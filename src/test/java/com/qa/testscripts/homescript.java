package com.qa.testscripts;

import org.testng.annotations.Test;

import com.qa.testpages.homePage;
import com.qa.testutility.BaseTest;

public class homescript extends loginscript{
 
	homePage home_p;
	
	@Test
	public void home() {
	home_p = new homePage(driver);
	
	home_p.hamburger().click();
	System.out.println("Menu clicked successfully");

	
	
}


}