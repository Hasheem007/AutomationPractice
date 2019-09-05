package com.cucumber.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.mav.base.Base;
import com.selenium.helper.FileDataManger;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty",
		"json:com\\cucumber\\resource\\com\\cucumber\\CucumberReports\\report2.json",
		"junit:com\\cucumber\\resource\\com\\cucumber\\CucumberReports\\report2.xml",
         "html:com\\cucumber\\resource\\com\\cucumber\\CucumberReports\\"},
		features = "src\\test\\java\\com\\cucumber\\features",glue ="com\\cucumber\\stepdefinition"
		)

public class TestRunner {
	
	public static WebDriver driver;
	@BeforeClass
	public static void SetupInitialisation() throws Throwable {
	String browserName =FileDataManger.fdm.getConfigReader().getbrowsername();
	driver = Base.openBrowser(browserName);
}
@AfterClass
public static void Teardown() throws Exception{
Base.driverQuit();
	
	
}


}             