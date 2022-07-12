package misc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Dyanamic_Webelement {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//1. Handle Hidden Division popup
			//driver.findElement(By.className("_2KpZ6l _2doB4z")).click();  // It throws Invalid_Selector_Exception : Compound class names not permitted
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		//2. Insert values in searh bar
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("apple 13");
		
		//3. Click on search button
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//4. Get reviews of APPLE iPhone 13 ((PRODUCT)RED, 128 GB)
		Thread.sleep(5000);
		String reviews = driver.findElement(By.xpath("((//div[@class='col col-7-12'])[1]//span)[6]")).getText();
		System.out.println(reviews);
	}

}
