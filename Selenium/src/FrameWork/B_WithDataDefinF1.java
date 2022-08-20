package FrameWork;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class B_WithDataDefinF1 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//Disable Notification
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
				
		System.setProperty("webdriver.chrome.driver", "H:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/?next=%2Fmargins");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		FileInputStream file = new FileInputStream("C:\\Users\\Jordan\\Desktop\\Velocity Testing1\\XcelSheet\\Kite Login.xlsx");

		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		//Enter UN
		String UN = sh.getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(UN);
				
		//Enter Pass
		String Pass = sh.getRow(0).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Pass);
				
		//Click on Login
		driver.findElement(By.xpath("//button[text()='Login ']")).click();
				
		//Enter Pin
		String Pin = sh.getRow(0).getCell(2).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(Pin);
				
		//Click on Continue
		driver.findElement(By.xpath("//button[text()='Continue ']")).click();
		
		//Get Actual User ID
			String actUserID = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
			System.out.println(actUserID);	//DV1510
			String ExpUserId = "DV1510";
			
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


















