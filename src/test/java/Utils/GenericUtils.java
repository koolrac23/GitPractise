package Utils;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GenericUtils 
{
	public WebDriver driver;
	public GenericUtils(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void SelectFromDropdown(WebElement ele,String name)
	{

		Select sct = new Select(ele);
		sct.selectByVisibleText(name);
	}
	
	public Alert switchToAlert()
	{
		return driver.switchTo().alert();
	}
	
	public String getTextfromAlert()
	{
		Alert alt=switchToAlert();
		return alt.getText();
		
	}

}
