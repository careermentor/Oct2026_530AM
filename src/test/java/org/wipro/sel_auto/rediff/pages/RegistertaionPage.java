package org.wipro.sel_auto.rediff.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.wipro.sel_auto.rediff.utilitieslayer.ConfigDataProperteis;

public class RegistertaionPage 
{
	WebDriver driver;

	public RegistertaionPage(WebDriver driver) 
	{
		this.driver=driver;
		
		
	}
	
	
	public void click_getnewrediffmail_link() throws Exception
	{
		WebElement getnewrediffmail_link= driver.findElement(By.xpath(ConfigDataProperteis.readelementdata("login_createnewemail_xpath")));
		getnewrediffmail_link.click();
	}


	public void enter_fullname_textfield(String fname) throws Exception
	{
		
		WebElement fullname_textfield= driver.findElement(By.cssSelector(ConfigDataProperteis.readelementdata("register_fullname_css")));
		fullname_textfield.sendKeys(fname);
	}
	
	
}
