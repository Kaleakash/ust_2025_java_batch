package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleSelenimExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// set driver in form of key-value pairs 
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		// created the reference of browser. 
		driver.get("http://www.google.com");	  // using driver open the google page. 
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		String sourceCode = driver.getPageSource();
		System.out.println(url);
		System.out.println(title);
		WebElement textAreaRef = driver.findElement(By.name("q"));
		textAreaRef.sendKeys("What is selenium");
		
		WebElement submitButton = driver.findElement(By.name("btnK"));
		submitButton.click();
		
		//System.out.println(sourceCode);
		driver.quit();
	}

}
