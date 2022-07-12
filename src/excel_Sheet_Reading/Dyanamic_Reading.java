package excel_Sheet_Reading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Dyanamic_Reading 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//1. Create object of File class which accept path of excel sheet along with file name and extension as argument
		File myfile = new File("C:\\Selenium\\Excel Sheets\\Test1.xlsx");

		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
	
		//System.out.println(mySheet.getPhysicalNumberOfRows());
	
		//2. Get Row Count (Counting starts from 0)
		int rowCount = mySheet.getLastRowNum();  // Will return last row INDEX i.e. Count
			System.out.println("Total number of rows: "+rowCount);
		
		//3. Get Cell Count	
		short totalNoOfCells = mySheet.getRow(rowCount).getLastCellNum();  // Will return total no. of cells and not last cell INDEX i.e. Count
			//System.out.println(totalNoOfCells);
		
		int cellCount = totalNoOfCells-1;  // To get last cell INDEX i.e. Count
		System.out.println("Total number of cells: "+cellCount);
		
		System.out.println("=================================================");
		
		//4. Read data
		for(int i=0; i<=rowCount; i++)   // Outer for loop--->for rows
		{
			for(int j=0; j<=cellCount; j++)   // Innner for loop--->for cells
			{
				Cell cellValue = mySheet.getRow(i).getCell(j);
				CellType dataType = cellValue.getCellType();
				
				if(dataType==CellType.STRING)
				{
					String value = cellValue.getStringCellValue();
					System.out.print(value+"  ");
				}
				
				else if (dataType==CellType.NUMERIC) 
				{
					double value = cellValue.getNumericCellValue();
					System.out.print(value+"  ");
				}
				
				else if (dataType==CellType.BOOLEAN)
				{
					boolean value = cellValue.getBooleanCellValue();
					System.out.print(value+"  ");
				}
				
				else if (dataType==CellType.BLANK) 
				{
					System.out.print("  ***  ");
				}
				
			}
			System.out.println();
		}
	}

}
