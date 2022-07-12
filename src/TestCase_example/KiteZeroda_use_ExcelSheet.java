package TestCase_example;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteZeroda_use_ExcelSheet {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		File myfile = new File("C:\\Selenium\\Excel Sheets\\Test1.xlsx");
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet3");
		
		String UID = mySheet.getRow(0).getCell(0).getStringCellValue();
		String pwd = mySheet.getRow(0).getCell(1).getStringCellValue();
		String pin1 = mySheet.getRow(0).getCell(2).getStringCellValue();
		
		WebElement usrId = driver.findElement(By.id("userid"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		//2.Perfom action on located webelements
				usrId.sendKeys(UID);
				Thread.sleep(500);
				password.sendKeys(pwd);
				Thread.sleep(500);
				loginButton.click();
		
		//3.
				Thread.sleep(3000);
				WebElement pin = driver.findElement(By.id("pin"));
				WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
				
				//4.
				Thread.sleep(3000);
				pin.sendKeys(pin1);
				Thread.sleep(500);
				continueButton.click();
				
				//5.
				Thread.sleep(3000);
				WebElement userName = driver.findElement(By.xpath("//span[@class='user-id']"));
				userName.click();
				
				String ActualUID = userName.getText();
				String Expected = UID;
				
				//6.
				if(ActualUID.equals(Expected))
				{
					System.out.println("Test Case is PASSED");
				}
				else
				{
					System.out.println("Test Case is FAILED");
				}
				
				//7.Log out
				Thread.sleep(1000);
				driver.findElement(By.xpath("//a[@target='_self']")).click();
				
				driver.close();
			
				
				  
	
	}

}
