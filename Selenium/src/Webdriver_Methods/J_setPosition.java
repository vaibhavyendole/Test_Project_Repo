package Webdriver_Methods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class J_setPosition
{
 public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "H:\\Selenium\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.com/");
	
	Point p = new Point(100, 50);
	driver.manage().window().setPosition(p);
	
	System.out.println("Position = "+driver.manage().window().getPosition());
}
}
