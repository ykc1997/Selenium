package testNG_Annotation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class PreSelection_of_Annotations 
{
  @Test
  public void validateUserName() 
  {
	  Reporter.log("UserName Validated",true);
  }
  
  @Test(priority = 1)
  public void validateDashBoard()
  {
	  Reporter.log("DashBoard Validated",true);
  }
  
  @BeforeMethod   //(priority = 1) .... Not applicable for other Annotations than @Test
  public void loginToKiteApp()
  {
	  Reporter.log("Login success",true);
  }
  
  @BeforeMethod
  public void enterPassword()
  {
	  Reporter.log("Password Entered Successfully...",true);
  }

  @AfterMethod
  public void logoutFromKiteApp() 
  {
	  Reporter.log("logging out....",true);
  }

  @BeforeClass
  public void launchBrowser() 
  {
	  Reporter.log("browser Launched",true);
  }

  @AfterClass
  public void closeBrowser() 
  {
	  Reporter.log("browser closed",true);
  }

  @BeforeTest
  public void beforeTest() 
  {
	  Reporter.log("study @BeforeTest",true);
  }
//
//  @AfterTest
//  public void afterTest() 
//  {
//	  
//  }

}
