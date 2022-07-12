package excel_Sheet_Reading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Static_reading {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		// Create object of File class which accept path of excel sheet along with file name and extension as argument
		File myfile = new File("C:\\Selenium\\Excel Sheets\\Test1.xlsx");
	
		Workbook book = WorkbookFactory.create(myfile);
		Sheet mysheet = book.getSheet("Sheet1");
		Row myRow = mysheet.getRow(3);
		Cell myCell = myRow.getCell(0);
		CellType myCellType = myCell.getCellType();
		System.out.println(myCellType);
		System.out.println(myCell.getStringCellValue());
		System.out.println("==================================");
		
		// Code for reading whole data from excel sheet [row=6 & cell=3]
		Sheet mysheet2 = book.getSheet("Sheet2");
		
		for(int i=0; i<=6; i++)        // Outer for loop--->for rows
		{
			for(int j=0; j<=3; j++)    // Innner for loop--->for cells
			{
				String value = mysheet2.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+"  ");
			}
			System.out.println();
		}
		
		
	}

}
