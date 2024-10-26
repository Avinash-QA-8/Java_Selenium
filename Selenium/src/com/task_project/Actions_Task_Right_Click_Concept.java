package com.task_project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actions_Task_Right_Click_Concept {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", 
				"/Users/mac/eclipse-workspace/Selenium/Driver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26useRedirectOnSuccess%3D1%26signIn%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.xpath("//input[@id='ap_email']"));
		username.sendKeys("avinash8ch@gmail.com");
		
		Thread.sleep(2000);
		WebElement continue_button = driver.findElement(By.xpath("//input[@id='continue']"));
		continue_button.click();
		
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		
		WebDriverWait w = new WebDriverWait (driver, 20);
		
		w.until(ExpectedConditions.visibilityOf(continue_button));
		
		
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.xpath("//input[@autocomplete='current-password']"));
		password.sendKeys("Avi888@@");
		
		Thread.sleep(2000);
		WebElement sign_in = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		sign_in.click();
		
		Thread.sleep(2000);
		WebElement recommeded_for_you = driver.findElement(By.xpath("(//span[@class='nav-a-content'])[3]"));
		
		Actions a = new Actions (driver);
		
		
		
//		a.doubleClick(recommeded_for_you).build().perform();
		
//		Thread.sleep(2000);
//		WebElement Accounts_and_Signin = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
//		
//		a.moveToElement(Accounts_and_Signin).build().perform();
//		
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[text()='Sign Out']")).click();		
		
		
		a.contextClick(recommeded_for_you).perform();
		Thread.sleep(2000);
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);	
		
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		
		String windowHandle = driver.getWindowHandle();
		
		String title = driver.getTitle();
		System.out.println(title);
	
		System.out.println();
		
		System.out.println(" Automation Program Executed Successfully !!! ");
		
		// driver.quit();
		
		
		
	}

}
