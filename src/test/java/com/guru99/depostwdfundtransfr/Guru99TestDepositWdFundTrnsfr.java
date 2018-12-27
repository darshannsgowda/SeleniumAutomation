package com.guru99.depostwdfundtransfr;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.guru99.account.Guru99Account;
import com.guru99.customer.Guru99Customer;
import com.guru99.deposit.withdraw.fundtransfer.Guru99DepositWthDrwFundTrnsfr;
import com.guru99.loginpage.Guru99LoginPage;

public class Guru99TestDepositWdFundTrnsfr 
{WebDriver driver;
Guru99Customer customer;
Guru99LoginPage Login;
Guru99Account creatnofaccnt;
Guru99DepositWthDrwFundTrnsfr deposit;

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

@Test(priority = 2,dataProvider="createaccount" )
public void creation_of_NewAccnt(String value) throws InterruptedException 
{
	creatnofaccnt = new Guru99Account(driver);
	String cusid= customer.Get_Created_Custmer_Id();
	creatnofaccnt.creation_of_Newaccount(cusid, value);
	String acidd = creatnofaccnt.get_AccountId();
	System.out.println(acidd);
//	creatnofaccnt.edition_Of_Account(acidd);
		
}

@Test(priority = 3, dataProvider = "deposit")
public void deposit_Of_MoneyToAccnt( String amt, String desc, String amount, String descrp) 
{
	deposit = new Guru99DepositWthDrwFundTrnsfr(driver);
	String accntno = creatnofaccnt.get_AccountId();
	deposit.deposit_Amt_From_DepositPage(accntno, amt, desc);
	deposit.withdrw_Amt_From_AccountPage(accntno, amount, descrp);
	
}


@DataProvider(name ="deposit")
public static Object[][] getDataFromDeposit(){
	return new Object[][] {
		{"9999", "Thanks for my amount deposited", "999", "Withdrw amount"}
	};
}

@DataProvider(name="createcustomer")
public static Object[][] getDataFromCreateCustomer(){
    return new Object[][] {
       
        { "mngr170111","ugemusy","Bli","09-10-1999","Thank fo coming here", "Califonia", "USA", "988992", "9889327992", "bell990@votercircle.in", "Test1239" },
        
    };  
  }



@DataProvider(name="createaccount")
public static Object[][] getDataFromCreateAccount(){
    return new Object[][] {
       
        {"3970"}
        
    };  
  }
}
