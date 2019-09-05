package com.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderAuto {
	
	public WebDriver driver;

	public OrderAuto(WebDriver driverfourth) {
		this.driver = driverfourth;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@href=\"http://automationpractice.com/index.php?controller=order\"]")
	private WebElement addtocartclick;

	@FindBy(xpath = "//a[@class='button btn btn-default standard-checkout button-medium']")
	private WebElement proceedtocheckout1;

	@FindBy(xpath = "//button[@class='button btn btn-default button-medium']")
	private WebElement proceedtocheckout2;

	@FindBy(id = "uniform-cgv")
	private WebElement termsagree;

	@FindBy(xpath = "//button[@class='button btn btn-default standard-checkout button-medium']")
	private WebElement proceedtocheckout3;

	@FindBy(xpath = "//a[@class='bankwire']")
	private WebElement payment;

	@FindBy(xpath = "//button[@class='button btn btn-default button-medium']")
	private WebElement orderconfirm;

	@FindBy(xpath = "//a[@class='logout']")
	private WebElement signout;

	public WebElement getAddtocartclick() {
		return addtocartclick;
	}

	public WebElement getProceedtocheckout1() {
		return proceedtocheckout1;
	}

	public WebElement getProceedtocheckout2() {
		return proceedtocheckout2;
	}

	public WebElement getTermsagree() {
		return termsagree;
	}

	public WebElement getProceedtocheckout3() {
		return proceedtocheckout3;
	}

	public WebElement getPayment() {
		return payment;
	}

	public WebElement getOrderconfirm() {
		return orderconfirm;
	}

	public WebElement getSignout() {
		return signout;
	}

}



