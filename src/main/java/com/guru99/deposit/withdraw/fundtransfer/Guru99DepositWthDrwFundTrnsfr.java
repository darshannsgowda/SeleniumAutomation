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
	
	@FindBy(css ="input[onkeyup=\"validateaccountno();\"]")
	WebElement WthAccontNumbrField;
	
	@FindBy(css = "input[name=\"ammount\"]")
	WebElement WithDrwAmountField ;
	
	@FindBy(css ="input[onkeyup=\"validatedesc();\"]")
	WebElement WithDrwDescField;
	
	@FindBy(css ="input[name=\"AccSubmit\"]")
	WebElement AmtWthDrwSubmtBtn;
	
	@FindBy(xpath="//tbody[1]/tr[6]/td[2]")
	WebElement WithDrwTransId;
	
	@FindBy(xpath ="//p[contains(text(),'Fund transfer')]")
	WebElement FundTrnsfrPageTitle;
	
	@FindBy(css ="input[name=\"payersaccount\"]")
	WebElement PayersAccnoField;
	
	@FindBy(css ="input[name=\"payeeaccount\"]")
	WebElement PayeesAccnoField;
	
	@FindBy(css ="input[name=\"ammount\"]")
	WebElement FundtrnsfrAmtField;
	
	@FindBy(css= "input[name=\"desc\"]")
	WebElement FundtrnsfrDescField;
	
	@FindBy(css = "input[name=\"AccSubmit\"]")
	WebElement FundtrnsfrSubmtBtn;
	
	@FindBy(xpath ="//p[contains(text(),'Fund Transfer Details')]")
	WebElement Fundtrnsfrdetails;
	
	
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
	
	public void enter_AccntNo_In_WthDrwFormPage(String accntid) {
		WthAccontNumbrField.sendKeys(accntid);
	}
	
	public void click_On_SubmtBtn_In_DepostPage() {
		DepositSubmtBtn.click();
	}
	
	public void enter_The_AmtValue_In_AmtWthDrwField(String amount) {
		AmntField.sendKeys(amount);
	}
	
	public void enter_The_DescIn_AmtWthDrwFrmPage(String descrp) {
		DescriptionField.sendKeys(descrp);
	}
	
	public void click_On_AmtWthDrw_SubmtBtn() {
		AmtWthDrwSubmtBtn.click();
	}
	
	public String get_Amt_transcId() 
	{
		String transcid = WithDrwTransId.getText();
		return transcid;
	}
	
	public void fundtransfr_PageTitle() {
		FundTrnsfrPageTitle.isDisplayed();
	}
	
	public void enter_The_PayersAccnbr(String accntnmbr) {
		PayersAccnoField.sendKeys(accntnmbr);
	}
	
	public void enter_The_PayeesAccntnumbr(String payeeacntno) {
		PayeesAccnoField.sendKeys(payeeacntno);
	}
	
	public void enter_the_AmtNeeds_To_Tranfr(String amtt) {
		FundtrnsfrAmtField.sendKeys(amtt);
	}
	
	public void enter_The_FundTranfsr_Desc(String desc) {
		FundtrnsfrDescField.sendKeys(desc);
	}
	
	public void click_On_Fundtransfr_SubmtBtn() {
		FundtrnsfrSubmtBtn.click();
	}
	
	public void fundtranfer_Details() {
		Fundtrnsfrdetails.isDisplayed();
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
	
	public void withdrw_Amt_From_AccountPage(String accntno, String amount, String descrp) {
//		get_AccountId();
		WithDraw();
		enter_AccntNo_In_WthDrwFormPage(accntno);
		enter_The_AmtValue_In_AmtWthDrwField(amount);
		enter_The_DescIn_AmtWthDrwFrmPage(descrp);
		click_On_AmtWthDrw_SubmtBtn();
		System.out.println("My transaction id is"+ get_Amt_transcId());
		
	}
	
	public void fundtranfer_Amt_From_PayeersToPayeesAccnt(String accntnmbr, String payeeacntno, String amtt, String desc)
	{
		Fund_Transfer();
		fundtransfr_PageTitle();
		enter_The_PayersAccnbr(accntnmbr);
		enter_The_PayeesAccntnumbr(payeeacntno);
		enter_the_AmtNeeds_To_Tranfr(amtt);
		enter_The_FundTranfsr_Desc(desc);
		click_On_Fundtransfr_SubmtBtn();
		fundtranfer_Details();
	}
	
	
	
	
}



