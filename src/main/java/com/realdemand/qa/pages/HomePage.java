package com.realdemand.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.realdemand.qa.base.BaseTest;

public class HomePage extends BaseTest {

	@FindBy(xpath = "//div[contains(text(),'HOME')]")
	WebElement homeTab;

	@FindBy(xpath = "//span[contains(text(),'Master Data')]")
	WebElement masterDataWidget;

	@FindBy(xpath = "//span[contains(text(),'Transactions')]")
	WebElement transactionDataWidget;

	@FindBy(xpath = "//button[@id='dropdownMenuButton']")
	WebElement menuButton;

	// initializing the page objects
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	// Actions
	public boolean verifyHomeTab() {
		return homeTab.isDisplayed();
	}

	public MasterDataPage clickOnMasterDataWidget() {
		masterDataWidget.click();
		return new MasterDataPage();
	}

	public TransactionDataPage clickOnTransactionsDataWidget() {
		transactionDataWidget.click();
		return new TransactionDataPage();
	}

	public MenuPage clickOnMenuDropdown() {
		menuButton.click();
		return new MenuPage();
	}
}