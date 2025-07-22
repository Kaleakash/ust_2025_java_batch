package com.service;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class OperationServiceTest {

  @Test
  public void addTest() {
    //throw new RuntimeException("Test not implemented");
	 OperationService os = new OperationService();
	 int result1 = os.add(100, 200);
	 assertEquals(result1, 300);
  }

  @Test
  public void subTest() {
    //throw new RuntimeException("Test not implemented");
	  OperationService os = new OperationService();
		 int result2 = os.sub(1000, 500);
		 assertEquals(result2, 500);
  }
}
