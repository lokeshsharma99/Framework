package com.facebook.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.facebook.Pages.LoginPageNew;
import com.facebook.Pages.LoginPage;
import helper.BrowserFactory;

public class VerifyValidLogin {
	static ExtentHtmlReporter htmlreporter=new ExtentHtmlReporter("C:\\Report.html");;
	static ExtentReports report=new ExtentReports();;
	static ExtentTest logger;
	static WebDriver driver;
	//WenbDrvier driver=
	
	
@BeforeTest

public void setup()
{
	
	BrowserFactory.startBrowser("chrome", "https://www.facebook.com");
	report.attachReporter(htmlreporter);
	
//	logger.log(Status.INFO,"Browser started");
	
}


@Test

	public void checkValidUser() throws Exception
	{		
	logger=report.createTest("TC ID:01","LOGIN FB with Valid Credentials");
	try{	
		LoginPageNew login_page=PageFactory.initElements(driver, LoginPageNew.class);
		
		LoginPage.LoginToFB("215454854", "54r343r4");
	//	logger.log(Status.PASS,"Login Successful");
		
	}catch(Exception e){
		//logger.log(Status.FAIL,"Login Failed");
		e.printStackTrace();
		//driver.quit();
		}		
	}


@Test

public void checkValidUser3() throws Exception
{		
logger=report.createTest("TC ID:02","LOGIN FB with Valid Credentials");
try{	
	LoginPageNew login_page=PageFactory.initElements(driver, LoginPageNew.class);
	
	LoginPage.LoginToFB("215454854", "54r343r4");
//	logger.log(Status.PASS,"Login Successful");
	
}catch(Exception e){
	//logger.log(Status.FAIL,"Login Failed");
	e.printStackTrace();
	//driver.quit();
	}		
}


@Test

public void checkValidUser1() throws Exception
{		
logger=report.createTest("TC ID:03","LOGIN FB with Valid Credentials");
try{	
	LoginPageNew login_page=PageFactory.initElements(driver, LoginPageNew.class);
	
	LoginPage.LoginToFB("215454854", "54r343r4");
//	logger.log(Status.PASS,"Login Successful");
	
}catch(Exception e){
	//logger.log(Status.FAIL,"Login Failed");
	e.printStackTrace();
	//driver.quit();
	}		
}


@Test

public void checkValidUser2() throws Exception
{		
logger=report.createTest("TC ID:04","LOGIN FB with Valid Credentials");
try{	
	LoginPageNew login_page=PageFactory.initElements(driver, LoginPageNew.class);
	
	LoginPage.LoginToFB("215454854", "54r343r4");
//	logger.log(Status.PASS,"Login Successful");
	
}catch(Exception e){
	//logger.log(Status.FAIL,"Login Failed");
	e.printStackTrace();
	//driver.quit();
	}		
}

@AfterMethod

public void checking(ITestResult result) throws Exception
{
	String screenshot_path=utility.captureScreenShot(driver,result.getName());	
	ExtentTest image=logger.addScreenCaptureFromPath(screenshot_path);
	//logger.log(Status.FAIL,image);
	
	
if(result.getStatus()==ITestResult.FAILURE)	{
utility.captureScreenShot(driver,result.getName());
logger.fail("Testcase Failed");	
}else if(result.getStatus()==ITestResult.SKIP){
	utility.captureScreenShot(driver,result.getName());
	logger.skip("Testcase Skipped");
	
}else{
	utility.captureScreenShot(driver,result.getName());
	logger.skip("Testcase Passesd");
}
}

	
@AfterSuite

public void close()
{
	
	report.flush();
	driver.quit();	
}
}
