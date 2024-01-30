package PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 * @author Aman Singh
 *
 */

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='Email']")
	private WebElement emailTextField;

	@FindBy(xpath = "//input[@id='Password']")
	private WebElement passwordTextField;

	@FindBy(xpath = "//span[text()='Login']")
	private WebElement loginButton;

	// getters method
	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	//operational method
	public void loginIntoShopperStack(String email, String password)
	{
		getEmailTextField().sendKeys(email);
		getPasswordTextField().sendKeys(password);
		getLoginButton().click();
	}

}
