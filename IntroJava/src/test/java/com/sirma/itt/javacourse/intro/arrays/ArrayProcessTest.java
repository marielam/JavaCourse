package com.sirma.itt.javacourse.intro.arrays;

import org.testng.Assert;
import org.testng.annotations.Test;
/**
 * Test class for the methods of ArrayProces class.
 * 
 * @author Mariela
 */
public class ArrayProcessTest {
	
	/**
	 * Test with an empty array.
	 */
	@Test(expectedExceptions = IllegalArgumentException.class)
	public void testGetMinElementEmptyArray() {
		int[] array = {};
		ArrayProcess.getMinElement(array);
	}

	/**
	 * Test with null array.
	 */
	@Test(expectedExceptions = NullPointerException.class)
	public void testGetMinElementNullArray() {
		int[] array = null;
		ArrayProcess.getMinElement(array);
	}
	
	/**
	 * Test with one element.
	 */
	@Test
	public void testGetMinElementOneElementInArray() {
		int[] array = {565};
		int actual = ArrayProcess.getMinElement(array);
		int expected = 565;
		Assert.assertEquals(actual, expected);
	}
	
	
	
	/**
	 * Test with normal numbers.
	 */
	@Test
	public void testGetMinElementNormalNumbers() {
		int[] array = {14, 18, 99, 23, 56, 34, 99, 3, 78, 8};
		int actual = ArrayProcess.getMinElement(array);
		int expected = 3;
		Assert.assertEquals(actual, expected);
	}


	/**
	 * Test including negative numbers.
	 */
	@Test
	public void testGetMinElementNegativeNumbers() {
		int[] array = {-303, 101, 4, 76, -45, 66, 18, 77, -5, 0};
		int actual = ArrayProcess.getMinElement(array);
		int expected = -303;
		Assert.assertEquals(actual, expected);
	}


	/**
	 * Test with equal elements.
	 */
	@Test
	public void testGetMinElementEqualElements() {
		int[] array = {55, 55};
		int actual = ArrayProcess.getMinElement(array);
		int expected = 55;
		Assert.assertEquals(actual, expected);
	}
	
	/**
	 * Test with an empty array.
	 */
	@Test(expectedExceptions = IllegalArgumentException.class)
	public void testSumEmptyArray() {
		int[] array = {};
		ArrayProcess.sum(array);
	}
	
	/**
	 * Test with null array.
	 */
	@Test(expectedExceptions = NullPointerException.class)
	public void testSumNullArray() {
		int[] array = null;
		ArrayProcess.sum(array);
	}

	/**
	 * Test with one element.
	 */
	@Test
	public void testSumOneElementInArray() {
		int[] array = {652};
		int actual = ArrayProcess.sum(array);
		int expected = 652;
		Assert.assertEquals(actual, expected);
	}
	
	
	
	/**
	 * Test with normal numbers.
	 */
	@Test
	public void testSumNormalNumbers() {
		int[] array = {14, 18, 99, 23, 56, 34, 99, 3, 78, 8};
		int actual = ArrayProcess.sum(array);
		int expected = 432;
		Assert.assertEquals(actual, expected);
	}


	/**
	 * Test including negative numbers.
	 */
	@Test
	public void testSumNegativeNumbers() {
		int[] array = {-303, 101, 4, 76, -45, 66, 18, 77, -5, 0};
		int actual = ArrayProcess.sum(array);
		int expected = -11;
		Assert.assertEquals(actual, expected);
	}


	/**
	 * Test with more than one zeros.
	 */
	@Test
	public void testSumOnlyZeros() {
		int[] array = {0, 0, 0, 0, 0};
		int actual = ArrayProcess.sum(array);
		int expected = 0;
		Assert.assertEquals(actual, expected);
	}
	
	/**
	 * Test with an empty array.
	 */
	@Test(expectedExceptions = IllegalArgumentException.class)
	public void testPrintEmptyArray() {
		int[] array = {};
		ArrayProcess.print(array);
	}
	
	/**
	 * Test with null array.
	 */
	@Test(expectedExceptions = NullPointerException.class)
	public void testPrintNullArray() {
		int[] array = null;
		ArrayProcess.print(array);
	}

	/**
	 * Test with one element.
	 */
	@Test
	public void testPrintOneElementInArray() {
		int[] array = {24};
		String actual = ArrayProcess.print(array);
		String expected = "24";
		Assert.assertEquals(actual, expected);
	}
	
	
	
	/**
	 * Test with normal numbers.
	 */
	@Test
	public void testPrintNormalNumbers() {
		int[] array = {14, 18, 99, 23, 56, 34, 99, 3, 78, 8};
		String actual = ArrayProcess.print(array);
		String expected = "14, 18, 99, 23, 56, 34, 99, 3, 78, 8";
		Assert.assertEquals(actual, expected);
	}
}
