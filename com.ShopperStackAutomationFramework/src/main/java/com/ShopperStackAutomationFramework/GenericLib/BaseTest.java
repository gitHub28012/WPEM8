package com.ShopperStackAutomationFramework.GenericLib;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.google.common.io.Files;

public class BaseTest extends FLib implements IAutoConstant {

	public static WebDriver sdriver;
	public WebDriver driver;
	

	@BeforeMethod
	public void setup() throws IOException {
		FLib lib = new FLib();
		String browser = lib.getDataFromPropertyFile(PROP_PATH, "Browser");
		System.out.println(browser);
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equals("Edge")) {
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		} else {
			System.out.println("Invalid browser");
		}		// launch the browser
		String url = lib.getDataFromPropertyFile(PROP_PATH, "Url");
		driver.get(url);
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TimeDuration));
		sdriver= driver;

	}
	
	public void toTakeScreenshot(String methodName)
	{
		TakesScreenshot ts = (TakesScreenshot) BaseTest.sdriver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/"+methodName+".Png");
		try {
			Files.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
