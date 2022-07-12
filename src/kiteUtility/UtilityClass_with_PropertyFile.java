package kiteUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass_with_PropertyFile 
{
	public static void captureScreenshot(WebDriver driver, String TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest= new File("C:\\Screenshots\\TestCaseNo"+TCID+".png");
		FileHandler.copy(src, dest);	
	}

	public static String getDataFromPropertyFile(String key) throws IOException
	{
		Properties prop = new Properties();
		FileInputStream myFile = new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\YogeshChavhan-Selenium\\Kite.properties");
		prop.load(myFile);
		String value = prop.getProperty(key);
		return value;
	}
}
