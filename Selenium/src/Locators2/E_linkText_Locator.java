package Locators2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E_linkText_Locator
{
 public static void main(String[] args)
 {
	System.setProperty("webdriver.chrome.driver", "H:\\Selenium\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://en-gb.facebook.com/");
	
	driver.findElement(By.linkText("facebook")).click();
 }
}
//file:///C:/Users/Jordan/Desktop/Velocity%20Testing/HTML/E_linkText.html
