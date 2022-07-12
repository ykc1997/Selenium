package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendkeys {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Yogesh Chavhan");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='autocomplete']")).clear();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='option1']")).click();
		
	
	}

}
