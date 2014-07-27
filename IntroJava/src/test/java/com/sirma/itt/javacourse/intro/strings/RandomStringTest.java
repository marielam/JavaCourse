package com.sirma.itt.javacourse.intro.strings;

import org.testng.Assert;
import org.testng.annotations.Test;
/**
 * 
 * Test class for the RandomString class`s method.
 * @author Mariela
 */
public class RandomStringTest {
	
/**
 * Test with zero for the length of the string.	
 */
  @Test(expectedExceptions=IllegalArgumentException.class)
  public void testGenerateRandomStringZeroLength() {
	  int length=0;
	  RandomString.generateRandomString(length);
  }
  
  /**
   * Test with negative number for the length of the string.	
   */
    @Test(expectedExceptions=IllegalArgumentException.class)
    public void testGenerateRandomStringNegativeNumberLength() {
  	  int length=-24;
  	  RandomString.generateRandomString(length);
    }
    
    /**
     * Test with valid symbols.	
     */
      @Test
      public void testGenerateRandomStringValidSymbols() {
    	  String actual=RandomString.generateRandomString(58);
    	  if(!actual.matches("[0-9a-zA-z]*")) {
    		  Assert.fail("The generated string is not valid!");
    	  }
      }
}
