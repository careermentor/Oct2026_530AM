package org.wipro.sel_auto.rediff.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.wipro.sel_auto.rediff.utilitieslayer.ConfigDataProperteis;

public class LoginPage 
{
	WebDriver driver;

	public LoginPage(WebDriver driver) 
	{
		this.driver=driver;
		
		
	}


	public void enter_username_textfield(String username) throws Exception
	{
		
		WebElement username_textfield= driver.findElement(By.id(ConfigDataProperteis.readelementdata("login_username_id")));
		username_textfield.sendKeys(username);
	}
	
	
	public void enter_password_textfield(String password) throws Exception
	{
		WebElement password_textfield= driver.findElement(By.name(ConfigDataProperteis.readelementdata("login_password_name")));
		password_textfield.sendKeys(password);
	}
	
	public void click_rememeberme_checkbox() throws Exception
	{
		WebElement rememeberme_checkbox= driver.findElement(By.cssSelector(ConfigDataProperteis.readelementdata("login_rememberme_checkbox_css")));
		rememeberme_checkbox.click();
	}
	
	public void click_login_button() throws Exception
	{
		WebElement login_button= driver.findElement(By.xpath(ConfigDataProperteis.readelementdata("login_loginbttn_xpath")));
		login_button.click();
	}
	
}
