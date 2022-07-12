package actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_Drop {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//1.Create object of Actions class and pass driver object as argument
		Actions act= new Actions(driver);
		
		//2.Find source element and store it in reference variable
		WebElement source = driver.findElement(By.xpath("//a[text()=' 5000']"));
		
		//3.Find destination element and store it in reference variable
		WebElement destination = driver.findElement(By.id("amt8"));
		
		//4.By using Actions class methods perform desired operation
			
			//1st way
			//act.moveToElement(source).perform();
			//act.clickAndHold().perform();
			//act.moveToElement(destination).perform();
			//act.release().perform();
		
			//2nd way
			//act.moveToElement(source).perform();
			//act.clickAndHold().perform();
			//act.moveToElement(destination).release().build().perform();
			
			//3rd way
			//act.moveToElement(source).perform();
			//act.clickAndHold().moveToElement(destination).build().perform();
			//act.release().perform();
		
			//4th way
			//act.moveToElement(source).perform();
			//act.clickAndHold().moveToElement(destination).release().build().perform();
			
			//5th way
			//act.moveToElement(source).perform();	
			//act.clickAndHold().release(destination).build().perform();
		
			//6th way
			//act.moveToElement(source).clickAndHold().build().perform();
			//act.moveToElement(destination).release().build().perform();
			
			// As such there are multiple ways to perform DRAGandDROP operation
		
			//act.moveToElement(source).clickAndHold().release(destination).build().perform();
		
			//act.clickAndHold(source).release(destination).build().perform();
		
			// Best way
			act.dragAndDrop(source, destination).perform();  
		
			
	}

}
