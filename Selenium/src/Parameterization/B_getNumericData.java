package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class B_getNumericData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("H:\\Velocity Testing\\ExcelFile\\Sample_File.xlsx");
		
		double value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(5).getCell(9).getNumericCellValue();
		
		System.out.println(value);		//123.0
		
		
	}

}
