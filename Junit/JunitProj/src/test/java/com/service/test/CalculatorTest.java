package com.service.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.service.Calculator;

class CalculatorTest {

	@Test
	void testAdd() {
		Calculator calc = new Calculator();
		Integer actualResult = calc.add(10, 5);
		Integer expectedResult = 15;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void testMultiply() {
		Calculator calc = new Calculator();
		Integer actualResult = calc.multiply(10, 5);
		Integer expectedResult = 50;
		assertEquals(expectedResult, actualResult);
	}

}
