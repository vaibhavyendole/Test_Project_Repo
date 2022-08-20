package Installation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class B_Edge_Driver
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.edge.driver", "C:\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.navigate().to("https://www.google.com/");
	}
	
	
}
	