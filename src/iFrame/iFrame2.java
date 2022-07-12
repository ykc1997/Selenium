package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame2 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/iframes/");
		
		driver.manage().window().maximize();
		
		String text = driver.findElement(By.xpath("//a[text()='Blogger']")).getText();   // Locator by xpath
		
		System.out.println("MAIN-PAGE: "+text);
		
		// switching to frame 1
		driver.switchTo().frame("Frame1");    // switching by frame(name/id)  
		String text1 = driver.findElement(By.id("frametext")).getText();   // Locator by id
		System.out.println("FRAME-1: "+text1);
		
		Thread.sleep(2000);
		
		// switching to main page
		driver.switchTo().parentFrame();    
		String text2 = driver.findElement(By.linkText("Pavilion")).getText();   // Locator by LinkText
		System.out.println("MAIN-PAGE: "+text2);
		
		// switching to frame 2
		driver.switchTo().frame(1);      // switching by frame(index)
		String text3 = driver.findElement(By.linkText("Category3")).getText();   // Locator by LinkText
		System.out.println("FRAME-2: "+text3);
		
		// switching to main page
		driver.switchTo().defaultContent();
//		driver.findElement(By.partialLinkText("Blog")).click();   // Locator by PartialLinkText
//		Thread.sleep(1000);
//		driver.close();
//		System.out.println("MAIN-PAGE: Blogger is clicked ");
		
		Thread.sleep(1000);
		
		// switching to frame 1
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='Frame1']")));  // switching by frame(WebElement)
		driver.findElement(By.xpath("//a[text()='Category2']")).click();    // Locator by xpath
		//System.out.println("FRAME-1: "+text4);
	}

}
