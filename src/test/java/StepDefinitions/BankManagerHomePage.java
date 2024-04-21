package StepDefinitions;

import PageObjects.BankManagerHomePageObject;
import PageObjects.CustomerLoginPageObject;
import Utils.TestSetupContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BankManagerHomePage 
{
	public  TestSetupContext testSetupContext;
	BankManagerHomePageObject bm;
	
	public BankManagerHomePage(TestSetupContext testSetupContext)
	{
		this.testSetupContext=testSetupContext;
	    bm=testSetupContext.pom.getBankManagerHomePageObject();
	}
	
	
	@Given("I login to bank Manager credentials")
	public void i_login_to_bank_manager_credentials() throws InterruptedException 
	{
		CustomerLoginPageObject clpo=testSetupContext.pom.getCustomerLoginPageObject();
		Thread.sleep(2000);
		clpo.clickBankManagerLoginButton();
		Thread.sleep(2000);
	}
	@When("I click open Account")
	public void i_click_open_account() throws InterruptedException 
	{
		
		bm.clickOpenAccount();
		Thread.sleep(2000);
		
	}
	@When("fill customer name as {string} and currency as {string}")
	public void fill_customer_name_as_and_currency_as(String name, String currency) throws InterruptedException {
		Thread.sleep(2000);
		testSetupContext.genericUtils.SelectFromDropdown(bm.getCustomerDropdown(), name);
		Thread.sleep(2000);
		testSetupContext.genericUtils.SelectFromDropdown(bm.getCurrencyDropdown(), currency);
		bm.clickProcessButton();
		Thread.sleep(2000);
	}
	@Then("Account should be created successfully with Account number")
	public void account_should_be_created_successfully_with_account_number() {
		String text=testSetupContext.genericUtils.getTextfromAlert();
		System.out.println(text.split(":")[1]);
	}

}
