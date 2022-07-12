package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class RandomStringSceenshot {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//Step 1
		String str = RandomString.make(2);
		
		// Step 2
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//step 3
		File destination = new File("C:\\Screenshots\\TestScreenshot"+str+".jpg");
		
		//Step 4
		FileHandler.copy(source, destination);
	}

}
