package com.guru99.newcustomer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import come.guru99.homepage.Guru99HomePage;

public class Guru99Customer extends Guru99HomePage

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
	WebElement Email;
	
	@FindBy(xpath ="//input[@name=\"password\"]")
	WebElement Pwd;
	
	@FindBy(xpath ="//input[@value=\"Submit\"]")
	WebElement SubmtBtn;
	
	@FindBy(xpath ="(//a[@href=\"Managerhomepage.php\"])[2]")
	WebElement AftrAccntCrtn;
	
	public Guru99Customer(WebDriver driver) {
		super(driver);
		
	}

	public void Creation_of_new_customer(String name, String date, String address, String city, String state, String pin, String phone, String Eml, String pwdd) throws Exception{
		NewCustmer.click();
		Thread.sleep(5000);
		CustmerName.sendKeys(name);
		Genderfmle.click();
		Thread.sleep(4000);
		DOB.sendKeys(date);
		Address.sendKeys(address);
		City.sendKeys(city);
		State.sendKeys(state);
		PinNmber.sendKeys(pin);
		PhneNmber.sendKeys(phone);
		Email.sendKeys(Eml);
		Pwd.sendKeys(pwdd);
		SubmtBtn.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		AftrAccntCrtn.click();
		
		
		
	}
}
