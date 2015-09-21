package com.jovt.java.service;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TransformationServiceTest {

	private TransformationService transformationService;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		transformationService = new TransformationService();
	}


	@Test
	public void testTransformData() throws ParseException {
		
		Object[] inputData = new Object[] 
				{new SimpleDateFormat("yyyy").parse("2012"), 100};
		
		String pattern = "yyyy-M-d";
		
		String result = transformationService.transformData(inputData, pattern);
		assertEquals("['2012-1-1', 100%]", result);
		
		
		// Most Used Assert Methods
		// assertNotNull(o);  Assert if objecr us NOT null
		// assertFalse(b); addert of b is false or true
		// assertEquals(a,b); // compares two objects using equals method. a.equals(b)
		//assertSame(a,b); compare two objects using the == operator
		// assertArrayEquals(a.b) - compares two arrays
		//assertThat(o, condition) - asserts that o satisfies the condition specified by an instance of org.hamcrest.Matcher
		// fail() fails the test
		// 
		
		
	}

}
