package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


	@FindBy(id="userid")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(xpath="//button[@class='button-orange wide']")
	private WebElement submitButton;
	
	@FindBy(id="pin")
	private WebElement enterPin;
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void login(String user, String pass, String pin) {
		
		username.sendKeys(user);
		password.sendKeys(pass);
		submitButton.click();
		enterPin.sendKeys(pin);
		submitButton.click();
		
	}
	
	
}
