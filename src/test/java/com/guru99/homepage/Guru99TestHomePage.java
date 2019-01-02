package com.guru99.homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
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
		Loginpage.Now_LoginToAccount("mngr170111","@Voter123");
		
	}
	
	@Test(priority = 2, dataProvider = "ResetPassword")
	public void reset_The_AccountPassword(String oldpass, String newpass, String cnfrmpass) {
		Loginpage.reset_Existing_AccountPasswrd(oldpass, newpass, cnfrmpass);
	}
	
	@DataProvider(name = "ResetPassword")
	public static Object[][] getDataFromResetPasswrd(){
	    return new Object[][] {
	       
	        { "@Voter123", "@Voter1234", "@Voter1234"}
	        
	        
	    };  
	  }
	

}
