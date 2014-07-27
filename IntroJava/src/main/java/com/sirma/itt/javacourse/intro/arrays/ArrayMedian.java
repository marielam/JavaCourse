package com.sirma.itt.javacourse.intro.arrays;

/**
 * Class for finding an array`s median.
 * 
 * @author Mariela
 */
public final class ArrayMedian {

	/**
	 * Protects from instantiation.
	 */
	private ArrayMedian() {

	}

	public static final String ARRAY_SIZE_ERROR_MESSAGE = "The array`s size is equal to or below zero";

	/**
	 * Finds a given array`s median as the sums of the elements before the median and after it are
	 * as close as possible.
	 * 
	 * @param array
	 *            the array whose median needs to be found
	 * @return the index of the median of the array, starting with one, if the array has one element
	 *         it will return 1 and if there is no such element it will return -1
	 */
	public static int findArrayMedian(int[] array) {
		if (array.length <= 0) {
			throw new IllegalArgumentException(ARRAY_SIZE_ERROR_MESSAGE);
		}
		if (array.length == 1) {
			return 1;
		}

		int index = 0;
		int leftSum = 0;
		int rightSum = 0;
		int difference = 0;

		for (int i = 1; i < array.length; i++) {
			rightSum += array[i];
		}

		difference = Math.abs(leftSum - rightSum);

		for (int i = 1; i < array.length; i++) {
			leftSum += array[i - 1];
			rightSum -= array[i];

			int currentDifference = Math.abs(leftSum - rightSum);
			if (difference > currentDifference) {
				difference = currentDifference;
				index = i;
			}
		}
		if (index != 0) {
			return index + 1;
		}
		return -1;
	}
}
