package com.sirma.itt.javacourse.intro.hangman;

import com.sirma.itt.javacourse.intro.messages.Messages;

/**
 * Class that handles with an array of strings and implements HangmanHandler interface.
 * 
 * @author Mariela
 */
public class ArrayHandler implements HangmanHandler {
	
	private final String [] words;

	/**
	 * Sets the array of words for the game.
	 * @param words
	 * 				the words
	 */
	public ArrayHandler(String [] words) {
		if (words == null) {
			System.out.println("The array is null!");
		}

		if (words.length == 0) {
			throw new IllegalArgumentException(Messages.ARRAY_SIZE_ERROR_MESSAGE);
		}
		this.words = words;
	}
	
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public String chooseRandomWord() {
		if (words == null) {
			System.out.println(Messages.MISSING_RESOURCES);
			return Messages.MISSING_RESOURCES;
		}

		if (words.length == 0) {
			throw new IllegalArgumentException(Messages.ARRAY_SIZE_ERROR_MESSAGE);
		}
		int randomNumber = HangmanHandler.RANDOM_CHOICE.nextInt(words.length);
		return words [randomNumber];
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getUserInput() {
		return ConsoleHandler.readLineFromConsole();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void printMessage(String message) {
		ConsoleHandler.printOnConsole(message);
	}

}
