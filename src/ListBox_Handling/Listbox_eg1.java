package ListBox_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox_eg1
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(2000);
		
	//Step1.Identify list box to be handled and store it in reference variable
		WebElement listbox = driver.findElement(By.id("dropdown-class-example"));
//		listbox.click();
//		System.out.println(listbox.isSelected());
	
	//Step2.Create an object of Select class which will accept WebElement as argument
		Select s = new Select(listbox);
		
	//Step3.By using one of the select class methods we can select values form list box like
		
		s.selectByVisibleText("Option3");   //1.select value form list box by using 'selectByVisibleText()' method
		
		Thread.sleep(2000);
		s.selectByValue("option2");        //2.select value form list box by using 'selectByValue()' method
		
		Thread.sleep(2000);
		s.selectByIndex(1);               //3.select value form list box by using 'selectByIndex()' method
		
		//s.deselectAll();  ---> not possible, we are working on single selectable list box
	}

}
