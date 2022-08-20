package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class E3_XpathByContainsText
{
	public static void main(String[] args)
{
	System.setProperty("webdriver.gecko.driver", "H:\\Selenium\\geckodriver.exe");
	
	// WebDriver driver = new ChromeDriver();
WebDriver driver1 = new FirefoxDriver();
//	WebDriver driver2 = new InternetExplorerDriver();
//	WebDriver driver3 = new OperaDriver();
//	WebDriver driver4 = new SafariDriver();
//  WebDriver driver5 = new EdgeDriver();

	driver1.get("https://en-gb.facebook.com/");
	driver1.findElement(By.xpath("//a[contains(text(),'New Account')]")).click();
}
	
	
	
	
	
	

}
