package com.github.sreepadbhagwat.aplos.appium.ios;

import java.sql.Timestamp;

import io.appium.java_client.ios.IOSElement;

public class AplosElement {
	
	
	public static IOSElement element(String identifier, String locator) {
		IOSElement element=null;
		

		switch (identifier) {
		case "Name": 						

			 element = AplosAppiumIOS.getDriver().findElementByName(locator);


			 break;
		case "Id": 						
			 element = AplosAppiumIOS.getDriver().findElementById(locator);
			 break;	 
		case "XPath": 						
			 element = AplosAppiumIOS.getDriver().findElementByXPath(locator);
			 break;	 
		}	
		
	
		return element;
	}

}
