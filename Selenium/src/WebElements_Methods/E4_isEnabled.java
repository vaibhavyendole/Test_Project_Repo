package WebElements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E4_isEnabled
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "H:\\Selenium\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	
	boolean result = driver.findElement(By.xpath("//button[@name='login']")).isEnabled();

	System.out.println(result);
	
	if(result==true)
	{
		System.out.println("Element is Enable");
	}
	else
	{
		System.out.println("Element is Disable");
	}
}
}
