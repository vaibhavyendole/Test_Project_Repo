package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A_ListBox2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "H:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(3000);
		//Step 1: Identify the element which need to be handling and store it in reference Variable
		WebElement date = driver.findElement(By.xpath("//select[@title='Day']"));
		WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
		WebElement year = driver.findElement(By.xpath("//select[@title='Year']"));
		
		Thread.sleep(3000);
		//Step 2: Create an object of the select class which accept the WebElement Argument
		Select dd = new Select(date);
		Select mm = new Select(month);
		Select yy = new Select(year);
		
		Thread.sleep(3000);
		//Step 3: USe Select class method to Select desired option
		dd.selectByIndex(3);
		mm.selectByValue("9");
		yy.selectByVisibleText("1993");
		}
}
