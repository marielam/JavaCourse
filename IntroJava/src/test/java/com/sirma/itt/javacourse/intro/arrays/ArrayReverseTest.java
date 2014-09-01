package com.sirma.itt.javacourse.intro.arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Test class for the method of ArrayReverse class.
 * 
 * @author Mariela
 */
public class ArrayReverseTest {

	private int[] array;

	/**
	 * Checks if the array is really reversed.
	 * 
	 * @param arrayParam
	 *            the array that will be checked if it is reversed
	 * @return true if the array is reversed and false if it is not
	 */
	public boolean isArrayReversed(int[] arrayParam) {
		for (int i = 0; i < arrayParam.length; i++) {
			if (arrayParam[i] != array[arrayParam.length - 1 - i]) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Test with an empty array.
	 */
	@Test(expectedExceptions = IllegalArgumentException.class)
	public void testReverseArrayEmptyArray() {
		int[] sampleArray = {};
		ArrayReverse.reverseArray(sampleArray);
	}

	/**
	 * Test with null array.
	 */
	@Test
	public void testReverseArrayNullArray() {
		int[] sampleArray = null;
		Assert.assertNull(sampleArray);
	}

	/**
	 * Test with one element.
	 */
	@Test
	public void testReverseArrayOneElementInArray() {
		int[] sampleArray = { 565 };
		array = sampleArray.clone();
		ArrayReverse.reverseArray(sampleArray);
		if (!isArrayReversed(sampleArray)) {
			Assert.fail("The array is not reversed!");
		}
	}

	/**
	 * Test with two elements.
	 */
	@Test
	public void testReverseArrayTwoElements() {
		int[] sampleArray = { 565, 75 };
		array = sampleArray.clone();
		ArrayReverse.reverseArray(sampleArray);
		if (!isArrayReversed(sampleArray)) {
			Assert.fail("The array is not reversed!");
		}
	}

	/**
	 * Test with normal numbers.
	 */
	@Test
	public void testReverseArrayNormalNumbers() {
		int[] sampleArray = { 565, 75, 66, -9, 345, 735 };
		array = sampleArray.clone();
		ArrayReverse.reverseArray(sampleArray);
		if (!isArrayReversed(sampleArray)) {
			Assert.fail("The array is not reversed!");
		}
	}

}
