package com.guru99.custompage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.guru99.customer.Guru99Customer;
import com.guru99.loginpage.Guru99LoginPage;

public class Guru99TestCreationOfCustomer 

{
	WebDriver driver;
	Guru99Customer customer;
	Guru99LoginPage Login;
	
	
	@Test(priority = 1, dataProvider="createCustomer")
	public void Creation_of_NewCustomer(String Usrname, String Pwd, String Custmrname, String Dob, String addres, String city,String state, String pin, String phone, String eml, String pass ) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\darsh\\eclipse-workspace\\SeleniumAutomation\\src\\main\\resources\\browser_drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		customer = new Guru99Customer(driver);
		Login = new Guru99LoginPage(driver);
		driver.get("http://demo.guru99.com/V4/");
		Login.Now_LoginToAccount(Usrname,Pwd);
		customer.Creation_of_new_customer(Custmrname,Dob,addres,city, state,pin, phone, eml, pass);
		
		
	
	}
	 
	@DataProvider(name="createCustomer")
    public static Object[][] getDataFromCreateCustomer(){
        return new Object[][] {
           
            { "mngr170111","ugemusy","bolinger","11-11-1998","Thanks for coming here", "California", "USA", "928392", "9887327382", "habr1093@votercircle.in", "Test123" },
            
        };  
	  }
	  
}
