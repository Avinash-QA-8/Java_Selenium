package com.adacitin_project;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adacitin_Hotel_Management {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", 
				"/Users/mac/eclipse-workspace/Selenium/Driver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://adactinhotelapp.com/index.php");
		
		//login
		
		Thread.sleep(1000);
		WebElement username = driver.findElement(By.cssSelector("input[type='text']"));
		username.sendKeys("stailn08");
		
		Thread.sleep(1000);
		WebElement password = driver.findElement(By.cssSelector("input[type='password']"));
		password.sendKeys("EEYJ97");
		
		TakesScreenshot login_ts = (TakesScreenshot) driver;
		
		File source1 = login_ts.getScreenshotAs(OutputType.FILE);
		
		File destination1 = new File("/Users/mac/eclipse-workspace/Selenium/TakeScreenshot/login.png");
		
		FileUtils.copyFile(source1, destination1);
		
		Thread.sleep(1000);
		WebElement submit = driver.findElement(By.cssSelector("input.login_button"));
		submit.click();
		
	
		
		
		//Search Hotel
		
		Thread.sleep(1000);
		WebElement location = driver.findElement(By.xpath("//select[@id='location']"));
		Select s = new Select(location);
		s.selectByVisibleText("Sydney");
		
		Thread.sleep(1000);
		WebElement hotels = driver.findElement(By.xpath("//td/select[@id='hotels']"));
		Select h = new Select(hotels);
		h.selectByVisibleText("Hotel Creek");
	
		Thread.sleep(1000);
		WebElement Room_Type = driver.findElement(By.xpath("//td/select[@id='room_type']"));
		Select room = new Select(Room_Type);
		room.selectByVisibleText("Double");
		
		Thread.sleep(1000);
		WebElement nos_Rooms = driver.findElement(By.xpath("//td/select[@id='room_nos']"));
		Select nos_rooms_1 = new Select(nos_Rooms);
	    nos_rooms_1.selectByIndex(3);
	
		Thread.sleep(1000);
		WebElement check_In = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		check_In.clear();
		
		Thread.sleep(1000);
		WebElement date_Enter_1 = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		date_Enter_1.sendKeys("13/10/2024");
		
		Thread.sleep(1000);
		WebElement check_Out = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		check_Out.clear();
		
		Thread.sleep(1000);
		WebElement date_Enter_2 = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		date_Enter_2.sendKeys("20/10/2024");
		

		Thread.sleep(1000);
		WebElement adult_Room = driver.findElement(By.xpath("//td/select[@id='adult_room']"));
		Select adult = new Select(adult_Room);
		adult.selectByIndex(2);
		
		Thread.sleep(1000);
		WebElement child = driver.findElement(By.xpath("//td/select[@id='child_room']"));
		Select s5 = new Select(child);
		s5.selectByVisibleText("3 - Three");
		
		TakesScreenshot search_Hotel = (TakesScreenshot) driver;
		
		File source2 = search_Hotel.getScreenshotAs(OutputType.FILE);
		
		File destination2 = new File("/Users/mac/eclipse-workspace/Selenium/TakeScreenshot/Search_Hotel.png");
		
		FileUtils.copyFile(source2, destination2);
		
		
		Thread.sleep(1000);
		WebElement Submit_btn = driver.findElement(By.xpath("//input[@name='Submit']"));
		Submit_btn.click();
		
	
		
		// Select Hotel
		
		Thread.sleep(1000);
		WebElement radio_Btn = driver.findElement(By.xpath("//td/input[@id='radiobutton_0']"));
		radio_Btn.click();
		
		TakesScreenshot select_Hotel = (TakesScreenshot) driver;
		
		File source3 = search_Hotel.getScreenshotAs(OutputType.FILE);
		
		File destination3 = new File("/Users/mac/eclipse-workspace/Selenium/TakeScreenshot/Select_Hotel.png");
		
		FileUtils.copyFile(source3, destination3);
		
		Thread.sleep(1000);
		WebElement continue_Btn = driver.findElement(By.xpath("//td/input[@id='continue']"));
		continue_Btn.click();
		
		
		//Book A Hotel 
		
		Thread.sleep(1000);
		WebElement first_Name = driver.findElement(By.xpath("//td/input[@id='first_name']"));
		first_Name.sendKeys("Avinash");
		
		Thread.sleep(1000);
		WebElement last_Name = driver.findElement(By.xpath("//td/input[@id='last_name']"));
		last_Name.sendKeys("Avi08");
		
		Thread.sleep(1000);
		WebElement address = driver.findElement(By.xpath("//td/textarea[@id='address']"));
		address.sendKeys(" Sector 67, Sahibzada Ajit Singh Nagar, Punjab 160062 ");
		
		Thread.sleep(1000);
		WebElement cc_Card = driver.findElement(By.xpath("//td/input[@id='cc_num']"));
		cc_Card.sendKeys("1234567898765432");
		
		Thread.sleep(1000);
		WebElement cc_Card_Type = driver.findElement(By.xpath("//td/select[@id='cc_type']"));
		Select card_Type = new Select(cc_Card_Type);
		card_Type.selectByIndex(3);
		
		Thread.sleep(1000);
		WebElement month = driver.findElement(By.xpath("//td/select[@id='cc_exp_month']"));
		Select c_Month = new Select(month);
		c_Month.selectByVisibleText("August");
		
		Thread.sleep(1000);
		WebElement year = driver.findElement(By.xpath("//td/select[@id='cc_exp_year']"));
		Select expiry_Year = new Select(year);
		expiry_Year.selectByVisibleText("2028");
		
		Thread.sleep(1000);
		WebElement cvv_Number = driver.findElement(By.xpath("//td/input[@id='cc_cvv']"));
		cvv_Number.sendKeys("321");
		
		TakesScreenshot Book_A_Table = (TakesScreenshot) driver;
		
		File source4 = search_Hotel.getScreenshotAs(OutputType.FILE);
		
		File destination4 = new File("/Users/mac/eclipse-workspace/Selenium/TakeScreenshot/Book_A_Table.png");
		
		FileUtils.copyFile(source4, destination4);
		
		Thread.sleep(1000);
		WebElement book_Now = driver.findElement(By.xpath("//td/input[@id='book_now']"));
		book_Now.click();
		
		
		// Booking Confirmation 
		
		TakesScreenshot Confirmation = (TakesScreenshot) driver;
		
		File source5 = search_Hotel.getScreenshotAs(OutputType.FILE);
		
		File destination5 = new File("/Users/mac/eclipse-workspace/Selenium/TakeScreenshot/Confirmation.png");
		
		FileUtils.copyFile(source5, destination5);
		
		Thread.sleep(1000);
		WebElement log_Out = driver.findElement(By.xpath("//td/a[text()='Logout']"));
		log_Out.click();
		
		
		
		
		System.out.println();
		
		// Click here to login again page. 
		
		System.out.println(" Application Logged out successfully ");
		
		System.out.println();
		
		TakesScreenshot Login_Again = (TakesScreenshot) driver;
		
		File source6 = search_Hotel.getScreenshotAs(OutputType.FILE);
		
		File destination6 = new File("/Users/mac/eclipse-workspace/Selenium/TakeScreenshot/Login_Again.png");
		
		FileUtils.copyFile(source6, destination6);
		
		Thread.sleep(1000);
		WebElement login_Again = driver.findElement(By.xpath("//a[text()='Click here to login again']"));
		login_Again.click();
		
		driver.quit();
		
	
		System.out.println(" User can Login Again to Book a Hotel !!!! ");
		
	
		
		System.out.println();
		
		System.out.println(" Automation Program Executed Successfully !!!! ");
	}

}
