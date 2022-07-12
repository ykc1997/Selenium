package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample1 {
 
	@Test
  public void myMethod() throws InterruptedException 
  {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(1000);
		
		System.out.println("Hi this is printing statement");
		
		Reporter.log("Hi this is reporter output");
		
		Reporter.log("Hi this is reporter output with true", true);
  }
}
