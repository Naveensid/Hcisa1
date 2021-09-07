package com.Selko.GenericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements IAutoConsts
	

{
		public static WebDriver driver;
		public void openBrowser() throws Throwable 
		{
			FileLib flib=new FileLib();
			String browserName=flib.readPropertyData(PRO_PATH, "browser"); 
			if(browserName.equalsIgnoreCase("chrome"))
			{
				System.setProperty(CHROME_KEY, CHROME_VALUE);
				driver=new ChromeDriver();
			}
			else if(browserName.equalsIgnoreCase("firefox"))
			{
				System.setProperty(GECKO_KEY, GECKO_VALUE);
				driver=new FirefoxDriver();
			}
			else
			{
				System.out.println("Enter proper Browser Name");
			}
			driver.manage().window().maximize();
			
			String testUrl=flib.readPropertyData(PRO_PATH, "url");
			driver.get(testUrl);
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			WebDriverCommonLib wlib=new WebDriverCommonLib();
			wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PRO_PATH, "loginTitle"), "Login Page");
		}
		public void closeBrowser()
		{
			driver.quit();
		}
	}

