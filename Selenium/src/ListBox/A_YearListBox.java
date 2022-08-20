package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A_YearListBox{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "H:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("a[text()='Create New Account']")).click();
		
	//Step.1 Identify ListBox, Find WebElement and Store in reference.
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
	//Step.2 Create and Object of Select class which accept webelement args.
		Select s = new Select(month);
		
	//Step.3 Use Select class Method to select option
		//A) selectByIndex(int value)
		//   s.selectByIndex(9);
		
		//B) selectByVisbileText("StringText")
		//   s.selectByVisibleText("Oct");
		   
		//C) selectByValue("String Value")
		   s.selectByValue("12");	
	}
}









