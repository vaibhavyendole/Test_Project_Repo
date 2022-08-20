package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class G_PrintAll_Data_InRow {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("H:\\Velocity Testing\\ExcelFile\\Sample_File.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
		
		int LastCellIndex = sh.getRow(3).getLastCellNum()-1;
		
		for(int i=0; i<=LastCellIndex;i++)
		{
			String Value = sh.getRow(3).getCell(i).getStringCellValue();
			System.out.print(Value+" "); //Hey Mike are  you  There?? There?? 
		}
		
		
		
	
	}

}
