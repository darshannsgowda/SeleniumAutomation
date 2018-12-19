package com.guru99.editcustomer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.guru99.newcustomer.Guru99Customer;

public class Guru99EditCustomer extends Guru99Customer

{
	WebDriver driver;
	
	@FindBy(xpath = "//a[@href=\"EditCustomer.php\"]")
	WebElement EdtCustmer;
	
	@FindBy(xpath ="//input[@name=\"cusid\"]")
	WebElement CustomerId;
	
	@FindBy(css ="input[name='AccSubmit']")
	WebElement SbmtBtn;
	
	public Guru99EditCustomer(WebDriver driver) {
		super(driver);
	}
	
	public String Get_Created_Custmer_Id() {
		String CustId =  GetCustomerId.getText();
		return CustId;
	}
	
	public void Edit_Customer_Details() {
		EdtCustmer.click();
	}
	
	public void Enter_Customer_Id(String CustId ) {
		
		CustomerId.sendKeys(CustId);
	}
	
	public void Click_On_SubmitBtn() {
		SbmtBtn.click();
	}
	
	public void Entering_The_CustmerId_And_Editng_Details(String CustId, String address, String city,String state, String pin, String phone, String Eml ) {
		Edit_Customer_Details();
		Enter_Customer_Id(CustId);
		Click_On_SubmitBtn();
		Enter_Address(address);
		Enter_City(city);
		Enter_state(state);
		Enter_PinNumber(pin);
		Enter_Phonenumber(phone);
		Enter_Email(Eml);
		Click_on_SubmitBtn();
	}
	
	
}
