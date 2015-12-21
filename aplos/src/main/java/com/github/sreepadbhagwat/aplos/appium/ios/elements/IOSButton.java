package com.github.sreepadbhagwat.aplos.appium.ios.elements;




import com.github.sreepadbhagwat.aplos.api.IButton;
import com.github.sreepadbhagwat.aplos.appium.AplosDriver;
import com.github.sreepadbhagwat.aplos.appium.ios.AplosElement;


public class IOSButton extends GenericElements implements IButton {

	public IOSButton(AplosDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void click(String identifier, String locator) {
		findElementByName(locator).click();
		}
	
}
