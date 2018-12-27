package com.guru99.deposit.withdraw.fundtransfer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import come.guru99.managerhomepage.Guru99ManagerHomePage;

public class Guru99DepositWthDrwFundTrnsfr extends Guru99ManagerHomePage
{
	WebDriver driver;
	
	@FindBy(xpath ="//p[contains(text(),'Amount Deposit Form')]")
	WebElement DepostPageTitle;
	
	@FindBy(xpath ="//input[@name=\"accountno\"]")
	WebElement DepostPageAccntNofield;
	
	@FindBy(xpath ="//input[@name=\"ammount\"]")
	WebElement AmntField ;
	
	@FindBy(xpath ="//input[@name=\"desc\"]")
	WebElement DescriptionField;
	
	@FindBy(xpath ="//input[@name=\"AccSubmit\"]")
	WebElement DepositSubmtBtn;
	
	@FindBy(xpath ="//p[contains(text(),'Amount Withdrawal Form')]")
	WebElement WithDrwPageTitle;
	
	@FindBy(css = "input[name=\"ammount\"]")
	WebElement WithDrwAmountField ;
	
	@FindBy(css ="input[onkeyup=\"validatedesc();\"]")
	WebElement WithDrwDescField;
	
	@FindBy(css ="input[name=\"AccSubmit\"]")
	WebElement AmtWthDrwSubmtBtn;
	
	
	public Guru99DepositWthDrwFundTrnsfr(WebDriver driver) {
		super(driver);
		
	}
	
	public void depositPage_Title() {
		DepostPageTitle.isDisplayed();
	}
	public void depostPage_AccnumbrField(String acno) {
		DepostPageAccntNofield.sendKeys(acno);
	}
	
	public void enter_AmntInField(String amt) {
		AmntField.sendKeys(amt);
	}
	
	public void enter_The_DescInField(String desc) {
		DescriptionField.sendKeys(desc);
	}
	
	public void click_On_SubmtBtn_In_DepostPage() {
		DepositSubmtBtn.click();
	}
	
	public void deposit_Amt_From_DepositPage(String acno, String amt, String desc) {
		
		get_AccountId();
		Deposit();
//		depositPage_Title();
		depostPage_AccnumbrField(acno);
		enter_AmntInField(amt);
		enter_The_DescInField(desc);
		click_On_SubmtBtn_In_DepostPage();
	}
}



