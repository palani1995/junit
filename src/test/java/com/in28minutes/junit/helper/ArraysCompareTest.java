package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArraysCompareTest {

	//arrays.sort
	@Test
	public void testArrays_RandomArray() {
		int[] number = {12,3,5,1};
		int[] expected = {1,3,5,12};
		Arrays.sort(number);
		assertArrayEquals(expected, number);
 	}
	
	@Test(expected=NullPointerException.class)
	public void testArraySort_NullArray()
	{
		int[] numbers =null;
		Arrays.sort(numbers);
	}
	
	@Test(timeout= 100)
	public void testSort_Performance()
	{
		int array[]= {13,11,17};
		for (int i = 1; i <100000; i++) {
			array[0] = i;
			Arrays.sort(array);
			
		}
		
	}

}
