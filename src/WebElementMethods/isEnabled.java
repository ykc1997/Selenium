package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.discoveryplus.in/");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		
		Thread.sleep(3000);
		
		WebElement getOTP = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		
		System.out.println(getOTP.isEnabled());
		
		//driver.findElement(By.xpath("//button[text()='Get OTP']")).sendKeys("7741010704");
		
		driver.findElement(By.id("mobileNumber")).sendKeys("7741010704");
		
		Thread.sleep(3000);
		
		System.out.println(getOTP.isEnabled());
		
		getOTP.click();
	}

}
