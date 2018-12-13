package com.guru99.editcustomer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99EditCustomer 

{
	WebDriver driver;
	
	@FindBy(xpath ="(//tr/td)[6]")
	WebElement CustomerId;
	
	@FindBy(xpath = "//a[@href=\"EditCustomer.php\"]")
	WebElement EdtCustmer;
	
	@FindBy(css ="input[name='AccSubmit']")
	WebElement SbmtBtn;
	
	public Guru99EditCustomer(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Edit_Customer_Using_Id() throws InterruptedException {
		String value = CustomerId.getText();
		Thread.sleep(4000);
		EdtCustmer.click();
		Thread.sleep(4000);
		EdtCustmer.sendKeys(value);
		SbmtBtn.click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	}
}
