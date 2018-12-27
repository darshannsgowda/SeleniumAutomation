package com.guru99.deposit.withdraw.fundtransfer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99Deposit 
{
	WebDriver driver;
	
	@FindBy(xpath ="//p[contains(text(),'Amount Deposit Form')]")
	WebElement DepostPageTitle;
	
	@FindBy(xpath ="//input[@name=\"ammount\"]")
	WebElement AmntField ;
	
	@FindBy(xpath ="//input[@name=\"desc\"]")
	WebElement DescriptionField;
	
	@FindBy(xpath ="//input[@name=\"AccSubmit\"]")
	WebElement DepositSubmtBtn;
	
	
	public Guru99Deposit(WebDriver driver) {
		this.driver =  driver;
		PageFactory.initElements(driver, this);
		
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
	
	public void deposit_Amt_From_DepositPage(String amt, String desc) {
		enter_AmntInField(amt);
		enter_The_DescInField(desc);
		click_On_SubmtBtn_In_DepostPage();
	}
}



