package com.sirma.itt.javacourse.intro.arrays;

import com.sirma.itt.javacourse.intro.messages.Messages;

/**
 * Class for reversing an array.
 * 
 * @author Mariela
 */
public final class ArrayReverse {

	/**
	 * Protects from instantiation.
	 */
	private ArrayReverse() {

	}

	// REVIEW comment start with upercase
	/**
	 * Reverses the elements of an array by swapping the first element with the last, the second
	 * with the one before the last and etc.
	 * 
	 * @param array
	 *            the array whose elements will be reversed
	 * @return the array with reversed elements
	 */
	public static int[] reverseArray(int[] array) {
		// REVIEW invalid check
		if (array == null) {
			System.out.println("The array is null!");
			return null;
		}

		if (array.length == 0) {
			throw new IllegalArgumentException(Messages.ARRAY_SIZE_ERROR_MESSAGE);
		}
		// REVIEW unformatted code
		int length = array.length;

		for (int j = 0; j < length / 2; j++) {
			int temp = array[j];
			array[j] = array[length - 1 - j];
			array[length - 1 - j] = temp;
		}

		return array;
	}

}
