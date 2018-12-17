package com.guru99.newcustompage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.guru99.editcustomer.Guru99EditCustomer;
import com.guru99.loginpage.Guru99LoginPage;
import com.guru99.newcustomer.Guru99Customer;

public class Guru99TestLoginPage 

{
	WebDriver driver;
	Guru99Customer customer;
	Guru99LoginPage Login;
	Guru99EditCustomer EditCustmer;
	
	
	@Test(priority = 1,dataProvider="SearchProvider")
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
	
	@Test(priority = 2)
	public void Edition_Customer_And_Save() throws InterruptedException {
		EditCustmer = new Guru99EditCustomer(driver);
		String Custid = EditCustmer.Get_Created_Custmer_Id();
		EditCustmer.Entering_The_CustmerId_And_Editng_Details(Custid);
		
	}
	  @DataProvider(name="SearchProvider")
      public static Object[][] getDataFromDataprovider(){
          return new Object[][] {
             
              { "mngr167859","mEdameb","JJVillan","12-11-1998","Thanks for coming here", "California", "USA", "928392", "9887327382", "Jibesh@votercircle.in", "Tet123" }
          };  
	  }
	  
	 
	  
}
