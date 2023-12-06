package com.realdemand.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.realdemand.qa.base.BaseTest;
import com.realdemand.qa.pages.HomePage;
import com.realdemand.qa.pages.LoginPage;

public class HomePageTest extends BaseTest {

	LoginPage loginpage;
	HomePage homepage;

	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initialization();
		loginpage = new LoginPage();
		loginpage.validateLogin(prop.getProperty("adminUsername"), prop.getProperty("adminPassword"));
	}

	@Test
	public void verifyHomepageTest() {
		
		homepage.verifyHomeTab();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
