package com.netbanking.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.netbanking.Pageobjects.LoginPage;
import com.netbanking.testBase.BaseClass;

public class TC_LoginTest_001 extends BaseClass{

	@Test
	public void logintest() throws IOException
	{
		
		logger.info("*************Starting Tc_LoginTest_001*********************");
		driver.get(configPropobj.getProperty("baseURL"));
		LoginPage lp=new LoginPage(driver);
		
		logger.info("*************Providing login details*********************");
		lp.setUserName(configPropobj.getProperty("username"));
		lp.setPassword(configPropobj.getProperty("password"));
		lp.clickLogin(); 
		
		String exp_title="Guru99 Bank Manager HomePage";
		String act_title=driver.getTitle();
		
		if(exp_title.equals(act_title))
		{
			logger.info("*************loginTest is passed*********************");
			Assert.assertTrue(true);
		}
		else
		{
			logger.info("*************login test failed*********************");
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
		} 		
		logger.info("************Finished Tc_LoginTest_001*********************");
		
	}
}
