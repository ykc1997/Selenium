package Hard_Assertions_OR_TestNG_verifications;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultipleVerifications 
{
  @Test
  public void myMethod1() 
  {
	  
		  String a="Pune";
		  String b="Pune";
		  
		  Assert.assertNotEquals(a, b,"TC is failed values are equal");	  
	  
  }
  
  @Test
  public void mymethod2()
  {
	  String a="Pune";
	  String b="Pune1";
	  
	  Assert.assertNotEquals(a, b,"TC is failed values are equal");

  }
}
