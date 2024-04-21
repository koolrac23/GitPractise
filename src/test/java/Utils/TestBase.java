package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestBase 
{
	public WebDriver driver;
	
	public WebDriver WebDriverManager() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\Config.properties");
		prop.load(fis);
		
		if(driver==null)
		{
		if (prop.getProperty("browser").equalsIgnoreCase("chrome"))
		{
	
		driver = new ChromeDriver();
		driver.get("https://www.way2automation.com/angularjs-protractor/banking/#/login");
		}
		else if (prop.getProperty("browser").equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
			driver.get("https://www.way2automation.com/angularjs-protractor/banking/#/login");
		}
		
		
	}
		return driver;

}
}
