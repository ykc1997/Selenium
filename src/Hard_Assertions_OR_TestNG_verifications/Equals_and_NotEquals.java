package Hard_Assertions_OR_TestNG_verifications;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Equals_and_NotEquals 
{
  @Test
  public void myMethod1() 
  {
	  //assertEquals
	  String a="Pune";
	  String b="Pune";
	  Assert.assertEquals(a, b," a and b values are not matching, TC failed");
	  Reporter.log(" a and b values are matching, TC PASSED",true);
	 
//	  Assert.assertNotEquals(a, b," a and b values are matching TC failed");
//	  Reporter.log(" a and b values are not matching TC Passed",true);
  }
         
  @Test
  public void myMethod2() 
  {
	//assertNotEquals
	  String x ="Pune";
	  String y ="Pune1";
	  Assert.assertNotEquals(x, y," x and y values are matching TC failed");
	  Reporter.log(" x and y values are not matching TC Passed",true);

  }
  
}
