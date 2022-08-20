package Handling_of_Multiple_Element;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B_HandlingMultipleElementsOn_CHECKBOX {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "H:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Jordan/Desktop/Velocity%20Testing1/HTML/Facebook%20Multiple%20Handling.html");
	
		List<WebElement> MultipleCheckBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		//For Printing in Forward and Backward use For loop otherwise ForEach loop
		for(int i=0; i<=MultipleCheckBoxes.size()-1;i++)
		{
			MultipleCheckBoxes.get(i).click();
			Thread.sleep(500);
		}
		
		//In Reverse Order Uncheck the Boxes
		for(int i=MultipleCheckBoxes.size()-1; i>=0; i--)
		{
			MultipleCheckBoxes.get(i).click();
			Thread.sleep(500);
		}
		
	
	
	}
}
