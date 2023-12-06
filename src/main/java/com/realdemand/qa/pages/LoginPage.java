package com.realdemand.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.realdemand.qa.base.BaseTest;

public class LoginPage extends BaseTest {

	// Page Factory
	@FindBy(name = "email")
	WebElement username;

	@FindBy(name = "confirmP")
	WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginBtn;

	@FindBy(xpath = "//a[contains(text(), 'Forgot Password?')]")
	WebElement forgotPassword;

	@FindBy(xpath = "//button[@type='button']")
	WebElement resetBtn;

	@FindBy(xpath = "//img[@class='card-img rounded']")
	WebElement RDLogo;

	// initializing the page objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	// Actions
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}

	public boolean validateRDLogo() {
		return RDLogo.isDisplayed();
	}

	public HomePage validateLogin(String un, String psw) throws InterruptedException {

		Thread.sleep(2000);
		username.sendKeys(un);
		Thread.sleep(500);
		password.sendKeys(psw);
		Thread.sleep(2000);
		loginBtn.click();
		
		return new HomePage();
	}

}