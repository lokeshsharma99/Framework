package com.facebook.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageNew {
	
	WebDriver driver;
	
	public LoginPageNew(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	@FindBy(id="email") 
	WebElement username;

	@FindBy(how=How.XPATH,using="//*[@id='pass']") 
	WebElement passwd;
	
	@FindBy(how=How.XPATH,using="//*[@id='u_0_r']") 
	WebElement login;
	
	public void LoginToFB()
	{
		username.sendKeys("Lokesh");	
		passwd.sendKeys("kirti");
		login.click();
	}
	
}
