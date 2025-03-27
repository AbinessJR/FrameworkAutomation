package com.qa.testpages;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.testutility.BaseTest;
import com.qa.testutility.BrowserFactory;
import com.qa.testutility.ConfigReader;



public class login extends BaseTest {
	
	    WebDriver driver;
	    login loginPage;
	    
	    public login(WebDriver driver2) {
			// TODO Auto-generated constructor stub
		}



		@BeforeMethod
	    public void setup() {
	        driver = BrowserFactory.getDriver("CHROME"); 
	        driver.get(ConfigReader.getBaseUrl());       // From your framework's config reader
	        loginPage = new login(driver);
	    }
	    
	 @Test
	 public void 
	    
	    @AfterMethod
	    public void tearDown() {
	        driver.quit();
	    }
	}

