package com.admin.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sims_sit {
	
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
			
			driver.get("https://t3.test.ocs.unsw.edu.au/psp/ocst3/EMPLOYEE/HRMS/h/?tab=DEFAULT&cmd=login&errorCode=106&languageCd=ENG");
			searchPage();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void searchPage()
	{
		driver.findElement(By.id("userid")).sendKeys("Z5045034");
		driver.findElement(By.id("pwd")).sendKeys("Z5045034");
		
		driver.findElement(By.name("Submit")).click();
		
		// Logged into SiMS -SIT  
		
		driver.get("https://t3.test.ocs.unsw.edu.au/psp/ocst3/EMPLOYEE/HRMS/c/ESTABLISH_COURSES.CRSE_CATALOG.GBL?FolderPath=PORTAL_ROOT_OBJECT.HCSR_CURRICULUM_MANAGEMENT.HCSR_COURSE_CATALOG.HC_CRSE_CATALOG_GBL&IsFolder=false&IgnoreParamTempl=FolderPath%2cIsFolder");
		 
		// Under Course Catalogue 
		
		courseCatalogue();
		

	}
	
	///////////////////////////////////////// Debug Below/////////////////////////////////////////
	
	public void courseCatalogue()	
	{
		//  driver.findElement(By.name("NS_CRSE_CAT_VW2_SUBJECT")).sendKeys("UNSWA");
		
		driver.findElement(By.xpath("")).sendKeys("UNSWA");
		
		driver.findElement(By.name("NS_CRSE_CAT_VW2_CRSE_I")).sendKeys("100000");
		
		driver.findElement(By.name("#ICSearch")).click();
	}
	

	public static void main(String[] args)
	{
		
		Sims_sit myObj = new Sims_sit();
		myObj.invokeBrowser();
	}

}
