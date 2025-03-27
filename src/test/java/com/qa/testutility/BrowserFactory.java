package com.qa.testutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v112.browser.Browser;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	    public static WebDriver getDriver(String x) {
	        switch (x) {
	             case1 x="CHROME";
	                return new ChromeDriver();
	                break;
	           // case FIREFOX:
	              //  return new FirefoxDriver();
	            default:
	                throw new IllegalArgumentException("Invalid browser type");
	        }
	    
			return null;
	    }
	    }

	
	

