package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleSelenimExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		// set driver in form of key-value pairs 
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();		// created the reference of browser. 
		
		driver.get("http://www.google.com");	  // using driver open the google page. 
		
		driver.manage().window().maximize();		// maximize the web page screen
		
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		String sourceCode = driver.getPageSource();
		System.out.println(url);
		System.out.println(title);
		// driver is reference and findElement is method which takes By class object reference. 
		// By is pre defined class which contains lot of static method like name, id, cssClass, class, link etc
		// which help to get reference of that tag and return type is WebElement. 
		WebElement textAreaRef = driver.findElement(By.name("q"));
		textAreaRef.sendKeys("What is selenium");		// write the content in text area. 
		
		// using name attribute get the submit button reference. 
		WebElement submitButton = driver.findElement(By.name("btnK"));
		// we click on that button 
		submitButton.click();
			Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		textAreaRef.clear();		// clear the content from text area. 
		textAreaRef.sendKeys("What is Junit testing");	// write new contents in text area 
		submitButton.click();				// again click 
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		//System.out.println(sourceCode);
		driver.quit();
	}

}
