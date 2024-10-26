package com.task_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Selector_Topic {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", 
				"/Users/mac/eclipse-workspace/Selenium/Driver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://adactinhotelapp.com/index.php");
		
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.cssSelector("input[type='text']"));
		username.sendKeys("stailn08");
		
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.cssSelector("input[type='password']"));
		password.sendKeys("EEYJ97");
		
		Thread.sleep(2000);
		WebElement submit = driver.findElement(By.cssSelector("input.login_button"));
		
		
		submit.click();
		
		System.out.println();
		
		System.out.println(" Automation Program Executed Successfully !!!! ");
		
		
		
	}

}
