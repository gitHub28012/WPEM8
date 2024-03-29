package PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "search")
	private WebElement searchTextField;

	@FindBy(id = "searchBtn")
	private WebElement searchButton;

	@FindBy(id = "cartIcon")
	private WebElement cartButton;

	@FindBy(xpath = "//button[@aria-label='Account settings']")
	private WebElement accountSettingButton;

	@FindBy(xpath = "//li[text()='Logout']")
	private WebElement logoutLink;

	@FindBy(xpath = "//span[contains(text(),'SAMSUNG Galaxy Z Flip4')]/ancestor::div[@class='featuredProducts_cardFooter__qL8vT']/descendant::button[@id='addToCart']")
	private WebElement addToCartProduct;

	public WebElement getAddToCartProduct() {
		return addToCartProduct;
	}

	public WebElement getSearchTextField() {
		return searchTextField;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getCartButton() {
		return cartButton;
	}

	public WebElement getAccountSettingButton() {
		return accountSettingButton;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}

	// operational method

	public void logoutFromShopperstack() {
		getAccountSettingButton().click();
		getLogoutLink().click();
	}
	
	public void addProductIntocart() throws InterruptedException
	{
		Thread.sleep(10000);
		getAddToCartProduct().click();
	}

}
