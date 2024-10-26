package com.task_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Pratice_FireFox {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver", 
				"/Users/mac/eclipse-workspace/Selenium/Driver/geckodriver 2");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		
		Thread.sleep(3000);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		Thread.sleep(3000);
		WebElement search = driver.findElement(By.xpath("//input[@type='search']"));
		search.sendKeys("brocolli");
		
		Thread.sleep(3000);
		WebElement search_button = driver.findElement(By.xpath("//button[@type='submit']"));
		search_button.click();
		
		Thread.sleep(3000);
		WebElement quantity = driver.findElement(By.xpath("//input[@type='number']"));
		quantity.clear();
		quantity.sendKeys("5");
		
		Thread.sleep(3000);
		WebElement add_to_cart = driver.findElement(By.xpath("//button[text()='ADD TO CART']"));
		add_to_cart.click();
		
		Thread.sleep(3000);
		WebElement cart = driver.findElement(By.xpath("//img[@alt='Cart']"));
		cart.click();		
		
		Thread.sleep(3000);
		WebElement check_Out = driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']"));
		check_Out.click();
		
		Thread.sleep(3000);
		WebElement place_Order = driver.findElement(By.xpath("//button[text()='Place Order']"));
		place_Order.click();
		
		
		
		WebElement country = driver.findElement(By.xpath("//select[@style='width: 200px;']"));
		
		Select s = new Select(country);
		
		s.selectByValue("India");
		
		
		Thread.sleep(3000);
		WebElement check_box = driver.findElement(By.xpath("//input[@type='checkbox']"));
		check_box.click();
		
		Thread.sleep(3000);
		WebElement proceed_btn = driver.findElement(By.xpath("//button[text()='Proceed']"));
		proceed_btn.click();
		

		Thread.sleep(5000);
		driver.quit();
		
		System.out.println();
		
		System.out.println(" Automation Program Exexuted Successfully !!!!  ");
	}

}
