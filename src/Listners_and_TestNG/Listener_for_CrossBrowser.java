package Listners_and_TestNG;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import kiteBase.Base_For_CrossBrowserTest;
import kiteUtility.UtilityClass_with_PropertyFile;

public class Listener_for_CrossBrowser extends Base_For_CrossBrowserTest  implements ITestListener
{
	//WebDriver driver;
	String TCID = "CB01";
	
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		Reporter.log("Congrats TC is PASSED, TC name is : "+result.getName(), true);
	}
	
	@Override
	public void onTestFailure(ITestResult result) 
	{
		Reporter.log("Oopss.. TC is FAILED, TC name is : "+result.getName(), true);
		
		try {
			UtilityClass_with_PropertyFile.captureScreenshot(driver, TCID);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void onTestSkipped(ITestResult result) 
	{
		Reporter.log("Sorry.. TC is SKIPPED, TC name is :"+result.getName(), true);
	}
}
