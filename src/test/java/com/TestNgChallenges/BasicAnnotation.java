package com.TestNgChallenges;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicAnnotation {

	@BeforeTest
	public void getBeforeTest() {
		System.out.println("Run getBeforeTest");
	}

	@BeforeMethod
	public void getBeforeMethod() {
		System.out.println("Run getBeforeMethod ");
	}

	@Test
	public void getTest() {
		System.out.println("Run getTest ");
	}

	@AfterClass
	public void getAfterClass() {
		System.out.println("Run getAfterClass ");
	}

	@BeforeSuite
	public void getBeforeSuite() {
		System.out.println("Run getBeforeSuite");
	}

	@AfterTest
	public void getAfterTest() {
		System.out.println("Run getAfterTest ");
	}

	@BeforeClass
	public void getBeforeClass() {
		System.out.println("Run getBeforeClass ");
	}

	@AfterSuite
	public void getAfterSuite() {
		System.out.println("Run getAfterSuite ");
	}

	@AfterMethod
	public void getAfterMethod() {
		System.out.println("Run getAfterMethod ");
	}

}
