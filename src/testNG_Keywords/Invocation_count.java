package testNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Invocation_count 
{
	@Test(invocationCount = 3)
	public void myTest()
	{
		Reporter.log("Hello",true);
	}
	
	@AfterMethod
	public void test()
	{
		Reporter.log("Hi",true);
	}
}
