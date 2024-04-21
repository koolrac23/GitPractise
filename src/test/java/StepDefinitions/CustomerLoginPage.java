package StepDefinitions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import PageObjects.CustomerLoginPageObject;
import PageObjects.PageObjectManager;
import Utils.TestSetupContext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CustomerLoginPage 

{
	public WebDriver driver;
	public String actualName;
	public int originalAmount;
	public int depositAmount;
	TestSetupContext testSetupContext;
	
	public CustomerLoginPage(TestSetupContext testSetupContext)
	{
		this.testSetupContext=testSetupContext;
	}
	
	
	@Given("^user logins with (.*) credentials$")
	public void user_logins_with_credentials(String Name) throws InterruptedException {
	    
		//CustomerLoginPageObject cl= new CustomerLoginPageObject(testSetupContext.driver);
		//PageObjectManager pom= new PageObjectManager(testSetupContext.driver);
		//CustomerLoginPageObject cl=pom.getCustomerLoginPageObject();
		CustomerLoginPageObject cl=testSetupContext.pom.getCustomerLoginPageObject();
		Thread.sleep(2000);
		cl.clickCustomerLoginButton();
		testSetupContext.actualName=Name;
		Thread.sleep(2000);
		cl.clickLoginDropdown();
		testSetupContext.genericUtils.SelectFromDropdown(cl.FindDropdown(), Name);
        cl.ClickLoginButton();
        
        
	    
	}
	
	


}
