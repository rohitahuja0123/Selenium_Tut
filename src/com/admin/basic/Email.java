package com.admin.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Email {
	
	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
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
		/// Wait for user input
/*		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		////// Security Risk //////
		
		driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("xxxx");
		
		////// Security Risk //////
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();
		
		//new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
		
		//driver.findElement(By.name("Submit")).click();
		
		
		/// Logged in 
		
		// Send email 
		
		for(int x = 1; x < 10; x = x + 1);
		{
			sendEmail();
		}
		
		
		/////  LOGOUT /////
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.get("https://mail.google.com/mail/logout?hl=en");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();

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
		
		// TO AND SUBJECT
		driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys("tejwansh1808@gmail.com"); 
        driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Automated Mail"); 
		
		// Body

		driver.findElement(By.xpath("//div[@class='Ar Au']//div")).sendKeys("Hi This mail is scripted, but WWE is not !"); 
		
		
		// Send Button 
		
		driver.findElement(By.xpath("//div[contains(text(),'Send')]")).click();
		

		
	}
	
	

	public static void main(String[] args)
	{

			Email myObj = new Email();
			myObj.invokeBrowser();
			
	}

}
