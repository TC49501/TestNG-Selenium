package com.thiru.testng.examples.exception;

import org.testng.annotations.Test;

public class TestRuntime {

	//@Test(expectedExceptions = ArithmeticException.class)
	@Test
	public void divisionWithException() {
		int i = 1 / 0;
	}

}