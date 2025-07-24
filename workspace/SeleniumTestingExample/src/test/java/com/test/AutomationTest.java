package com.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class AutomationTest {
  
  
  WebDriver driver;

  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	  driver = new ChromeDriver();	
	  driver.get("https://practice-automation.com/");
  }

  
  @Test
  public void f() {
	  WebElement strongTagRef = driver.findElement(By.tagName("strong"));	// we get the reference of strong tag 
	  String actualContent = strongTagRef.getText();			// get the content of that tag 
	  //assertEquals(actualContent, "Welcome to your software automation practice website!");	// checking the content
	  assertEquals(actualContent, "Hello");	// checking the content
  }
  
  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
