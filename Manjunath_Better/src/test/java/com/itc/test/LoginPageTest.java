package com.itc.test;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import com.itc.pages.HomePage;
import com.itc.pages.LoginPage;
import com.itc.util.BaseTestObject;

public class LoginPageTest extends BaseTestObject
{

	HomePage objhomepage=null;
	LoginPage objloginpage=null;
	boolean flag=false;
	
	
	@Parameters({"browserType"})
	@Test(priority=0, enabled=true,groups="regression")
	public void verifyLoginPage() throws Exception
	{
		try 
		{
			objloginpage = new LoginPage(driver);
			flag = objloginpage.isLoginPageDisplayed();
		    Assert.assertTrue(flag, "login page is not is not displayed");
		   
		    
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED CLICK ON SITELOGO AND VERFIY PAGETITLE TESTCASE" + "\n clickOnSiteLogoAndCheckThePageTitle" +e.getLocalizedMessage());
		}

		}
	
		
	}
	

