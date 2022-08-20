package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class F_DragAndDrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","H:\\Selenium\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		//Step.1 Identify the Souce and Destination Element
		 WebElement src = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		 
		 WebElement dest = driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[3]"));
		 
		//Step.2 Create an Object of Select Class and Pass Web driver as input in its constructor
		 Actions act = new Actions(driver);
		 
		// Step.3 Use Action class methods to perform actions
		 act.dragAndDrop(src, dest).perform(); //OR
		 
		 act.moveToElement(src).clickAndHold().moveToElement(dest).release().build().perform();
	}
}
