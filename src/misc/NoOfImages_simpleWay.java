package misc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfImages_simpleWay {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
//		// handling iframe and click on 'No thanks' button
//		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@role='presentation']")));
//		driver.findElement(By.xpath("//button[text()='No thanks']")).click();
		
		driver.findElement(By.name("q")).sendKeys("audi Q7");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='audi q7'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Images']")).click();
		Thread.sleep(2000);
		List<WebElement> ImageCount = driver.findElements(By.tagName("img"));
		System.out.println(ImageCount.size());
	}

}
