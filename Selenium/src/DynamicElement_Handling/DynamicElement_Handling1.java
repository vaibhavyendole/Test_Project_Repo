package DynamicElement_Handling;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicElement_Handling1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "H:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		//Implicitly Wait ( Selenium Wait Method)
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		// in implicitly, it will wait for 10,20,etc sec to find the element But if element
		// found before 10 sec it will proceed.
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Iphone11");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		String Rating = driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[6]")).getText();
		System.out.println(Rating);
		
		}
}
