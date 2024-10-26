package org.selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook_task {
	
	public static void main (String [] args) throws InterruptedException
	
	{
		
		
		System.setProperty("webdriver.chrome.driver", 
				"/Users/mac/eclipse-workspace/Selenium/Driver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.get("https://www.facebook.com/");
		
//		WebElement ele1 = driver.findElement(By.xpath("//input[@type='text']"));
//		ele1.sendKeys("kodak@gmail.com");
//		
//		WebElement ele2 = driver.findElement(By.xpath("//input[@type='password']"));
//		ele2.sendKeys("Welcome@123");
		
//		WebElement ele3 = driver.findElement(By.xpath("//button[text()='Log in']"));
//		ele3.click();
		
		WebElement ele1 = driver.findElement(By.xpath("//a[text()='Create new account']"));
		ele1.click();
		
		
		
		
		
	
//		driver.close();
//		
//		driver.quit();
		
		System.out.println();
		
		System.out.println(" Automation Program Executed successfully !!!  ");
		
		
		
	}

}
