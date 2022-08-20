package Webdriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class G_getURL
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "H:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
	}
}
