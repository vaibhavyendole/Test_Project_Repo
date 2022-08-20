package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class C_getBooleanData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("H:\\Velocity Testing\\ExcelFile\\Sample_File.xlsx");
		
		boolean value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(7).getCell(11).getBooleanCellValue();
		
		System.out.println(value);			//true
	}
}
