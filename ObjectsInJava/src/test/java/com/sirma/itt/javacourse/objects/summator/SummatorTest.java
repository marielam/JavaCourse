package com.sirma.itt.javacourse.objects.summator;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Test class for the methods of Summator class.
 * 
 * @author Mariela
 */
public class SummatorTest {
	private Summator summator = new Summator();
	private static final double DELTA = 1e-15;

	/**
	 * Tests Summator class method sum(Integer a, Integer b) with zeros.
	 */
	@Test
	public void testSumIntZeros() {
		Integer a = 0;
		Integer b = 0;
		Integer actual = summator.sum(a, b);
		Integer expected = 0;
		Assert.assertEquals(actual, expected);
	}

	/**
	 * Tests Summator class method sum(Integer a, Integer b) with negative numbers.
	 */
	@Test
	public void testSumIntNegativeNumbers() {
		Integer a = -99;
		Integer b = -1000;
		Integer actual = summator.sum(a, b);
		Integer expected = -1099;
		Assert.assertEquals(actual, expected);
	}

	/**
	 * Tests Summator class method sum(Integer a, Integer b) with minimum value.
	 */
	@Test
	public void testSumIntMinimumValue() {
		Integer a = -2147482648;
		Integer b = -1000;
		Integer actual = summator.sum(a, b);
		Integer expected = -2147483648;
		Assert.assertEquals(actual, expected);
	}

	/**
	 * Tests Summator class method sum(Integer a, Integer b) with maximum value.
	 */
	@Test
	public void testSumIntMaximumValue() {
		Integer a = 2147483645;
		Integer b = 2;
		Integer actual = summator.sum(a, b);
		Integer expected = 2147483647;
		Assert.assertEquals(actual, expected);
	}

	/**
	 * Tests Summator class method sum(Float a, Float b) with zeros.
	 */
	@Test
	public void testSumFloatZeros() {
		Float actual = summator.sum(0.0f, 0.0f);
		Float expected = 0.0f;
		Assert.assertEquals(actual, expected, DELTA);
	}

	/**
	 * Tests Summator class method sum(Float a, Float b) with negative numbers.
	 */
	@Test
	public void testSumFloatNegativeNumbers() {
		Float actual = summator.sum(-22.2f, -1.8f);
		Float expected = -24.0f;
		Assert.assertEquals(actual, expected);
	}

	/**
	 * Tests Summator class method sum(Float a, Float b) with minimum value.
	 */
	@Test
	public void testSumFloatMinimumValue() {
		Float a = Float.MAX_VALUE;
		Float b = 0.0f;
		Float actual = summator.sum(a, b);
		Float expected = Float.MAX_VALUE;
		Assert.assertEquals(actual, expected);
	}

	/**
	 * Tests Summator class method sum(Float a, Float b) with maximum value.
	 */
	@Test
	public void testSumFloatMaximumValue() {
		Float a = Float.MIN_VALUE;
		Float b = 0.0f;
		Float actual = summator.sum(a, b);
		Float expected = Float.MIN_VALUE;
		Assert.assertEquals(actual, expected);
	}

	/**
	 * Tests Summator class method sum(BigInteger a, BigInteger b) with zeros.
	 */
	@Test
	public void testSumBigIntegerZeros() {
		BigInteger number1 = new BigInteger("0");
		BigInteger number2 = new BigInteger("0");
		BigInteger actual = summator.sum(number1, number2);
		BigInteger expected = new BigInteger("0");
		Assert.assertEquals(actual, expected);
	}

	/**
	 * Tests Summator class method sum(BigInteger a, BigInteger b) with negative numbers.
	 */
	@Test
	public void testSumBigIntegerNegativeNumbers() {
		BigInteger number1 = new BigInteger("-1467563245678000");
		BigInteger number2 = new BigInteger("-7865434546789001");
		BigInteger actual = summator.sum(number1, number2);
		BigInteger expected = new BigInteger("-9332997792467001");
		Assert.assertEquals(actual, expected);
	}

