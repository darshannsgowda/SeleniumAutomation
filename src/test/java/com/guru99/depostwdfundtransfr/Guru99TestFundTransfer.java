package com.guru99.depostwdfundtransfr;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.guru99.account.Guru99Account;
import com.guru99.customer.Guru99Customer;
import com.guru99.deposit.withdraw.fundtransfer.Guru99DepositWthDrwFundTrnsfr;
import com.guru99.loginpage.Guru99LoginPage;

public class Guru99TestFundTransfer 
{
	WebDriver driver;
	Guru99Customer customer;
	Guru99LoginPage Login;
	Guru99Account creatnofaccnt;
	Guru99DepositWthDrwFundTrnsfr fundtrnsfr;
	
	
	@Test(priority = 1, dataProvider="createcustomer")
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

	@Test(invocationCount = 2,priority = 2,dataProvider="createaccount" )
	public void creation_of_NewAccnt(String value) throws InterruptedException 
	{
		creatnofaccnt = new Guru99Account(driver);
		String cusid= customer.Get_Created_Custmer_Id();
		creatnofaccnt.creation_of_Newaccount(cusid, value);
		String acidd = creatnofaccnt.get_AccountId();
		System.out.println(acidd);
//		creatnofaccnt.edition_Of_Account(acidd);
			
	}
	
	@Test(priority =3, dataProvider="fundtranfr")
	public void fundTransfr_Amount_From_PayeersToPayees_Accnt(String amtt, String desc) {
		fundtrnsfr = new Guru99DepositWthDrwFundTrnsfr(driver);
		String acid = creatnofaccnt.get_AccountId();
		String actid = creatnofaccnt.get_AccountId();
		fundtrnsfr.fundtranfer_Amt_From_PayeersToPayeesAccnt(acid, actid, amtt, desc);
	}
	@DataProvider(name ="deposit")
	public static Object[][] getDataFromDeposit(){
		return new Object[][] {
			{"9999", "Thanks for my amount deposited", "959", "Withdrw amount"}
		};
	}

	@DataProvider(name="createcustomer")
	public static Object[][] getDataFromCreateCustomer(){
	    return new Object[][] {
	       
	        { "mngr170110","ApAjutA","Jaeiish","10-10-1979","Thank fo coming here", "Califsnia", "USA", "988552", "9989327992", "bel9908@votercircle.in", "Test239" },
	        
	    };  
	  }
	
	@DataProvider(name ="fundtranfr")
	public static Object[][] getDataFromFundtranfr(){
		return new Object[][] {
			{"969", "Thanks folks for all your support"}
		};
	}
	@DataProvider(name="createaccount")
    public static Object[][] getDataFromCreateAccount(){
        return new Object[][] {
           
            {"4800"}
            
        };  
	  }
}
