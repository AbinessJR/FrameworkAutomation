package com.qa.testutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	    static Properties prop = new Properties();

	    static {
	        try {
	            FileInputStream fis = new FileInputStream("src/test/resources/config.properties");
	            prop.load(fis);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    public static String getBaseUrl() {
	        return prop.getProperty("https://www.saucedemo.com/login");
	    }
	}
