package com.ShopperStackAutomationFramework.TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.ShopperStackAutomationFramework.GenericLib.BaseTest;

import PomClass.HomePage;

public class AddToCart extends BaseTest {

	@Test
	public void addToCart() throws EncryptedDocumentException, IOException {
		ValidLoginIntoShopperstack valid = new ValidLoginIntoShopperstack();
		valid.login();
		
		HomePage hp = new HomePage(driver);
		hp.addProductIntocart();
		
		hp.logoutFromShopperstack();
		

	}
	
	
	

}
