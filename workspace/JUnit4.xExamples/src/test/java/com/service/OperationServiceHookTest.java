package com.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class OperationServiceHookTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("it call before all test - only once");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("it call after all test - only once");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("it call again and again before each test method");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("it call again and again after each test method");
	}

	@Test
	public void testAdd() {
		System.out.println("add testing");
	}

	@Test
	public void testSub() {
		System.out.println("sub testing");
	}

}
