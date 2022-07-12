package pop_up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popUp {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
//		// Step 1 : click on web element 'Click me'
//		driver.findElement(By.id("alertButton")).click();
//		
//		Thread.sleep(2000);
//		
//		// Step 2 : click on 'OK'
//		Alert alt = driver.switchTo().alert();
//		alt.accept();
//		
		// Step 3
//		Thread.sleep(10000);
//		driver.findElement(By.id("timerAlertButton")).click();
//		Alert alt1 = driver.switchTo().alert();
//		//System.out.println(alt1.getText());
//		alt1.accept();
		
		//Step 4
		Thread.sleep(2000);
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(2000);
		
		Alert alt2 = driver.switchTo().alert();
		//alt2.dismiss();   // it will throw NoAlertPresentException for getText() at following action (line no 47)
		Thread.sleep(2000);
		System.out.println(alt2.getText());
		alt2.dismiss();
		
		Thread.sleep(2000);
		WebElement text = driver.findElement(By.xpath("//span[text()='On button click, prompt box will appear']"));
		System.out.println(text.getText());
		
	}

}
