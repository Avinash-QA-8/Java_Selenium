package com.task_project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Practice {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver",
				"/Users/mac/eclipse-workspace/Selenium/Driver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://adactinhotelapp.com/index.php");
		
		
		// Login Page  
		
	
		Thread.sleep(2000);
		WebElement user_name = driver.findElement(By.xpath("//input[@name='username']"));
		user_name.sendKeys("stailn08");
		
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("EEYJ97");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='login']")).click();
		
		// Search Hotel 
		
		Thread.sleep(2000);
		WebElement location = driver.findElement(By.xpath("(//select[@class='search_combobox'])[1]"));
		
		Select s = new Select (location);
		
		s.selectByIndex(3);
		
		System.out.println();
		
		boolean multi_Select = s.isMultiple();
		System.out.println(multi_Select);
		
		List<WebElement> all_Options = s.getOptions();
		

		for (WebElement all : all_Options)
			
		{
			System.out.println(all.getText());
		}
		
		System.out.println();
		
		System.out.println(" Automation Program Executed Successfully !!! ");
		
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
		
		
	}

}
