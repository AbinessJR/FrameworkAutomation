package com.qa.testutility;
	import org.openqa.selenium.WebDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
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
	       
	    }

	    @AfterMethod
	    public void tearDown() {
	    //    if (driver != null) {
	      //      driver.quit();
	        }
	    }
	

