package kiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Pin_Page 
{
	//1. Data Members (i.e.WebElement)
	@FindBy (id="pin") private WebElement Pin;
	@FindBy (xpath = "//button[@type='submit']") private WebElement continueButton;
	
	//2. Constructor
	public Kite_Pin_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3. Methods
	public void sendPin() 
	{
		Pin.sendKeys("982278");
	}
	
	public void clickContinueButton() 
	{
		continueButton.click();
	}
}
