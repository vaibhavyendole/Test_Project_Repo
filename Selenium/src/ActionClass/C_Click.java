package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class C_Click {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","H:\\Selenium\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();//Click on close button
		Thread.sleep(3000);
		
		//Step.1 Identify the element which need to be handle
		WebElement cart = driver.findElement(By.xpath("//span[text()='Cart']"));
		
		//Step.2 Create the object of the action class and pass webdriver input into its constructor
		Actions act = new Actions(driver);
		
		//Step.3 Use Action class Method
		act.click(cart).perform();	// OR
		
		act.moveToElement(cart).click().build().perform(); //OR
		
		act.moveToElement(cart).perform();
		act.click().perform();	
	}
}
