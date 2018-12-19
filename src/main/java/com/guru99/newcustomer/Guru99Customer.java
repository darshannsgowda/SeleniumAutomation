package com.guru99.newcustomer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import come.guru99.homepage.Guru99HomePage;

public class Guru99Customer extends Guru99HomePage

{
//	WebDriver driver;
	
	
	@FindBy(xpath = "//a[@href =\"addcustomerpage.php\"]")
	WebElement NewCustmer;
	
	@FindBy(xpath ="//input[@name=\"name\"]")
	WebElement CustmerName;
	
	@FindBy(xpath ="((//input[@name=\"rad1\"]))[2]")
	WebElement Genderfmle;
	
	//Telerik date time picker below
	@FindBy(id = "dob")
	WebElement DOB;
	
	@FindBy(tagName = "textarea")
	WebElement Address;
	
	@FindBy(xpath ="//input[@name=\"city\"]")
	WebElement City;
	
	@FindBy(xpath ="//input[@name=\"state\"]")
	WebElement State;
	
	@FindBy(xpath ="//input[@name=\"pinno\"]")
	WebElement PinNmber;
	
	@FindBy(xpath ="//input[@name=\"telephoneno\"]")
	WebElement PhneNmber;
	
	@FindBy(xpath ="//input[@name=\"emailid\"]")
	WebElement Email;
	
	@FindBy(xpath ="//input[@name=\"password\"]")
	WebElement Pwd;
	
	@FindBy(xpath ="//input[@value=\"Submit\"]")
	WebElement SubmtBtn;
	
	@FindBy(xpath="//tbody[1]/tr[4]/td[2]")
	protected
	WebElement GetCustomerId;
	
	@FindBy(xpath ="(//a[@href=\"Managerhomepage.php\"])[2]")
	WebElement AftrAccntCrtn;
	
	@FindBy(xpath ="//p[contains(text(),'Add New Customer')]")
	WebElement createNewCustomerTitle;
	
	public Guru99Customer(WebDriver driver) {
		super(driver);
		
	}
	
	public void Click_On_NewcustomerLink_From_Menu() {
		NewCustmer.click();
	}

	public void Enter_CustomerName(String name) {
		CustmerName.sendKeys(name);
	}
	
	public void Gender_Selection() {
		Genderfmle.click();	
	}
	
	public void Select_DOB(String date) {
		DOB.sendKeys(date);	
	}
	
	public void Enter_Address(String address) {
		Address.clear();
		Address.sendKeys(address);
	}
	
	public void Enter_City(String city) {
		City.clear();
		City.sendKeys(city);
	
	}
	
	public void Enter_state(String state) {
		State.clear();
		State.sendKeys(state);
	}
	
	public void Enter_PinNumber(String pin) {
		PinNmber.clear();
		PinNmber.sendKeys(pin);
	}
	
	public void Enter_Phonenumber(String phone) {
		PhneNmber.clear();
		PhneNmber.sendKeys(phone);
	}
	
	public void Enter_Email(String Eml) {
		Email.clear();
		Email.sendKeys(Eml);
	}
	
	public void Enter_Passwrd(String pwdd) {
		Pwd.sendKeys(pwdd);
	}
	
	public void Click_on_SubmitBtn(){
		SubmtBtn.click();
	}
	public void Creation_of_new_customer(String name, String date, String address, String city, String state, String pin, String phone, String Eml, String pwdd) throws Exception{
		NewCustmer.click();
		ExpliwaitUntilElementToBeClickable(driver, 2000, createNewCustomerTitle);
		CustmerName.sendKeys(name);
		Genderfmle.click();
		Thread.sleep(4000);
		DOB.sendKeys(date);
		Address.sendKeys(address);
		City.sendKeys(city);
		State.sendKeys(state);
		PinNmber.sendKeys(pin);
		PhneNmber.sendKeys(phone);
		Email.sendKeys(Eml);
		Pwd.sendKeys(pwdd);
		SubmtBtn.click();

		
		
	}
}
