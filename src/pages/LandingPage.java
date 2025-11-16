package pages;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Locators.LandingPageLocators;

public class LandingPage extends Configuration{
	
	@Test(dependsOnGroups={"UserLogin.userLogin"},groups= {"LandingPage.checkLandingPageOpened"})
	public void c() throws InterruptedException
	{	
		System.out.println("On Landing Page");
		SoftAssert softAssert=new SoftAssert();
		softAssert.assertEquals(LandingPageLocators.userNameTextWebElement.isDisplayed(),true); 
		softAssert.assertAll();
		 
		System.out.println("\n\t\t Check1:Landing Page Opening Properly");
		
		LandingPageLocators.productTShirtWebElement.click();
		
	}

}
