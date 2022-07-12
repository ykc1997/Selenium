package crossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Compatibility 
{
	@Parameters("browserName")
	@Test
  public void myMethod(String name) throws InterruptedException 
  {
		WebDriver driver = null  ;
	  if(name.equals("chrome"))
	  {  
	  	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		 driver = new ChromeDriver();
	  }
		
	  else if (name.equals("firefox")) 
	  {
		  System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");

//		  FirefoxOptions opt = new FirefoxOptions();
//		  opt.setHeadless(true);
//		  driver = new FirefoxDriver(opt);
		  
		  driver = new FirefoxDriver();
	
	  }
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		driver.close();
	  
  }
}
