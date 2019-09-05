@EndtoEnd
Feature: Automation Practice End to End Test automation scenario
This feature file includes Login, Search the product, adding to cart, adding the address, selecting the 
payment method and placing the order.
Scenario: Verify user validate the automation practice home page
Given User hit the Automation practice website
Then User verifes the site logo
And User verifies the page title
Then User click on Signin Button in Header
Scenario: Verify user login the application with valid credentials
When User enter the email id 'venkat@gmail.com' in the login page
And User enter the password '123456789' in the login page
And User click on Login Button in the Login Page
Then User verifies the Username 'mohan vasu' present in the header
Scenario: Verify user search the product in the product page
When User enters the product type in search field
And User click on search button
Then User verifies the product type is displayed in result section

#Scenario: Verify user whether the product is added to cart
#When User click on the product
#And User click on add to cart button
#Then User verifies whether the product is added in cart
#Then User click on proceed to checkout button in product page
#
#Scenario: Verify user whether the order details is displayed in Summary
#When User checks the product quantity in summary
#And User verifies the price of the selected product
#Then User click on proceed to checkout button in Summary page
#
#Scenario: Verify whether the delivery address is added
#When User verifies the delivery address title 'YOUR DELIVERY ADDRESS' in the address section
#Then User verifies the delivery address is displayed in the address section
#And User click on Update button to edit the address
#And User update the mobile number '9865220088' in the address
#And User click on save button
#Then User verifies whether the updated mobile number is displayed
#Then User click on proceed to checkout button in Address page
#
#Scenario: Verify whether the shipping option is selected
#When User click on proceed to checkout button in Shipping option page
#Then User closes the warning message popup displayed
#And User click on terms and condition checkbox
#Then User click on proceed to checkout button in shipping option page
#
#Scenario: Verify whether the payment method is selected
#When User verifies whether payment option title 'PLEASE CHOOSE YOUR PAYMENT METHOD' is displayed
#Then User click on Pay by bank wire option for the payment
#
#Scenario: Verify whether the order summary is displayed
#When User verifies the payment method with total amount is displayed
#Then User click on confirm my order button in Order summary page
#
#Scenario: Verify whether the order is confirmed
#When User verifies whether the order is completed
#Then User click on sign out button

  