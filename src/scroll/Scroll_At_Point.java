package scroll;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_At_Point {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/");
		//driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		JavascriptExecutor j = (JavascriptExecutor)driver;
		
		//j.executeScript("window.scrollBy(110,1550)");
		
		j.executeScript("window.scrollTo(0,document.body.scrollHeight)");   // Scroll direct to bottom
	}

}
