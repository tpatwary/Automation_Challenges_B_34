package com.TestNgChallenges;

import org.testng.annotations.Test;

public class DependsOnMethod {
	

	@Test(dependsOnMethods = "getOpenBrowser")
	public void getLogIn() {
		System.out.println("getLogIn");
	}

	//@Test(dependsOnMethods = "getLogIn")
	public void getCloseBrowser() {
		System.out.println("getCloseBrowser");
	}
	@Test
	public void getOpenBrowser() {
		System.out.println("getOpenBrowser");
	}
}
