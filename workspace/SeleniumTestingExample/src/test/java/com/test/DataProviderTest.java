package com.test;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderTest {
  @Test(dataProvider = "dp")
  public void f(String username, String password) {
	  System.out.println(username+" "+password);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "student", "Password123" },
      new Object[] { "wrongname", "Password123" },
      new Object[] { "student", "wrongpassword" }
    };
  }
}
