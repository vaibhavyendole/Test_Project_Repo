package Autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_Autosuggestion_Google {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "H:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Redmi");
		
		Thread.sleep(2000);
		String expText = "redmi Note 10";
		List<WebElement> MultipleElements = driver.findElements(By.xpath("//input[@class='gLFyf gsfi']"));
		
		for(WebElement SingleElement : MultipleElements)
		{
			String ActText = SingleElement.getText();
			if(ActText.equalsIgnoreCase(expText))
			{
				SingleElement.click();
			}
		}
	}

}








