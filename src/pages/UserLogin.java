package pages;

import org.testng.annotations.Test;

import Locators.OpenSiteLocators;
import Locators.UserLoginLocators;

public class UserLogin extends Configuration{
	
	@Test(groups={"UserLogin.userLogin"},dependsOnGroups={"OpenSite.openSite"})
	public void userLogin() throws InterruptedException
	{
		System.out.println("On User Login Page");
		
		OpenSiteLocators.signInLinkWebElement.click();
		UserLoginLocators.userNameWebElement.sendKeys(UserLoginLocators.UserNameData);
		UserLoginLocators.passwordWebElement.sendKeys(UserLoginLocators.PasswordData);
		UserLoginLocators.loginBtnIDWebElement.click();
	}

}
