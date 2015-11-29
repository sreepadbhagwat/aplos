package com.github.sreepadbhagwat.aplos.appium.ios.elements;



import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import com.github.sreepadbhagwat.aplos.api.Button;
import com.github.sreepadbhagwat.aplos.appium.ios.AplosAppiumIOS;

public class  IOSButton implements Button {

	
	private IOSElement element(String identifier, String locator) {
		IOSElement element=null;
		
		switch (identifier) {
		case "Name": 						
			 element = AplosAppiumIOS.getDriver().findElementByName(locator);
			 break;
		}	
		return element;
	}


	public void  click(String identifier, String locator) {
		element(identifier,locator).tap(1, 1);
	}

}
