package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerHomePageObject 
{
	public WebDriver driver;
	
	public CustomerHomePageObject(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	private By CustomerNameTitle= By.xpath("//span[@class='fontBig ng-binding']");
	private By DepositButton = By.xpath("//button[contains(text(),'Deposit')]");
	private By BalanceAmount= By.xpath("//div[@ng-hide='noAccount'][1]//strong[2]");
	private By AmountTextBox=By.xpath("//input[@type='number']");
	private By Submitbutton= By.xpath("//button[@type='submit']");
	
	
	public String getPageTitle()
	{
		return driver.findElement(CustomerNameTitle).getText();
	}
	
	public void clickDepositTab()
	{
		driver.findElement(DepositButton).click();;
	}
	
	public String getBalanceAmount()
	{
		return driver.findElement(BalanceAmount).getText();
	}
	
	public void enterAmount(Integer amount)
	{
		driver.findElement(AmountTextBox).sendKeys(amount.toString());
	}
	
	public void clickSubmitButton()
	{
		driver.findElement(Submitbutton).click();;
	}
	
	

}
