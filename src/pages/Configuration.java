package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
;

public class Configuration {
	
	public static WebDriver driver=new ChromeDriver();
	
	public static void setChromeBrowser() {
		System.setProperty("webdriver.chrome.driver","E:\\Rohit Data\\Selenium Practice\\chromedriver-win32\\chromedriver.exe");
		System.setProperty("chromeoptions.prefs", "profile.password_manager_leak_detection=false");
	}	
	
	@BeforeSuite
	public void setBrowser()
	{
		System.out.println("\n\t\t Opening Browser");
		setChromeBrowser();
	}
	
	@AfterSuite
	public void afterTest()
	{
		System.out.println("\n\t\t Closing Browser");
		driver.quit();
	}
}
