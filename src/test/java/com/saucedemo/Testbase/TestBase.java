package com.saucedemo.Testbase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.saucedemo.utility.ConfigReader;

public class TestBase {
	public static WebDriver driver;
	@BeforeSuite
	public void initBrowser() throws IOException
	{
		ConfigReader conf=new ConfigReader();
	String browsername=	conf.readConfig("browser");
	if(browsername.equals("chrome"))
	{
	    driver=new ChromeDriver();
	}
	else if(browsername.equals("edge"))
	{
		driver=new FirefoxDriver();
	}
	String url=	conf.readConfig("testsiteurl");
	driver.get(url);
	
	}
	
	
@AfterSuite
public void tearDown()
{
	
}
}