package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class J_Verify_Type_of_Cell {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("H:\\Velocity Testing\\ExcelFile\\Sample_File.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		 CellType dataType = sh.getRow(9).getCell(7).getCellType();
		 
		 System.out.println(dataType);
		 
		 if(dataType==CellType.STRING)
		 {
			 String value = sh.getRow(9).getCell(7).getStringCellValue();
			 System.out.println(value);
		 }
		 
		 else if (dataType==CellType.NUMERIC)
		 {		
			 double value = sh.getRow(9).getCell(7).getNumericCellValue();
			 System.out.println(value);
		 }
		 
		 else if(dataType ==CellType.BOOLEAN)
		 {
			  boolean value = sh.getRow(9).getCell(7).getBooleanCellValue();
			 System.out.println(value);
		 }
		 
		}
}
