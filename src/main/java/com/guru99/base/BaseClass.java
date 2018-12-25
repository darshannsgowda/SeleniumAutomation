package com.guru99.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
	@FindBy(xpath="//tbody[1]/tr[4]/td[2]")
	protected
	WebElement GetCustomerIdText;
	
	
	
	public void ExpliwaitUntilElementToBeClickable(WebDriver driver, long time, WebElement element) {

		new WebDriverWait(driver, time).until(ExpectedConditions.elementToBeClickable(element));
	}

	public void ExpliwaitUntilVisibilityofElementLocated(WebDriver driver, long time, WebElement element) {

		new WebDriverWait(driver, time).until(ExpectedConditions.invisibilityOfElementLocated((By) element));
	
	}
	
	public String Get_Created_Custmer_Id() {
		String CustId =  GetCustomerIdText.getText();
		return CustId;
	}
	
}
