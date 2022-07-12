package testNG_Annotation;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Study2
{
	 @Test
	  public void recharge() 
	  {
		  Reporter.log("Reacharge Successfull...", true);
	  }
	  
	  @BeforeMethod
	  public void logIn() 
	  {
		  Reporter.log("LogIn Done...", true);
	  }

	  @AfterMethod
	  public void logOut() 
	  {
		  Reporter.log("LogOut Done...", true); 
	  }

	  @BeforeClass
	  public void launchBrowser() 
	  {
		  Reporter.log("Browser Launched...", true);
	  }

	  @AfterClass
	  public void closeBrowser() 
	  {
		  Reporter.log("Browser Closed...", true);
	  }

}