	/**
	 * Tests Summator class method sum(BigDecimal a, BigDecimal b) with zeros.
	 */
	@Test
	public void testSumBigDecimalZeros() {
		BigDecimal number1 = new BigDecimal("0");
		BigDecimal number2 = new BigDecimal("0");
		BigDecimal actual = summator.sum(number1, number2);
		BigDecimal expected = new BigDecimal("0");
		Assert.assertEquals(actual, expected);
	}

	/**
	 * Tests Summator class method sum(BigDecimal a, BigDecimal b) with negative numbers.
	 */
	@Test
	public void testSumBigDecimalNegativeNumbers() {
		BigDecimal number1 = new BigDecimal("-146756324567.8000");
		BigDecimal number2 = new BigDecimal("-786543454678.9001");
		BigDecimal actual = summator.sum(number1, number2);
		BigDecimal expected = new BigDecimal("-933299779246.7001");
		Assert.assertEquals(actual, expected);
	}

	/**
	 * Tests Summator class method sum(String a, String b) with empty strings.
	 */
	@Test(expectedExceptions = IllegalArgumentException.class)
	public void testSumEmptyString() {
		summator.sum("", "");
	}

	/**
	 * Tests Summator class method sum(String a, String b) with null strings.
	 */
	@Test(expectedExceptions = IllegalArgumentException.class)
	public void testSumNullString() {
		summator.sum(null, "abc");
	}

	/**
	 * Tests Summator class method sum(String a, String b) with invalid format strings.
	 */
	@Test(expectedExceptions = NumberFormatException.class)
	public void testSumInvalidFormatString() {
		summator.sum("yut455", "abc");
	}

	/**
	 * Tests Summator class method sum(String a, String b) with numbers.
	 */
	@Test
	public void testSumStringNumbers() {
		String actual = summator.sum("13", "23");
		String expected = "36";
		Assert.assertEquals(actual, expected);
	}

	/**
	 * Tests Summator class method sum(String a, String b) with negative numbers.
	 */
	@Test
	public void testSumStringNegativeNumbers() {
		String actual = summator.sum("-13", "-23");
		String expected = "-36";
		Assert.assertEquals(actual, expected);
	}

	/**
	 * Tests Summator class method sum(String a, String b) with real numbers.
	 */
	@Test
	public void testSumStringRealNumbers() {
		String actual = summator.sum("13.7", "23.2");
		String expected = "36.9";
		Assert.assertEquals(actual, expected);
	}

	/**
	 * Tests Summator class method sum(String a, String b) with negative real numbers.
	 */
	@Test
	public void testSumStringNegativeRealNumbers() {
		String actual = summator.sum("-13.1", "-23.0");
		String expected = "-36.1";
		Assert.assertEquals(actual, expected);
	}

	/**
	 * Tests Summator class method sum(String a, String b) with big numbers.
	 */
	@Test
	public void testSumStringBigNumbers() {
		String actual = summator.sum("9999999999999999999999999999999", "383333333222222222");
		String expected = "10000000000000383333333222222221";
		Assert.assertEquals(actual, expected);
	}

	/**
	 * Tests Summator class method sum(String a, String b) with big negative numbers.
	 */
	@Test
	public void testSumStringBigNegativeNumbers() {
		String actual = summator.sum("-9999999999999999999999999999999", "-383333333222222222");
		String expected = "-10000000000000383333333222222221";
		Assert.assertEquals(actual, expected);
	}
	

	/**
	 * Tests Summator class method sum(String a, String b) with big real numbers.
	 */
	@Test
	public void testSumStringBigRealNumbers() {
		String actual = summator.sum("10333333333333333333300333333333330.9999999993333333333333333333333339999999", "838888888333333333333333333333333338888888.33333333333333333");
		String expected = "838888898666666666666666666633666672222219.3333333326666666633333333333333339999999";
		Assert.assertEquals(actual, expected);
	}

	/**
	 * Tests Summator class method sum(String a, String b) with big real negative numbers.
	 */
	@Test
	public void testSumStringBigRealNegativeNumbers() {
		String actual = summator.sum("-10333333333333333333300333333333330.9999999993333333333333333333333339999999", "-838888888333333333333333333333333338888888.33333333333333333");
		String expected = "-838888898666666666666666666633666672222219.3333333326666666633333333333333339999999";
		Assert.assertEquals(actual, expected);
	}

}
