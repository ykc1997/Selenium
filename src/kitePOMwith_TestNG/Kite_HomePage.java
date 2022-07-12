package kitePOMwith_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_HomePage 
{
	//1. Data Members (i.e.WebElement)
		@FindBy (xpath = "//span[@class='user-id']") private WebElement userID;
		@FindBy (xpath = "//a[@target='_self']") private WebElement logOutButton;
		
	//2. Constructor
		public Kite_HomePage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		
	//3. Methods
		public void userName(String expected) 
		{
			String actualUID = userID.getText();
			String expectedUID = expected;
			
			if(actualUID.equals(expectedUID))
			{
				System.out.println("UID is matched : Test Case is Passed");
			}
			else
			{
				System.out.println("UID is not-matched : Test Case is Failed");
			}
		}
		
		//to get actual userName
		public String getActualUserName()
		{
			String actualUserName = userID.getText();
			return actualUserName;
		}
		
		public void logOut() throws InterruptedException 
		{
			Thread.sleep(1000);
			userID.click();
			
			Thread.sleep(1000);
			logOutButton.click();
		}

}
