package testNG_Annotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Annotation_study1 {
  @Test
  public void myMethod1() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
	  WebDriver driver = new ChromeDriver();
		
	  driver.get("https://vctcpune.com/selenium/practice.html");
		
	  Reporter.log("Hi this is myMethod 1", true);
  }
  
  @Test
  public void myMethod2()
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
	  WebDriver driver = new ChromeDriver();
		
	  driver.get("https://kite.zerodha.com/");
		
	  Reporter.log("Hi this is myMethod 2", true);
  }
}
