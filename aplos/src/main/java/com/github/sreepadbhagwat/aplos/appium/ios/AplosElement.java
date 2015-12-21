package com.github.sreepadbhagwat.aplos.appium.ios;

import java.sql.Timestamp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class AplosElement {
	
/*	
	public static IOSElement findelement(String identifier, String locator) {
		System.out.println("1");

		IOSElement element=(IOSElement) getElement(identifier,locator);
		return element;
	}
	
	// abstrackt factory pattern accepts identifier
	// returns an object
	
	public static IOSElement getElement(String identifier, String locator){
		IOSElement object = null;
		switch (identifier) {
		case "Name": 						
			object = getDriver().findElementByName(locator);
			break;
		case "Id": 						
			object = getDriver().findElementById(locator);
			 break;	 
		case "XPath": 						
			object = getDriver().findElementByXPath(locator);
			 break;	 
		default: 
			System.out.println("2");
			object = getDriver().findElement(By.xpath(locator));
			System.out.println("3");
			break;
		}
		return object;	
		
	}
	
	private static IOSDriver<IOSElement> getDriver(){
		return AplosAppiumIOS.getDriver();
	}
	
	*/

}
