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
	
	
	public Guru99Customer(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	public void Creation_of_new_customer() throws Exception{
		NewCustmer.click();
		Thread.sleep(5000);
		CustmerName.sendKeys("Johnson");
		Genderfmle.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		DOB.sendKeys("01-10-2017");
		Address.sendKeys("Please create myaccount");
		
		
	}
}
