package softAssert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertTrue_and_False 
{
  @Test
  public void myMethod() 
  {
	  boolean x = true;
	  boolean y = false;
	  
	  // Create object of SoftAssert Class
	  SoftAssert soft = new SoftAssert();
	  
	  soft.assertTrue(y,"Value is not true, TC is Failed");
	  
	  soft.assertFalse(x,"Value is not false, TC is Failed");
	  
	  soft.assertAll();
  }
}
