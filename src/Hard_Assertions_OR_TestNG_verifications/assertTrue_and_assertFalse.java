package Hard_Assertions_OR_TestNG_verifications;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class assertTrue_and_assertFalse 
{
  @Test
  public void myMethod1() 
  {
	boolean a = true;  
	boolean b = false;
	
	Assert.assertTrue(a, "TC is failed value is false");
	Reporter.log("TC is passed value is true ",true);
	
	Assert.assertFalse(b, "TC is failed value is true");
	Reporter.log("TC is passed value is false",true);
	
  }
}
