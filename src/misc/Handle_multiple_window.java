package misc;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_multiple_window {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		String mainPageID = driver.getWindowHandle();
		System.out.println("Main window ID : "+mainPageID);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='w3-button tryit-button'])[1]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='w3-button tryit-button'])[1]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='w3-button tryit-button'])[1]")).click();
		
		//driver.quit();   // It will throw NoSuchSessionException for line no 35
		
		Thread.sleep(3000);
		Set<String> windowIDs = driver.getWindowHandles();
		System.out.println("Total no of windows : "+windowIDs.size());
		
		System.out.println("============================================================================");
		
		Thread.sleep(3000);
		Iterator<String> it = windowIDs.iterator();
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
		
		String Main_Window_ID = it.next();
		String First_Window_ID = it.next();
		String Sconnd_Window_ID = it.next();
		String Third_Window_ID = it.next();
		
		// switch focus to 3rd window
		driver.switchTo().window(Third_Window_ID);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
		Thread.sleep(3000);
		driver.close();
		
		// switch focus to 2nd window
		Thread.sleep(3000);
		driver.switchTo().window(Sconnd_Window_ID);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='menuButton']")).click();
		Thread.sleep(3000);
		driver.close();
		
		// switch focus to 1st window
		Thread.sleep(3000);
		driver.switchTo().window(First_Window_ID);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='Change Orientation']")).click();
		Thread.sleep(3000);
		driver.close();
		
		// switch focus to main window
		Thread.sleep(3000);
		driver.switchTo().window(Main_Window_ID);
		Thread.sleep(3000);
		driver.findElement(By.linkText("Learn HTML")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
