package testNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class enabled {
  @Test
  public void a() 
  {
	  Reporter.log("Hi Good Morning", true);
  }
  
  @Test(enabled = false)
  public void b() 
  {
	  Reporter.log("Hi Good Afternoon", true);
  }
  
  @Test(enabled = true)
  public void c() 
  {
	  Reporter.log("Hi Good Night", true);  
  }
  
}
