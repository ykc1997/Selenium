package seleniumTest;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_driver_method 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
			driver.get("https://vctcpune.com/selenium/practice.html");    //1.get() Method
		
			//driver.close();    //2.close() Method
		
			//driver.quit();     //3.quit() Method
				
			driver.manage().window().maximize();   //4.1 maximize() Method
				
			//driver.manage().window().minimize();  //4.2 minimize() Method
				
			driver.navigate().to("https://www.facebook.com/");   //5.1 navigate().to() Method
				
			driver.navigate().back();      //5.2 navigate().back() Method
				
			driver.navigate().forward();   //5.3 navigate().forward() Method
			
			driver.navigate().refresh();   //5.4 navigate().refresh() Method
				
			driver.getTitle();    //6.getTitle() Method--->Returns->String
				
			System.out.println(driver.getTitle());
				
			driver.getCurrentUrl();  //7.getUrl() Method--->Returns->String
				
			System.out.println(driver.getCurrentUrl());
			
			Dimension size = driver.manage().window().getSize();  //8. getSize() method--->Returns->Dimension
			System.out.println(size);	
			
			Dimension d = new Dimension(1550,900);  //crate object of Dimension class
			driver.manage().window().setSize(d);    //9. setSize() method--->Returns->void
			
			Point position = driver.manage().window().getPosition();  //10. getPosition() method--->Returns->Point
			System.out.println(position);
			
			Point p = new Point(200,100);   //crate object of Point class
			driver.manage().window().setPosition(p);   //11. setPosition() method--->Returns->void
	}

}
