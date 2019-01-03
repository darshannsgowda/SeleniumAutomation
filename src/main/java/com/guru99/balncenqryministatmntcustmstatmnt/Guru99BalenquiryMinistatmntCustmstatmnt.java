package com.guru99.balncenqryministatmntcustmstatmnt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import come.guru99.managerhomepage.Guru99ManagerHomePage;

public class Guru99BalenquiryMinistatmntCustmstatmnt extends Guru99ManagerHomePage
{
	WebDriver driver ;
	
	
	@FindBy(xpath = "//p[contains(text(),'Balance Enquiry Form')]")
	WebElement BalenquiryPageTitle;
	
	@FindBy(css = "input[name=\"accountno\"]")
	WebElement BalenquiryAccontnofield;
	
	@FindBy(css ="input[name=\"AccSubmit\"]")
	WebElement BalenquirySubmtBtn;
	
	@FindBy(xpath = "//p[contains(text(),'Mini Statement Form')]")
	WebElement MiniStatmntPageTitle;
	
	@FindBy(css ="input[name=\"accountno\"]")
	WebElement MiniStatAccntNumbrField;
	
	@FindBy(css ="input[name=\"AccSubmit\"]")
	WebElement MiniStatmntSubmtBtn;
	
	
	
	public  Guru99BalenquiryMinistatmntCustmstatmnt (WebDriver driver) {
		super(driver);
	}
	
	public void balance_Enquiry_FormPage_Title() {
		BalenquiryPageTitle.isDisplayed();
	}
	
	public void enter_The_Accntno_In_Balenquiry_AccntnoField(String acntno) {
		BalenquiryAccontnofield.sendKeys(acntno);
	}
	
	public void click_On_SubmitBtn_In_BalEnqFormPage() {
		BalenquirySubmtBtn.click();
	}
	
	public void ministatmnt_PageTitle() {
		MiniStatmntPageTitle.isDisplayed();
	}
	
	public void enter_The_AccntNo_in_MiniStatAccntnofield(String accntnoo) {
		MiniStatAccntNumbrField.sendKeys(accntnoo);
	}
	
	public void click_On_MiniStatmntSubmtBtn() {
		MiniStatmntSubmtBtn.click();
	}
	
	public void checking_The_BalFormPage(String acntno) {
		Bal_Enquiry();
		balance_Enquiry_FormPage_Title();
		enter_The_Accntno_In_Balenquiry_AccntnoField(acntno);
		click_On_SubmitBtn_In_BalEnqFormPage();
	}
	
	public void ministatmnt_From_Accnt(String acntno) {
		Mini_StateMent();
		ministatmnt_PageTitle();
		enter_The_Accntno_In_Balenquiry_AccntnoField(acntno);
		click_On_MiniStatmntSubmtBtn();
		
	}
	
	
	
	
}



