package Listners_and_TestNG;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import kiteBase.BaseClass_with_PropertyFile;
import kiteUtility.UtilityClass_with_PropertyFile;

public class Listeners extends BaseClass_with_PropertyFile  implements ITestListener
{
	//WebDriver driver;
	String TCID = "006";
	
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
