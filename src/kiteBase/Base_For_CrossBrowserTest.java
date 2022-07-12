package kiteBase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import kiteUtility.UtilityClass_with_PropertyFile;

public class Base_For_CrossBrowserTest 
{
	protected static WebDriver driver;
	
	public void launchChrome() throws IOException 
	{
		ChromeOptions opt1 = new ChromeOptions();
		opt1.addArguments("--start-maximized");
		opt1.addArguments("--disable-notifications");
		opt1.addArguments("--disable-infobars");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver(opt1);
		driver.get(UtilityClass_with_PropertyFile.getDataFromPropertyFile("URL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
	
	public void launchFirefox() throws IOException 
	{
		FirefoxOptions opt2 = new FirefoxOptions();
		opt2.addArguments("--start-maximized");
		opt2.addArguments("--disable-notifications");
		opt2.addArguments("--disable-infobars");
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		driver = new FirefoxDriver(opt2);
		driver.get(UtilityClass_with_PropertyFile.getDataFromPropertyFile("URL"));	
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}	
}
