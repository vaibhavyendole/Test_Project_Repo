package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class I_Get_Type_Of_Cell {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("H:\\Velocity Testing\\ExcelFile\\Sample_File.xlsx");
		
	 CellType findtype = WorkbookFactory.create(file).getSheet("Sheet1").getRow(9).getCell(7).getCellType();
	
	 System.out.println(findtype);			//STRING
	}
}
