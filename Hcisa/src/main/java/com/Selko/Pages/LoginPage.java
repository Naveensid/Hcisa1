package com.Selko.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Selko.GenericLib.BaseTest;

public class LoginPage 
{
	@FindBy(id="userName") private WebElement untb;
	@FindBy(id="passWord") private WebElement pwtd;
	@FindBy(xpath="//input[@title='Sign In']") private WebElement signInBtn;
	public LoginPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	public WebElement getUntb()
	{
		return untb;
		
	}
	public void setUntb(WebElement untb)
	{
		this.untb=untb;
	}
	public WebElement getPwtb()
	{
		return pwtd;
		
	}
	public void setpwtd(WebElement pwtd)
	{
		this.pwtd=pwtd;
	}
	public WebElement getSignInBtn()
	{
		return signInBtn;
	}
	public void setSignInBtn(WebElement signInBtn)
	{
		this.signInBtn=signInBtn;
	}
	public void loginToApp(String un,String pwd)
	{
		untb.sendKeys(un);
		pwtd.sendKeys(pwd);
		signInBtn.click();
	}
	
}
