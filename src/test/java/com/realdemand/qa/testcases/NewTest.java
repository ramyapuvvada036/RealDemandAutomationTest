package com.realdemand.qa.testcases;

import org.testng.annotations.Test;
import com.realdemand.qa.base.BaseTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest extends BaseTest {
	@Test
	public void f() {

		System.out.println("This is Test");
	}

	@BeforeTest
	public void beforeTest() {

		System.out.println("This is Before Test");
	}

	@AfterTest
	public void afterTest() {

		System.out.println("This is After Test");
	}
}