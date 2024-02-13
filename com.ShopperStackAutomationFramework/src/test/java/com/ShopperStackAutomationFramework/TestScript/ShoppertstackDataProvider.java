package com.ShopperStackAutomationFramework.TestScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ShopperStackAutomationFramework.GenericLib.BaseTest;

import PomClass.LoginPage;
import PomClass.WelcomePage;

public class ShoppertstackDataProvider {

	@DataProvider(name = "TestData")
	public Object[][] loginTestData() {
		Object[][] testdata = new Object[3][2];

		testdata[0][0] = "aaman21123e@gmail.com";
		testdata[0][1] = "Aman@12354";

		testdata[1][0] = "aaman21123e@gmail.com";
		testdata[1][1] = "Aman@12354";

		testdata[2][0] = "aaman21123e@gmail.com";
		testdata[2][1] = "Aman@12354";

		
		return testdata;
	}

	@Test(dataProvider = "TestData")
	public void loginIntoShopperStack(String username, String password) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://shoppersstack.com");
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		driver.quit();

	}

}
