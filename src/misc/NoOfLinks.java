package misc;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfLinks {

	public static void main(String[] args) throws InterruptedException 
	{
		//1. Set property of chrome driver, create object of chrome driver and launch the URL
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//2. Locate all links present in webpage using findElements() method
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		
			// OR by using driver.findElements(By.xpath("//a"));
		
		//3. To get the size of links in webpage
		System.out.println(Links.size());
		
			//System.out.println(Links);
		
		//4. Get text of each link

//		for(WebElement LinkText:Links)
//		{
//			System.out.println(LinkText.getText());
//			
//			//System.out.println(LinkText);
//		}
		
		Iterator<WebElement> it = Links.iterator();
		while(it.hasNext())
		{
		System.out.println(it.next().getText());
		}
	}	

}
