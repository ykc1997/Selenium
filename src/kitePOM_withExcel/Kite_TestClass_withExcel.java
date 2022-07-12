package kitePOM_withExcel;

import java.io.File;
//import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kite_TestClass_withExcel {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
	{
		//1.1 Create object of File class
		File myfile = new File("C:\\Selenium\\Excel Sheets\\Test1.xlsx");
		
		//FileInputStream myfile = new  FileInputStream("C:\\Selenium\\Excel Sheets\\Test1.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet3");
		
		String Euid = mySheet.getRow(0).getCell(0).getStringCellValue();
		String Epwd = mySheet.getRow(0).getCell(1).getStringCellValue();
		String Epin = mySheet.getRow(0).getCell(2).getStringCellValue();
		
		//1.2 Lauch application on chrome driver
				System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");	
				WebDriver driver = new ChromeDriver();
				driver.get("https://kite.zerodha.com/");
				driver.manage().window().maximize();
				Thread.sleep(1000);
				
		//2.Create object of Kite_Login_Page class and call methods from that class
				Kite_LogInPage_withExcel Login = new Kite_LogInPage_withExcel(driver);
				Login.sendUID(Euid);
				Login.sendPASS(Epwd);
				Login.clickLoginButton();
				
		//3.Create object of Kite_Pin_Page class and call methods from that class
				Thread.sleep(1000);
				
				Kite_PinPage_withExcel Pin = new Kite_PinPage_withExcel(driver);
				Pin.sendPin(Epin);
				Pin.clickContinueButton();
				
		//4.Create object of Kite_Home_Page class and call methods from that class
				Thread.sleep(1000);
				
				Kite_HomePage_withExcel Home = new Kite_HomePage_withExcel(driver);
				Home.userName(Euid);
				Home.logOut();
				
		//5.Close Kite_Zeroda application
				Thread.sleep(1000);
				driver.close();

	}

}
