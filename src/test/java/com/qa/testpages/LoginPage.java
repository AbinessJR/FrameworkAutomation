package com.qa.testpages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
WebDriver driver;



 	@FindBy(xpath="//input[@id='user-name']")
 	WebElement menu;
 	public WebElement username() {
 		return menu;
 	}
	@FindBy(xpath="//input[@id='password']")
 	WebElement menu1;
 	public WebElement password() {
 		return menu1;
 	}

    @FindBy(xpath="//input[@id='login-button']")
	WebElement menu2;
	public WebElement loginButton() {
		return menu2;
	}
 	
 	
 	  public LoginPage(WebDriver driver)
 	    {
 	        this.driver=driver;
 	       PageFactory.initElements(driver,this); 
 	       
 	      try {
 	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
 	            wait.until(ExpectedConditions.alertIsPresent());
 	            Alert alert = driver.switchTo().alert();
 	            alert.accept(); // Click "OK" to close the alert
 	        } catch (NoAlertPresentException | TimeoutException e) {
 	            // No alert found, proceed normally
 	            System.out.println("No alert detected. Continuing test.");
 	        }
 	    }
 	  
 	  

}