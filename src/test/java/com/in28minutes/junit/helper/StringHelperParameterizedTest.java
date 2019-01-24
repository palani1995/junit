package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {
	StringHelper helper = new StringHelper();

	private String input;
	private String expectedOutput;

	public StringHelperParameterizedTest(String input, String expectedOutput) {
		super();
		this.input = input;
		this.expectedOutput = expectedOutput;
	}

	@Parameters
	public static Collection<String[]> testCOnditions() {
		String expectedOutputs[][] = { { "AACD", "CD" }, { "ACD", "CD" } };
		return Arrays.asList(expectedOutputs);
	}

	@Test
	public void testTruncateAInFirst2Positions_AinFirst2Position() {
		System.out.println("Inside test1");
		assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));
	}

	@Test
	public void testTruncateAInFirst2Positions_AinFirstPosition() {
		System.out.println("Inside test2");
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}

	// ABCD=> false, ABAB=>true, AB=>true,A=>false.
	@Test
	public void testAreFirstAndLastTwoCharactersTheSam() {
		System.out.println("Inside test3");
		assertFalse("This condition is failed ", helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}

}
