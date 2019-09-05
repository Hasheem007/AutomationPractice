$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AutomationLogin.feature");
formatter.feature({
  "line": 2,
  "name": "Automation Practice End to End Test automation scenario",
  "description": "This feature file includes Login, Search the product, adding to cart, adding the address, selecting the \r\npayment method and placing the order.",
  "id": "automation-practice-end-to-end-test-automation-scenario",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@EndtoEnd"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Verify user validate the automation practice home page",
  "description": "",
  "id": "automation-practice-end-to-end-test-automation-scenario;verify-user-validate-the-automation-practice-home-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User hit the Automation practice website",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User verifes the site logo",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User verifies the page title",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User click on Signin Button in Header",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPage.user_hit_the_Automation_practice_website()"
});
formatter.result({
  "duration": 11458419895,
  "status": "passed"
});
formatter.match({
  "location": "LoginPage.user_verifes_the_site_logo()"
});
formatter.result({
  "duration": 239074188,
  "status": "passed"
});
formatter.match({
  "location": "LoginPage.user_verifies_the_page_title()"
});
formatter.result({
  "duration": 23338699,
  "status": "passed"
});
formatter.match({
  "location": "LoginPage.user_click_on_Signin_Button_in_Header()"
});
formatter.result({
  "duration": 4366705549,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Verify user login the application with valid credentials",
  "description": "",
  "id": "automation-practice-end-to-end-test-automation-scenario;verify-user-login-the-application-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "User enter the email id \u0027venkat@gmail.com\u0027 in the login page",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User enter the password \u0027123456789\u0027 in the login page",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User click on Login Button in the Login Page",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User verifies the Username \u0027mohan vasu\u0027 present in the header",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "venkat@gmail.com",
      "offset": 25
    }
  ],
  "location": "LoginPage.user_enter_the_email_id_venkat_gmail_com_in_the_login_page(String)"
});
formatter.result({
  "duration": 830700304,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456789",
      "offset": 25
    }
  ],
  "location": "LoginPage.user_enter_the_password_in_the_login_page(int,String)"
});
formatter.result({
  "duration": 1001812,
  "error_message": "cucumber.runtime.CucumberException: Arity mismatch: Step Definition \u0027com.cucumber.stepdefinition.LoginPage.user_enter_the_password_in_the_login_page(int,String) in file:/C:/Users/Sakthi/eclipse-workspace/CucmberProject/target/test-classes/\u0027 with pattern [^User enter the password \u0027(.*)\u0027 in the login page$] is declared with 2 parameters. However, the gherkin step has 1 arguments [123456789]. \nStep: And User enter the password \u0027123456789\u0027 in the login page\r\n\tat cucumber.runtime.StepDefinitionMatch.arityMismatch(StepDefinitionMatch.java:102)\r\n\tat cucumber.runtime.StepDefinitionMatch.transformedArgs(StepDefinitionMatch.java:60)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.internal.runners.statements.RunBefores.evaluate(RunBefores.java:26)\r\n\tat org.junit.internal.runners.statements.RunAfters.evaluate(RunAfters.java:27)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:89)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:41)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:541)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:763)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:463)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:209)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginPage.user_click_on_Login_Button_in_the_Login_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginPage.user_verifies_the_Username_mohan_vasu_present_in_the_header()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 15,
  "name": "Verify user search the product in the product page",
  "description": "",
  "id": "automation-practice-end-to-end-test-automation-scenario;verify-user-search-the-product-in-the-product-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "User enters the product type in search field",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "User click on search button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User verifies the product type is displayed in result section",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPage.user_enters_the_product_type_in_search_field()"
});
formatter.result({
  "duration": 577147280,
  "status": "passed"
});
formatter.match({
  "location": "LoginPage.user_click_on_search_button()"
});
formatter.result({
  "duration": 3591775389,
  "status": "passed"
});
formatter.match({
  "location": "LoginPage.user_verifies_the_product_type_is_displayed_in_result_section()"
});
formatter.result({
  "duration": 104065421,
  "status": "passed"
});
});