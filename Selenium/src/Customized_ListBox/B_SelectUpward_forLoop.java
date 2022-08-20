package Customized_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class B_SelectUpward_forLoop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","H:\\Selenium\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//a[contains(text(),'New Account')]")).click();
		Thread.sleep(3000);
		
		//Step.1 Identify the WebElement that need to be handle of the WebElement Type
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		//Step.2 Create the object of the Action class and pass the input driver
		Actions act = new Actions(driver);
		
		//Step.3 se Action class Method to click
		act.click(month).perform();
		Thread.sleep(3000);
		
		for(int i=1; i<=4;i++)
		{
			act.sendKeys(Keys.ARROW_UP).perform();
		}
		
		Thread.sleep(3000);
		
		act.sendKeys(Keys.ENTER).perform();		
	}
}
