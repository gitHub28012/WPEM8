package com.ShopperStackAutomationFramework.TestScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LearningAssertion {
	
	@Test(description = "verifying the title")
	public void verifyTitle()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://qspwakad/login.do");
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "ctiTIME - Login";
		
		//Assert.assertEquals(actualTitle, expectedTitle);
//		SoftAssert soft = new SoftAssert();
//		soft.assertEquals(actualTitle, expectedTitle);
		
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("Title is verified");
		}
//		else
//		{
//			System.out.println("Title not verified");
//		}
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
		//soft.assertAll();
		
		
	}

}
