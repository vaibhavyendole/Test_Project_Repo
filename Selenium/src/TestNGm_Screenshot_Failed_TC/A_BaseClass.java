package TestNGm_Screenshot_Failed_TC;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_BaseClass {
	// Base class consist of Mandatory code that run everytime like open browser
	// Use extends keyword to inherited Base class
	//Declared Globally	
	WebDriver driver;
	public void initializeBrowser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "H:\\Java\\Selenium\\Browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(A_Utility_Class.getDataFromPropertyFile("URL"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
}
