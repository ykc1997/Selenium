package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
//		String a1 = driver.findElement(By.xpath("(//a[@role='button'])[2]")).getTagName();
//		System.out.println(a1);
		
		//1.Insert first name
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("Yogesh");
		
		//2.Insert surname
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("Chavhan");			
		
		//3.Insert email address
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email__")).sendKeys("ykchavhan1997@gmail.com");			
				
		//4.Re-enter email address
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("ykchavhan1997@gmail.com");			
		
		//5.Enter new password
		Thread.sleep(2000);
		driver.findElement(By.id("password_step_input")).sendKeys("**********");			
				
		//6.Select day
		Thread.sleep(2000);
		WebElement Day = driver.findElement(By.id("day"));
		Select s = new Select(Day);
		s.selectByVisibleText("14");
		
		//7.Select month -------> NO NEED TO SELECT MONTH, BECAUSE BIRTH MONTH IS 'MAY' WHICH IS ALREADY SELECTED, SINCE IT IS CURRENT MONTH
//		Thread.sleep(2000);
//		WebElement month = driver.findElement(By.id("month"));
//		Select s1 = new Select(month);
//		s1.selectByVisibleText("May");
		
		//8.Select year
		Thread.sleep(2000);
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select s2 = new Select(year);
		s2.selectByValue("1997");
		
		//9.Select gender
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		//10.Click sign up button
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
	}

}
