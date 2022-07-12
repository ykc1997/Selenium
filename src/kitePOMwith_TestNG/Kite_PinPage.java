package kitePOMwith_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_PinPage
{
	//1. Data Members (i.e.WebElement)
		@FindBy (id="pin") private WebElement Pin;
		@FindBy (xpath = "//button[@type='submit']") private WebElement continueButton;
		
	//2. Constructor
		public Kite_PinPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
	//3. Methods
		public void sendPin(String pin) 
		{
			Pin.sendKeys(pin);
		}
		
		public void clickContinueButton() 
		{
			continueButton.click();
		}
}
