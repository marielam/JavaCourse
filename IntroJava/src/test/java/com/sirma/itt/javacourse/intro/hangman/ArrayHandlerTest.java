package com.sirma.itt.javacourse.intro.hangman;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Test class for the methods of ArrayHandler class.
 * 
 * @author Mariela
 */
public class ArrayHandlerTest {

	/**
	 * Tests ArrayHandler with an empty array.
	 */
	@Test(expectedExceptions = IllegalArgumentException.class)
	public void testArrayHandlerEmptyArray() {
		String[] array = {};
		new ArrayHandler(array);
	}

	/**
	 * Test ArrayHandler with null array.
	 */
	@Test
	public void testArrayHandlerNullArray() {
		String[] array = null;
		Assert.assertNull(array);

	}

	/**
	 * Tests ArrayHandler with a word which is not in the array.
	 */
	@Test
	public void testArrayHandlerNonExistingWord() {
		String[] array = { "ginger" };
		ArrayHandler arrHandler = new ArrayHandler(array);
		if (!arrHandler.chooseRandomWord().equals(array[0])) {
			Assert.fail("The array doe not contain this word!");
		}
	}
}
