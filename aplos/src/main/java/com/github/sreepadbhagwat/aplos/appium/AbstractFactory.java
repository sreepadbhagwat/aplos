package com.github.sreepadbhagwat.aplos.appium;

import org.openqa.selenium.remote.RemoteWebDriver;

public abstract class AbstractFactory {

	abstract RemoteWebDriver getDriverType(String platformtype);
		
	
}
