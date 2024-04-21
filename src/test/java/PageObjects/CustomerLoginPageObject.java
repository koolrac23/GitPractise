package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustomerLoginPageObject 

{
	public WebDriver driver;
	
	public CustomerLoginPageObject(WebDriver driver)
	{
		this.driver=driver;
	}
	
	 By CustomerLoginButton= By.xpath("//button[contains(text(),'Customer Login')]");
	
	 By LoginDropdown=By.id("userSelect");
	
	 By LoginID= By.xpath("//button[text()='Login']");
	 
	 By BankManagerLoginButton=By.xpath("//button[contains(text(),'Bank Manager')]");
	
	
	
	public void clickCustomerLoginButton()
	{
		driver.findElement(CustomerLoginButton).click();
	}
	
	public void clickLoginDropdown()
	{
		driver.findElement(LoginDropdown).click();
	}
	
	public void ClickLoginButton()
	{
		driver.findElement(LoginID).click();
	}
	
	public WebElement FindDropdown()
	{
		return driver.findElement(LoginDropdown);
	}
	
	public void clickBankManagerLoginButton()
	{
		driver.findElement(BankManagerLoginButton).click();
	}
	
	

}
