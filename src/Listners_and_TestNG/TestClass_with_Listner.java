package Listners_and_TestNG;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import kiteBase.BaseClass_with_PropertyFile;
import kitePOMwith_TestNG.Kite_HomePage;
import kitePOMwith_TestNG.Kite_LogInPage;
import kitePOMwith_TestNG.Kite_PinPage;
import kiteUtility.UtilityClass_with_PropertyFile;

@Listeners(Listners_and_TestNG.Listeners.class)
public class TestClass_with_Listner extends BaseClass_with_PropertyFile
{
	//Declare objects of POM classes Globaly
	Kite_LogInPage logIn;
	Kite_PinPage pin;
	Kite_HomePage home;
	//String TCID = "005";

	@BeforeClass  // Here launch Browser
	public void launchBrowser() throws IOException
	{
		openBrowser();
		Reporter.log("Browser Launched..", true);
		
		//Initialize objects of POM classes
		logIn = new Kite_LogInPage(driver);
		pin = new Kite_PinPage(driver);
		home = new Kite_HomePage(driver);
	}
	
	@BeforeMethod   // Here logIn to kite app
	public void loginToKiteApp() throws IOException 
	{
		Reporter.log("Please Insert UserID and Password", true);
		logIn.sendUID(UtilityClass_with_PropertyFile.getDataFromPropertyFile("UN"));
		logIn.sendPassword(UtilityClass_with_PropertyFile.getDataFromPropertyFile("PWD"));
		logIn.clickLoginButton();
		 
		Reporter.log("Please Insert Pin", true);
		pin.sendPin(UtilityClass_with_PropertyFile.getDataFromPropertyFile("PIN"));
		pin.clickContinueButton();
		
		Reporter.log("Welcome to Kite Zeroda..", true);
	}
 
	@Test
  public void validateUserID() throws IOException 
  {
	String actualUID = home.getActualUserName();
	String expectedUID = UtilityClass_with_PropertyFile.getDataFromPropertyFile("UN");
	
	Assert.fail();
	Assert.assertEquals(actualUID, expectedUID);
	
	Reporter.log("Acual User name and Expected User name are matched, TC is PASSED ", true);
	
	//UtilityClass_with_PropertyFile.captureScreenshot(driver,TCID);
  }
	
	@AfterMethod
	public void logOutFromKite() throws InterruptedException, IOException 
	{
//		if(result.getStatus()==ITestResult.FAILURE)
//		{
//			UtilityClass_with_PropertyFile.captureScreenshot(driver, TCID);
//		}
		
		Reporter.log("Thank You For Visiting Us, You Are Logging Out..",true);
		home.logOut();		
	}
	
	@AfterClass
	public void closeBrowser() throws InterruptedException 
	{
		Thread.sleep(2000);
		driver.close();
		Reporter.log("Browser has been Closed..", true);
	}
}
