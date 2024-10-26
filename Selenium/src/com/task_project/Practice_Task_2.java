package com.task_project;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_Task_2 {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver", 
				"/Users/mac/eclipse-workspace/Selenium/Driver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(2000);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		Thread.sleep(3000);
		WebElement e_commerce = driver.findElement(By.xpath("//img[@alt='Potato - 1 Kg']"));
		
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();",e_commerce);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File destination =  new File("/Users/mac/eclipse-workspace/Selenium/TakeScreenshot/cart.png");
		
		FileUtils.copyFile(source, destination);
		
		

		System.out.println();
		
		System.out.println(" Automation Program Executed successfully ");
		
	}

}
