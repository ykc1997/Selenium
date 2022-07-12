package softAssert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Equals_and_NotEquals 
{
  @Test
  public void myMethod() 
  {
	  String a = "Pune";
	  String b = "Pune1";
	  
	  // Create object of SoftAssert Class
	  SoftAssert soft = new SoftAssert();
	  
	  soft.assertEquals(a,b," Values are not matching, TC is Failed");
	  
	  soft.assertNotEquals(a, b," Values are matching, TC is Passed");

	  soft.assertAll();
	  
  }
}
