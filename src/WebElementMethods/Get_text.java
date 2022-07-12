package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_text {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		String output = driver.findElement(By.xpath("//a[text()='Velocity Corporate Training Center']")).getText();
		
		System.out.println(output);
		
	}

}
