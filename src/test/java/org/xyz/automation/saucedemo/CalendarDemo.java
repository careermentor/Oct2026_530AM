package org.xyz.automation.saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalendarDemo 
{

	@Test(enabled=false)
	public void calendar_text() throws Exception
	{
		
		WebDriver driver = new EdgeDriver(); //launch the edge browser
		
		driver.manage().window().maximize();
		
		driver.get("https://practice-automation.com/calendars/");
		
		
		driver.findElement(By.xpath("//input[contains(@name,'selectorenteradate')]")).sendKeys("2005-05-08");
		driver.findElement(By.xpath("//button[contains(@aria-label,'Sun May 08 2005')]")).click();
		
		
	}
	
	

	@Test
	public void calendar_icon() throws Exception
	{
		
		WebDriver driver = new EdgeDriver(); //launch the edge browser
		
		driver.manage().window().maximize();
		
		driver.get("https://www.agoda.com/");
		
		System.out.println(driver.getTitle());
		
		Assert.assertEquals(driver.getTitle(), "Agoda Official Site | Free Cancellation & Booking Deals | Over 2 Million Hotels");
		
		driver.findElement(By.cssSelector("[data-selenium='checkInText']")).click();
		
		driver.findElement(By.cssSelector("[data-selenium-date='2026-12-02']")).click();
		
		driver.findElement(By.cssSelector("[data-selenium-date='2026-12-04']")).click();
		
	}
	
	
}
