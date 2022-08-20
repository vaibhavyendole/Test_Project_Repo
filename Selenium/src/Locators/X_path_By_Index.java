package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_path_By_Index
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "H:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com/signin");
		
		driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf'][1]")).sendKeys("vaibhav.yendole@ggsf.edu.in");
	
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@jsname='YPqjbf'][1]")).sendKeys("123456789");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
	}
	
	
	
	
	
	
	
	

}
