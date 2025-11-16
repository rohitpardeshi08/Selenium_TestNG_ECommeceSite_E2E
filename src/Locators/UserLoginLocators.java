package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import pages.Configuration;

public class UserLoginLocators extends Configuration{
	
	
	public static String userNameXpath="//input[@id='field-email']";
	public static String passwordXpath="//input[@id='field-password']";
	public static String loginBtnXpath="//button[@id='submit-login']";
	
	//Data
	
	public static String UserNameData="sibem66015@gusronk.com";
	public static String PasswordData="Mystoretest@1234";
	
	//WebElements
	public static WebElement userNameWebElement=driver.findElement(By.xpath(userNameXpath));
	public static WebElement passwordWebElement=driver.findElement(By.xpath(passwordXpath));
	public static WebElement loginBtnIDWebElement=driver.findElement(By.xpath(loginBtnXpath));
}
