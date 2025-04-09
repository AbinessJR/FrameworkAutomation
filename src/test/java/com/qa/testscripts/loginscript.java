package com.qa.testscripts;

import com.qa.testpages.LoginPage;
import com.qa.testutility.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class loginscript extends BaseTest {

    @Test
    public void testValidLogin() {
    	LoginPage loginPage = new com.qa.testpages.LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");
      //  Assert.assertTrue(driver.getCurrentUrl().contains("inventory.html"));
         
        String header = driver.getCurrentUrl(); 
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(header, "inventory.html");

        
       
    }
}