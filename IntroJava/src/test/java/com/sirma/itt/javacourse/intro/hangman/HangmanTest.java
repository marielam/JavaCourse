package com.sirma.itt.javacourse.intro.hangman;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Test class for the methods of Hangman class.
 * 
 * @author Mariela
 */
public class HangmanTest {
	/**
	 * Tests with null.
	 */
	@Test(expectedExceptions = IllegalArgumentException.class)
	public void testHangmanNull() {
		new Hangman(null);
	}

	/**
	 * Tests with winning guesses.
	 */
	@Test
	public void testHangmanWin() {
		String[] userInput = { "i", "k", "r", "h", "d", "s", "f", "giraffe" };
		TestNGHandler testHandler = new TestNGHandler("giraffe", userInput);
		Hangman game = new Hangman(testHandler);
		game.run();
		Assert.assertTrue(game.isWordGuessed(), "The user must win!");
	}

	/**
	 * Tests with loosing guesses.
	 */
	@Test
	public void testHangmanLoose() {
		String[] userInput = { "j", "o", "r", "u", "l", "sas", "n", "guitar" };
		TestNGHandler testHandler = new TestNGHandler("giraffe", userInput);
		Hangman game = new Hangman(testHandler);
		game.run();
		Assert.assertTrue(!game.isWordGuessed(), "The user must lose!");
	}

	/**
	 * Tests with one left attempt.
	 */
	@Test
	public void testHangmanLeftOneAttempt() {
		String[] userInput = { "j", "h", "m", "i", "r", "a", "giraffe" };
		TestNGHandler testHandler = new TestNGHandler("giraffe", userInput);
		Hangman game = new Hangman(testHandler);
		game.run();
		Assert.assertTrue(game.getAttempts() == 1,
				"Attemmpts left must be 1, but are " + game.getAttempts());
	}

	/**
	 * Tests with the number of the left attempts with no wrong guesses.
	 */
	@Test
	public void testHangmanNoWrongAnswerNumberAttempts() {
		String[] userInput = { "giraffe" };
		TestNGHandler testHandler = new TestNGHandler("giraffe", userInput);
		Hangman game = new Hangman(testHandler);
		game.run();
		Assert.assertTrue(game.getAttempts() == 7,
				"Attemmpts left must be 7, but are " + game.getAttempts());
	}
}
