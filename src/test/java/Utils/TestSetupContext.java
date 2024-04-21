package Utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObjects.PageObjectManager;

public class TestSetupContext 
{
	
	public WebDriver driver;
	public String actualName;
	public PageObjectManager pom;
	public TestBase testBase;
	public GenericUtils genericUtils;
	
	public TestSetupContext() throws IOException
	
	{
		testBase= new TestBase();
		pom = new PageObjectManager(testBase.WebDriverManager());
		genericUtils= new GenericUtils(testBase.WebDriverManager());
	}

}
