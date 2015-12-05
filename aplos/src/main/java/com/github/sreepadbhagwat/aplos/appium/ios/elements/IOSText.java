package com.github.sreepadbhagwat.aplos.appium.ios.elements;

import com.github.sreepadbhagwat.aplos.appium.ios.AplosElement;

public class IOSText implements com.github.sreepadbhagwat.aplos.api.Text {
	public AplosElement aploselement = new AplosElement();

	public String getText(String identifier, String locator) {
		return AplosElement.element(identifier,locator).getText();
	}
	
	public void click(String identifier, String locator) {
		AplosElement.element(identifier,locator).tap(1, 1);
	}

}
