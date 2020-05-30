package com.netbanking.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.netbanking.Pageobjects.AddCustomerPage;
import com.netbanking.Pageobjects.LoginPage;
import com.netbanking.testBase.BaseClass;

public class TC_AddCustomer_003 extends BaseClass
{
	@Test	
	public void addCustomerTest() throws IOException, InterruptedException
	{
			
			logger.info("*************Starting Tc_LoginTest_001*********************");
			driver.get(configPropobj.getProperty("baseURL"));
			LoginPage lp=new LoginPage(driver);
			
			logger.info("*************Providing login details*********************");
			lp.setUserName(configPropobj.getProperty("username"));
			lp.setPassword(configPropobj.getProperty("password"));
			lp.clickLogin(); 
			logger.info("***************   TC_AddCustomerTest_003 statred  *********** ");
			
			 AddCustomerPage addcust=new AddCustomerPage(driver);
			 
			 
			 addcust.clickAddNewCustomer();
			 
			 logger.info("***************  Providing customer details  *********** ");
			 addcust.custName("sravana");
			 addcust.setGender("Female");
			 addcust.custdob("02", "12", "1987");
			 addcust.custaddress("INDIA");
			 addcust.custcity("DMM");
			 addcust.custstate("AndhraPradesh");
			 addcust.custpin("55983882");
			 addcust.custtelephone("9826373636");
			 String email=randomestring()+"@gmail.com";
			 addcust.custemail(email);
			 addcust.custpassword("msknxzm");
			 addcust.custbutton();
			 Thread.sleep(3000);
			 
			 boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
			 
			 if(res==true)
			 {
				 logger.info("***************  Customer added succesfully *********** ");
				 Assert.assertTrue(true);
			 }
			 else
			 {
				 logger.error("*************** Customer Not added succesfully *********** ");
				 captureScreen(driver,"addNewCustomer");
				 Assert.assertTrue(false);
			 }
			 logger.info("***************   TC_AddCustomerTest_003 Finished  *********** ");
			 
			 
			 
			 
			 
			 
			 
			 
		 }

			
	}
	


