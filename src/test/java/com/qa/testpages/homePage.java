package com.qa.testpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage extends LoginPage{

public homePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	
	WebDriver driver;

	@FindBy(id="react-burger-menu-btn")
	WebElement menu3;
	
	public WebElement hamburger(){
		return menu3;
	}
	
	

	}
	
	


