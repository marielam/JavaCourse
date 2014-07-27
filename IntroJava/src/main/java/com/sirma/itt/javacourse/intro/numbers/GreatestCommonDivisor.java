package com.sirma.itt.javacourse.intro.numbers;

/**
 * Class for finding the greatest common divisor of two integers.
 * 
 * @author Mariela
 */
public final class GreatestCommonDivisor {

	/**
	 * Protects from instantiation.
	 */
	private GreatestCommonDivisor() {

	}

	public static final String TWO_ZEROS_ERROR_MESSAGE = "Both, The two numbers are zeros.";

	/**
	 * Finds the greatest common divisor of two integers.
	 * 
	 * @param number1
	 *            the first number
	 * @param number2
	 *            the second number
	 * @return the greatest common divisor of the given numbers
	 */
	public static long findGreatestCommonDivisor(int number1, int number2) {
		if (number1 == 0 && number2 == 0) {
			throw new IllegalArgumentException(TWO_ZEROS_ERROR_MESSAGE);
		}
		return(number2==0?number1:(findGreatestCommonDivisor(number2, number1%number2)));
	}

	/**
	 * Finds the least common multiple of two integers.
	 * 
	 * @param number1
	 *            the first number
	 * @param number2
	 *            the second number
	 * @return the least common multiple of the given numbers
	 */
	public static long findLeastCommonMultiple(int number1, int number2) {
		if (number1 == 0 && number2 == 0) {
			throw new IllegalArgumentException(TWO_ZEROS_ERROR_MESSAGE);
		} else if (number1 == 0 && number2 != 0) {
			return number2;
		} else if (number1 != 0 && number2 == 0) {
			return number1;
		} 

		return number1 * (number2 / findGreatestCommonDivisor(number1, number2));
	}

}
