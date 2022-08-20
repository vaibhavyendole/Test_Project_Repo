package WebElements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E1_sendKeys_and_Clear
{
public static void main(String[] args)
{
	
	System.setProperty("webdriver.chrome.driver", "H:\\Selenium\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://en-gb.facebook.com/");
	
	WebElement UN = driver.findElement(By.xpath("//input[@name='email']"));
	
	UN.sendKeys("ABCDEF");
	
	UN.clear();
	
	UN.sendKeys("vaibyendole");
}
}
