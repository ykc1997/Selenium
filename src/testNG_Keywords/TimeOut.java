package testNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOut {
	 @Test
	  public void a() 
	  {
		  Reporter.log("Hi Good Morning", true);
	  }
	  
	  @Test (timeOut = 100)
	  public void b() throws InterruptedException 
	  {
		  //Thread.sleep(1000);  // It will throw Thread TimeOut Exception as Sleep time(Statically Wait the browser) is more than timeout
		  Reporter.log("Hi Good Afternoon", true);
	  }
	  
	  @Test
	  public void c() 
	  {
		  Reporter.log("Hi Good Night", true);  
	  }
}
