package Webdriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_Get_Method
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "H:\\Selenium\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	//driver.get("https://www.w3schools.com/sql/default.asp");
	//Thread.sleep(3000);
	//driver.close(); // Close is used to close CURRENT TAB only
}
}
