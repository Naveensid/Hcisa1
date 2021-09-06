package com.Selko.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Selko.GenericLib.BaseTest;

public class HomePage
{
	@FindBy(xpath="//a[text()='Leads']") private WebElement leadsTab;
	@FindBy(xpath="//a[text()='Accounts']") private WebElement AccountsTab;

	public  HomePage()
{
	PageFactory.initElements(BaseTest.driver,this);
}
	public void clickLeadsTab()
	{
		leadsTab.click();
	}
	public void clickAccountsTab()
	{
		AccountsTab.click();
	}
}
