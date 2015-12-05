package com.github.sreepadbhagwat.aplos.appium.ios.elements;

import org.openqa.selenium.By;

import com.github.sreepadbhagwat.aplos.appium.AplosDriver;
import com.github.sreepadbhagwat.aplos.appium.ios.AplosElement;

public class IOSTextField implements com.github.sreepadbhagwat.aplos.api.TextField {

	public String getText(String identifier, String locator) {
		return AplosElement.element(identifier,locator).getText();
	}


	@Override
	public void setText(String identifier, String locator, String text) {
		System.out.println(text);
		//AplosElement.element(identifier,locator).sendKeys(text);
		AplosDriver.driver.findElement(By.xpath(locator)).sendKeys(text);
	}

}
