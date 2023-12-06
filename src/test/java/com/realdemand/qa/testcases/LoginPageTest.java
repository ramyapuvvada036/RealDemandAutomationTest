package com.realdemand.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.realdemand.qa.base.BaseTest;
import com.realdemand.qa.pages.HomePage;
import com.realdemand.qa.pages.LoginPage;

public class LoginPageTest extends BaseTest {

	LoginPage loginpage;
	HomePage homepage;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		loginpage = new LoginPage();

	}

	@Test(priority = 1)
	public void loginPageTitleTest() {
		String title = loginpage.validateLoginPageTitle();
		Assert.assertEquals(title, "RealReco");
	}

	@Test(priority = 2)
	public void RDLogoTest() {
		boolean logoPresence = loginpage.validateRDLogo();
		Assert.assertTrue(logoPresence);
	}

	@Test(priority = 3)
	public void LoginTest() throws InterruptedException {

		homepage = loginpage.validateLogin(prop.getProperty("adminUsername"), prop.getProperty("adminPassword"));
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}