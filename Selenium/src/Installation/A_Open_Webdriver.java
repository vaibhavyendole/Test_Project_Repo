package Installation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_Open_Webdriver
{ public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "H:\\Selenium\\chromedriver.exe");
	
	ChromeDriver driver1 = new ChromeDriver();
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	Thread.sleep(10000);
	driver.close();
}
}
