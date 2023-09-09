package com.saucedemo.test;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.Testbase.TestBase;
import com.saucedemo.pages.LoginPage;

public class LoginPageTest  extends TestBase{ 
      
	@Test
	public void validateUnAndPas() throws InterruptedException
	{
		  LoginPage log=new LoginPage(driver);
		  log.enterUsername("standard_user");
		  log.enterPassword("secret_sauce");
		  log.clickOnLoginBtn();
		  Thread.sleep(2000);
		 String exp_url= driver.getCurrentUrl();
		 String act_url="https://www.saucedemo.com/v1/inventory.html";
		  Assert.assertEquals(exp_url,act_url);
	}
}
