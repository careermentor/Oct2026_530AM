package org.xyz.automation.saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class HandlingBrowser 
{

	@Test
	public void handleInprivateWindow() throws Exception
	{
		/*
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("incognito");
		
		WebDriver driver = new ChromeDriver(ops); //launch the chrome browser
		*/
		
		//EdgeOptions ops = new EdgeOptions();
		//ops.addArguments("inprivate");
		
		WebDriver driver = new EdgeDriver(); //launch the edge browser
		
		driver.manage().window().maximize();
		
		//driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
		
		Thread.sleep(5000); //pause this automation for 5 secs
		
		driver.findElement(By.xpath("//a[text()='Get a new Rediffmail ID']")).click();
		
		Thread.sleep(5000); //pause this automation for 5 secs
		
		driver.navigate().back(); //login page
		
		Thread.sleep(5000); //pause this automation for 5 secs
		
		driver.navigate().forward();  //register page
		
		Thread.sleep(5000); //pause this automation for 5 secs
		
		driver.navigate().refresh();  //reload the page
		
		
		
		
		
		//compatible testing
		//Selenium Grid
		
	}
	
	
	
}
