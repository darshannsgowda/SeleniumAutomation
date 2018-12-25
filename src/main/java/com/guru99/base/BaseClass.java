package com.guru99.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.guru99.customer.Guru99Customer;

public class BaseClass {
	
	Guru99Customer customerr;
	
	public void ExpliwaitUntilElementToBeClickable(WebDriver driver, long time, WebElement element) {

		new WebDriverWait(driver, time).until(ExpectedConditions.elementToBeClickable(element));
	}

	public void ExpliwaitUntilVisibilityofElementLocated(WebDriver driver, long time, WebElement element) {

		new WebDriverWait(driver, time).until(ExpectedConditions.invisibilityOfElementLocated((By) element));
	
	}
	
	
}
