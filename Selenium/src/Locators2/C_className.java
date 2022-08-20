package Locators2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_className
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "H:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Jordan/Desktop/Velocity%20Testing/HTML/C_ClassName.html");
	
		driver.findElement(By.className("abc")).sendKeys("Virat ");
		
		driver.findElement(By.className("abc")).sendKeys("Kohli");
	}
}
