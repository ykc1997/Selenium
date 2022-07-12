package kiteUtility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityClass 
{
	//excel
	//screenshot
	//closing
	
	public static String readExcelData(int row, int cell) throws EncryptedDocumentException, IOException
	{
		File myfile = new File("C:\\Selenium\\Excel Sheets\\Test1.xlsx");
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet3");
		String value = mySheet.getRow(row).getCell(cell).getStringCellValue();
		return value;
		
	}
}
