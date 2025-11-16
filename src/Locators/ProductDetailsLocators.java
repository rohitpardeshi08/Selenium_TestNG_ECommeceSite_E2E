package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import pages.Configuration;

public class ProductDetailsLocators extends Configuration{

	public static String writeYourReviewBtnXpath="//button[@class='btn btn-comment post-product-comment']";
	
	public static WebElement writeYourReviewBtnWebElement=driver.findElement(By.xpath(writeYourReviewBtnXpath));
}
