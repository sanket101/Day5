package com.pack.mockitoDemo;

public class Calculator {
	
	public int performCalculation(CalculatorService cs) {
		return cs.add(10, 20);
	}
}
