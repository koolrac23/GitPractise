package StepDefinitions;

import java.io.IOException;

import Utils.TestSetupContext;
import io.cucumber.java.After;

public class Hooks 
{
	public TestSetupContext testSetupContext;
	public Hooks(TestSetupContext testSetupContext)
	{
		this.testSetupContext=testSetupContext;
	}
	@After
	public void quitBrowser() throws IOException
	{
		testSetupContext.testBase.WebDriverManager().quit();
	}

}
