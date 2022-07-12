package testNG_Grouping;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test_class1 
{
	 @Test(groups="Sanity")
	  public void a() 
	  {
		 Reporter.log("Hi Good Morning", true);
	  }
	  
	  @Test()
	  public void b() 
	  {
		  Reporter.log("Hi Good Afternoon", true);
	  }
	  
	  @Test(groups="Regression")
	  public void c() 
	  {
		  Reporter.log("Hi Good Night", true);  
	  }
	  
	  @Test()
	  public void d() 
	  {
		 Assert.fail();
		 Reporter.log("Zop Gap Guman...", true);
	  }
}
