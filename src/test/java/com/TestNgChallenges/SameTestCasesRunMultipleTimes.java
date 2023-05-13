package com.TestNgChallenges;

import org.testng.annotations.Test;

public class SameTestCasesRunMultipleTimes {
	@Test(invocationCount = 10)
	public void GetMethod() {
		System.out.println("GetMethod");
	}

}
