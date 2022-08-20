package Locators2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_Tagname {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "H:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Jordan/Desktop/Velocity%20Testing/HTML/A_Tagname.html");
	
	driver.findElement(By.tagName("input")).sendKeys("Vaibhav");
	
	
	driver.findElement(By.tagName("input")).sendKeys("Yendole");
	
	// In Above case Tagname "input" is repeated/duplicate so selenium perform Both actions on
	// only on 1st Tagname.
	// NOTE: Indexing is Not possible in Tagname Locator.
	}
}
