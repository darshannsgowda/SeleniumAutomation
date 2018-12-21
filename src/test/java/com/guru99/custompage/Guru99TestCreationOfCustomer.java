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
	 
//	@Test(priority = 2, dataProvider="editCustomer")
//	public void Edition_Customer_And_Save(String address, String city,String state, String pin, String phone, String Eml) throws InterruptedException {
//		String Custid = customer.Get_Created_Custmer_Id();
//		System.out.println(Custid);
//		customer.edition_Of_CreatedCustomer_Details(Custid, address, city, state, pin, phone, Eml);
//	}
	
	@DataProvider(name="createCustomer")
    public static Object[][] getDataFromCreateCustomer(){
        return new Object[][] {
           
            { "mngr167859","mEdameb","habri","11-11-1998","Thanks for coming here", "California", "USA", "928392", "9887327382", "habriii@votercircle.in", "Test123" },
            
        };  
	  }
	 
//	  @DataProvider(name="editCustomer")
//	  public static Object[][] getDataFromEditCustomer(){
//		  return new Object[][] {
//			  {"Thanks for coming here well", "Califora", "SSA", "928892", "9887329982", "prakash11@votercircle.in"}
//		  };
//	  }
//	  
	 
	  
}
