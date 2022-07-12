package softAssert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertNull_NotNull 
{
  @Test
  public void myMethod() 
  {
	  String a = "Pune";
	  String b = null;
	  
	  // Create object of SoftAssert Class
	  SoftAssert soft = new SoftAssert();
	  
	  soft.assertNull(a," Value is not null, TC is Failed");
	  
	  soft.assertNotNull(b," Value is null, TC is Failed");
	  
	  soft.assertAll();
	
  }
}
