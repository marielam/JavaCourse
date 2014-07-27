package com.sirma.itt.javacourse.intro.numbers;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Test class for methods of SummatorLargeNumbers class.
 * 
 * @author Mariela
 */
public class SummatorLargeNumbersTest {

	/**
	 * Test with two zeros.
	 */
	@Test
	public void testSumLargeNumbersTwoZeros() {
		String actual = SummatorLargeNumbers.sumLargeNumbers("0", "0");
		String expected = "0";
		Assert.assertEquals(actual, expected);
	}

	/**
	 * Test with one zero.
	 */
	@Test
	public void testSumLargeNumbersOneZero() {
		String actual = SummatorLargeNumbers.sumLargeNumbers("0", "6456709876554331333");
		String expected = "6456709876554331333";
		Assert.assertEquals(actual, expected);
	}

	/**
	 * Test with invalid numbers.
	 */
	@Test(expectedExceptions = IllegalArgumentException.class)
	public void testSumLargeNumbersInvalidNumbers() {
		SummatorLargeNumbers.sumLargeNumbers("54566SRS*64", "87554&$klk_786");
	}

	/**
	 * Test with normal numbers.
	 */
	@Test
	public void testSumLargeNumbersNormalNumbers() {
		String actual = SummatorLargeNumbers.sumLargeNumbers("76680238675679098986",
				"237890908979780");
		String expected = "76680476566588078766";
		Assert.assertEquals(actual, expected);
	}

	/**
	 * Test with negative numbers.
	 */
	@Test(expectedExceptions = IllegalArgumentException.class)
	public void testSumLargeNumbersNegativeNumbers() {
		SummatorLargeNumbers.sumLargeNumbers("-76680238675679098986", "-12356768955555");
	}
}
