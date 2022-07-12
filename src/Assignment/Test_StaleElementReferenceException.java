package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_StaleElementReferenceException {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		      
		//URL launch
		driver.get("https://www.google.com/");
		      
		// identify element
		WebElement we = driver.findElement(By.name("q"));
		we.sendKeys("tutorialspoint");
		     
		//page refresh
		driver.navigate().refresh();
		we.sendKeys("Java");
		driver.close();
		
		
	}

}
