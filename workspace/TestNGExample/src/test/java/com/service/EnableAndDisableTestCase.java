package com.service;

import org.testng.annotations.Test;

public class EnableAndDisableTestCase {
  @Test
  public void f1() {
	  System.out.println("first test");
  }
 
  public void f2() {
	  System.out.println("second test");
  }
  @Test(enabled = false)
  public void f3() {
	  System.out.println("third test");
  }
  

}
