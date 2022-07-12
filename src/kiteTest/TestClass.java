package kiteTest;

import org.testng.annotations.Test;

import kiteBase.BaseClass;
import kitePOMwith_TestNG.Kite_HomePage;
import kitePOMwith_TestNG.Kite_LogInPage;
import kitePOMwith_TestNG.Kite_PinPage;
import kiteUtility.UtilityClass;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class TestClass extends BaseClass
{
	Kite_LogInPage login;
	Kite_PinPage pin;
	Kite_HomePage home;
	
	@BeforeClass
	public void launchBrowser() 
	{
		openBrowser();
	}	
	
	@BeforeMethod
	public void loginToKiteApp() throws EncryptedDocumentException, IOException
	{
		login = new Kite_LogInPage(driver);
		pin = new Kite_PinPage(driver);
		home = new Kite_HomePage(driver);
		
		Reporter.log("Please Insert Login Credentials..", true);

		
		//Insert UID, Password and click on login button 
		login.sendUID(UtilityClass.readExcelData(0, 0));
		login.sendPassword(UtilityClass.readExcelData(0, 1));
		login.clickLoginButton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		//Insert Pin and click on Continue button
		pin.sendPin(UtilityClass.readExcelData(0, 2));
		pin.clickContinueButton();
		
		Reporter.log("Welcome to Kite-Zeroda..", true);

		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}

	@Test
	public void validateUserID() throws EncryptedDocumentException, IOException
	{
		Assert.assertEquals(home.getActualUserName(), UtilityClass.readExcelData(0, 0),"Actual and Expected UserName are not Matching, Test Case is FAILED");
		
		Reporter.log("Actual and Expected UserName are Matching, Test Case is PASSED", true);
	}
 
	@AfterMethod
	public void logOutFromKite() throws InterruptedException 
	{
		Reporter.log("Thank You For Visiting Us, You Are Logging Out..",true);
		home.logOut();
	}

  
	@AfterClass
	public void closeBrowser() 
	{
		driver.close();
	}

}
