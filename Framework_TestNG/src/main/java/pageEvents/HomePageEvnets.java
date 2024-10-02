package pageEvents;



import pageObjects.HomePageElements;
import utils.ElementFetch;

public class HomePageEvnets {
	
	ElementFetch ele = new ElementFetch();
	public void signInButton()
	{
		ele.getWebElement("XPATH", HomePageElements.signInButtonText).click();
	}

}
