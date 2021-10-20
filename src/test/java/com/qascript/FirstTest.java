package com.qascript;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;
import java.util.*;
import java.lang.*;

public class FirstTest {


    @Test
    public void OpenBrowser()  {
/*        WebDriver driver;   */
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SimitBhattacharyya\\OneDrive - iCatalyst Inc\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://3.144.243.162:8081/v1/docker");
/*		String testString = "Welcome to deployment in docker DOED TEST";  */
	         String testString = "index.htm"; 
		
/*		String testSample =driver.findElement(By.tagName("h1")).getText(); */
		String testSample =driver.findElement(By.tagName("body")).getText();
 	
		System.out.println("Text= " +testSample);
		  if (testSample.equals(testString))
		  { 
		  System.out.println("Success");
		   System.out.println(testSample.getClass().getSimpleName());
/*			  	  system.exit(0);  */
		  }
		  else
		  { 
			  System.out.println("Failure");
/*			  system.exit(1);    */
		  }
		
	}


}


