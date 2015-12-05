package com.github.sreepadbhagwat.aplos.appium.ios.elements;



import java.sql.Timestamp;

import com.github.sreepadbhagwat.aplos.api.Button;
import com.github.sreepadbhagwat.aplos.appium.AplosDriver;
import com.github.sreepadbhagwat.aplos.appium.ios.AplosElement;


public class  IOSButton implements Button {

    //AplosElement aploselement = new AplosElement();
	
/*
	public void click1(String identifier, String locator) {
		double start = java.util.Calendar.getInstance().getTimeInMillis();

		//AplosElement.element(identifier,locator).tap(1, 1);
		 AplosDriver.driver.findElementByName(locator).tap(1, 1);
		double end = java.util.Calendar.getInstance().getTimeInMillis();
	    System.out.println("it took this long to complete click inside button: " + (end - start)/1000 + "ms");
	    System.out.println("it took this long to complete click inside button diff after finding element: " + (end - AplosElement.end)/1000 + "ms");

	}*/

	public void click(String identifier, String locator) {
		
		AplosElement.element(identifier,locator).click();
		
	}
	
}
