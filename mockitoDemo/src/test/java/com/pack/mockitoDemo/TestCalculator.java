package com.pack.mockitoDemo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class TestCalculator {
	
	Calculator c1 = null;
	CalculatorService cs = Mockito.mock(CalculatorService.class);
	
	@Test
	public void testOperation() {
		assertEquals(30, c1.performCalculation(cs));
		System.out.println("Tested operation...");
	}
	
	@Before
	public void createObject() {
		c1 = new Calculator();
	}

}
