package Installation;

import org.openqa.selenium.chrome.ChromeDriver;

public class A_OpenChromeDriver
{
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "H:\\Selenium\\chromedriver.exe");
	
	
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	Thread.sleep(15000);
	driver.close();
	}
}
















