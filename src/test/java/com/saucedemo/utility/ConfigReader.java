package com.saucedemo.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	public String readConfig(String readvalue) throws IOException
	{
		String path= System.getProperty("user.dir")+"\\src\\test\\resources\\TestData\\Config.properties";
	   FileInputStream fis=new FileInputStream(path);
	   
	   Properties prop=new Properties();
	   prop.load(fis);
	   String value=prop.getProperty(readvalue);
	   return value;
	
	}

}
