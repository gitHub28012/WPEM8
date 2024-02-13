package com.ShopperStackAutomationFramework.TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.ShopperStackAutomationFramework.GenericLib.BaseTest;
import com.ShopperStackAutomationFramework.GenericLib.FLib;

import PomClass.LoginPage;
import PomClass.WelcomePage;

public class InValidLoginIntoShopperstack extends BaseTest {

	@Test(groups = "Functional")
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
