package com.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public WebDriver driver;
	  
	public HomePage(WebDriver driver2){ 
		this.driver = driver2;
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(id="email_create")
	private WebElement newnameid;

	public WebElement getNewnameid() {
		return newnameid;
	}

	@FindBy(id="SubmitCreate")
	 private WebElement login;

	public WebElement getLogin() {
		return login;
	}

	
	}
	
	
	
	
		
	


