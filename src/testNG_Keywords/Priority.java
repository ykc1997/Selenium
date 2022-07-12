package testNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
  @Test(priority = -1)
  public void myMethod1() 
  {
	  Reporter.log("Hi Good Morning", true);
  }
  
  @Test(priority = 2)
  public void myMethod2()
  {
	  Reporter.log("Hi Good Night", true);  
  }
  
  @Test
  public void a()
  {
	  Reporter.log("Hi Good Afternoon", true);
  }
}
