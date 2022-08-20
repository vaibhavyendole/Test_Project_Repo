package TestNGm_Screenshot_Failed_TC;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class A_Utility_Class {
	//In the Utility class consist of Selenium Common Functions
	//like Take Screenshot, Parameterization i.e used sometimes if needed
	
	//Static Method is used		// Use Return Type as String instead of void
	
	//Author Name : Y. Vaibhav
	//Description : This method is use to get test data from excel sheet
	//Need to pass Two parameters Row Index the Col Index
	public static String getTD(int RowIndex, int CellIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("H:\\Java\\Selenium\\TestData_Excel\\Kite Login.xlsx");	
		
		Sheet sh = WorkbookFactory.create(file).getSheet("LoginSheet");
		String value = sh.getRow(RowIndex).getCell(CellIndex).getStringCellValue();
		return value;
	}
	
	//Author Name : Y. Vaibhav
	//This method is use to capture the Screenshot
	//Need to pass two parameters 1.driver 2.test case ID
	public static void captureScreenshot(WebDriver driver, int TestCaseID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest = new File("H:\\Java\\Selenium\\Screenshot\\TCID"+TestCaseID+".jpg");
		
		FileHandler.copy(src, dest);
	}
	
	//Author Name : Y. Vaibhav
	//This method is use to access imp credentials stores in property file
	public static String getDataFromPropertyFile(String key) throws IOException
	{
		FileInputStream file = new FileInputStream("H:\\Java\\Selenium\\PropertyFile\\PropertyFile.properties");
		
		Properties p = new Properties();
		p.load(file);
		
		String value = p.getProperty(key);
		return value;
	}
}

















