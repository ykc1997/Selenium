package TestCase_example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KIte_zeroda_logIn {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//1.Locate elements of LogIn page
		WebElement usrId = driver.findElement(By.id("userid"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
	
		//2.Perfom action on located webelements of LogIn page
		usrId.sendKeys("ELR321");
		Thread.sleep(500);
		password.sendKeys("Dhana1111");
		Thread.sleep(500);
		loginButton.click();
		  
		//3.Locate elements of Pin page
		Thread.sleep(3000);
		WebElement pin = driver.findElement(By.id("pin"));
		WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		//4.Perfom action on located webelements of Pin page
		Thread.sleep(3000);
		pin.sendKeys("982278");
		Thread.sleep(500);
		continueButton.click();
		
		//5.Locate elements of Home page
		Thread.sleep(3000);
		WebElement userName = driver.findElement(By.xpath("//span[@class='user-id']"));
		userName.click();
		
		String ActualUID = userName.getText();
		String ExpectedUID = "ELR321";
		
		//6.Perfom action on located webelements of Home page
		if(ActualUID.equals(ExpectedUID))
		{
			System.out.println("Test Case is PASSED");
		}
		else
		{
			System.out.println("Test Case is FAILED");
		}
		
		//7.Log out
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@target='_self']")).click();
		
		driver.quit();
		
	}

}
