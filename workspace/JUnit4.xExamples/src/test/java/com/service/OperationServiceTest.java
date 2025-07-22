package com.service;

//import org.junit.Assert;
import static org.junit.Assert.*;

import org.junit.Test;

public class OperationServiceTest {

	@Test
	public void testAdd() {
		OperationService os = new OperationService();
		int result = os.add(100, 200);
		assertEquals(300, result);
	}

	@Test
	public void testSub() {
		OperationService os = new OperationService();
		int result = os.sub(200, 100);
		assertEquals(100, result);
	}

}
