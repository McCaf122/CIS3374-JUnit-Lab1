package com.lab1.calculator;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;


public class CalculatorTest {

	private Calculator calculator;
	
	@Before
	public void setUp()
	{
		calculator = new Calculator();
	}
	
	@Test
	public void addTest()
	{
		assertEquals(4, calculator.add(2,2));
	}
	
	@Test
	public void subtractTest()
	{
		assertEquals(4, calculator.subtract(8, 4));
	}
	
	@Test
	public void multiplyTest()
	{
		assertEquals(2,calculator.multiply(2, 1));
	}
	
	@Test
	public void divideTest()
	{
		assertEquals(10,calculator.divide(10, 1));
	}
}