package com.netbanking.testcases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.netbanking.Pageobjects.LoginPage;
import com.netbanking.testBase.BaseClass;
import com.netbanking.utilities.XLUtils;

public class TC_LoginDDT_002 extends BaseClass
{
	
	@Test(dataProvider="LoginData")
	public void logintest(String user,String pwd) throws InterruptedException, IOException
	{
		logger.info("**************** Starting TC_LoginDDT_002 ************* ");
		LoginPage lp=new LoginPage(driver);		
		driver.get(configPropobj.getProperty("baseURL"));
		
		logger.info("**************** Proving login details ************* ");
		
		lp.setUserName(user);
		lp.setPassword(pwd);
		lp.clickLogin();
		Thread.sleep(5000);
		
		if(isAlertPresent()==true)
		{
			captureScreen(driver,"logintest");
			logger.warn("**************** loginTest is Failed************* ");
			driver.switchTo().alert();
			driver.switchTo().defaultContent();			
			Assert.assertTrue(false);
		}
		else
		{			
			Assert.assertTrue(true);
			logger.warn("**************** loginTest is Passed************* ");			
			lp.clicklogout();
			Thread.sleep(3000);
			driver.switchTo().alert().accept();//close logout alert
			driver.switchTo().defaultContent();
		}		
	}
	
	public boolean isAlertPresent() {
		try
		{
			driver.switchTo().alert();
			return true;
		}
		catch(NoAlertPresentException e)
		{
			return false;
		}
	}
	
	@DataProvider(name="LoginData")
	public String [][] getData() throws IOException
	{
		String path=System.getProperty("user.dir")+"//src//test//java//com//netbanking//testdata//Logindata.xlsx";
		int rownum=XLUtils.getRowCount(path, "sheet1");
		int colcount=XLUtils.getCellCount(path, "sheet1",1);
		
		String logindata[][]=new String[rownum][colcount];
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				logindata[i-1][j]=XLUtils.getCellData(path,"sheet1", i,j);
				
			}
		}
		return logindata;
		
}

}
