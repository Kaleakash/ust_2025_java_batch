package com.service;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGHookFunctions {
  @Test
  public void firstTestMethod() {
	  assertTrue(true);
	  System.out.println("1st test method");
  }
  @Test
  public void secondTestMethod() {
	  assertFalse(false);
	  System.out.println("2nd test method");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("AFter method");
  }

  
  
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before class min one test must be there");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("after class min one test must be there ");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before test - optiona (test)");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After test - optional(test)");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After suite");
  }

}
