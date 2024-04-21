package StepDefinitions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import PageObjects.CustomerHomePageObject;
import PageObjects.PageObjectManager;
import Utils.TestSetupContext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CustomerHomePage 

{
	public WebDriver driver;
	public String actualName;
	public int originalAmount;
	public int depositAmount;
	 TestSetupContext testSetupContext;
	 PageObjectManager pom;
	
	public CustomerHomePage(TestSetupContext testSetupContext)
	{
		this.testSetupContext=testSetupContext;
	}
	
	
	 
	@Given("user is in home page")
	public void user_is_in_home_page() throws InterruptedException {
		
		CustomerHomePageObject chp=testSetupContext.pom.getCustomerHomePageObject();
		Thread.sleep(2000);
	    
	  String Customename= chp.getPageTitle();
	  
	  Assert.assertEquals(testSetupContext.actualName, Customename);
	}
	
	@When("^he deposits (.*) to his account$")
	public void he_deposits_to_his_account(Integer amount) throws InterruptedException {
		
		CustomerHomePageObject chp=testSetupContext.pom.getCustomerHomePageObject();
		depositAmount=amount;
		chp.clickDepositTab();
	    originalAmount=Integer.parseInt(chp.getBalanceAmount());
	    System.out.println(originalAmount);
	    Thread.sleep(2000);
	    chp.enterAmount(amount);
	    chp.clickSubmitButton();
	    Thread.sleep(2000);
	    System.out.println(depositAmount);
	    
	    
	}
	@Then("Account balance should get updated")
	public void account_balance_should_get_updated() {
		
		CustomerHomePageObject chp=testSetupContext.pom.getCustomerHomePageObject();
		int UpdatedAmount=Integer.parseInt(chp.getBalanceAmount());
		System.out.println(UpdatedAmount);
		
		int DifferenceAmount =UpdatedAmount-originalAmount;
		System.out.println(DifferenceAmount);
		
		Assert.assertEquals(depositAmount, DifferenceAmount);
	    
	}

}
