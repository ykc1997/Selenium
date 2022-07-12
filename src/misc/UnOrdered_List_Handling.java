package misc;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnOrdered_List_Handling {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("sgbau");
		
		Thread.sleep(2000);
				
		List<WebElement> ElementList = driver.findElements(By.xpath("(//ul[@jsname='bw4e9b'])[1]//li"));
		System.out.println(ElementList.size());
	
		//System.out.println(ElementList);
		
		Iterator<WebElement> it = ElementList.iterator();    // for getting text only
		while(it.hasNext())
		{
			System.out.println(it.next().getText());
		}
		
		for(WebElement el:ElementList)    // for clicking on required result
		{	String ActualResult = el.getText();
			String Expectedresult = "sgbau phd cell";
		
			if(ActualResult.equals(Expectedresult))
			{
				el.click();
				break;
			}
		}
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Images")).click();
		
		List<WebElement> ImageList = driver.findElements(By.tagName("img"));
		System.out.println(ImageList.size());
	}

}
