package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringHelperTest {
	StringHelper helper;

	
	@Before
	public void before()
	{
		helper = new StringHelper();
		System.out.println("Inisde Before() in StringHelper class");
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AinFirst2Position() {
		System.out.println("Inside test1");
		assertEquals("CD",helper.truncateAInFirst2Positions("AACD"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AinFirstPosition()
	{
		System.out.println("Inside test2");
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}
	
	//ABCD=> false, ABAB=>true, AB=>true,A=>false.
	@Test
	public void testAreFirstAndLastTwoCharactersTheSam()
	{
		System.out.println("Inside test3");
		assertTrue("This condition is failed ",helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}

}
