package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import pages.Configuration;

public class LandingPageLocators extends Configuration{
	
	public static String productTShirtXpath="(//h3[@class='h3 product-title'])[1]";
	public static String userNameTextXpath="//div[@id='_desktop_user_info']//a[@class='account']";

	
	
	//WebElements
	public static WebElement userNameTextWebElement=driver.findElement(By.xpath(userNameTextXpath));
	public static WebElement productTShirtWebElement=driver.findElement(By.xpath(productTShirtXpath));
}
