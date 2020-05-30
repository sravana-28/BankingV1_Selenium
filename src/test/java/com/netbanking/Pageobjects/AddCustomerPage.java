package com.netbanking.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	
	public WebDriver ldriver;
	
	public AddCustomerPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
		
	}
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div/ul/li[2]/a")
	@CacheLookup
	WebElement lnkAddNewCustomer ;
	
	@FindBy(how = How.XPATH, using =  "//input[@name='name']")
	@CacheLookup
	WebElement txtCustomerName;
	
	@FindBy(how = How.NAME, using =  "rad1")
	@CacheLookup
	WebElement rdMale;
	
	@FindBy(how = How.XPATH, using =  "//tr[5]//td[2]//input[2]")
	@CacheLookup
	WebElement rdFemale;
	
	@FindBy(how = How.ID, using =  "dob")
	@CacheLookup
	WebElement txtdob;
	
	@FindBy(how = How.NAME, using =  "addr")
	@CacheLookup
	WebElement txtaddress;
	
	@FindBy(how = How.NAME, using =  "city")
	@CacheLookup
	WebElement txtcity;
	
	@FindBy(how = How.NAME, using =  "state")
	@CacheLookup
	WebElement txtstate;
	
	@FindBy(how = How.NAME, using =  "pinno")
	@CacheLookup
	WebElement txtpin;
	
	@FindBy(how = How.NAME, using =  "telephoneno")
	@CacheLookup
	WebElement txtmobile;
	
	@FindBy(how = How.NAME, using =  "emailid")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(how = How.NAME, using =  "password")
	@CacheLookup
	WebElement txtPassword;	

	@FindBy(how = How.NAME, using =  "sub")
	@CacheLookup
	WebElement btnsubmit;
	
	public void clickAddNewCustomer()
	{
		lnkAddNewCustomer.click();
	}
	
	public void custName(String cname)
	{
		txtCustomerName.sendKeys(cname);
	}
	
	public void setGender(String gender)
	{
		if(gender.equals("Male"))
		{
			rdMale.click();
		}
		else if(gender.equals("Female"))
		{
			 rdFemale.click();
		}
		else
		{
			 rdMale.click();//Default
		}
	}
	public void custdob(String mm,String dd,String yy)
	{
		txtdob.sendKeys(mm);
		txtdob.sendKeys(dd);
		txtdob.sendKeys(yy);
	}
	
	public void custaddress(String caddress)
	{
		txtaddress.sendKeys(caddress);
	}
	public void custcity(String ccity)
	{
		txtcity.sendKeys(ccity);
	}
	public void custstate(String cstate)
	{
		txtstate.sendKeys(cstate);
	}
	public void custpin(String cpin)
	{
		txtpin.sendKeys(cpin);
	}
	public void custtelephone(String ctelephone)
	{
		txtmobile.sendKeys(ctelephone);
	}
	public void custemail(String cemail)
	{
		txtEmail.sendKeys(cemail);
	}
	public void custpassword(String cpassword)
	{
		txtPassword.sendKeys(cpassword);
	}
	public void custbutton()
	{
		btnsubmit.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
