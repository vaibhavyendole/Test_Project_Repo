package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E1_XpathByAttribute
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "H:\\Selenium\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	 driver.get("https://en-gb.facebook.com/");
	 
	 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vaibyendole");
	 
	 driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("xyz");

	 driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
}
}
