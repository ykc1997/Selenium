package kiteTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import kiteBase.Base_For_CrossBrowserTest;
import kitePOMwith_TestNG.Kite_HomePage;
import kitePOMwith_TestNG.Kite_LogInPage;
import kitePOMwith_TestNG.Kite_PinPage;
import kiteUtility.UtilityClass_with_PropertyFile;

@Listeners(Listners_and_TestNG.Listener_for_CrossBrowser.class)
public class TestClass_for_CrossBrowser_with_Listener extends Base_For_CrossBrowserTest
{
	//Declare objects of POM classes Globally
	Kite_LogInPage login1;
	Kite_PinPage pin1;
	Kite_HomePage home1; 
	
	//String pTCID = "011";
	
	@Parameters("browserName")
	@BeforeClass
	public void openBrowser(String name) throws IOException 
	{
		  if (name.equals("Chrome")) 
		  {
			Reporter.log("Launching Chrome..", true);
			launchChrome();
		  }
		  
		  else if (name.equals("Firefox"))
		  {
			Reporter.log("Launching Firefox..", true);
			launchFirefox();
		  } 
		  
		  login1 = new Kite_LogInPage(driver);
		  pin1 = new Kite_PinPage(driver);
		  home1 = new Kite_HomePage(driver);
	}
	
	@BeforeMethod
	public void loginToKiteApp() throws IOException, InterruptedException 
	{
		//On Login Page
		Reporter.log("Insert UserID and Password", true);
		login1.sendUID(UtilityClass_with_PropertyFile.getDataFromPropertyFile("UN"));
		login1.sendPassword(UtilityClass_with_PropertyFile.getDataFromPropertyFile("PWD"));
		login1.clickLoginButton();
		
		//On Pin Page
		Reporter.log("Insert Pin", true);
		Thread.sleep(1000);
		pin1.sendPin(UtilityClass_with_PropertyFile.getDataFromPropertyFile("PIN"));
		pin1.clickContinueButton();
		
		Reporter.log("Welcome to Kite Zeroda..", true);
	}
	
  @Test
  public void validadeUserID() throws IOException 
  {
	 String actualUID = home1.getActualUserName();
	 String expectedUID = UtilityClass_with_PropertyFile.getDataFromPropertyFile("UN");
	
	 Assert.fail();
	 Assert.assertEquals(actualUID, expectedUID);
	 
	 //Capture ScreenShot if TC is PASSED
	 //UtilityClass_with_PropertyFile.captureScreenshot(driver, pTCID);
  }
  
  @AfterMethod
  public void logoutFromKiteApp() throws InterruptedException,IOException 
  {
//	  String TCID = result.getName();
//	  if(result.getStatus()==ITestResult.FAILURE)
//	  {
//		  UtilityClass_with_PropertyFile.captureScreenshot(driver, TCID);
//	  }

	  Reporter.log("Thank You For Visiting Us, You Are Logging Out..",true);
	  home1.logOut();
  }
  
  @AfterClass
  public void closeBrowser() 
  {
	  Reporter.log("Closing Browser..",true);
	  driver.close();
  }
}
