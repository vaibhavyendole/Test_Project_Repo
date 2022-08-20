package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A_HandlingDropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","H:\\Selenium\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();//Click on close button
		Thread.sleep(3000);
		
		//Step.1 Identify the dropdown Element which need to be handle
		WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
		
		//Step.2 Create an object of the Action class with web driver object as input
		Actions act = new Actions(driver);
		
		//Step.3 Call Action Class Method
		act.moveToElement(login).perform();
		Thread.sleep(3000);
		
		//Click on object present in Dropdown //Gift Card
		driver.findElement(By.xpath("//div[text()='Gift Cards']")).click();
	}
}