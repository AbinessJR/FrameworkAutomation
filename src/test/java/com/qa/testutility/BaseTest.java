package com.qa.testutility;
	import java.time.Duration;

import org.openqa.selenium.WebDriver;
	import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

	public class BaseTest extends BrowserFactory{
		protected WebDriver driver;
	    protected String baseUrl;

	    
	    @BeforeMethod
	    @Parameters("base.url") // Fetch from testng.xml
	    public void setup(@Optional("https://www.saucedemo.com/") String url) {
	        baseUrl = url;
	     
	        driver = BrowserFactory.getDriver("chrome");
	        driver.get(baseUrl);
	        driver.manage().window().maximize();
	     //   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	       
	    }

	    @AfterMethod
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	           // driver = null; 
	        }
	    }
	
	}
