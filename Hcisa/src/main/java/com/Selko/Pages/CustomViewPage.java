package com.Selko.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Selko.GenericLib.BaseTest;

public class CustomViewPage
{
	@FindBy(xpath="//input[@value='New Lead']") private WebElement newLeadBtn;
	@FindBy(xpath="//input[@value='New Account']") private WebElement newAccountBtn;
	public CustomViewPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	public void  clickNewLeadBtn()
	{
		newLeadBtn.click();
	}
	public void  clickNewAccntsBtn()
	{
		newAccountBtn.click();
	}
}
