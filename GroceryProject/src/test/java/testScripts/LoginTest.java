package testScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import automationcore.TestBase;
import pages.LoginPage;
import utility.ExcelUtility;


public class LoginTest extends TestBase{
	
	@Test
	public void verifyUserLoginWithValidCredentials() throws IOException {
		String usernameValue = ExcelUtility.getStringData(0, 0,"GrocerySignInPage");
		String passwordValue = ExcelUtility.getStringData(0, 1,"GrocerySignInPage");
		
		LoginPage login=new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernameValue);
		login.enterPasswordOnPasswordField(passwordValue);
		login.clickOnSignInButton();
		
	}
	
	@Test
	public void verifyUserLoginWithInvalidUsernameAndValidPassword() throws IOException {
		String usernameValue = ExcelUtility.getIntegerData(1, 0,"GrocerySignInPage");
		String passwordValue = ExcelUtility.getStringData(1, 1,"GrocerySignInPage");
		
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernameValue);
		login.enterPasswordOnPasswordField(passwordValue);
		login.clickOnSignInButton();
	}
	
	@Test
	public void verifyUserLoginWithvalidUsernameAndInValidPassword() throws IOException {
		String usernameValue = ExcelUtility.getStringData(2, 0,"GrocerySignInPage");
		String passwordValue = ExcelUtility.getIntegerData(2, 1,"GrocerySignInPage");
		
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernameValue);
		login.enterPasswordOnPasswordField(passwordValue);
		login.clickOnSignInButton();
	}
		
	@Test
	public void verifyUserLoginWithInvalidCredentials() throws IOException {
		String usernameValue = ExcelUtility.getIntegerData(3, 0,"GrocerySignInPage");
		String passwordValue = ExcelUtility.getStringData(3, 1,"GrocerySignInPage");
		
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernameValue);
		login.enterPasswordOnPasswordField(passwordValue);
		login.clickOnSignInButton();
	}
	
	
	


}
