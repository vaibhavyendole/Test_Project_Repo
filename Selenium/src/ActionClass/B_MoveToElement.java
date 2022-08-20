package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class B_MoveToElement {
	public static void main(String[] args) throws InterruptedException {
		{
			System.setProperty("webdriver.chrome.driver","H:\\Selenium\\chromedriver.exe");

			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();//Click on close button
			Thread.sleep(3000);
			
			//Step1 Identify the Dropdown Element which need to be handle
			WebElement moreElement = driver.findElement(By.xpath("//div[@class='exehdJ']"));
			
			// Step2 : Create an object of actions class and pass Web driver as input
			Actions act = new Actions(driver);
			
			//Step3:Use Action class methods 
			act.moveToElement(moreElement).perform();
	}
}}








