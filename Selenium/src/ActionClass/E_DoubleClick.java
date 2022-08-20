package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class E_DoubleClick {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","H:\\Selenium\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		//Step.1 Find the Element which need to be Handle
		WebElement ClickDouble = driver.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));
		
		//Step.2 Create an object of Action class and pass input Web driver into Constructor
		Actions act = new Actions(driver);
		
		//Step.3 Use Action class method to perform action
		//Method.1 OR
		act.doubleClick(ClickDouble).perform();
		
		//Method.2 OR
		//act.moveToElement(ClickDouble).doubleClick().build().perform();
		
		//Method.3
		//act.moveToElement(ClickDouble).perform();
		//act.doubleClick().perform();
	}
}
