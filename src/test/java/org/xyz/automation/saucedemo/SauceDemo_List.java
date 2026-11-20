package org.xyz.automation.saucedemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SauceDemo_List 
{

	WebDriver driver;
	
	@Test(enabled=true)
	public void weblement_list() throws Exception
	{
		 // Step 1: Launch Chrome browser
        WebDriver driver = new EdgeDriver();

        // Step 2: Open application URL
        driver.get("https://www.saucedemo.com/");
        
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(600));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        
        //we are in login page
        
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/");

        // Step 3: Maximize browser
        

        // Step 4: Enter Username
        driver.findElement(By.id("user-name"))
              .sendKeys("standard_user");

        // Step 5: Enter Password
        driver.findElement(By.id("password"))
              .sendKeys("secret_sauce");

        
        //find location coordinate for login button
        
        System.out.println(driver.findElement(By.id("login-button")).getLocation());
        
        System.out.println(driver.findElement(By.id("login-button")).isDisplayed());
        
        //System.out.println(driver.getPageSource());
        
        // Step 6: Click Login button
        
        
        driver.findElement(By.id("login-button"))  //if element do not found, no such element exception
              .click();

        // Step 7: Print page title
        System.out.println("Page Title: " + driver.getTitle());
        
        List<WebElement> prod_list = driver.findElements(By.cssSelector("[class='inventory_item_name ']"));
      //if element do not found, no error/exceptiomn will come because this list is empty
       // [e1, e2, e3....e1]  //it accept duplicates, 
      
        System.out.println(prod_list.size()); //0
        
       prod_list.get(1).click();
       //java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 0

        // Step 8: Close browser
       // driver.quit();
		
	}
	
	
}
