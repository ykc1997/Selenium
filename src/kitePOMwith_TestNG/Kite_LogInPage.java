package kitePOMwith_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_LogInPage 
{
	//1.Data Members (i.e.WebElement)
		@FindBy (id = "userid") private WebElement UserName;
		@FindBy (id = "password") private WebElement Password;
		@FindBy (xpath = "//button[@type='submit']") private WebElement LoginButton;
		
	//2.Constructor
		public Kite_LogInPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);    //initElements(SearchContext searchContext, Object page)
		}
		
	//3.Methods
		public void sendUID(String uid) 
		{
			UserName.sendKeys(uid);
		}
		
		public void sendPassword(String pwd) 
		{
			Password.sendKeys(pwd);
		}
		
		public void clickLoginButton() 
		{
			LoginButton.click();
		}
}
