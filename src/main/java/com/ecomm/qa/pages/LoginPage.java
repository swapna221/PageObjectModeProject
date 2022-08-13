package com.ecomm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecomm.qa.base.TestBase;

public class LoginPage extends TestBase{
	//OR Object Repository
	
	@FindBy(xpath="//a[normalize-space()='Login']")
	WebElement loginButton;

	@FindBy(xpath="//input[@name=\'userId\']")
	WebElement username;
	
	@FindBy(xpath="//input[@name=\'password\']")
	WebElement password;
	
	@FindBy(xpath="//span[@class=\'ng-star-inserted\']")
	WebElement loginbutton;
	
	@FindBy(xpath="//button[@text='logo']")
	WebElement logo;
	
	//How to initialize page factory

	public LoginPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	//Actions , features
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateLogo() {
		return logo.isDisplayed();
	}
	
	public void login(String un, String pwd) {
		loginButton.click();
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbutton.click();
	}

}
