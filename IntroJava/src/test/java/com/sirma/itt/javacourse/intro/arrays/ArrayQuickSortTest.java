package com.sirma.itt.javacourse.intro.arrays;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Test class for the methods of ArrayQuickSort class.
 * 
 * @author Mariela
 */
public class ArrayQuickSortTest {

	/**
	 * Validates sorting.
	 * 
	 * @param arrayBeforeSort
	 *            the not sorted array which will be sorted
	 * @param arrayAfterSort
	 *            the array which will be checked if it is sorted
	 * @return true if the array is sorted and false if it is not
	 */
	private static boolean isSorted(int[] arrayBeforeSort, int[] arrayAfterSort) {
		Arrays.sort(arrayBeforeSort);
		if (Arrays.equals(arrayBeforeSort, arrayAfterSort)) {
			return true;
		}
		return false;
	}

	/**
	 * Test with an empty array.
	 */
	@Test(expectedExceptions = IllegalArgumentException.class)
	public void testSortEmptyArray() {
		int[] array = {};
		ArrayQuickSort.sort(array);
	}

	/**
	 * Test with null array.
	 */
	@Test
	public void testSortNullArray() {
		int[] array = null;
		Assert.assertNull(array);
	}

	/**
	 * Test with one element.
	 */
	@Test
	public void testSortOneElementInArray() {
		int[] arrayBeforeSort = { 565 };
		int[] arrayAfterSort = { 565 };
		ArrayQuickSort.sort(arrayAfterSort);
		if (!isSorted(arrayBeforeSort, arrayAfterSort)) {
			Assert.fail("The array is not sorted!");
		}
	}

	/**
	 * Test with two elements.
	 */
	@Test
	public void testSortTwoElements() {
		int[] arrayBeforeSort = { 565, 45 };
		int[] arrayAfterSort = { 565, 45 };
		ArrayQuickSort.sort(arrayAfterSort);
		if (!isSorted(arrayBeforeSort, arrayAfterSort)) {
			Assert.fail("The array is not sorted!");
		}
	}

	/**
	 * Test with normal elements.
	 */
	@Test
	public void testSortNormalElements() {
		int[] arrayBeforeSort = { 565, 78, 34, 2, 23, 2222, 34 };
		int[] arrayAfterSort = { 565, 78, 34, 2, 23, 2222, 34 };
		ArrayQuickSort.sort(arrayAfterSort);
		if (!isSorted(arrayBeforeSort, arrayAfterSort)) {
			Assert.fail("The array is not sorted!");
		}
	}

	/**
	 * Test including positive and negative elements.
	 */
	@Test
	public void testSortPositiveNegativeElements() {
		int[] arrayBeforeSort = { 565, -78, 34, -2, 23, 2222, 34 };
		int[] arrayAfterSort = { 565, -78, 34, -2, 23, 2222, 34 };
		ArrayQuickSort.sort(arrayAfterSort);
		if (!isSorted(arrayBeforeSort, arrayAfterSort)) {
			Assert.fail("The array is not sorted!");
		}
	}

	/**
	 * Test with only negative elements.
	 */
	@Test
	public void testSortOnlyNegativeElements() {
		int[] arrayBeforeSort = { -565, -78, -34, -2, -23, -2222, -34 };
		int[] arrayAfterSort = { -565, -78, -34, -2, -23, -2222, -34 };
		ArrayQuickSort.sort(arrayAfterSort);
		if (!isSorted(arrayBeforeSort, arrayAfterSort)) {
			Assert.fail("The array is not sorted!");
		}
	}

	/**
	 * Test with repeatable numbers.
	 */
	@Test
	public void testSortRepeatableNumbers() {
		int[] arrayBeforeSort = { 104, 104, 0, 9, 56, 0, 9, 77, 88 };
		int[] arrayAfterSort = { 104, 104, 0, 9, 56, 0, 9, 77, 88 };
		ArrayQuickSort.sort(arrayAfterSort);
		if (!isSorted(arrayBeforeSort, arrayAfterSort)) {
			Assert.fail("The array is not sorted!");
		}
	}

	/**
	 * Test with sorted numbers.
	 */
	@Test
	public void testSortSortedNumbers() {
		int[] arrayBeforeSort = { 104, 103, 102, 101, 100, 99, 98 };
		int[] arrayAfterSort = { 104, 103, 102, 101, 100, 99, 98 };
		ArrayQuickSort.sort(arrayAfterSort);
		if (!isSorted(arrayBeforeSort, arrayAfterSort)) {
			Assert.fail("The array is not sorted!");
		}
	}

}
