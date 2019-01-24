package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickBeforeAfterTest {

	
	@BeforeClass
	public static void beforeClass()
	{
		System.out.println("before class");
	}
	
	
	@Before
	public void setup() {
		System.out.println("Before Test()");
	}

	@Test
	public void test1() {
		System.out.println("test1 is executed");
	}

	@Test
	public void test2() {
		System.out.println("test2 is executed");
	}

	@After
	public void tearDown() {
		System.out.println(" after inside tearDown()");
	}
	
	@AfterClass
	public static void afterClass()
	{
		System.out.println("after class");
	}

}
