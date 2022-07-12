package excel_Sheet_Reading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		// Create object of File class which accept path of excel sheet along with file name and extension as argument
				File myfile = new File("C:\\Selenium\\Excel Sheets\\Test1.xlsx");
				
		// How to read String value
				String name = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(7).getCell(0).getStringCellValue();
				System.out.println(name);
				
	}

}
