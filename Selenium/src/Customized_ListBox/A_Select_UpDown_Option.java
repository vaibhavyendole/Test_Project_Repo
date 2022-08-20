package Customized_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A_Select_UpDown_Option {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","H:\\Selenium\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//a[contains(text(),'New Account')]")).click();
		Thread.sleep(3000);
		
		//Step.1 Identify the Customized ListBox Which need to handle of WebElement Type
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		//Step.2 Create an object of the Action Class and Pass Input Web Driver
		Actions act = new Actions(driver);
		
		//Step.3 Use Action class method .click to click on element
		act.click(month).perform();
		Thread.sleep(3000);
		
		//Step.4 To Move one Option upward
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(3000);
		
		//Step.5 To Move One Option Downward
		act.sendKeys(Keys.ARROW_DOWN).perform();
		
		//Step.6 To Enter
		act.sendKeys(Keys.ENTER).perform();
	}
}
