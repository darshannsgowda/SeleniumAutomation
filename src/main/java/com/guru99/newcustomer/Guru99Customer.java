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
	WebElement CustmerNamefield;
	
	@FindBy(xpath ="((//input[@name=\"rad1\"]))[2]")
	WebElement Genderfmleradiobtn;
	
	//Telerik date time picker below
	@FindBy(id = "dob")
	WebElement Dobfield;
	
	@FindBy(tagName = "textarea")
	WebElement Addressfield;
	
	@FindBy(xpath ="//input[@name=\"city\"]")
	WebElement Cityfield;
	
	@FindBy(xpath ="//input[@name=\"state\"]")
	WebElement Statefield;
	
	@FindBy(xpath ="//input[@name=\"pinno\"]")
	WebElement PinNmberfield;
	
	@FindBy(xpath ="//input[@name=\"telephoneno\"]")
	WebElement PhneNmberfield;
	
	@FindBy(xpath ="//input[@name=\"emailid\"]")
	WebElement Emailfield;
	
	@FindBy(xpath ="//input[@name=\"password\"]")
	WebElement Pwdfield;
	
	@FindBy(xpath ="//input[@value=\"Submit\"]")
	WebElement SubmtBtn;
	
	@FindBy(xpath="//tbody[1]/tr[4]/td[2]")
	protected
	WebElement GetCustomerIdText;
	
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
		CustmerNamefield.sendKeys(name);
	}
	
	public void Gender_Selection() {
		Genderfmleradiobtn.click();	
	}
	
	public void Select_DOB(String date) {
		Dobfield.sendKeys(date);	
	}
	
	public void Enter_Address(String address) {
		Addressfield.clear();
		Addressfield.sendKeys(address);
	}
	
	public void Enter_City(String city) {
		Cityfield.clear();
		Cityfield.sendKeys(city);
	
	}
	
	public void Enter_state(String state) {
		Statefield.clear();
		Statefield.sendKeys(state);
	}
	
	public void Enter_PinNumber(String pin) {
		PinNmberfield.clear();
		PinNmberfield.sendKeys(pin);
	}
	
	public void Enter_Phonenumber(String phone) {
		PhneNmberfield.clear();
		PhneNmberfield.sendKeys(phone);
	}
	
	public void Enter_Email(String Eml) {
		Emailfield.clear();
		Emailfield.sendKeys(Eml);
	}
	
	public void Enter_Passwrd(String pwdd) {
		Pwdfield.sendKeys(pwdd);
	}
	
	public void Click_on_SubmitBtn(){
		SubmtBtn.click();
	}
	public void Creation_of_new_customer(String name, String date, String address, String city, String state, String pin, String phone, String Eml, String pwdd) throws Exception{
		NewCustmer.click();
		ExpliwaitUntilElementToBeClickable(driver, 2000, createNewCustomerTitle);
		CustmerNamefield.sendKeys(name);
		Genderfmleradiobtn.click();
		Thread.sleep(4000);
		Dobfield.sendKeys(date);
		Addressfield.sendKeys(address);
		Cityfield.sendKeys(city);
		Statefield.sendKeys(state);
		PinNmberfield.sendKeys(pin);
		PhneNmberfield.sendKeys(phone);
		Emailfield.sendKeys(Eml);
		Pwdfield.sendKeys(pwdd);
		SubmtBtn.click();
		NewCustmer.click();

		
		
	}
}
