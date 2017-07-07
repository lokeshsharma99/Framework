package com.facebook.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import com.facebook.Pages.LoginPage;

public class VerifyFBLogin {

	@Test
	public void verifyvalidLogin() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Hybrid Keyword Driven\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com");
		LoginPage login=new LoginPage(driver);
		login.LoginToFB("Lokesh","Sharma");
		utility.captureScreenShot(driver, "TC");
	
	}
	
}
