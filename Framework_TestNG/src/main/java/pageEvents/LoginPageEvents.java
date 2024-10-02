package pageEvents;

import org.testng.Assert;

import pageObjects.LoginPageElements;
import utils.ElementFetch;

public class LoginPageEvents {
	
	ElementFetch ele = new ElementFetch();
	public void verifyIfLoginPageIsLoaded() 
	{
		Assert.assertTrue(ele.getWebElements("XPATH",LoginPageElements.loginText).size()>0,"Element Not Found");  
	}
	public void EnterCrenetials() 
	{
		ele.getWebElement("XPATH", LoginPageElements.emailAddress).sendKeys("hinal@gmail.com");
		ele.getWebElement("XPATH", LoginPageElements.passWordField).sendKeys("12345");
		
	}
}
