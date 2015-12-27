package com.github.sreepadbhagwat.aplos.appium.ios.elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

import com.github.sreepadbhagwat.aplos.api.AplosDriverI;
import com.github.sreepadbhagwat.aplos.api.Driver;
import com.github.sreepadbhagwat.aplos.appium.AplosIOSDriver;
//import com.github.sreepadbhagwat.aplos.appium.CDriver;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class GenericElements {

  AplosIOSDriver driver;

	public GenericElements(AplosIOSDriver driver){
		this.driver=driver;		
	}
	
	public IOSDriver<IOSElement> getDriver() {
		// TODO Auto-generated method stub
		return driver.getDriver();
	}
	
	public WebElement findElementByName(String locator){
		return getDriver().findElementByName(locator);	
	}
	
	

}
