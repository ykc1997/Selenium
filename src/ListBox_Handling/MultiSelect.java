package ListBox_Handling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		WebElement multiSelectElement = driver.findElement(By.name("cars"));
		
		Select s = new Select(multiSelectElement);
		
		System.out.println("Multi Selectable status is "+s.isMultiple());
		
		Thread.sleep(1000);
		s.selectByValue("volvo");
		
		Thread.sleep(1000);
		s.selectByVisibleText("Saab");
		
		Thread.sleep(1000);
		s.selectByIndex(2);
		
		Thread.sleep(1000);
		s.selectByIndex(3);
		
//		Thread.sleep(1000);
//		s.deselectAll();
		
//		Thread.sleep(1000);
//		s.deselectByIndex(3);
//		
//		Thread.sleep(1000);
//		s.deselectByIndex(2);
//		
//		Thread.sleep(1000);
//		s.deselectByVisibleText("Saab");
//		
		Thread.sleep(1000);
		System.out.println(s.getFirstSelectedOption().getText());
		
		Thread.sleep(1000);
//		s.getAllSelectedOptions();
//		System.out.println(s.getAllSelectedOptions());
		
		List<WebElement> SelectedAll = s.getAllSelectedOptions();
		
		for(WebElement option : SelectedAll )
		{
			System.out.println(option.getText());
		}
		
	}
}
