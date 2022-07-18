package com.oswaldo.test.exercise;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class TestApp {
	
		
	@Test
	public void shouldCompareValues() {
		
		int[] list = {3, 5, 9, 8, 1, 7};		
		int[] returnedArray = CheckArray.checkValues(list);
		
		assertEquals(9, returnedArray[0]);
		assertEquals(1, returnedArray[1]);
		
		
	}

}
