package com.sirma.itt.javacourse.intro.numbers;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Test class for the methods of GreatestCommonDivisor Class.
 * 
 * @author Mariela
 */
public class GreatestCommonDivisorTest {
  
	/**
	 * Test with one zero number.
	 */
	@Test
	public void testFindCreatestCommonDivisorOneZero() {
		long actual=GreatestCommonDivisor.findGreatestCommonDivisor(5, 0);
		long expected=5;
		Assert.assertEquals(actual, expected);
	}
	
	/**
	 * Test with two zeros.
	 */
	@Test (expectedExceptions=IllegalArgumentException.class)
	public void testFindCreatestCommonDivisorTwoZeros() {
		GreatestCommonDivisor.findGreatestCommonDivisor(0, 0);
	}
	/**
	 * Test with two normal numbers.
	 */
	@Test
	public void testFindCreatestCommonDivisorNormalNumbers() {
		long actual=GreatestCommonDivisor.findGreatestCommonDivisor(12, 18);
		long expected=6;
		Assert.assertEquals(actual, expected);
	}
	
	/**
	 * Test with two negative numbers.
	 */
	@Test
	public void testFindCreatestCommonDivisorNegativeNumbers() {
		long actual=GreatestCommonDivisor.findGreatestCommonDivisor(-12, -18);
		long expected=-6;
		Assert.assertEquals(actual, expected);
	}
	
	/**
	 * Test with two prime numbers.
	 */
	@Test
	public void testFindCreatestCommonDivisorPrimeNumbers() {
		long actual=GreatestCommonDivisor.findGreatestCommonDivisor(9, 28);
		long expected=1;
		Assert.assertEquals(actual, expected);
	}
	
	/**
	 * Test with one zero number.
	 */
	@Test
	public void testFindLeastCommonMultipleOneZero() {
		long actual=GreatestCommonDivisor.findLeastCommonMultiple(5, 0);
		long expected=5;
		Assert.assertEquals(actual, expected);
	}
	
	/**
	 * Test with two zeros.
	 */
	@Test(expectedExceptions=IllegalArgumentException.class)
	public void testFindLeastCommonMultipleTwoZeros() {
		long actual=GreatestCommonDivisor.findLeastCommonMultiple(0, 0);
		long expected=0;
		Assert.assertEquals(actual, expected);
	}
	/**
	 * Test with two normal numbers.
	 */
	@Test
	public void testFindLeastCommonMultipleNormalNumbers() {
		long actual=GreatestCommonDivisor.findLeastCommonMultiple(12, 18);
		long expected=36;
		Assert.assertEquals(actual, expected);
	}
	
	/**
	 * Test with two negative numbers.
	 */
	@Test
	public void testFindLeastCommonMultipleNegativeNumbers() {
		long actual=GreatestCommonDivisor.findLeastCommonMultiple(-12, -18);
		long expected=-36;
		Assert.assertEquals(actual, expected);
	}
	
	/**
	 * Test with two prime numbers.
	 */
	@Test
	public void testFindLeastCommonMultiplePrimeNumbers() {
		long actual=GreatestCommonDivisor.findLeastCommonMultiple(9, 28);
		long expected=252;
		Assert.assertEquals(actual, expected);
	}
}
