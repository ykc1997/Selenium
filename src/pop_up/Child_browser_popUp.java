package pop_up;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_browser_popUp {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//Step 1 : id of main page
//		String mainPageId = driver.getWindowHandle();
//		System.out.println(mainPageId);
//		System.out.println("================");
		
		//Step 2 : To open Child window
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(2000);
	
		//Step 3: To handle multiple windows / to get IDs of windows
		Set<String> AllPageIDs = driver.getWindowHandles();
	
		//System.out.println(AllPageIDs);  // If we print directly it gives us output as a set 
		
//		for(String api:AllPageIDs)
//		{
//			System.out.println(api);
//		}
		
		Iterator<String> it = AllPageIDs.iterator();   // To get IDs individually or one by one
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
		
		String mainPageID = it.next();
		String childPageID = it.next();
		
		//Step 4: Switch selenium focus from main page to child page
		
		driver.switchTo().window(childPageID);
		driver.manage().window().maximize();
		
		//System.out.println(driver.getWindowHandle());  //It will return ID of child page
		
		driver.findElement(By.xpath("//input[@id='the7-search']")).sendKeys("Java");
		Thread.sleep(2000);
		
		//Step 5 : Switch selenium focus from child page to main page
		driver.switchTo().window(mainPageID);
		String text = driver.findElement(By.xpath("//p[contains(text(),'browser window')]")).getText();
		System.out.println(text);
		
		//System.out.println(driver.getWindowHandle());   //It will return ID of main page
	}
	

}
