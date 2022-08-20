package FrameWork;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_Without_DDF {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "H:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/?next=%2Fmargins");
		
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		//Enter UN
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("DV1510");
		
		//Enter Pass
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Pass@123");
		
		//Click on Login
		driver.findElement(By.xpath("//button[text()='Login ']")).click();
		
		//Enter Pin
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("959594");
		
		//Click on Continue
		driver.findElement(By.xpath("//button[text()='Continue ']")).click();
		
		//Get Actual User ID
		String actUserID = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
		System.out.println(actUserID);	//DV1510
		String ExpUserId = "DV1510";		//Already declared by User
		
		boolean result = actUserID.equals(ExpUserId);
		System.out.println(result);		//true
		if(result=true)		//Test Case Pass
		{
			System.out.println("Test Case Pass");
		}
		else
		{
			System.out.println("Test Case Fail");
		}
	}
}



















