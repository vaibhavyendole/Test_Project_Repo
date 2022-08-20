package TestNGj_Comaptibility_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class B_MultibrowserTesting_With_parallel {
	@Parameters("browserName")
	@Test
	public void TC(String browserName)
	{
		WebDriver driver = null;
		if(browserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "H:\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","H:\\Selenium\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browserName.equals("Edge"))
		{
			System.setProperty("webdriver.edge.driver", "H:\\Selenium\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		driver.get("https://wazirx.com/");
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter your email']")).sendKeys("v123@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Pass@23");
		driver.findElement(By.xpath("//span[text()='Login']")).click();
	}
}











