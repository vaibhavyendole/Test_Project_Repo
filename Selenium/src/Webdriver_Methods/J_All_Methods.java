package Webdriver_Methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class J_All_Methods
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "H:\\Selenium\\chromedriver.exe");
		//System.setProperty("webdriver.edge.driver", "C:\\msedgedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		//WebDriver driver2 = new EdgeDriver();
		//1. driver.get();
		driver1.get("https://www.google.com/");
		//driver2.get("https://wazirx.com/exchange/BTC-INR");
				
		//2. driver.getCurrentUrl();
		String URL = driver1.getCurrentUrl();
		System.out.println(URL);
		
		//3. driver.getTitle();
		String Title =  driver1.getTitle();
		System.out.println(Title);
		
		//4. driver.manage().window().maximize();
		driver1.manage().window().maximize();
		
		//5. driver.manage().window().fullscreen();
		driver1.manage().window().fullscreen();
		
		//6. setSize();
		Dimension d1 = new Dimension(500, 700);
		driver1.manage().window().setSize(d1);
		
		//7. getSize();
		Dimension d2 = driver1.manage().window().getSize();
		System.out.println(d2);
		
		//8. naviagte();
		driver1.navigate().to("https://www.google.com/");
		driver1.navigate().to("https://wazirx.com/exchange/BTC-INR");
		driver1.navigate().back();
		driver1.navigate().refresh();
		driver1.navigate().forward();
		
				
		
		
		
		// . close();
		// . quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
