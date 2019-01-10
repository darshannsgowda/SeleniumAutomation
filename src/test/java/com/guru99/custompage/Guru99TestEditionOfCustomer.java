package com.guru99.custompage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.guru99.customer.Guru99Customer;
import com.guru99.usermanagement.Guru99Login_ResetPassword_LogoutPage;

public class Guru99TestEditionOfCustomer 

{
	WebDriver driver;
	Guru99Customer customer;
	Guru99Login_ResetPassword_LogoutPage Login;
	@Test(priority = 1, dataProvider="createCustomer")
	public void Creation_of_NewCustomer(String Usrname, String Pwd, String Custmrname, String Dob, String addres, String city,String state, String pin, String phone, String eml, String pass ) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\darsh\\eclipse-workspace\\SeleniumAutomation\\src\\main\\resources\\browser_drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		customer = new Guru99Customer(driver);
		Login = new Guru99Login_ResetPassword_LogoutPage(driver);
		driver.get("http://demo.guru99.com/V4/");
		Login.Now_LoginToAccount(Usrname,Pwd);
		customer.Creation_of_new_customer(Custmrname,Dob,addres,city, state,pin, phone, eml, pass);
		
	
	}
	 
	@Test(priority = 2, dataProvider="editCustomer")
	public void Edition_Customer_And_Save(String address, String city,String state, String pin, String phone, String Eml) throws InterruptedException {
		String Custid = customer.Get_Created_Custmer_Id();
		customer.edition_Of_CreatedCustomer_Details(Custid, address, city, state, pin,phone, Eml);
	}
	
	@DataProvider(name="createCustomer")
    public static Object[][] getDataFromCreateCustomer(){
        return new Object[][] {
           
            { "mngr172590","gApYbUt","ipjn","10-11-1908","Thanks for coming here", "California", "USA", "928392", "9887007382", "bw900@votercircle.in", "Test123" },
            
        };  
	  }
	 
	  @DataProvider(name="editCustomer")
	  public static Object[][] getDataFromEditCustomer(){
		  return new Object[][] {
			  {"Thanks comin here well", "Cifora", "SSA", "929982", "989929982", "prabhhha@votercircle.in"}
		  };
	  }
	  
	 
}
