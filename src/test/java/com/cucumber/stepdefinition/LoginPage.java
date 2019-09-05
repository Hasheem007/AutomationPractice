package com.cucumber.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.cucumber.runner.TestRunner;
import com.mav.base.Base;
import com.selenium.helper.FileDataManger;
import com.selenium.helper.PageObjectManager;
import com.selenium.pom.LoginPage2;
import com.selenium.pom.LoginPage3;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPage extends Base {
	public static WebDriver driver = TestRunner.driver;
	public static PageObjectManager pm = new PageObjectManager(driver);


@Given("^User hit the Automation practice website$")
public void user_hit_the_Automation_practice_website() throws Throwable {
	//driver = openBrowser("chrome");
	//getUrl("http://automationpractice.com/index.php?");
	String url = FileDataManger.fdm.getConfigReader().geturl();
	getUrl(url);


}

@Then("^User verifes the site logo$")
public void user_verifes_the_site_logo() throws Throwable {
	elementIsDisplayed(pm.getLp().getLogo());

}

@Then("^User verifies the page title$")
public void user_verifies_the_page_title() throws Throwable {
	getTitle();
	String s = "My Store";
	Assert.assertEquals(getTitle(), s);

}

@Then("^User click on Signin Button in Header$")
public void user_click_on_Signin_Button_in_Header() throws Throwable {
	clickoperation(pm.getLp().getSignin());
}

@When("^User enter the email id '(.*)' in the login page$")
public void user_enter_the_email_id_venkat_gmail_com_in_the_login_page(String username) throws Throwable {
	senkeys(pm.getLp3().getEmailid(), username);

	


}

@When("^User enter the password '(.*)' in the login page$")
public void user_enter_the_password_in_the_login_page(int arg1, String password) throws Throwable {
	senkeys(pm.getLp3().getPassword(), password);


}

@When("^User click on Login Button in the Login Page$")
public void user_click_on_Login_Button_in_the_Login_Page() throws Throwable {
    clickoperation(pm.getLp3().getLog());

}

@Then("^User verifies the Username 'mohan vasu' present in the header$")
public void user_verifies_the_Username_mohan_vasu_present_in_the_header() throws Throwable {
	LoginPage3 lp3 = new LoginPage3(driver);
	String actual = lp3.getUsernamedisplay().getText();
	Assert.assertTrue(actual.contains("mohan"));

}

@When("^User enters the product type in search field$")
public void user_enters_the_product_type_in_search_field() throws Throwable {
	LoginPage3 lp3 = new LoginPage3(driver);
	senkeys(lp3.getSearchfield(), "Dresses");

}

@When("^User click on search button$")
public void user_click_on_search_button() throws Throwable {
	LoginPage3 lp3 = new LoginPage3(driver);
	clickoperation(lp3.getSearchbtn());

}

@Then("^User verifies the product type is displayed in result section$")
public void user_verifies_the_product_type_is_displayed_in_result_section() throws Throwable {
	LoginPage3 lp3 = new LoginPage3(driver);
	String actual = lp3.getTopsellers().getText();
	Assert.assertTrue(actual.contains("TOP"));

}

//@When("^User click on the product$")
//public void user_click_on_the_product() throws Throwable {
//	LoginPage3 lp3 = new LoginPage3(driver);
//	clickoperation(lp3.getProduct());
//
//}
//
///*@Then("^User verifies whether the product name 'Printed Summer Dress' is displayed$")
//public void user_verifies_whether_the_product_name_Printed_Summer_Dress_is_displayed(String pname) throws Throwable {
//	LoginPage3 lp3 = new LoginPage3(driver);
//	String actual = lp3.getProductname().getText();
//	Assert.assertEquals(pname, actual);
//
//}*/
//
//@Then("^User click on add to cart button$")
//public void user_click_on_add_to_cart_button() throws Throwable {
//	LoginPage3 lp3 = new LoginPage3(driver);
//	clickoperation(lp3.getAddtocartbtn());
//
//}
//
//@Then("^User verifies whether the product is added in cart$")
//public void user_verifies_whether_the_product_is_added_in_cart() throws Throwable {
//   LoginPage3 lp3 = new LoginPage3(driver);
//   String actual = lp3.getProductaddedtocartmsg().getText();
//   Assert.assertTrue(actual.contains("1 item in your cart"));
//
//}
//
//@Then("^User click on proceed to checkout button in product page$")
//public void user_click_on_proceed_to_checkout_button_in_product_page() throws Throwable {
//	LoginPage3 lp3 = new LoginPage3(driver);
//	clickoperation(lp3.getProceedtocheckout());
//
//}
//
//@When("^User checks the product quantity in summary$")
//public void user_checks_the_product_quantity_in_summary() throws Throwable {
//	LoginPage3 lp3 = new LoginPage3(driver);
//	elementIsDisplayed(lp3.getQuantityadded());
//
//}
//
//@When("^User verifies the price of the selected product$")
//public void user_verifies_the_price_of_the_selected_product() throws Throwable {
//	LoginPage3 lp3 = new LoginPage3(driver);
//	String actual = lp3.getPrice().getText();
//	Assert.assertTrue(actual.contains("30"));
//
//}
//
//@Then("^User click on proceed to checkout button in Summary page$")
//public void user_click_on_proceed_to_checkout_button_in_Summary_page() throws Throwable {
//	LoginPage3 lp3 = new LoginPage3(driver);
//	clickoperation(lp3.getProceedtocheckout1());
//
//}
//
//@When("^User verifies the delivery address title 'YOUR DELIVERY ADDRESS' in the address section$")
//public void user_verifies_the_delivery_address_title_YOUR_DELIVERY_ADDRESS_in_the_address_section(String dtitle) throws Throwable {
//	LoginPage3 lp3 = new LoginPage3(driver);
//	String actual = lp3.getDeliveryaddresstitle().getText();
//	Assert.assertEquals(dtitle, actual);
//
//}
//
//@Then("^User verifies the delivery address is displayed in the address section$")
//public void user_verifies_the_delivery_address_is_displayed_in_the_address_section() throws Throwable {
//	LoginPage3 lp3 = new LoginPage3(driver);
//	String actual = lp3.getDeliveryaddress().getText();
//	Assert.assertTrue(actual.contains("ceasefire"));
//
//}
//
//@Then("^User click on Update button to edit the address$")
//public void user_click_on_Update_button_to_edit_the_address() throws Throwable {
//	LoginPage3 lp3 = new LoginPage3(driver);
//	clickoperation(lp3.getUpdatebtn());
//
//}
//
//@Then("^User update the mobile number '(\\d+)' in the address$")
//public void user_update_the_mobile_number_in_the_address(int arg1, String mobileno) throws Throwable {
//	LoginPage3 lp3 = new LoginPage3(driver);
//	senkeys(lp3.getMobilenumber(), mobileno);
//
//
//}
//
//@Then("^User click on save button$")
//public void user_click_on_save_button() throws Throwable {
//	LoginPage3 lp3 = new LoginPage3(driver);
//	clickoperation(lp3.getSavebtn());
//
//}
//
//@Then("^User verifies whether the updated mobile number is displayed$")
//public void user_verifies_whether_the_updated_mobile_number_is_displayed() throws Throwable {
//	LoginPage3 lp3 = new LoginPage3(driver);
//	String actual = lp3.getUpdatebtn().getText();
//	Assert.assertTrue(actual.contains("9865220088"));
//
//}
//
//@Then("^User click on proceed to checkout button in Address page$")
//public void user_click_on_proceed_to_checkout_button_in_Address_page() throws Throwable {
//	LoginPage3 lp3 = new LoginPage3(driver);
//    clickoperation(lp3.getProceedtocheckout2());
//}
//
//@When("^User click on proceed to checkout button in Shipping option page$")
//public void user_click_on_proceed_to_checkout_button_in_Shipping_option_page() throws Throwable {
//	LoginPage3 lp3 = new LoginPage3(driver);
//	clickoperation(lp3.getProceedtocheckout3());
//
//}
//
//@Then("^User closes the warning message popup displayed$")
//public void user_closes_the_warning_message_popup_displayed() throws Throwable {
//	LoginPage3 lp3 = new LoginPage3(driver);
//	clickoperation(lp3.getClose());
//
//}
//
//@Then("^User click on terms and condition checkbox$")
//public void user_click_on_terms_and_condition_checkbox() throws Throwable {
//	LoginPage3 lp3 = new LoginPage3(driver);
//	clickoperation(lp3.getTermsagree());
//
//}
//
//@Then("^User click on proceed to checkout button in shipping option page$")
//public void user_click_on_proceed_to_checkout_button_in_shipping_option_page() throws Throwable {
//	LoginPage3 lp3 = new LoginPage3(driver);
//	clickoperation(lp3.getProceedtocheckout3());
//
//}
//
//@When("^User verifies whether payment option title 'PLEASE CHOOSE YOUR PAYMENT METHOD' is displayed$")
//public void user_verifies_whether_payment_option_title_PLEASE_CHOOSE_YOUR_PAYMENT_METHOD_is_displayed(String paymenttitle) throws Throwable {
//	LoginPage3 lp3 = new LoginPage3(driver);
//	String actual = lp3.getPaymenttitle().getText();
//	Assert.assertEquals(paymenttitle, actual);
//
//}
//
//@Then("^User click on Pay by bank wire option for the payment$")
//public void user_click_on_Pay_by_bank_wire_option_for_the_payment() throws Throwable {
//	LoginPage3 lp3 = new LoginPage3(driver);
//	clickoperation(lp3.getPayment());
//
//}
//
//@When("^User verifies the payment method with total amount is displayed$")
//public void user_verifies_the_payment_method_with_total_amount_is_displayed() throws Throwable {
//	LoginPage3 lp3 = new LoginPage3(driver);
//	String actual = lp3.getOrdersummary().getText();
//	Assert.assertTrue(actual.contains("order comes to: $30.98"));
//
//}
//
//@Then("^User click on confirm my order button in Order summary page$")
//public void user_click_on_confirm_my_order_button_in_Order_summary_page() throws Throwable {
//	LoginPage3 lp3 = new LoginPage3(driver);
//	clickoperation(lp3.getOrderconfirm());
//
//}
//
//@When("^User verifies whether the order is completed$")
//public void user_verifies_whether_the_order_is_completed() throws Throwable {
//	LoginPage3 lp3 = new LoginPage3(driver);
//	String actual = lp3.getOrdercompletionmsg().getText();
//	Assert.assertTrue(actual.contains("My Store is"));
//
//
//}
//
//@Then("^User click on sign out button$")
//public void user_click_on_sign_out_button() throws Throwable {
//	LoginPage3 lp3 = new LoginPage3(driver);
//	clickoperation(lp3.getSignout());
//
//}
//
}