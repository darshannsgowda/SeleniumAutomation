package com.guru99.account;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.guru99.customer.Guru99Customer;

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
	
	@FindBy(xpath= "//input[@name=\"inideposit\"]")
	WebElement IntialDepost ;

	@FindBy(xpath= "//input[@name=\"button2\"]")
	WebElement NewAccSubmtBtn;
	

	
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
	
	
	
	public void creation_of_Newaccount(String custid, String value) {
		Get_Created_Custmer_Id();
		addnew_Account_Titlename();
		enter_Customerid_InAccount_CustomerField(custid);
		click_on_AccntDropDwn();
		select_Current_OtnFrom_Dropdwn();
		enter_Intitial_DepostMoney(value);
		click_on_AccountSubmtBtn();
	}
}
