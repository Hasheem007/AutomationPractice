package com.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {
	
	public WebDriver driver;
	  
	public LoginPage2(WebDriver driver1){ 
		this.driver = driver1;
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath="//img[@class=\"logo img-responsive\"]")
private WebElement logo;
	
public WebElement getLogo() {
	return logo;
	}

	@FindBy(xpath="//div[@class='header_user_info']") 
	private WebElement signin;

	public WebElement getSignin() {
		return signin;
	}

	}

	
	
	
	

