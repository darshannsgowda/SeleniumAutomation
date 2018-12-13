package com.guru99.newcustompage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.guru99.newcustomer.Guru99Customer;

import come.guru99.homepage.Guru99LoginPage;

public class Guru99TestLoginPage 

{
	WebDriver driver;
	Guru99Customer customer;
	Guru99LoginPage Login;
	
	
	@Test
	public void Creation_of_NewCustomer() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\darsh\\\\eclipse-workspace\\\\SeleniumAutomation\\\\src\\\\main\\\\resources\\\\browser_drivers\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		customer = new Guru99Customer(driver);
		Login = new Guru99LoginPage(driver);
		driver.get("http://demo.guru99.com/V4/");
		Login.LoginToAccount();
		customer.Creation_of_new_customer();
	
	}
}
