package org.wipro.sel_auto.rediff.testcases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.wipro.sel_auto.rediff.baselayer.InitiateBrowser;
import org.wipro.sel_auto.rediff.pages.RegistertaionPage;

public class SearchProductScenario extends InitiateBrowser
{

	@Test
	public void tc03_validate_login_register_correct_data() throws Exception
	{
		RegistertaionPage reg = new RegistertaionPage(driver); //calling the constructor
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		
		reg.click_getnewrediffmail_link();
		reg.enter_fullname_textfield("John Seo");
		
	}
		
	
}
