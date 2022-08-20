package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class E4_xpathBy_ContainsAttribute
{
public static void main(String[] args)
{
	System.setProperty("webdriver.gecko.driver", "H:\\Selenium\\geckodriver.exe");
	
	WebDriver driver = new FirefoxDriver();
	
	driver.get("https://en-gb.facebook.com/");
	
	driver.findElement(By.xpath("//input[contains(@placeholder,'address or')]")).sendKeys("Vaibhav");
			
}
}  
