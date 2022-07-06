package com.pageobjectmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pom.LoginPage;

public class Pom {
	
	public WebDriver driver;
	
	private LoginPage lp;
	
	public Pom(WebDriver driver2) {
		
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}

	public LoginPage getLogin() {
		
		if(lp == null) {
		
		 lp = new LoginPage(driver);
		
	
	}

		return lp;
}

}