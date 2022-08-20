package TestNGl_POM_DDF_TestNG_BaseClass_UtilityClass;

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

public class A_KiteLoginTest extends A_BaseClass{
			//declare Globally objects
			A_loginPage1 page1;
			A_loginPage2 page2;
			A_HomePage3 page3;
			Sheet sh;	
			
	@BeforeClass
	public void openbrowser() throws EncryptedDocumentException, IOException
	{	
		//This class is Not static and initializeBrowser() is also an Non Static Method
		//call methodeName(); to open browser
		initializeBrowser();					
		
		//POM Class Object Creation
		page1 = new A_loginPage1(driver);
		page2 =new A_loginPage2(driver);
		page3 =new A_HomePage3(driver);
	}
	
	@BeforeMethod		//login Method
	public void loginToApp() throws EncryptedDocumentException, IOException
	{	//Enter ID Pass
		page1.setEnterID(A_Utility_Class.getTD(2, 0));
		page1.setEnterPass(A_Utility_Class.getTD(2, 1));
		page1.clickLoginButton();
		
		//Enter Pin
		page2.setEnterPin(A_Utility_Class.getTD(2, 2));
		page2.clickContinue();
	}
	
	@Test					//Actual Test Case
	public void verifyPN() throws EncryptedDocumentException, IOException
	{
		String actPN=page3.getKiteHomePageProfileName();				//get POM page 3
		String expPN=A_Utility_Class.getTD(2, 3);		// Get from Excel
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
