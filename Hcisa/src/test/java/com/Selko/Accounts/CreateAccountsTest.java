package com.Selko.Accounts;

import org.testng.annotations.Test;

import com.Selko.GenericLib.BaseTest;
import com.Selko.GenericLib.FileLib;
import com.Selko.GenericLib.WebDriverCommonLib;
import com.Selko.Pages.CreateLeadPage;
import com.Selko.Pages.CustomViewPage;
import com.Selko.Pages.HomePage;
import com.Selko.Pages.LoginPage;

public class CreateAccountsTest extends BaseTest
{
	@Test 
	public void Dem() throws Throwable
		 {
	
			BaseTest bt=new BaseTest();
			bt.openBrowser();
			Thread.sleep(3000);
			 LoginPage lp=new LoginPage();
			 FileLib flib =new FileLib();
			 lp.loginToApp(flib.readPropertyData(PRO_PATH, "username"), flib.readPropertyData(PRO_PATH, "password"));
			 WebDriverCommonLib wlib =new WebDriverCommonLib();
			 wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PRO_PATH, "homeTitle"), "Home Page");
			 HomePage hp=new HomePage();
			 hp.clickAccountsTab();
			 Thread.sleep(2000);
		 
			 wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PRO_PATH, "customViewTitle"), "Custom View Page");
			 
			 CustomViewPage cv= new CustomViewPage();
			 cv.clickNewAccntsBtn();
			 
			 wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PRO_PATH, "createAccountTitle"), "Create Accounts Page");
			 Thread.sleep(2000);
			 CreateAccountPage cl=new CreateAccountPage(); 
			 cl.createAccountWithMandatoryDetails(flib.readExcelData(EXCEL_PATH, "Sheet2", 1, 0));
			 wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PRO_PATH, "AccountDetailsTitle"), "Account Details page");
			 
		 
		 
		 }
}


