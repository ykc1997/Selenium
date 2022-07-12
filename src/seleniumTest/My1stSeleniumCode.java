package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class My1stSeleniumCode {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		
		driver.findElement(By.xpath("//label[@class='_58mt']")).click();   // Xpath by attribute
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("7741010704");   // Xpath by attribute
		
		//driver.findElement(By.xpath("//div[text()='Mobile number or email address']")).sendKeys("ykchavhan1997@gmail.com");
		
		driver.findElement(By.xpath("//input[@value='Radio2']")).click();
		
	}
	

}
