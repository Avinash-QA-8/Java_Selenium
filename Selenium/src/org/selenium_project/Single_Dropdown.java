package org.selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"/Users/mac/eclipse-workspace/Selenium/Driver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		
		Thread.sleep(3000);
		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		
		Select s = new Select(day);
		s.selectByValue("10");
		
		
		Thread.sleep(3000);
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select s1 = new Select(month);
		s1.selectByIndex(5);
		
		
		Thread.sleep(3000);
		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select s2 = new Select(year);
		s2.selectByVisibleText("2023");
		
//		Thread.sleep(3000);
//		WebElement day1 = driver.findElement(By.xpath("//select[@name='birthday_day']"));
//		Select s3 = new Select(day);
//		s3.deselectByValue("24");
//		
//		
//		Thread.sleep(3000);
//		WebElement month1 = driver.findElement(By.xpath("//select[@name='birthday_month']"));
//		Select s4 = new Select(month);
//		s1.deselectByIndex(3);
//		
//		
//		Thread.sleep(3000);
//		WebElement year1 = driver.findElement(By.xpath("//select[@name='birthday_year']"));
//		Select s5 = new Select(year);
//		s5.deselectByValue("2024");
		
		Thread.sleep(2000);
		driver.quit();
		
		System.out.println();
		
		
		System.out.println(" Automation Program Executed successfully !!! ");
		
	}
}
