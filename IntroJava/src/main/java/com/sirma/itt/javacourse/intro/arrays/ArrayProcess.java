package com.sirma.itt.javacourse.intro.arrays;

/**
 * Class for processing arrays (finding an array`s minimal element, summing an array`s elements,
 * printing an array`s elements).
 * 
 * @author Mariela
 */
public final class ArrayProcess {

	/**
	 * Protects from instantiation.
	 */
	private ArrayProcess() {

	}

	public static final String ARRAY_SIZE_ERROR_MESSAGE = "The array`s size is equal to or below zero";

	/**
	 * Finds the minimal element in the array of integers.
	 * 
	 * @param array
	 *            the array to find the minimal element in
	 * @return the minimal element in the array
	 */
	public static int getMinElement(int[] array) {

		if (array.length <= 0) {
			throw new IllegalArgumentException(ARRAY_SIZE_ERROR_MESSAGE);
		} else {
			int minElement = array[0];
			for (int j = 1; j < array.length; j++) {
				if (array[j] < minElement) {
					minElement = array[j];
				} else {
					continue;
				}
			}

			return minElement;
		}
	}

	/**
	 * Sums the elements of an array.
	 * 
	 * @param array
	 *            the array whose elements will be summed
	 * @return the sum of the array`s elements
	 */
	public static int sum(int[] array) {

		if (array.length <= 0) {
			throw new IllegalArgumentException(ARRAY_SIZE_ERROR_MESSAGE);
		} else {
			int sum = 0;
			for (int j = 0; j < array.length; j++) {
				sum += array[j];
			}

			return sum;
		}
	}

	/**
	 * Prints to the screen the elements of an array.
	 * 
	 * @param array
	 *            the array whose elements will be printed
	 */
	public static String print(int[] array) {

		if (array.length <= 0) {
			throw new IllegalArgumentException(ARRAY_SIZE_ERROR_MESSAGE);
		} 

			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < array.length; j++) {
				sb.append(array [j]);
				if (j != array.length - 1) {
					sb.append(", ");
				}
			}
		return sb.toString();
	}

}
