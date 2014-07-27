package com.sirma.itt.javacourse.intro.strings;

import java.util.Random;

/**
 * Class for generating random strings only with digits, lowercase and uppercase.
 * 
 * @author Mariela
 */
public class RandomString {

	
	private static final String STRING_LENGTH_ERROR_MESSAGE = "The length of the string cannot be 0 or below 0";

	private static Random rnd = new Random();

	/**
	 * Generates a random string which contains only digits, lowercase and uppercase.
	 * 
	 * @param length
	 *            the desired length of the random string
	 * @return the generated random string
	 */
	public static String generateRandomString(int length) {

		final String allowedSymbols = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

		if (length <= 0) {
			throw new IllegalArgumentException(STRING_LENGTH_ERROR_MESSAGE);
		}
		StringBuilder sb = new StringBuilder(length);
		for (int j = 0; j < length; j++) {
			sb.append(allowedSymbols.charAt(rnd.nextInt(allowedSymbols.length())));
		}
		return sb.toString();
	}

}
