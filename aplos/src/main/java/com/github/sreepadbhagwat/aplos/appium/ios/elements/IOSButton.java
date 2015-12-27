package com.github.sreepadbhagwat.aplos.appium.ios.elements;




import com.github.sreepadbhagwat.aplos.api.IButton;
import com.github.sreepadbhagwat.aplos.appium.AplosIOSDriver;
import com.github.sreepadbhagwat.aplos.appium.ios.AplosElement;


public class IOSButton extends GenericElements implements IButton {

	public IOSButton(AplosIOSDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void click(String identifier, String locator) {
		findElementByName(locator).click();
		}
	
}
