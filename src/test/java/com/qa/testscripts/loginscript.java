package com.qa.testscripts;

import com.qa.testpages.LoginPage;
import com.qa.testutility.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class loginscript extends BaseTest {

    @Test
    public void testValidLogin() {
    	LoginPage loginPage = new com.qa.testpages.LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");
        Assert.assertTrue(driver.getCurrentUrl().contains("inventory.html"));
    }
}