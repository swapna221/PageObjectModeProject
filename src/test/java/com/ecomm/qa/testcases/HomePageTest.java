package com.ecomm.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.ecomm.qa.base.TestBase;
import com.ecomm.qa.pages.LoginPage;

public class HomePageTest extends TestBase{
	LoginPage log;

	public HomePageTest() throws IOException {
		super();
		
	}
	
	@BeforeTest
	public void init() throws IOException {
		initilization();
		 log = new LoginPage();
		 log.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
