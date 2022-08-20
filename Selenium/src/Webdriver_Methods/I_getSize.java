package Webdriver_Methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class I_getSize
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "H:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		Dimension d1 =  driver.manage().window().getSize();
		
		System.out.println(d1);
		//driver.manage().window().fullscreen();		// (1382, 744)
		driver.manage().window().maximize();		// (1366, 768)
		
		Dimension d2 = driver.manage().window().getSize();
		
		System.out.println(d2); 		
	}
}
