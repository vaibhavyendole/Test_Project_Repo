package TestNGk_POM_DDF_TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class A_KiteLoginTest {
			//declare Globally objects
			A_loginPage1 page1;
			A_loginPage2 page2;
			A_HomePage3 page3;
			Sheet sh;
			WebDriver driver;
			
	@BeforeClass
	public void openbrowser() throws EncryptedDocumentException, IOException
	{	
		//All the methods Run only one Time
		FileInputStream file = new FileInputStream("C:\\Users\\Jordan\\Desktop\\Velocity Testing1\\XcelSheet\\Kite Login.xlsx");	
		
		sh = WorkbookFactory.create(file).getSheet("LoginSheet"); 			
		
		System.setProperty("webdriver.chrome.driver", "H:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//POM Class Object Creation
		page1 = new A_loginPage1(driver);
		page2 =new A_loginPage2(driver);
		page3 =new A_HomePage3(driver);
	}
	
	@BeforeMethod		//login Method
	public void loginToApp()
	{	//Enter ID Pass
		page1.setEnterID(sh.getRow(1).getCell(0).getStringCellValue());
		page1.setEnterPass(sh.getRow(1).getCell(1).getStringCellValue());
		page1.clickLoginButton();
		
		//Enter Pin
		page2.setEnterPin(sh.getRow(1).getCell(2).getStringCellValue());
		page2.clickContinue();
	}
	
	@Test					//Actual Test Case
	public void verifyPN()
	{
		String actPN=page3.getKiteHomePageProfileName();				//get POM page 3
		String expPN=sh.getRow(1).getCell(3).getStringCellValue();		// Get from Excel
		Assert.assertEquals(actPN, expPN, "Failed: Both Results are Different");
				
		//Don't Use this Method
		//page3.VerifyKiteHomePageUserID(sh.getRow(1).getCell(3).getStringCellValue());
	}
	
	@AfterMethod		//Logout method
	
	public void logoutFromApp()
	{
		Reporter.log("Logout",true);
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
		
		page1 =null;
		page2 = null;
		page3 = null;
		sh=null;
		driver=null;
	}

}
