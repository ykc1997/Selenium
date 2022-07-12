package excel_Sheet_Reading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Reading1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		// Create object of File class which accept path of excel sheet along with file name and extension as argument
		File myfile = new File("C:\\Selenium\\Excel Sheets\\Test1.xlsx");
		
		// How to read String value
		String name = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(name);
		
		// How to read Numeric value
		double age = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(2).getCell(1).getNumericCellValue();
		System.out.println(age);
		
		// How to read Character value
		String gender = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(4).getCell(2).getStringCellValue();
		System.out.println(gender);
		
		// How to read Boolean value
		boolean status = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(5).getCell(3).getBooleanCellValue();
		System.out.println(status);
	}

}
