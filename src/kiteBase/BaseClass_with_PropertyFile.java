package kiteBase;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import kiteUtility.UtilityClass_with_PropertyFile;

public class BaseClass_with_PropertyFile 
{
	 protected static WebDriver driver;
	 
	public void openBrowser() throws IOException
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("disable-notifications");
		options.addArguments("start-maximized");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");	
		driver= new ChromeDriver(options);
		driver.get(UtilityClass_with_PropertyFile.getDataFromPropertyFile("URL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
}
