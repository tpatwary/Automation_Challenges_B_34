package com.TestNgChallenges;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTesting {
	WebDriver driver;

	@BeforeMethod //
	@Parameters("Browsers") // @Parameters one of the advance annotation in TestNg which we use to run cross
							// browser testing.
	public void initialization(String browser) {
		if (browser.equalsIgnoreCase("Chrome")) {
			System.out.println("Test will execute with chrome browser");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("Edge")) {
			System.out.println("Test will execute with Edge browser");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		} else if (browser.equalsIgnoreCase("Firefox")) {
			System.out.println("Test will execute with Firefox browser");

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		}
	}

	@AfterMethod // Before it was from cucumber, But now it is coming from TestNg
	public void getCloseBrowser() {
		driver.quit();
		System.out.println("Browser Closed");
	}

	@Test // Same test cases will run in multiple browser
	public void getLogIn() {
//		driver.get("https://www.automationexercise.com/login");
//		driver.manage().window().maximize();
//		System.out.println("Log in the Application ");

		driver.get("https://www.automationexercise.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys("tanvirpatwary16@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Tester01");
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		String act = driver.findElement(By.xpath("//*[text()=' Home']")).getText();
		String exp = "Home";
		Assert.assertEquals(exp, act);
		System.out.println("Visibility of text : " + act);

	}

}
