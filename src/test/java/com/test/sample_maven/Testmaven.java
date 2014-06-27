package com.test.sample_maven;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testmaven {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
System.out.println("hi");
		
		//FirefoxDriver driver = new FirefoxDriver();
		

         WebDriver driver= new FirefoxDriver();
      
		// Chrome
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.hotmail.co.uk");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		String x=driver.getTitle();
		Assert.assertEquals("Sign In", x);
	  driver.findElement(By.xpath("//*[@id='idA_PWD_ForgotPassword']")).click();  
		//driver.findElement(By.xpath("//*[@id='gbqfba']")).click();
	
	  System.out.println("test finished");
	  
	   driver.close();
	   driver.quit();
	
	}

}
