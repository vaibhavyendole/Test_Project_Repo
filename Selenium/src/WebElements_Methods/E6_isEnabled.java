package WebElements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E6_isEnabled
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "H:\\Selenium\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://en-gb.facebook.com/");
	
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	
	Thread.sleep(3000);
	
	WebElement female = driver.findElement(By.xpath("(//input[@class='_8esa'][1])"));
	boolean result = female.isSelected();
	System.out.println(result);
	if(result==true)
	{
		System.out.println("Radio button already selected");
	}
	else
	{
		System.out.println("Radio button is not selected");
		female.click();
		boolean result1 = female.isSelected();
		if(result1==true)
		{
			System.out.println("Radio Button is Now Selected");
		}
		else
		{
			System.out.println("Radio Button is Not Selected");
		}
		
	}
}
}
