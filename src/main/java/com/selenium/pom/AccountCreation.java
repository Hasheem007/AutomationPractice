package com.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountCreation {
	
	
	public WebDriver driver;
	  
	public AccountCreation(WebDriver driver3){ 
		this.driver = driver3;
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(id="id_gender1")
	private WebElement radiobtn;
	
	@FindBy(id="customer_firstname")
	private WebElement firstname;
	
	@FindBy(id="customer_lastname")
	private WebElement lastname;
	
	@FindBy(id="passwd")
	private WebElement pass;
	
	@FindBy(id="days")
	private WebElement day;
	
	@FindBy(id="months")
	private WebElement month;

	@FindBy(id="years")
	private WebElement year;
	
	@FindBy(xpath="//div[@class=\"checker\"]")
	private WebElement check;
	
	@FindBy(id="firstname")
	private WebElement fname;
	
	@FindBy(id="lastname")
	private WebElement lname;
	
	@FindBy(id="company")
	private WebElement Company;
	
	@FindBy(id="address1")
	private WebElement address;
	
	@FindBy(id="address2")
	private WebElement saddress;
	
	@FindBy(id="city")
	private WebElement city;
	
	@FindBy(id="id_state")
	private WebElement state;
	
	@FindBy(id="postcode")
	private WebElement pcode;
	
	@FindBy(id="other")
	private WebElement option;
	
	@FindBy(id="phone")
	private WebElement phone;
	
	@FindBy(id="phone_mobile")
	private WebElement mobile2;
	
	@FindBy(id="alias")
	private WebElement maddress;
	
	@FindBy(id="submitAccount")
	private WebElement saccount;
	
	@FindBy(xpath="//a[@class=\"logout\"]") 
	private WebElement Lout;

	public WebElement getLout() {
		return Lout;
	}

	public WebElement getRadiobtn() {
		return radiobtn;
	}

	public WebElement getFirstname() {
		return firstname;
	}


	public WebElement getLastname() {
		return lastname;
	}

	

	public WebElement getPass() {
		return pass;
	}

	

	public WebElement getDay() {
		return day;
	}

	

	public WebElement getMonth() {
		return month;
	}

	

	public WebElement getYear() {
		return year;
	}

	

	public WebElement getCheck() {
		return check;
	}

	

	public WebElement getFname() {
		return fname;
	}

	

	public WebElement getLname() {
		return lname;
	}

	

	public WebElement getCompany() {
		return Company;
	}

	

	public WebElement getAddress() {
		return address;
	}

	

	public WebElement getSaddress() {
		return saddress;
	}

	

	public WebElement getCity() {
		return city;
	}

	

	public WebElement getState() {
		return state;
	
	}

	public WebElement getPcode() {
		return pcode;
	}

	

	public WebElement getOption() {
		return option;
	}

	

	public WebElement getPhone() {
		return phone;
	}

	

	public WebElement getMobile2() {
		return mobile2;
	}

	

	public WebElement getMaddress() {
		return maddress;
	}

	

	public WebElement getSaccount() {
		return saccount;
	}

	

	
	
	
	
	
	
	
	
}


