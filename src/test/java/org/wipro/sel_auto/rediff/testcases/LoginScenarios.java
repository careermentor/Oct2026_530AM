package org.wipro.sel_auto.rediff.testcases;

import org.testng.annotations.Test;
import org.wipro.sel_auto.rediff.baselayer.InitiateBrowser;
import org.wipro.sel_auto.rediff.pages.LoginPage;
import org.wipro.sel_auto.rediff.pages.LoginPage_PF;

public class LoginScenarios extends InitiateBrowser
{

	@Test
	public void tc01_validate_login_functionality_valid_credentials() throws Exception
	{
		LoginPage_PF login = new LoginPage_PF(driver); //calling the constructor
		
		login.enter_username_textfield("testuser");
		login.enter_password_textfield("pass123");
		login.click_rememeberme_checkbox();
		login.click_login_button();
		
		//java.lang.NullPointerException: 
		//Cannot invoke "org.openqa.selenium.WebDriver.findElement(org.openqa.selenium.By)" because "this.driver" is null
		
	}
	
	//@Test(dataProvider="login",dataProviderClass=TestData.class)
	public void tc02_validate_login_functionality_valid_credentials(String uname, String upass) throws Exception
	{
		LoginPage login = new LoginPage(driver); //calling the constructor
		
		login.enter_username_textfield(uname);
		login.enter_password_textfield(upass);
		login.click_rememeberme_checkbox();
		login.click_login_button();
		
		//java.lang.NullPointerException: 
		//Cannot invoke "org.openqa.selenium.WebDriver.findElement(org.openqa.selenium.By)" because "this.driver" is null
		
	}
	
	
	
	
}
