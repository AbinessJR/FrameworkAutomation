package com.qa.testpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
     WebDriver driver;

 	@FindBy(xpath="//i[@class='material-icons']")
 	WebElement menu;
 	public WebElement login() {
 		return menu;
 	}
	@FindBy(xpath="//i[@class='material-icons']")
 	WebElement menu1;
 	public WebElement login1() {
 		return menu;
 	}

@FindBy(xpath="//i[@class='material-icons']")
	WebElement menu2;
	public WebElement login2() {
		return menu;
	}
 	
 	
 	
 	
 	  public LoginPage(WebDriver driver)
 	    {
 	        this.driver=driver;
 	       PageFactory.initElements(driver,this); 
 	    }
}