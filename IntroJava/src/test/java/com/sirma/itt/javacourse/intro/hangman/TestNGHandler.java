package com.sirma.itt.javacourse.intro.hangman;
/**
 * TestNGHandler class for testing puposes.
 * 
 * @author Mariela
 */
public class TestNGHandler implements HangmanHandler {
	
	private String secretWord;
	private String [] userInput;
	private int userGuess;
	
	/**
	 * Creates a new TestNGHandler.
	 * 
	 * @param word
	 * 				the secret word to be guessed
	 * @param userInput
	 * 				the user`s input
	 */
	public TestNGHandler(String word, String [] userInput) {
		userGuess = -1;
		this.secretWord = word;
		this.userInput = userInput;
	}
	

	@Override
	public String chooseRandomWord() {
		return secretWord;
	}

	@Override
	public String getUserInput() {
		if(userGuess+1<userInput.length) {
			userGuess++;
		}
		return userInput[userGuess];
	}

	@Override
	public void printMessage(String message) {
		ConsoleHandler.printOnConsole(message);
		
	}

}
