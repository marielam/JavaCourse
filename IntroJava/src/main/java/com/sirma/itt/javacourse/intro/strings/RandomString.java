package com.sirma.itt.javacourse.intro.strings;

import java.util.Random;

import com.sirma.itt.javacourse.intro.messages.Messages;

/**
 * Class for generating random strings only with digits, lowercase and uppercase.
 * 
 * @author Mariela
 */
public class RandomString {

	private static Random rnd = new Random();

	/**
	 * Generates a random string which contains only digits, lowercase and uppercase.
	 * 
	 * @param length
	 *            the desired length of the random string
	 * @return the generated random string
	 */
	public static String generateRandomString(int length) {
		// REIVIEW good idea. Can you do it using ASCII boundaries?
		final String allowedSymbols = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

		if (length <= 0) {
			throw new IllegalArgumentException(Messages.STRING_LENGTH_ERROR_MESSAGE);
		}
		// REVIEW good usage of constructor
		StringBuilder sb = new StringBuilder(length);
		for (int j = 0; j < length; j++) {
			sb.append(allowedSymbols.charAt(rnd.nextInt(allowedSymbols.length())));
		}
		return sb.toString();
	}

}
