package Locators2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B_ID {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "H:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/Jordan/Desktop/Velocity%20Testing/HTML/B_ID.html");
		
		driver.findElement(By.id("1234")).sendKeys("Ranjit ");
		
		driver.findElement(By.id("1234")).sendKeys("Walia");
	}
}
