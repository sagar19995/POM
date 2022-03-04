package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {
//demo unit test cases 
//If execute through Maven test - happens direclty 
	@Test
	public void sum() {
		System.err.println("SUM");
		int a = 10;
		int b = 20;
		Assert.assertEquals(30, a + b);

	}

	@Test
	public void sub() {
		System.err.println("SUB");
		int a = 10;
		int b = 20;
		Assert.assertEquals(10, b - a);

	}

	@Test
	public void multi() {
		System.err.println("MULTIPLICATION");
		int a = 10;
		int b = 20;
		Assert.assertEquals(200, a * b);

	}

	@Test
	public void div() {
		System.err.println("DIV");
		int a = 10;
		int b = 20;
		Assert.assertEquals(2, b / a);

	}

}
