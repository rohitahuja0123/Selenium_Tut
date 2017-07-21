package com.admin.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Email {
	
	WebDriver driver;
	
	public void invokeBrowser()
	{
		try {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\z5045034\\Downloads\\selenium\\chromedriver.exe" );
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
			driver.get("https://gmail.com");
			searchPage();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void searchPage()
	{
		driver.findElement(By.id("identifierId")).sendKeys("z5045034@gmail.com");
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
		driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("");
		driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();
		
		//driver.findElement(By.name("Submit")).click();
		
		
		/// Logged in  ////
		
		// Send email 
		sendEmail();
		

	}
	
	///////////////////////////////////////// Debug Below/////////////////////////////////////////
	
	public void sendEmail()	
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.get("https://mail.google.com/mail/u/0/#inbox?compose=new");
		
		//
		driver.findElement(By.xpath(".//*[@id=':kg']/div")).click();
		driver.findElement(By.xpath(".//*[@id=':kg']/div")).sendKeys("bphan.ms@gmail.com"); 
	}
	
	

	public static void main(String[] args)
	{
		
		Email myObj = new Email();
		myObj.invokeBrowser();
	}

}
