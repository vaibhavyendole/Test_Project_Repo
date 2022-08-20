package POM_With_PageFactory;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_TestClassKite {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "H:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		A_kiteLogin1Page page1 = new A_kiteLogin1Page(driver);
		page1.enterUN();
		page1.enterPass();
		page1.clickButton();
		
		A_kiteLogin2Page page2 = new A_kiteLogin2Page(driver);
		page2.enterPin();
		page2.clickButton2();
		
		A_kiteLogin3HomePage homePage = new A_kiteLogin3HomePage(driver);
		homePage.verifyID();
	}
}

















