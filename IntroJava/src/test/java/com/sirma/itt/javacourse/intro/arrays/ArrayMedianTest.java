package com.sirma.itt.javacourse.intro.arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Test class for the method of ArrayMedian class.
 * 
 * @author Mariela
 */
public class ArrayMedianTest {
	
	/**
	 * Test with an empty array.
	 */
	@Test(expectedExceptions = IllegalArgumentException.class)
	public void testFindArrayMedianEmptyArray() {
		int[] array = {};
		ArrayMedian.findArrayMedian(array);
	}
	
	/**
	 * Test with null array.
	 */
	@Test(expectedExceptions = NullPointerException.class)
	public void testFindArrayMedianNullArray() {
		int[] array = null;
		ArrayMedian.findArrayMedian(array);
	}

	
	/**
	 * Test with one element.
	 */
	@Test
	public void testFindArrayMedianOneElementInArray() {
		int[] array = {565};
		int actual = ArrayMedian.findArrayMedian(array);
		int expected = 1;
		Assert.assertEquals(actual, expected);
	}
	
	/**
	 * Test with normal numbers.
	 */
	@Test
	public void testFindArrayMedianNormalNumbers() {
		int[] array = {1, 2, 3, 4, 5};
		int actual = ArrayMedian.findArrayMedian(array);
		int expected = 4;
		Assert.assertEquals(actual, expected);
	}
	
	/**
	 * Test including negative numbers.
	 */
	@Test
	public void testFindArrayMedianNegativeNumbers() {
		int[] array = {4, 5, 99, -1, 5, 6};
		int actual = ArrayMedian.findArrayMedian(array);
		int expected = 3;
		Assert.assertEquals(actual, expected);
	}
	
	/**
	 * Test with array with no median.
	 */
	@Test
	public void testFindArrayMedianNoSuchElement() {
		int[] array = {100, 78};
		int actual = ArrayMedian.findArrayMedian(array);
		int expected = -1;
		Assert.assertEquals(actual, expected);
	}
}
