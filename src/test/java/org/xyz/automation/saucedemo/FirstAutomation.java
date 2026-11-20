package org.xyz.automation.saucedemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstAutomation 
{
	
	WebDriver driver;
	
	@BeforeMethod
	public void launchbrowser()
	{
		
		driver= new EdgeDriver(); //launch the chrome browser
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi"); //pass the url
		
		//which page we are in/// page title or current url
		
		driver.manage().window().maximize();
		
		
	}
	
	@AfterMethod
	public void closebrowser()
	{
		//driver.quit();
		
	}
	
	
	@Test
	public void register_functionality()
	{
		
		
		driver.findElement(By.xpath("//a[text()='Get a new Rediffmail ID']")).click();
		
		System.out.println(driver.findElement(By.xpath("//label[text()='Full Name']")).getText()); //print
		
		Assert.assertEquals(driver.findElement(By.xpath("//label[text()='Full Name']")).getText(), "Full Name");
		
		System.out.println(driver.findElement(By.cssSelector("[placeholder='Enter your full name']")).getAttribute("placeholder")); //print
		
		Assert.assertEquals(driver.findElement(By.cssSelector("[placeholder='Enter your full name']")).getAttribute("placeholder"), "Enter your full name");
		
		
		driver.findElement(By.cssSelector("[placeholder='Enter your full name']")).sendKeys("John Lee");
		
		Select dob_month = new Select(driver.findElement(By.xpath("//select[contains(@name,'DOB_Month')]"))); 
		
		dob_month.selectByIndex(4); //APR
		
		dob_month.selectByValue("06"); //JUN
		
		dob_month.selectByVisibleText("OCT");  ///final select
		
		//these below two lines of code will be used only and only in case of List
		//dob_month.deselectByValue("06");
		
		//dob_month.deselectAll();
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		
		driver.findElement(By.cssSelector("[type='checkbox']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		
		wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//select[contains(@name,'hintq')]")), "What is the name of your first school?"));
		
		Select hintquestion = new Select(driver.findElement(By.xpath("//select[contains(@name,'hintq')]")));
		hintquestion.selectByVisibleText("What is your favourite food?");
		
		
		
		
		
	}

	@Test(enabled=false)
	public void login_functionality()
	{
	
		
		WebElement username = driver.findElement(By.id("login1"));
		username.sendKeys("testuser");
		
		username.clear();
		
		username.sendKeys("modisantosh");
		
		driver.findElement(By.name("passwd")).sendKeys("pass2345");
		
		//login button is clickable or not
		
		System.out.println(driver.findElement(By.cssSelector("[type='checkbox']")).isEnabled());
		
		Assert.assertEquals(driver.findElement(By.cssSelector("[type='checkbox']")).isEnabled(), true);
		
		//is checkbox is selected
		
		System.out.println(driver.findElement(By.cssSelector("[type='checkbox']")).isSelected()); //true
		
		driver.findElement(By.cssSelector("[type='checkbox']")).click();
		
		Assert.assertEquals(driver.findElement(By.cssSelector("[type='checkbox']")).isSelected(), false);
		
		System.out.println(driver.findElement(By.cssSelector("[type='checkbox']")).isSelected()); //false
		
		//driver.findElement(By.xpath("//button[text()='Log In']")).click();
		
		//driver.close(); //will only close the open tab/window
		//driver.quit();  //will close all the tab/winodw open
	}
	
}
