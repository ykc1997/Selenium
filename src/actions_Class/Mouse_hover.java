package actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_hover {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		// How to perform actions on elements using Actions class
		
		//1. Create object of Actions class who accept driver object as argument
		Actions act = new Actions(driver);
				
		//2. Find element to be handled and store into reference variable
		WebElement SeleniumButton = driver.findElement(By.linkText("Selenium"));
		
		//3. Perform operations on target element by using Actions class methods
		
		// Action no: 1. Click on Selenium Button
		
			//SeleniumButton.click(); --->by using webElement method
		
		/* 1st Way
		 * Step 1: First move mouse cursor to target element
		 * Step 2: And after that perform action on that element
		*/ 
			//act.moveToElement(SeleniumButton).perform();
			//act.click().perform();
			
		// 2nd Way : Move mouse cursor to target element and perform action on that element	
			//act.moveToElement(SeleniumButton).click().build().perform();
		
		// 3rd Way : Directly click on target element
			act.click(SeleniumButton).perform();
			
			// Now to perfom further opeations on web page, unclick/reclick the Selenium Button
			Thread.sleep(1000);
			act.click().perform();
			
			
		// Action no: 2. Right click on  Button
			WebElement RightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
			Thread.sleep(1000);
			act.contextClick(RightClickButton).perform();
			
			// Now to perfom further opeations on web page, unclick/reclick the Right click Button
			Thread.sleep(1000);
			act.click().perform();
			
		// Action no: 3. Double click on  Button
			WebElement DoubleClickButton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
			act.doubleClick(DoubleClickButton).perform();
			
		// Quit browser
		Thread.sleep(1000);
		driver.quit();

	}

}
