package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import pages.Configuration;

public class OpenSiteLocators extends Configuration{
	public static String signInLinkXpath="//div[@class='user-info']/a";
	public static WebElement signInLinkWebElement=driver.findElement(By.xpath(signInLinkXpath));
}
