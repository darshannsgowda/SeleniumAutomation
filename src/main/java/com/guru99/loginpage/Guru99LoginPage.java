package com.guru99.loginpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99LoginPage 
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
	
	public Guru99LoginPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
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
	public void Now_LoginToAccount(String userid, String pas) {
		
		Enter_UserId(userid);
		Enter_Password(pas);
		Click_On_Login_Button();
		WelocomePage_IsDisplayed();
		
		
		
	}
	
}


