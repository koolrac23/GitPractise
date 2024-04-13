package StepDefinitions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

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
	
	public CustomerHomePage(TestSetupContext testSetupContext)
	{
		this.testSetupContext=testSetupContext;
	}
	
	
	 
	@Given("user is in home page")
	public void user_is_in_home_page() throws InterruptedException {
		
		Thread.sleep(2000);
	    
	  String Customename= testSetupContext.driver.findElement(By.xpath("//span[text()='Harry Potter']")).getText();
	  
	  Assert.assertEquals(testSetupContext.actualName, Customename);
	}
	
	@When("he deposits {int} to his account")
	public void he_deposits_to_his_account(Integer amount) throws InterruptedException {
		depositAmount=amount;
		testSetupContext.driver.findElement(By.xpath("//button[contains(text(),'Deposit')]")).click();
	    originalAmount=Integer.parseInt(testSetupContext.driver.findElement(By.xpath("//div[@ng-hide='noAccount'][1]//strong[2]")).getText());
	    System.out.println(originalAmount);
	    Thread.sleep(2000);
	    testSetupContext.driver.findElement(By.xpath("//input[@type='number']")).sendKeys(amount.toString());
	    testSetupContext.driver.findElement(By.xpath("//button[@type='submit']")).click();
	    Thread.sleep(2000);
	    System.out.println(depositAmount);
	    
	    
	}
	@Then("Account balance should get updated")
	public void account_balance_should_get_updated() {
	    
		int UpdatedAmount=Integer.parseInt(testSetupContext.driver.findElement(By.xpath("//div[@ng-hide='noAccount'][1]//strong[2]")).getText());
		System.out.println(UpdatedAmount);
		
		int DifferenceAmount =UpdatedAmount-originalAmount;
		System.out.println(DifferenceAmount);
		
		Assert.assertEquals(depositAmount, DifferenceAmount);
	    
	}

}
