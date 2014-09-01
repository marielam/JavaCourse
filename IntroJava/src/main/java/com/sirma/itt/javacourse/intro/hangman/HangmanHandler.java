package com.sirma.itt.javacourse.intro.hangman;

import java.util.Random;

/**
 * Interface for getting random words, for console input and output.
 * 
 * @author Mariela
 */
public interface HangmanHandler {
	
	Random RANDOM_CHOICE = new Random();
	
	/**
	 * Generates a random word.
	 * 
	 * @return
	 * 			the chosen word
	 */
	String chooseRandomWord();
	
	/**
	 * Gives the user input.
	 * 
	 * @return 
	 * 			the user input
	 */
	String getUserInput();
	
	/**
	 * Prints a message to the user.
	 * 
	 * @param message
	 * 				the message
	 */
	void printMessage(String message);

}
