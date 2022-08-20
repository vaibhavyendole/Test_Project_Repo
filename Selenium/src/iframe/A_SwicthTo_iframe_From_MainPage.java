package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_SwicthTo_iframe_From_MainPage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "H:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		Thread.sleep(5000);
		
		//Step.1 Switch to frame
		//First find the tagname "iframe".
		//Method.1--> Id 
		//driver.switchTo().frame("iframeResult");	// USe String frame 'id'
		
		//Method.2 --> name
		//driver.switchTo().frame("iframeResult"); 	// USe String frame 'name'
		
		//Method.3 --> index
		//driver.switchTo().frame(0);					// use int args /fname Index
		
		// Method.4 --> webElement
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));
		
		//Step.2 Click on the selcted webElement
		driver.findElement(By.xpath("//button[contains(text(),'Click me to')]")).click();
		}
}











