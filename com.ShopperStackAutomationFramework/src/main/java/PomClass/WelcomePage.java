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



public class WelcomePage {
	
	public WelcomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	@FindBy(id ="loginBtn")
	private WebElement loginButton;
	
	@FindBy(xpath ="//a[@id='men']")
	private WebElement menLink;
	
	@FindBy(xpath ="(//button[@name='addToCart'])[1]")
	private WebElement addToCartButton;
	
	//getter method
	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getMenLink() {
		return menLink;
	}

	public WebElement getAddToCartButton() {
		return addToCartButton;
	}
	
	//operational method
	public void clickOnLoginButton()
	{
		getLoginButton().click();
	}
	
	
	

}
