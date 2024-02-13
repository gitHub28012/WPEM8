package com.ShopperStackAutomationFramework.TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ShopperStackAutomationFramework.GenericLib.BaseTest;
import com.ShopperStackAutomationFramework.GenericLib.CustomListener;
import com.ShopperStackAutomationFramework.GenericLib.FLib;

import PomClass.LoginPage;
import PomClass.WelcomePage;

@Listeners(CustomListener.class)
public class ValidLoginIntoShopperstack extends BaseTest {

	@Test(groups = "Smoke")
	public void login() throws EncryptedDocumentException, IOException {
		// click on login button
		WelcomePage wp = new WelcomePage(driver);
		wp.clickOnLoginButton();

		// fetch the username and password from excel file
		String email = getDataFromExcelSheet(EXCEL_PATH, SHEET_NAME, 1, 0);
		String password = getDataFromExcelSheet(EXCEL_PATH, SHEET_NAME, 1, 1);

		// use the method present inside login page
		LoginPage lp = new LoginPage(driver);
		lp.loginIntoShopperStack(email, password);

	}

	@Test(enabled = false,groups = "Smoke")
	public void invalidLogin() throws EncryptedDocumentException, IOException {

		WelcomePage wp = new WelcomePage(driver);
		wp.clickOnLoginButton();

		FLib lib = new FLib();

		int rc = lib.getRowCount(EXCEL_PATH, INVALIDSHEETNAME);

		for (int i = 1; i <= rc; i++) {
			LoginPage lp = new LoginPage(driver);

			lp.invalidLoginIntoShopperstack(lib.getDataFromExcelSheet(EXCEL_PATH, INVALIDSHEETNAME, i, 0),
					lib.getDataFromExcelSheet(EXCEL_PATH, INVALIDSHEETNAME, i, 0));
		}

	}

}
