package POM_With_DDF;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_TestClass {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//Open eXcel Sheet and Get Data
		FileInputStream file = new FileInputStream("C:\\Users\\Jordan\\Desktop\\Velocity Testing1\\XcelSheet\\Kite Login.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("LoginSheet"); 
		
		
		System.setProperty("webdriver.chrome.driver", "H:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		A_loginPage1 page1 = new A_loginPage1(driver);
		String TID = sh.getRow(0).getCell(0).getStringCellValue();
		page1.setEnterID(TID);
		
		String TPass = sh.getRow(0).getCell(1).getStringCellValue();
		page1.setEnterPass(TPass);
		
		page1.clickLoginButton();
		
		A_loginPage2 page2 =new A_loginPage2(driver);
		 String TPin = sh.getRow(0).getCell(2).getStringCellValue();
		 page2.setEnterPin(TPin);
		 page2.clickContinue();
		 
		 A_HomePage3 page3 =new A_HomePage3(driver);
		 String tVerify = sh.getRow(0).getCell(3).getStringCellValue();
		 page3.VerifyKiteHomePageUserID(TID);
	}
}














