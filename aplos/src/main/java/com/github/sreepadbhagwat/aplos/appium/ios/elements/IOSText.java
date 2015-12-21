package com.github.sreepadbhagwat.aplos.appium.ios.elements;

import com.github.sreepadbhagwat.aplos.api.Text;
import com.github.sreepadbhagwat.aplos.appium.AplosDriver;
import com.github.sreepadbhagwat.aplos.appium.ios.AplosElement;

public class IOSText extends GenericElements implements Text {
	
	public IOSText(AplosDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public AplosElement aploselement = new AplosElement();

	public String getText(String identifier, String locator) {
		return findElementByName(locator).getText();
	}
	
	public void click(String identifier, String locator) {
		//AplosElement.findelement(identifier,locator).click();
	}

}
