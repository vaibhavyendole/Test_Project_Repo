package Installation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class C_Firefox
{
public static void main(String[] args)
{
	System.setProperty("webdriver.gecko.driver","H:\\Selenium\\geckodriver.exe");
	
	WebDriver driver = new FirefoxDriver();
	driver.navigate().to("https://www.google.com/");
	driver.findElement(By.xpath("//input[@jsaction='paste:puy29d;']")).sendKeys("Download Chrome");
}
}