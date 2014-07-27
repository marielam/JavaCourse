package com.sirma.itt.javacourse.intro.arrays;

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

	
	public static final String ARRAY_SIZE_ERROR_MESSAGE = "The array`s size is equal or below zero";

	/**
	 * reverses the elements of an array by swapping the first element with the last, the second
	 * with the one before the last and etc.
	 * 
	 * @param array
	 *            the array whose elements will be reversed
	 * @return the array with reversed elements
	 */
	public static int[] reverseArray(int[] array) {

		if (array.length <= 0) {
			throw new IllegalArgumentException(ARRAY_SIZE_ERROR_MESSAGE);

		} 
			int length = array.length;

			for (int j = 0; j < length/2; j++) {
				int temp = array[j];
				array[j] = array[length - 1 - j];
				array[length - 1 - j] = temp;
			}
	
		return array;
	}

}
