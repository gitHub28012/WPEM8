package com.ShopperStackAutomationFramework.TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.ShopperStackAutomationFramework.GenericLib.BaseTest;

import PomClass.HomePage;

public class AddToCart extends BaseTest {

	@Test(groups = "Smoke")
	public void addToCart() throws EncryptedDocumentException, IOException, InterruptedException {
		
		HomePage hp = new HomePage(driver);
		hp.addProductIntocart();
		
		hp.logoutFromShopperstack();
		

	}
	
	
	

}
