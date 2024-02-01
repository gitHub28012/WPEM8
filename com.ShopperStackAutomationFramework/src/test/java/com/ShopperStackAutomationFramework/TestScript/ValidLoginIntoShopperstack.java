package com.ShopperStackAutomationFramework.TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ShopperStackAutomationFramework.GenericLib.BaseTest;
import com.ShopperStackAutomationFramework.GenericLib.CustomListener;

import PomClass.LoginPage;
import PomClass.WelcomePage;

@Listeners(CustomListener.class)
public class ValidLoginIntoShopperstack extends BaseTest{
	
	
	@Test
	public void login() throws EncryptedDocumentException, IOException
	{
		//click on login button
		WelcomePage wp = new WelcomePage(driver);
		wp.clickOnLoginButton();
		
		//fetch the username and password from excel file
		String email = getDataFromExcelSheet(EXCEL_PATH, SHEET_NAME, 1, 0);
		String password = getDataFromExcelSheet(EXCEL_PATH, SHEET_NAME, 1, 1);
			
		//use the method present inside login page
		LoginPage lp = new LoginPage(driver);
		lp.loginIntoShopperStack(email, password);
		
	}

}
