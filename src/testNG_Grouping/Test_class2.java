package testNG_Grouping;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test_class2 
{
	 @Test(groups="Sanity")
	  public void p() 
	  {
		 Reporter.log("Please have a Brakefast", true);
	  }
	  
	  @Test()
	  public void q() 
	  {
		  Reporter.log("Please have a Lunch", true);
	  }
	  
	  @Test(groups="Regression")
	  public void r() 
	  {
		  Reporter.log("Please have a Dinner", true);  
	  }
	  
	  @Test()
	  public void s() 
	  {
		  Assert.fail();
		  Reporter.log("Tula aaj Jevayla nahi ...", true);
	  }
}
