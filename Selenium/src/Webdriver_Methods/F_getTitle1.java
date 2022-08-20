package Webdriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class F_getTitle1
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "H:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		String actTitle = driver.getTitle();
		String expTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
	
		if(actTitle.equalsIgnoreCase(expTitle))
		{
			System.out.println("Navigated to Current WebPage");
		}
		else
		{
			System.out.println("Navigated to Wrong WebPage");
		}
	}
}
