package com.qa.testscripts;

import com.qa.testpages.LoginPage;
import com.qa.testutility.BaseTest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class loginscript extends BaseTest {
     WebDriver driver;
     LoginPage lg;
     
    @Test
    public void login() {
    	lg =  new LoginPage(driver);
    	lg.login().sendKeys("standard_user");
    	lg.login().sendKeys("standard_user");
    	lg.login().sendKeys("standard_user");
    	lg.login().sendKeys("standard_user");
    	
    	
    	
    	
    	//LoginPage loginPage = new com.qa.testpages.LoginPage(driver);
      //  loginPage.login("standard_user", "secret_sauce");
       // Assert.assertTrue(driver.getCurrentUrl().contains("inventory.html"));
    	
    }
}