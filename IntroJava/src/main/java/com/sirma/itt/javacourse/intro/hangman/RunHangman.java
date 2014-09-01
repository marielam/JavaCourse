package com.sirma.itt.javacourse.intro.hangman;

/**
 * Class for running the game.
 * 
 * @author Mariela
 */
public final class RunHangman {

	/**
	 * Protects from instantiation.
	 */
	private RunHangman() {

	}

	/**
	 * Main method.
	 * 
	 * @param args
	 *            args
	 */
	public static void main(String[] args) {
		String[] words = { "apple", "vegetable", "grapefruit", "cabbage", "swimwear", "shampoo",
				"elephant", "rhinoceros", "hippopotamus", "crocodile", "ruster", "dolphin",
				"cucumber" };
		HangmanHandler handler = new ArrayHandler(words);
		Hangman game = new Hangman(handler);
		game.run();

	}

}
