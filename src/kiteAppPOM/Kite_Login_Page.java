package kiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Login_Page 
{	
	//1.Data Members (i.e.WebElement)
	@FindBy (id = "userid") private WebElement UserName;
	@FindBy (id = "password") private WebElement Password;
	@FindBy (xpath = "//button[@type='submit']") private WebElement LoginButton;
	
	//2.Constructor
	public Kite_Login_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3.Methods
	public void sendUserName() 
	{
		UserName.sendKeys("ELR321");
	}
	
	public void sendPassword() 
	{
		Password.sendKeys("Dhana1111");
	}
	
	public void clickLoginButton() 
	{
		LoginButton.click();
	}
}
