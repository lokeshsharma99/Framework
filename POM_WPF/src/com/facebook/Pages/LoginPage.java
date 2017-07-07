package com.facebook.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/* Locators of Login Pages */
public class LoginPage {

	static WebDriver driver;
	
	static By username=By.xpath("//*[@id='email']");
	static By passwd=By.xpath("//*[@id='pass']");
	static By login=By.xpath("//*[@id='u_0_r']");
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	
	public static void LoginToFB(String uname,String pass)
	{
		driver.findElement(username).sendKeys(uname);	
		driver.findElement(passwd).sendKeys(pass);
		driver.findElement(login).click();
	}
	
	
}
