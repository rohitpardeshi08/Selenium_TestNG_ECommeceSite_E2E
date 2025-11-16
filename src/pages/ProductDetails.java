package pages;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Locators.ProductDetailsLocators;

public class ProductDetails extends Configuration{
	
	@Test(dependsOnGroups={"LandingPage.checkLandingPageOpened"})
	public void checkingProductDetailsPageOpened()
	{
		System.out.println("On Product Details Page");
		
		SoftAssert softAssert=new SoftAssert();
		softAssert.assertEquals(ProductDetailsLocators.writeYourReviewBtnWebElement.isDisplayed(), true);
		System.out.println("\n\t\t Check2:Product Details Page Opening Properly");
	}


}
