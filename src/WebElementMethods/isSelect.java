package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelect {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		WebElement option1 = driver.findElement(By.name("checkBoxOption1"));
		
		//option1.click();
		
		if(option1.isSelected())
		{
			System.out.println("Option1 is already selected");
		}
		else
		{
			option1.click();
			System.out.println("Option1 is now selected");
		}
	}

}
