package ListBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class E_ListBox_deselectAll{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","H:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Jordan/Desktop/Velocity%20Testing1/HTML/Select_Country1.html");
		
		Thread.sleep(3000);
		//Step.1
		WebElement country = driver.findElement(By.xpath("//select[@id='1234']"));
		
		//Step.2
		Select cc = new Select(country);
		
		Thread.sleep(2000);
		//Step.3
		cc.selectByIndex(0);
		cc.selectByIndex(1);
		cc.selectByVisibleText("England");
		
		// Use of deselectAll()
		Thread.sleep(4000);
		cc.deselectAll();
	}}

