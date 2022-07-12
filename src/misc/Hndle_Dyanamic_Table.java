package misc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hndle_Dyanamic_Table {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//1. Get Total number of Rows
		List<WebElement> rows = driver.findElements(By.xpath("//table//tr"));
		int NoOfRows = rows.size();
		System.out.println("Total number of Rows : "+NoOfRows);
		
		//2. Total number of Colums
		List<WebElement> colums = driver.findElements(By.xpath("//table//tr//th"));
		int NoOfColums = colums.size();
		System.out.println("Total number of Colums : "+NoOfColums);
		
		System.out.println("============================================================");
		
		//3. Read Header of table
		for(WebElement Header:colums)
		{
			System.out.print(Header.getText()+"  ");
		}
		System.out.println();
		
		//4. Read Rows from table
		for(int i = 1; i<=NoOfRows-1; i++)
		{
			System.out.print(rows.get(i).getText()+"  ");
			System.out.println();
		}
		
	}

}
