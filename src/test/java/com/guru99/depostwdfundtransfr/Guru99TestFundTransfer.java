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
	
	
	@Test(priority = 1, dataProvider="logintoguru99homepage")
	public void login_to_Guru99HomePage(String Usrname, String Pwd, String accntnmbr,String payeeacntno, String amtt, String desc ) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\darsh\\eclipse-workspace\\SeleniumAutomation\\src\\main\\resources\\browser_drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		customer = new Guru99Customer(driver);
		Login = new Guru99LoginPage(driver);
		driver.get("http://demo.guru99.com/V4/");
		Login.Now_LoginToAccount(Usrname,Pwd);
	}
	
	@Test(priority = 2, dataProvider="logintoguru99homepage")
	public void fundtransfer_From_One_AccntToAnother_Accnt(String Usrname, String Pwd,String accntnmbr,String payeeacntno, String amtt, String desc ) 
	{
		
		fundtrnsfr = new Guru99DepositWthDrwFundTrnsfr(driver);
		fundtrnsfr.fundtranfer_Amt_From_PayeersToPayeesAccnt(accntnmbr, payeeacntno, amtt, desc);
	}
	
	@DataProvider(name = "logintoguru99homepage")
	public static Object[][] getDataFromFundTrnsfrPage(){
	    return new Object[][] {
	       
	        { "mngr170110","ApAjutA","54923", "54924", "400", "Thanks for trnsfering the money" }
	        
	        
	    };  
	  }
	
	
}
