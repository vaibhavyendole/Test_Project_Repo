package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class F_getNumericData_AsString {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("H:\\Velocity Testing\\ExcelFile\\Sample_File.xlsx");
	
		String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(6).getCell(9).getStringCellValue();

		System.out.println(value);		//456
		// Note : To use this method Make sure that the Number Stored in Excel file 
		// must poses single inverted comma before the number ('456)
	}
	}