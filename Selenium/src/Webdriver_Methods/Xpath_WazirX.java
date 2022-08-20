package Webdriver_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_WazirX {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "H:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				driver.get("https://wazirx.com/login?source=menubar");
				
				driver.findElement(By.xpath("//input[@class='sc-fAjcbJ bSmqHY']")).sendKeys("ABC@gmail.com");
				
				driver.findElement(By.xpath("//input[@type='password']")).sendKeys("XYZyyz@123");
				
				Thread.sleep(3000);
				driver.findElement(By.xpath("//button[@class='sc-htpNat iIeMYP']")).click();
	}

}
