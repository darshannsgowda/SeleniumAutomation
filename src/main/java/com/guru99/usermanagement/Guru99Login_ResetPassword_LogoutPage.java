package com.guru99.usermanagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import come.guru99.managerhomepage.Guru99ManagerHomePage;

public class Guru99Login_ResetPassword_LogoutPage extends Guru99ManagerHomePage
{
	WebDriver driver;
	@FindBy(xpath = "//input[@type=\"text\"]")
	WebElement UserId;
	
	@FindBy(xpath = "//input[@type=\"password\"]")
	WebElement Password;
	
	@FindBy(xpath = "//input[@name=\"btnLogin\"]")
	WebElement LoginBtn;
	
	@FindBy(xpath ="//marquee[@class=\"heading3\"]")
	WebElement WelcomePage;
	
	@FindBy(xpath ="//a[@href=\"Logout.php\"]")
	WebElement LogoutfromGuru99;
	
	@FindBy(xpath ="//input[@name=\"btnReset\"]")
	WebElement ResetBtn;
	
	@FindBy(xpath ="//a[@href = \"http://demo.guru99.com/\"]")
	WebElement GenerateNwAct;
	
	@FindBy(xpath = "//p[contains(text(),\"Change Password\")]")
	WebElement ResetPasswrdPgetitle;
	
	@FindBy(css = "input[name=\"oldpassword\"]")
	WebElement OldPasswordField;
	
	@FindBy(css ="input[name=\"newpassword\"]")
	WebElement NewPasswordField;
	
	@FindBy(css ="input[name=\"confirmpassword\"]")
	WebElement ConfrmPassField;
	
	@FindBy(css = "input[value=\"Submit\"]")
	WebElement ChangePasswrdPageSubmtBtn;
	
	
	public Guru99Login_ResetPassword_LogoutPage(WebDriver driver) 
	{
		super(driver);
	}
	
	public void Enter_UserId(String userid) {
		UserId.sendKeys(userid);
	}
	
	public void Enter_Password(String pas) {
		Password.sendKeys(pas);
	}
	
	public void Click_On_Login_Button() {
		LoginBtn.click();
	}
	
	public void WelocomePage_IsDisplayed() {
		WelcomePage.isDisplayed();
	}
	

	public void reset_Passwrd_PageTitle() {
		ResetPasswrdPgetitle.isDisplayed();
	}
	
	public void enter_The_OldPasswrd(String oldpass) {
		OldPasswordField.sendKeys(oldpass);
	}
	
	public void enter_The_NewPasswrd(String newpass) {
		NewPasswordField.sendKeys(newpass);
	}
	
	public void confirm_The_EnterdPasswrd(String cnfrmpass) {
		ConfrmPassField.sendKeys(cnfrmpass);
	}
	
	public void click_On_ResetPasswrd_SubmtBtn() {
		ChangePasswrdPageSubmtBtn.click();
	}
	public void Now_LoginToAccount(String userid, String pas) {
		
		Enter_UserId(userid);
		Enter_Password(pas);
		Click_On_Login_Button();
		WelocomePage_IsDisplayed();
		
	}
	
	public void reset_Existing_AccountPasswrd(String oldpass, String newpass,String cnfrmpass ) {
		Change_Password();
		reset_Passwrd_PageTitle();
		enter_The_OldPasswrd(oldpass);
		enter_The_NewPasswrd(newpass);
		confirm_The_EnterdPasswrd(cnfrmpass);
		click_On_ResetPasswrd_SubmtBtn();
		
		
	}
	
	
}


