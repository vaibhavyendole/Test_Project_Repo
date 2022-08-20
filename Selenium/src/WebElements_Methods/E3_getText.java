package WebElements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E3_getText
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "H:\\Selenium\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://en-gb.facebook.com/");
	
	String text = driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getText();
	
	System.out.println(text);
}
}

