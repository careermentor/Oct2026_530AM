package org.xyz.automation.saucedemo;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeybboardMouseWindows {

	WebDriver driver;

	@Test
	public void handleFrames() throws Exception {
		ChromeOptions crops = new ChromeOptions();
		crops.addArguments("incognito");

		driver = new ChromeDriver(crops); // launch the chrome browser

		driver.get("https://demoqa.com/frames");

		driver.manage().window().maximize();

		System.out.println(driver.findElement(By.xpath("//h1[text()='Frames']")).getText());

		driver.switchTo().frame("frame1");

		System.out.println(driver.findElement(By.xpath("//h1[text()='This is a sample page']")).getText());

		driver.switchTo().defaultContent();

		System.out.println(driver.findElement(By.xpath("//h1[text()='Frames']")).getText());

		CaptureScreenshot.testresults(driver, "handleFrames");

	}

	@Test(enabled = true)
	public void handleAlert() throws Exception {
		ChromeOptions crops = new ChromeOptions();
		crops.addArguments("incognito");

		driver = new ChromeDriver(crops); // launch the chrome browser

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.manage().window().maximize();

		driver.findElement(By.name("proceed")).click();

		driver.switchTo().alert().accept();

		CaptureScreenshot.testresults(driver, "handleAlert");

	}

	@Test(enabled = false)
	public void handleMouse() throws Exception {
		ChromeOptions crops = new ChromeOptions();
		crops.addArguments("incognito");

		driver = new ChromeDriver(crops); // launch the chrome browser

		// driver.get("https://www.mphasis.com/home.html");

		driver.get("https://www.rediff.com/"); // pass the url

		// which page we are in/// page title or current url

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Actions act = new Actions(driver, Duration.ofSeconds(10));

		// act.dragAndDrop(null, null).perform();

		// act.scrollToElement(driver.findElement(By.xpath("//a[text()='Privacy
		// Policy']"))).perform();

		act.moveToElement(driver.findElement(By.xpath("//button[text()='Payments']"))).perform();

		act.click(driver.findElement(By.xpath("//a[text()='Mobile Recharge']"))).perform();

		Set<String> windowsid = driver.getWindowHandles();
		// [w1, w2,w3...]...no duplicates, no sequence

		System.out.println(windowsid);

		Iterator<String> itr = windowsid.iterator();

		String win1 = itr.next();
		String win2 = itr.next();

		driver.switchTo().window(win2);

		driver.findElement(By.cssSelector("[type='tel']")).sendKeys("7799601919");

		Thread.sleep(5000);

		driver.switchTo().window(win1);

	}

	@Test(enabled = false)
	public void handleKeyboard() {

		driver = new EdgeDriver(); // launch the chrome browser

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi"); // pass the url

		// which page we are in/// page title or current url

		driver.manage().window().maximize();

		Actions act = new Actions(driver);

		act.sendKeys("testuser").perform();

		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();

		act.sendKeys("careermentor").perform();

		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("pass3455").perform();

		// act.sendKeys(Keys.ENTER).perform();

	}
}
