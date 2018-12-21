package com.guru99.customer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import come.guru99.managerhomepage.Guru99ManagerHomePage;

public class Guru99Customer extends Guru99ManagerHomePage

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
	WebElement CreateCustomerSubmtBtn;
	
	@FindBy(xpath ="//p[contains(text(),'Customer Registered Successfully!!!')]")
	WebElement CustomerSuccessfullTitle;
	
	@FindBy(xpath="//tbody[1]/tr[4]/td[2]")
	protected
	WebElement GetCustomerIdText;
	
	@FindBy(xpath ="(//a[@href=\"Managerhomepage.php\"])[2]")
	WebElement AftrAccntCrtn;
	
	@FindBy(xpath ="//p[contains(text(),'Add New Customer')]")
	WebElement createNewCustomerTitle;
	
	@FindBy(xpath = "//input[@name=\"cusid\"]")
	WebElement EditCustomeridField;
	
	@FindBy(xpath="//input[@type=\"submit\"]")
	WebElement EditCustomerSubmitBtn;
	
	@FindBy(xpath="//p[contains(text(),'Delete Customer Form')]")
	WebElement DeleteCustmrTitle;
	
	@FindBy(xpath = "//input[@onkeyup=\"validatecustomerid();\"]")
	WebElement DeleteCustmerField ;
	
	@FindBy(xpath ="//input[@name=\"AccSubmit\"]")
	WebElement DeleteCustSubmtBtn;
	
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
	
	public void Click_on_CreateCustomer_SubmitBtn(){
		CreateCustomerSubmtBtn.click();
	}
	
	public String Get_Created_Custmer_Id() {
		String CustId =  GetCustomerIdText.getText();
		return CustId;
	}
	public void created_Customerid_in_EditCustomerField(String CustId) {
		EditCustomeridField.sendKeys(CustId);
	}
	
	public void click_On_EditCustomer_SubmitBtn() {
		EditCustomerSubmitBtn.click();
	}
	
	public void delete_CustomerPage_Title() {
		DeleteCustmrTitle.isDisplayed();
	}
	public void enter_Custmer_Id_DeleteCustmrField(String CustId) {
		DeleteCustmerField.sendKeys(CustId);
	}
	
	public void click_On_DeleteCustomer_SubmtBtn() {
		DeleteCustSubmtBtn.click();
	}
	public void Creation_of_new_customer(String name, String date, String address, String city, String state, String pin, String phone, String Eml, String pwdd) throws Exception{
		NewCustmer.click();
		ExpliwaitUntilElementToBeClickable(driver, 10000, createNewCustomerTitle);
		CustmerNamefield.sendKeys(name);
		Genderfmleradiobtn.click();
		Thread.sleep(2000);
		Dobfield.sendKeys(date);
		Addressfield.sendKeys(address);
		Cityfield.sendKeys(city);
		Statefield.sendKeys(state);
		PinNmberfield.sendKeys(pin);
		PhneNmberfield.sendKeys(phone);
		Emailfield.sendKeys(Eml);
		Pwdfield.sendKeys(pwdd);
		CreateCustomerSubmtBtn.click();
		Thread.sleep(3000);

	}
	
	
	public void edition_Of_CreatedCustomer_Details(String CustId, String addrss, String cty, String stte, String pn, String phne, String eeml) throws InterruptedException {
		Get_Created_Custmer_Id();
		Edition_of_Customer_Details();
		Thread.sleep(2000);
		created_Customerid_in_EditCustomerField(CustId);
		click_On_EditCustomer_SubmitBtn();
		ExpliwaitUntilElementToBeClickable(driver, 3000, EditCustomerSubmitBtn);
		Enter_Address(addrss);
		Enter_City(cty);
		Enter_state(stte);
		Enter_PinNumber(pn);
		Enter_Phonenumber(phne);
		Enter_Email(eeml);
		click_On_EditCustomer_SubmitBtn();
	}
	
	
	public void deletion_Of_NewlyCreated_Customer(String CustId) {
		Get_Created_Custmer_Id();
		Deletion_of_Customer();
		ExpliwaitUntilElementToBeClickable(driver, 2000,DeleteCustmrTitle);
		enter_Custmer_Id_DeleteCustmrField(CustId);
		click_On_DeleteCustomer_SubmtBtn();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().accept();
		Guru99_Welcome_Page_Title();
		
		
	}
}
