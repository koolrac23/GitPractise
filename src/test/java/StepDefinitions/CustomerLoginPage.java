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
	
	
	@Given("user logins with {string} credentials")
	public void user_logins_with_credentials(String Name) throws InterruptedException {
	    
		
		testSetupContext.driver = new ChromeDriver();
		testSetupContext.driver.get("https://www.way2automation.com/angularjs-protractor/banking/#/login");
		testSetupContext.driver.findElement(By.xpath("//button[contains(text(),'Customer Login')]")).click();
		testSetupContext.actualName=Name;
		Thread.sleep(2000);
		Select sct = new Select(testSetupContext.driver.findElement(By.id("userSelect")));
		sct.selectByVisibleText(Name);
		testSetupContext.driver.findElement(By.xpath("//button[text()='Login']")).click();
	    
	}


}
