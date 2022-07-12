package kiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Home_Page 
{
	//1. Data Members (i.e.WebElement)
	@FindBy (xpath = "//span[@class='user-id']") private WebElement userID;
	@FindBy (xpath = "//a[@target='_self']") private WebElement logOutButton;
	
	//2. Constructor
	public Kite_Home_Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//3. Methods
	public void userName() 
	{
		String actualUID = userID.getText();
		String expectedUID ="ELR321";
		
		if(actualUID.equals(expectedUID))
		{
			System.out.println("UID is matched : Test Case is Passed");
		}
		else
		{
			System.out.println("UID is not-matched : Test Case is Failed");
		}
	}
	
	public void logOut() throws InterruptedException 
	{
		Thread.sleep(1000);
		userID.click();
		
		Thread.sleep(1000);
		logOutButton.click();
	}
}
