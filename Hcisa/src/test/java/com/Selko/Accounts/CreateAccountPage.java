package com.Selko.Accounts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Selko.GenericLib.BaseTest;

public class CreateAccountPage
{
	@FindBy(xpath="//input[@name='property(Account Name)']")private WebElement AccntsName;
	@FindBy(xpath="(//input[@value='Save'])[1]")private WebElement SaveBtn;
//	@FindBy(xpath="")
	public CreateAccountPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	public void createAccountWithMandatoryDetails(String accountsName) throws Throwable
	{
		AccntsName.sendKeys(accountsName);
	SaveBtn.click();
	}
}
