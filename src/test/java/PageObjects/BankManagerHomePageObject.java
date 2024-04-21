package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BankManagerHomePageObject 
{
	public WebDriver driver;
	public BankManagerHomePageObject(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By OpenAccount =By.xpath("//button[@ng-click='openAccount()']");
	
	By CustomerDropdown = By.id("userSelect");
	
	By CurrencyDropdown = By.id("currency");
	
	By ProcessButton= By.xpath("//button[@type='submit']");
	
	
	public void clickOpenAccount()
	{
		driver.findElement(OpenAccount).click();
	}
	
	public void clickProcessButton()
	{
		driver.findElement(ProcessButton).click();
	}
	
	public WebElement getCustomerDropdown()
	{
		return driver.findElement(CustomerDropdown);
	}
	
	public WebElement getCurrencyDropdown()
	{
		return driver.findElement(CurrencyDropdown);
	}
	
	
	

}
