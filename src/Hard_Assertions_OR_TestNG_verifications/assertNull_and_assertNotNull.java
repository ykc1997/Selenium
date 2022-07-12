package Hard_Assertions_OR_TestNG_verifications;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class assertNull_and_assertNotNull 
{
  @Test
  public void myMethod() 
  {
	  String a=null;
	  String b="abc";
	 
	  Assert.assertNull(a, "value is not null TC is failed");
	  Reporter.log("value is null TC is passed",true);
	 
	  Assert.assertNotNull(b, "value is null TC is failed");
	  Reporter.log("value is not null TC is passed",true);
	 
	  Assert.fail();
  }
}
