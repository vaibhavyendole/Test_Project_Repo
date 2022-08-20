package Webdriver_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Mobikwik {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "H:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mobikwik.com/");
		
		driver.findElement(By.xpath("//button[@class='csrPtr colsep cright spright15 spleft15 m_spright7 m_smleft7 m_spleft7 noblur']")).click();
		
		
	}

}
