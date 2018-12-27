package com.guru99.account;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import come.guru99.managerhomepage.Guru99ManagerHomePage;
public class Guru99Account extends Guru99ManagerHomePage
{
	WebDriver driver;
	
	@FindBy(xpath="//p[contains(text(),'Add new account form')]")
	WebElement AddNewAccountTitle;
	
	@FindBy(xpath ="//input[@onblur=\"validatecustomerid();\"]")
	WebElement NewAccCustmeridField;
	
	@FindBy(tagName= "select")
	WebElement AccountTypeDropdwn;
	
	@FindBy(xpath ="//select/option[@value=\"Current\"]")
	WebElement SelectCurrentOptFrmDropdwn;
	
	@FindBy(xpath ="//option[@value = \"Savings\"]")
	WebElement SelectSavingsOptFrmDropdwn;
	
	@FindBy(xpath= "//input[@name=\"inideposit\"]")
	WebElement IntialDepost ;

	@FindBy(xpath= "//input[@name=\"button2\"]")
	WebElement NewAccSubmtBtn;
	
	@FindBy(xpath = "//tbody[1]/tr[4]/td[2]")
	WebElement AccountId;
	
	@FindBy(xpath ="//input[@name =\"accountno\"]")
	WebElement Editaccountfield;
	
	@FindBy(xpath ="//p[contains(text(),'Edit Account Form')]")
	WebElement EditacntpageTitle;
	
	@FindBy(xpath ="//input[@type=\"submit\"]")
	WebElement EditAccountPageSubmtBtn;
	
	@FindBy(xpath ="//select[@name =\"a_type\"]")
	WebElement TypeOfAccountDropDwnInEditCountryEntryForm;
	
	@FindBy(xpath ="//input[@onclick =\"return validate();\"]")
	WebElement EditAccountEntrySubmtBtn;

	
	public Guru99Account(WebDriver driver) {
		super(driver);
	}
	
	
	public void addnew_Account_Titlename() {
		AddNewAccountTitle.isDisplayed();
	}
	
	public void enter_Customerid_InAccount_CustomerField(String custid) {
		NewAccCustmeridField.sendKeys(custid);
	}
	
	public void click_on_AccntDropDwn() {
		AccountTypeDropdwn.click();
	}
	
	public void select_Current_OtnFrom_Dropdwn() {
		SelectCurrentOptFrmDropdwn.click();
	}
	
	public void enter_Intitial_DepostMoney(String value) {
		IntialDepost.sendKeys(value);
	}
	
	public void click_on_AccountSubmtBtn() {
		NewAccSubmtBtn.click();
	}
	
	public String get_AccountId() {
		String Accid = AccountId.getText();
		return Accid ;
	}
	
	public void enter_Id_In_EditAccountField(String accid) {
		Editaccountfield.sendKeys(accid);
	}
	
	public void click_On_EditAccnt_SubmtBtn() {
		EditAccountPageSubmtBtn.click();
	}
	
	public void click_On_EntryAccountFormPage_TypeOfAccount_DropDwn() {
		TypeOfAccountDropDwnInEditCountryEntryForm.click();
	}
	
	public void select_SavingsOpt_From_AccountDropdwn() {
		SelectSavingsOptFrmDropdwn.click();
	}
	
	public void click_On_EditAccntEntry_SubmtBtn() {
		EditAccountEntrySubmtBtn.click();
	}
	public void creation_of_Newaccount(String custid, String value) {
		Get_Created_Custmer_Id();
		Creation_of_NewAccount();
		addnew_Account_Titlename();
		enter_Customerid_InAccount_CustomerField(custid);
		click_on_AccntDropDwn();
		select_Current_OtnFrom_Dropdwn();
		enter_Intitial_DepostMoney(value);
		click_on_AccountSubmtBtn();
	}
	
	public void edition_Of_Account(String accid) throws InterruptedException 
	{
		get_AccountId();
		Thread.sleep(8);
		Edition_of_Account();
//		ExpliwaitUntilElementToBeClickable(driver, 3000, EditacntpageTitle);
		enter_Id_In_EditAccountField(accid);
		click_On_EditAccnt_SubmtBtn();
//		select_Current_OtnFrom_Dropdwn();
		click_On_EntryAccountFormPage_TypeOfAccount_DropDwn();
		select_SavingsOpt_From_AccountDropdwn();
		click_On_EditAccntEntry_SubmtBtn();
	
		
		
		
		
	}
}
