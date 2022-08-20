package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B_Alert_popup {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "H:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		//Enter customer Id
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("XYZZ123");
		
		//Click on the submit button
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		//Ouput : New popup has opened asking for Do you really want to delete this Customer?
		// Unable to find the WebElement using locator i.e selenium webdriver methods 
		//cant able to find element
		
		//Get Text from Alert Popup
		String text = driver.switchTo().alert().getText();
		System.out.println(text);	//Do you really want to delete this Customer?

		//Click on the OK button --> Use .accept()
		driver.switchTo().alert().accept();
		
		//Click on the cancel button --> use .dismiss
		//driver.switchTo().alert().dismiss();		
	}
}
