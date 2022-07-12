package testNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods {
 
	 @Test(timeOut = 1000)
	  public void a() throws InterruptedException 
	  {
		 Thread.sleep(500); 
		 Reporter.log("Hi Good Morning", true);
	  }
	  
	  @Test
	  public void b() 
	  {
		  Reporter.log("Hi Good Afternoon", true);
	  }
	  
	  @Test(dependsOnMethods = {"a"})
	  public void c() 
	  {
		  Reporter.log("Hi Good Night", true);  
	  }
  
}
