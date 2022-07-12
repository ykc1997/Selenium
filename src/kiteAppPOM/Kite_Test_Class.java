package kiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kite_Test_Class {

	public static void main(String[] args) throws InterruptedException 
	{
		//1.Lauch application on chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//2.Create object of Kite_Login_Page class and call methods from that class
		Kite_Login_Page Login = new Kite_Login_Page(driver);
		Login.sendUserName();
		Login.sendPassword();
		Login.clickLoginButton();
		
		//3.Create object of Kite_Pin_Page class and call methods from that class
		Thread.sleep(1000);
		
		Kite_Pin_Page Pin = new Kite_Pin_Page(driver);
		Pin.sendPin();
		Pin.clickContinueButton();
		
		//4.Create object of Kite_Home_Page class and call methods from that class
		Thread.sleep(1000);
		
		Kite_Home_Page Home = new Kite_Home_Page(driver);
		Home.userName();
		Home.logOut();
		
		//5.Close Kite_Zeroda application
		Thread.sleep(1000);
		driver.close();
	}

}
