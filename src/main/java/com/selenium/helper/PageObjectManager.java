package com.selenium.helper;

import org.openqa.selenium.WebDriver;

import com.selenium.pom.HomePage;
import com.selenium.pom.LoginPage2;
import com.selenium.pom.LoginPage3;
public class PageObjectManager {
	public  WebDriver driver;

  
  public PageObjectManager(WebDriver driverL) {
	  this.driver = driverL;
  }
  
	  private HomePage hp;
	  private LoginPage2 lp2;
	  private LoginPage3 lp3;
	public HomePage getHp() {
		if (hp==null) {
			hp = new HomePage(driver);
		}
	
		return hp;
	}
	public LoginPage2 getLp() {
		if (lp2==null) {
			lp2 = new LoginPage2(driver);
			
		}
	
		return lp2;
	}
	public LoginPage3 getLp3() {
		if (lp3==null) {
			lp3 = new LoginPage3(driver);
			
			
		}
	
		return lp3;
	}
	  
}
	
	  


