package Locators2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D_name_Locator
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "H:\\Selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/Jordan/Desktop/Velocity%20Testing/HTML/D_name.html");
	
	driver.findElement(By.name("abc123")).sendKeys("Sagar ");
	
	driver.findElement(By.name("abc123")).sendKeys("Shinde");
}
}
