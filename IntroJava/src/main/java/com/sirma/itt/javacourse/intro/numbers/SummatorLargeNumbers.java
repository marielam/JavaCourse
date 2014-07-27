package com.sirma.itt.javacourse.intro.numbers;

/**
 * Class for summing large numbers.
 * 
 * @author Mariela
 */
public final class SummatorLargeNumbers {

	/**
	 * Protects from instantiation.
	 */
	private SummatorLargeNumbers() {

	}

	public static final String NUMBER_FORMAT_ERROR_MESSAGE = "The number format is not valid!";

	public static final char ZERO_CHAR = '0';

	/**
	 * Finds and returns the sum of two large numbers, given as strings.
	 * 
	 * @param number1
	 *            the first number
	 * @param number2
	 *            the second number
	 * @return the sum of the given numbers
	 */
	public static String sumLargeNumbers(String number1, String number2) {
		if (!number1.matches("[0-9]*") || !number2.matches("[0-9]*")) {
			throw new IllegalArgumentException(NUMBER_FORMAT_ERROR_MESSAGE);
		}

		String currentNumber1 = number1;
		String currentNumber2 = number2;
		char charNumber1;
		char charNumber2;
		int digitsNumber1;
		int digitsNumber2;
		int carry = 0;
		int sum;
		StringBuilder sb = new StringBuilder();

		while (currentNumber1.length() > 0 || currentNumber2.length() > 0) {
			if (currentNumber1.length() > 0) {
				charNumber1 = currentNumber1.charAt(currentNumber1.length() - 1);
				currentNumber1 = currentNumber1.substring(0, currentNumber1.length() - 1);
			} else {
				charNumber1 = ZERO_CHAR;
			}

			if (currentNumber2.length() > 0) {
				charNumber2 = currentNumber2.charAt(currentNumber2.length() - 1);
				currentNumber2 = currentNumber2.substring(0, currentNumber2.length() - 1);
			} else {
				charNumber2 = ZERO_CHAR;
			}

			digitsNumber1 = Character.getNumericValue(charNumber1);
			digitsNumber2 = Character.getNumericValue(charNumber2);
			sum = digitsNumber1 + digitsNumber2 + carry;
			if (sum >= 10) {
				carry = sum;
				sum = sum - 10;
			}
			carry = carry / 10;
			sb.append(sum);
		}

		if (carry > 0) {
			sb.append(carry);
		}
		sb.reverse();

		return sb.toString();

	}

}
