package com.guru99.newcustomer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99Customer

{
	WebDriver driver;
	

	
	@FindBy(xpath = "//a[@href =\"addcustomerpage.php\"]")
	WebElement NewCustmer;
	
	@FindBy(xpath ="//input[@name=\"name\"]")
	WebElement CustmerName;
	
	@FindBy(xpath ="((//input[@name=\"rad1\"]))[2]")
	WebElement Genderfmle;
	
	//Telerik date time picker below
	@FindBy(id = "dob")
	WebElement DOB;
	
	@FindBy(tagName = "textarea")
	WebElement Address;
	
	@FindBy(xpath ="//input[@name=\"city\"]")
	WebElement City;
	
	@FindBy(xpath ="//input[@name=\"state\"]")
	WebElement State;
	
	@FindBy(xpath ="//input[@name=\"pinno\"]")
	WebElement PinNmber;
	
	@FindBy(xpath ="//input[@name=\"telephoneno\"]")
	WebElement PhneNmber;
	
	@FindBy(xpath ="//input[@name=\"emailid\"]")
	WebElement Eml;
	
	@FindBy(xpath ="//input[@name=\"password\"]")
	WebElement Pwd;
	
	@FindBy(xpath ="//input[@value=\"Submit\"]")
	WebElement SubmtBtn;
	
	@FindBy(xpath ="(//a[@href=\"Managerhomepage.php\"])[2]")
	WebElement AftrAccntCrtn;
	
	public Guru99Customer(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	public void Creation_of_new_customer() throws Exception{
		NewCustmer.click();
		Thread.sleep(5000);
		CustmerName.sendKeys("Simmmya");
		Genderfmle.click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		DOB.sendKeys("24-11-2002");
		Address.sendKeys("Dad mm myaccount");
		City.sendKeys("Washington AC");
		State.sendKeys("USA");
		PinNmber.sendKeys("784432");
		PhneNmber.sendKeys("9898838388");
		Eml.sendKeys("Samprr@votercircle.in");
		Pwd.sendKeys("V3d1122");
		SubmtBtn.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		AftrAccntCrtn.click();
		
		
		
	}
}
