package wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Implicit_wait {

	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		WebElement listbox = driver.findElement(By.id("dropdown-class-example"));
		
		Select s = new Select(listbox);
		
		s.selectByVisibleText("Option3");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20000));  //Syntax from Selenium 4
		
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);  //Syntax before Selenium 4
		
		driver.close();
	}

}
