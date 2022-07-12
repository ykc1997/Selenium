package kitePOMwith_TestNG;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_ValidateUserID 
{
	WebDriver driver;
	Sheet mySheet;
	Kite_LogInPage logIn;
	Kite_PinPage pin;
	Kite_HomePage home;
	
	@BeforeClass
	public void launchBrowser() throws EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	
		Reporter.log("Browser has been Launched...", true);
		
		File myfile = new File("C:\\Selenium\\Excel Sheets\\Test1.xlsx");
		mySheet = WorkbookFactory.create(myfile).getSheet("Sheet3");
		
		logIn = new Kite_LogInPage(driver);
		pin = new Kite_PinPage(driver);
		home = new Kite_HomePage(driver);
	}
	
	@BeforeMethod
	public void loginKiteApp()
	{
		String Euid = mySheet.getRow(0).getCell(0).getStringCellValue();
		String Epwd = mySheet.getRow(0).getCell(1).getStringCellValue();
		String Epin = mySheet.getRow(0).getCell(2).getStringCellValue();
		
		logIn.sendUID(Euid);
		logIn.sendPassword(Epwd);
		logIn.clickLoginButton();
		Reporter.log("Login Credentials entered successfully...", true);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		pin.sendPin(Epin);
		pin.clickContinueButton();
		Reporter.log("Login Successfully Done...", true);
	}
	
	@Test
	public void validateKiteUserID() 
	{
		String ExpectedUID = mySheet.getRow(0).getCell(0).getStringCellValue();
		String ActualUID = home.getActualUserName();
		
		Assert.assertEquals(ActualUID, ExpectedUID,"Actual and Expected UserName are not Matching, Test Case is FAILED");
	  
		Reporter.log("Actual and Expected UserName are Matching, Test Case is PASSED", true);
		
	}
	
	@AfterMethod
	public void logOutFromKiteApp() throws InterruptedException
	{
		home.logOut();
		
		Reporter.log("Logging Out...",true);
	}
	
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		
		Reporter.log("Closing browser",true);
		
		driver.close();
	}
}
