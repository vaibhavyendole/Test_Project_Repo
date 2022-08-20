package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class D_getRowSize {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("H:\\Velocity Testing\\ExcelFile\\Sample_File.xlsx");
		
		//int rowSize = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum()+1;
		int rowSize2 = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();
		// getLastRowNum(); --> returns Index of Last Row
		// getLastRowNum()+1;-->returns Size of Last Row
		//System.out.println(rowSize);		//13
		System.out.println(rowSize2);		//12
	} //(Above both operation can't be perform simultaneously.
}
