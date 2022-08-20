package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class E2_X_PathByText {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "H:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/login/");		//tagname[text() = ‘text value’] 
		
		driver.findElement(By.xpath("//a[text()='Forgotten account?']")).click();	
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9764963423");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
}
