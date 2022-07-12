package actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_actions {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//1. Create object of Actions class
		Actions act = new Actions(driver);
		
		//2. Locate web element and store in reference variable
		WebElement textbox = driver.findElement(By.id("autocomplete"));
		
		//3. Perform action using Actions class
	
		//Action 1 : sendKeys()--->Insert values directly in target element
		
			Thread.sleep(1000);
			
			//act.moveToElement(textbox).sendKeys("Hi I am Yogesh").build().perform();   //1st way
			
			act.sendKeys(textbox, "Hi I am Yogesh").perform();   //2nd way
			Thread.sleep(3000);
			textbox.clear();
			
		//Action 2 : keyDown()--->Press and Hold the key--->( only modifier keys--->Alt,Shift,Ctrl,Windows keys)
		//Action  : keyUp()--->Release the key--->( only modifier keys--->Alt,Shift,Ctrl,Windows keys)
			
			// Insert 'Good Morning' at target
			Thread.sleep(2000);
			act.keyDown(textbox, Keys.SHIFT).sendKeys("g").keyUp(Keys.SHIFT).sendKeys("ood").build().perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.SPACE).keyDown(textbox, Keys.SHIFT).sendKeys("m").keyUp(Keys.SHIFT).sendKeys("orning").build().perform();
	}

}
