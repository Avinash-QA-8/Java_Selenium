package org.selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class send_keys_concept_2 {

	public static void main (String [] args) throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver", 
				"/Users/mac/eclipse-workspace/Selenium/Driver/chromedriver");
		
	     
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://yopmail.com/");
		
		driver.findElement(By.id("login")).sendKeys("rocket8");
		Thread.sleep(3000);
		
		driver.findElement(By.className("md")).click();
		Thread.sleep(3000);
		
//		driver.close();
//		
//		driver.quit();
		
		System.out.println(" Program Exexuted successfully ");
		
	}
}
