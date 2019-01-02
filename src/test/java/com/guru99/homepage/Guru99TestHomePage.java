package com.guru99.homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.guru99.usermanagement.Guru99Login_ResetPassword_LogoutPage;

public class Guru99TestHomePage

{
	WebDriver driver;
	Guru99Login_ResetPassword_LogoutPage Loginpage;
	
	@Test(priority =1)
	public void LogintomyAccount() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\darsh\\eclipse-workspace\\SeleniumAutomation\\src\\main\\resources\\browser_drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/V4/");
		Loginpage = new Guru99Login_ResetPassword_LogoutPage(driver);
		Loginpage.Now_LoginToAccount("mngr170111","ugemusy");
	}
	

}
