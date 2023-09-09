package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement username;
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement login_button;
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	   this.driver=driver;
	}
	public void enterUsername(String username1)
	{
		username.sendKeys(username1);
	}
	public void enterPassword(String pass)
	{
		password.sendKeys(pass);
	}
	public void clickOnLoginBtn()
	{
		login_button.click();
	}
}
