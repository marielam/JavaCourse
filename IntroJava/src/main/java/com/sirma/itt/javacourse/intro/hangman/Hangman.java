package com.sirma.itt.javacourse.intro.hangman;

import com.sirma.itt.javacourse.intro.messages.Messages;

/**
 * Class for implementing the game Hangman.
 * 
 * @author Mariela
 */
public class Hangman {

	private final HangmanHandler hangmanHandler;
	private final String secretWord;
	private final StringBuilder sb = new StringBuilder();
	private int attempts = 8;
	private char firstLetter;
	private char lastLetter;

	/**
	 * Initializes the game.
	 * 
	 * @param handler
	 *            the interface that has the words
	 */
	public Hangman(HangmanHandler handler) {
		if (handler == null) {
			throw new IllegalArgumentException(Messages.MISSING_INTERFACE);
		}
		this.hangmanHandler = handler;
		this.secretWord = hangmanHandler.chooseRandomWord();
		firstLetter = secretWord.charAt(0);
		lastLetter = secretWord.charAt(secretWord.length() - 1);
		for (int i = 0; i < secretWord.length(); i++) {
			sb.append(Messages.HIDDEN_LETTER_SYMBOL);
		}
		sb.setCharAt(0, firstLetter);
		setVisibleLetter(firstLetter);
		sb.setCharAt(secretWord.length() - 1, lastLetter);
		setVisibleLetter(lastLetter);

	}

	/**
	 * Checks if it is a word.
	 * 
	 * @param str
	 *            the word to be checked
	 * @return true if it is or false if it is a character
	 */
	private boolean isWord(String str) {
		if (str.length() >= 2) {
			return true;
		}
		return false;
	}

	/**
	 * Checks if the word is guessed.
	 * 
	 * @return true if it is or false if it is not
	 */
	public Boolean isWordGuessed() {
		String word = sb.toString();
		if (!word.contains(Messages.HIDDEN_LETTER_SYMBOL)) {
			return true;
		}
		return false;
	}

	/**
	 * When the user input is whole word, it checks if the secret word is guessed. If it is guessed,
	 * it is displayed.
	 * 
	 * @param str
	 *            the word to be checked
	 */
	private void checkWord(String str) {
		if (str.isEmpty()) {
			return;
		}
		if (secretWord.equalsIgnoreCase(str)) {
			sb.replace(0, secretWord.length() - 1, secretWord);
			attempts--;
		} else {
			attempts--;
		}
	}

	/**
	 * When the user input is a letter, it checks if the word contains the letter and reduces the
	 * number of attempts to guess.
	 * 
	 * @param letter
	 *            the user input character
	 */
	private void checkLetter(char letter) {

		if (secretWord.contains(Character.toString(letter))) {
			setVisibleLetter(letter);
			attempts--;
		} else {
			attempts--;
		}
	}

	/**
	 * Reveals the guessed letters of the word.
	 * 
	 * @param letter
	 *            the letter
	 */
	private void setVisibleLetter(char letter) {
		char[] temporaryArray = secretWord.toCharArray();
		for (int i = 0; i < temporaryArray.length; i++) {
			if (temporaryArray[i] == letter) {
				sb.setCharAt(i, letter);
			}
		}
	}

	/**
	 * Gets the remaining attempts to guess.
	 * 
	 * @return the number of remaining attempts
	 */
	public int getAttempts() {
		return attempts;
	}

	/**
	 * Checks if the attempts are finished.
	 * 
	 * @return true if they are or false if there are more attempts
	 */
	private Boolean areAttemptsOver() {
		if (attempts == 0) {
			return true;
		}
		return false;
	}

	private boolean isUserInputEmpty(String str) {
		if (str.isEmpty()) {
			return true;
		}
		return false;

	}

	/**
	 * Contains the logic of the game.
	 */
	public void run() {
		while (true) {
			if (isWordGuessed()) {
				hangmanHandler.printMessage(System.lineSeparator() + Messages.WIN_MESSAGE);
				hangmanHandler.printMessage(System.lineSeparator() + Messages.WORD_MESSAGE
						+ secretWord + System.lineSeparator());
				break;
			}

			if (areAttemptsOver()) {
				hangmanHandler.printMessage(System.lineSeparator() + Messages.LOOSE_MESSAGE);
				hangmanHandler.printMessage(System.lineSeparator() + Messages.WORD_MESSAGE
						+ secretWord + System.lineSeparator());
				break;
			}

			System.out.println(Messages.GUESS_WORD + sb);
			System.out.println("You have " + getAttempts() + " attempts!");
			System.out.print(Messages.ENTER_LETTER);
			System.out.println(System.lineSeparator());
			String line = hangmanHandler.getUserInput().toLowerCase();
			line = line.trim();
			if (isUserInputEmpty(line)) {
				System.out.println(Messages.REMAINDER_MESSAGE);
			} else {
				if (isWord(line)) {
					checkWord(line);
				} else {
					checkLetter(line.charAt(0));
				}
			}
		}

	}

}
