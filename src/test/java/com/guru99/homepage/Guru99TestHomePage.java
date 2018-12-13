package com.guru99.homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import come.guru99.homepage.Guru99LoginPage;

public class Guru99TestHomePage

{
	WebDriver driver;
	Guru99LoginPage Homepage;
	
	@Test(priority =1)
	public void LogintomyAccount() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\darsh\\eclipse-workspace\\SeleniumAutomation\\src\\main\\resources\\browser_drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/V4/");
		Homepage = new Guru99LoginPage(driver);
		Homepage.LoginToAccount();
		
	}
	
//	@Test (priority =2)
//	public void NewAccntCreation() throws InterruptedException {
//		driver.get("http://demo.guru99.com/V4/index.php");
//		Homepage.CreateNwAcnt();
//	}
}
