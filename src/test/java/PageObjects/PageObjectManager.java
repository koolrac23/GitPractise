package PageObjects;

import org.openqa.selenium.WebDriver;

import net.bytebuddy.asm.Advice.Return;

public class PageObjectManager 
{
	
	public WebDriver driver;
	public CustomerLoginPageObject clpo;
	
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	public CustomerHomePageObject getCustomerHomePageObject()
	{
		 return new CustomerHomePageObject(driver);
		 
	}
	
	public CustomerLoginPageObject getCustomerLoginPageObject()
	{
		clpo= new CustomerLoginPageObject(driver);
		return clpo;
		
	}
	
	public BankManagerHomePageObject getBankManagerHomePageObject()
	{
		 return new BankManagerHomePageObject(driver);
		 
	}

}
