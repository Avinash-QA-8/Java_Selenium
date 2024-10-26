package com.task_project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Task_Right_Click {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"/Users/mac/eclipse-workspace/Selenium/Driver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/droppable/");
		
		
		Thread.sleep(2000);
		WebElement web_Browser = driver.findElement(By.xpath("//a[@id='droppableExample-tab-accept']"));
		web_Browser.click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView();", web_Browser);
		
		Thread.sleep(2000);
		WebElement from_Element = driver.findElement(By.xpath("//div[text()='Acceptable']"));
		
		
		Actions a = new Actions (driver);
		
		a.moveToElement(from_Element).build().perform();
		
		System.out.println();
		
		System.out.println(" Automation Program Executed !!! ");
		
		
		
		
		
		
		
		
		
	}

}
