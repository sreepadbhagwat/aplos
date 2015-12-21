package com.github.sreepadbhagwat.aplos.appium.ios.elements;

import com.github.sreepadbhagwat.aplos.api.TextField;
import com.github.sreepadbhagwat.aplos.appium.AplosDriver;
import com.github.sreepadbhagwat.aplos.appium.ios.AplosElement;

public final class IOSTextField extends GenericElements  implements TextField {

	public IOSTextField(AplosDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	public final String getText(String identifier, String locator) {
		return null;
				//AplosElement.findelement(identifier,locator).getText();
	}


	@Override
	public final void setText(String identifier, String locator, String text) {
		//AplosElement.findelement(identifier,locator).sendKeys(text);
	}

}
