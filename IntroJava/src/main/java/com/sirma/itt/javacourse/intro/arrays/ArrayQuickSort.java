package com.sirma.itt.javacourse.intro.arrays;

/**
 * Class for applying the quick sort algorithm.
 * 
 * @author Mariela
 */
public final class ArrayQuickSort {

	/**
	 * Protects from instantiation.
	 */
	private ArrayQuickSort() {

	}

	public static final String ARRAY_SIZE_ERROR_MESSAGE = "The array`s size is equal to or below zero";

	/**
	 * Sorts an array. Invokes the sorting algorithm.
	 * 
	 * @param array
	 *            the array to be sorted
	 */
	public static void sort(int[] array) {
		if (array.length <= 0) {
			throw new IllegalArgumentException(ARRAY_SIZE_ERROR_MESSAGE);
		}

		quickSort(array, 0, array.length - 1);
	}

	/**
	 * Sorts an array by applying quick sort algorithm.
	 * 
	 * @param array
	 *            the array to be sorted
	 * @param low
	 *            the start index of the array
	 * @param high
	 *            the last index of the array
	 */
	public static void quickSort(int[] array, int low, int high) {
		int currentLow = low;
		int currentHigh = high;

		/**
		 * Gets the pivot element from the middle of the array.
		 */
		int pivotElement = array[low + (high - low) / 2];

		// Divide into two parts.
		while (currentLow <= currentHigh) {
			// If the current value from the left part is smaller than the pivot element
			// then continue with the next element from the left part.
			while (array[currentLow] < pivotElement) {
				currentLow++;
			}
			// If the current value from the right part is bigger than the pivot element
			// then continue with the next element from the right part.
			while (array[currentHigh] > pivotElement) {
				currentHigh--;
			}
			// If it is found an element in the left side which is greater than the pivot element
			// and if it is found an element in the right side which is smaller than the pivot
			// element
			// then the places of the elements are changed.
			if (currentLow <= currentHigh) {
				exchangeTwoElements(array, currentLow, currentHigh);
				currentLow++;
				currentHigh--;
			}
		}
		// Apply recursion for the rest of the elements.
		if (low < currentHigh) {
			quickSort(array, low, currentHigh);
		}
		if (currentLow < high) {
			quickSort(array, currentLow, high);
		}
	}

	/**
	 * Exchanges two elements of an array.
	 * 
	 * @param array
	 *            the array whose elements will be exchanged
	 * @param i
	 *            the index of the one array element
	 * @param j
	 *            the index of the other array element
	 */
	public static void exchangeTwoElements(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}
