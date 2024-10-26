package com.task_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Task {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", 
				"/Users/mac/eclipse-workspace/Selenium/Driver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.get("https://demoqa.com/droppable/");
		
		Thread.sleep(2000);
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		Thread.sleep(2000);
		WebElement drop = driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));
		
		Actions a = new Actions(driver);
		
		a.dragAndDrop(drag, drop).build().perform();
		

		System.out.println(" Autoation Program executed successfully !!!! ");
		
		
		
		
	}
}
