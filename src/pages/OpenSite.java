package pages;

import java.io.*;

import org.testng.annotations.Test;

public class OpenSite extends Configuration {
	public static String tab1;
	@Test(groups={"OpenSite.openSite"})
	public void launchGoogleSite() throws InterruptedException, FileNotFoundException
	{
		System.out.println("On Open Site");
		driver.get("https://teststore.automationtesting.co.uk/index.php");
		driver.manage().window().maximize();
	}
}