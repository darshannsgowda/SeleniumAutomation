package com.guru99.accountpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.guru99.account.Guru99Account;
import com.guru99.customer.Guru99Customer;
import com.guru99.usermanagement.Guru99Login_ResetPassword_LogoutPage;

public class Guru99CreationOfAccount 
{
	WebDriver driver;
	Guru99Customer customer;
	Guru99Login_ResetPassword_LogoutPage Login;
	Guru99Account creatnofaccnt;
	
	@Test(priority = 1, dataProvider="createcustomer")
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
	
	@Test(priority = 2,dataProvider="createaccount" )
	public void creation_of_NewAccnt(String value) throws InterruptedException 
	{
		creatnofaccnt = new Guru99Account(driver);
		String cusid= customer.Get_Created_Custmer_Id();
		creatnofaccnt.creation_of_Newaccount(cusid, value);
		String acidd = creatnofaccnt.get_AccountId();
		System.out.println(acidd);
		creatnofaccnt.edition_Of_Account(acidd);
		
		
		
	}
	

	@DataProvider(name="createcustomer")
    public static Object[][] getDataFromCreateCustomer(){
        return new Object[][] {
           
            { "mngr170111","ugemusy","Birbal","09-10-1999","Thank fo coming here", "Califonia", "USA", "988992", "9889327992", "birbal202@votercircle.in", "Test1239" },
            
        };  
	  }
	

	@DataProvider(name="createaccount")
    public static Object[][] getDataFromCreateAccount(){
        return new Object[][] {
           
            {"800"}
            
        };  
	  }
}
