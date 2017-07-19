package RotateList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* ### Unit Test 
UML is required
Unit test in  place before proceeding with code
Make sure you test EVERY public method

### Instructions

1. In your unit test class, initialize your custom List with values
2. In your unit test class call the method that rotates your array*/


import org.junit.Test;
import org.junit.Assert;
import org.junit.Assert.*;



public class RotateListTest {

	@Test
    public void testStartArray() {
    		// :Given
			List<String> listA = Arrays.asList("1 2 3 4 5 6".split(" "));
			String sourceBefore = listA.toString();
			//System.out.println(sourceBefore);
			// :When
			String sourceExpected = "[1, 2, 3, 4, 5, 6]"; 
			//System.out.println(sourceExpected);
			// :Then
			Assert.assertEquals(sourceBefore, sourceExpected);
	             
	}   

	@Test
    public void testRotatedArray() {	
			// :Given
			List<String> listA = Arrays.asList("1 2 3 4 5 6".split(" "));
			//String sourceBefore = listA.toString();
			String afterExpected = "[3, 4, 5, 6, 1, 2]";
			//System.out.println(afterExpected);	
			// :When
			int k = -2;
			String actualA = RotateList.rotate(listA, k);
			System.out.println(actualA);
			String actualS = actualA.toString();
			//:Then
			Assert.assertEquals(afterExpected, actualS);
	}
}
	
