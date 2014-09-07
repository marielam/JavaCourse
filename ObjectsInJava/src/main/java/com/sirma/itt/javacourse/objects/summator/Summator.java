package com.sirma.itt.javacourse.objects.summator;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Class for summing integer numbers, float pointing numbers, strings, objects.
 * 
 * @author Mariela
 */
public class Summator {

	/**
	 * Sums two integer numbers.
	 * 
	 * @param a
	 *            the first number
	 * @param b
	 *            the second number
	 * @return a+b
	 */
	public int sum(Integer a, Integer b) {
		return a + b;
	}

	/**
	 * Sums two numbers of float type.
	 * 
	 * @param a
	 *            the first number
	 * @param b
	 *            the second number
	 * @return a+b
	 */
	public float sum(Float a, Float b) {
		return a + b;
	}

	/**
	 * Sums two numbers of BigInteger type.
	 * 
	 * @param a
	 *            the first number
	 * @param b
	 *            the second number
	 * @return a+b
	 */
	public BigInteger sum(BigInteger a, BigInteger b) {
		return a.add(b);
	}

	/**
	 * Sums two numbers of BigDecimal type.
	 * 
	 * @param a
	 *            the first number
	 * @param b
	 *            the second number
	 * @return a+b
	 */
	public BigDecimal sum(BigDecimal a, BigDecimal b) {
		return a.add(b);
	}

	/**
	 * Checks if a given string can be parsed to BigInteger.
	 * 
	 * @param number
	 *            the string to be checked
	 * @return true if it can be parsed or false if it cannot be
	 */
	public boolean isBigInteger(String number) {

		try {
			new BigInteger(number);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}

	/**
	 * Checks if a given string can be parsed to BigDecimal.
	 * 
	 * @param number
	 *            the string to be checked
	 * @return true if it can be parsed or false if it cannot be
	 */
	public boolean isBigDecimal(String number) {

		try {
			new BigDecimal(number);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}

	/**
	 * Sums two numbers of String type.
	 * 
	 * @param a
	 *            the first number
	 * @param b
	 *            the second number
	 * @return a+b
	 */
	public String sum(String a, String b) {

		if (a == null || b == null) {
			throw new IllegalArgumentException("One of the strings is null");
		}

		if (a.isEmpty() || b.isEmpty()) {
			throw new IllegalArgumentException("One of the strings is empty");
		}

		if ((!a.matches("[-0-9].*")) || (!b.matches("[-0-9].*"))) {
			throw new NumberFormatException("Invalid number format");
		}

		if (isBigInteger(a) && isBigInteger(b)) {
			BigInteger number1 = new BigInteger(a);
			BigInteger number2 = new BigInteger(b);
			BigInteger sum = sum(number1, number2);
			return sum.toString();
		} else {
			BigDecimal number1 = new BigDecimal(a);
			BigDecimal number2 = new BigDecimal(b);
			BigDecimal sum = sum(number1, number2);
			return sum.toString();
		}
	}
}
