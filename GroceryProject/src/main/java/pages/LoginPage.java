package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//input[@name='username']") WebElement username_Field;
	@FindBy(xpath="//input[@name='password']") WebElement password_Field;
	@FindBy(xpath="//button[@class='btn btn-dark btn-block']") WebElement signInButton;
	
	public void enterUsernameOnUsernameField(String usernameValue) {
		username_Field.sendKeys(usernameValue);
	}
	
	public void enterPasswordOnPasswordField(String passwordValue) {
		password_Field.sendKeys(passwordValue);
	}
	public void clickOnSignInButton() {
		signInButton.click();
	}
	

}
