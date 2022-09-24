package com.project.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


public class RegisterTest {
	
	private WebDriver driver;
	LoginPage registerPage;

	@Before
	public void setUp() throws Exception {
		
		registerPage = new LoginPage(driver);
		driver = registerPage.chromeDriverConection();
		registerPage.visit("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		registerPage.registerUser();
		assertEquals("Welcome to your account. Here you can manage all of your personal information and orders.", registerPage.registerCorrectMessage());
		System.out.println(registerPage.registerCorrectMessage());
	}


}
