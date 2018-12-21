package com.guru99.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
	public void ExpliwaitUntilElementToBeClickable(WebDriver driver, long time, WebElement element) {

		new WebDriverWait(driver, time).until(ExpectedConditions.elementToBeClickable(element));
	}

//	public void ExpliwaitUntilTextToBePresentInElement(WebDriver driver, long time, WebElement element) {
//		new WebDriverWait(driver, time).until(ExpectedConditions.textToBePresentInElement(element, null));
//	}
//	
	
	
	
}
