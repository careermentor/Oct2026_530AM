package org.wipro.sel_auto.rediff.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage_PF 
{
	WebDriver driver;

	public LoginPage_PF(WebDriver driver) 
	{
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="login1")
	WebElement username_textfield;


	@FindBy(name="passwd")
	WebElement password_textfield;

	
	@FindBy(css="[type='checkbox']")
	WebElement rememeberme_checkbox;
	
	@FindBy(xpath="//button[text()='Log In']")
	WebElement login_button;
	
	public void enter_username_textfield(String username) throws Exception
	{
		
		//WebElement username_textfield= driver.findElement(By.id("login1"));
		username_textfield.sendKeys(username);
	}
	
	
	public void enter_password_textfield(String password) throws Exception
	{
		//WebElement password_textfield= driver.findElement(By.name(ConfigDataProperteis.readelementdata("login_password_name")));
		password_textfield.sendKeys(password);
	}
	
	public void click_rememeberme_checkbox() throws Exception
	{
		//WebElement rememeberme_checkbox= driver.findElement(By.cssSelector(ConfigDataProperteis.readelementdata("login_rememberme_checkbox_css")));
		rememeberme_checkbox.click();
	}
	
	public void click_login_button() throws Exception
	{
		//WebElement login_button= driver.findElement(By.xpath(ConfigDataProperteis.readelementdata("login_loginbttn_xpath")));
		login_button.click();
	}
	
}
