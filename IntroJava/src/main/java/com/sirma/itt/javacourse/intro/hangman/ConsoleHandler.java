package com.sirma.itt.javacourse.intro.hangman;

import java.util.Scanner;

/**
 * Class that handles with the input and output of the console.
 * 
 * @author Mariela
 */
public final class ConsoleHandler {

	/**
	 * Protects from instantiation.
	 */
	private ConsoleHandler() {
	}

	/**
	 * Reads the user input from the console.
	 * 
	 * @return the read line
	 */
	public static String readLineFromConsole() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}

	/**
	 * Prints a string on the console.
	 * 
	 * @param word
	 *            the string to be printed on the console
	 */
	public static void printOnConsole(String word) {
		System.out.println(word);
	}

	/**
	 * Prints a character on the console.
	 * 
	 * @param character
	 *            the character to be printed on the console
	 */
	public static void printOnConsole(char character) {
		System.out.println(character);
	}

}
