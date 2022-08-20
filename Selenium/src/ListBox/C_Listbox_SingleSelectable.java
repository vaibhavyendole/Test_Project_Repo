package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class C_Listbox_SingleSelectable {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "H:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.naukri.com/account/createaccount");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='I am a Professional']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='expYear']")).click();
		
		Thread.sleep(3000);
		
		WebElement exp = driver.findElement(By.xpath("//span[@class='ddIcon srchTxt'][1]"));
		
		Select sm = new Select(exp);
		
		sm.selectByVisibleText("3");
		//sm.getOptions()
		
		
		

		
		
	}

}
