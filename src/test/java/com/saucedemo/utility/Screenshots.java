package com.saucedemo.utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshots {
   public static String captureScreenshot(WebDriver driver, String Filename) throws IOException
   {
	   
	   String path=System.getProperty("user.dir")+"\\Screenshot\\"+Filename+"\\.png";
	   TakesScreenshot ts=(TakesScreenshot)driver;
	  File  src= ts.getScreenshotAs(OutputType.FILE);
	  File des=new File(path);
	  FileHandler.copy(src,des);
	  return path;
	  
   }
}
