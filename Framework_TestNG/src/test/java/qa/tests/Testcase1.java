package qa.tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pageEvents.HomePageEvnets;
import pageEvents.LoginPageEvents;
import utils.ElementFetch;

public class Testcase1 extends BaseTest {
	
	ElementFetch ele = new ElementFetch();
	HomePageEvnets homePage = new HomePageEvnets();
	LoginPageEvents loginPage = new LoginPageEvents();

	@Test
  public void sampleMethodForEnteringCredentials() {
		
		homePage.signInButton();
		loginPage.verifyIfLoginPageIsLoaded();
		loginPage.EnterCrenetials();
		
		
		System.out.println("success");
		
  }
}
