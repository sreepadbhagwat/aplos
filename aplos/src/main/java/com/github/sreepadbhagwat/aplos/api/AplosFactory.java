package com.github.sreepadbhagwat.aplos.api;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public interface AplosFactory {

	IOSDriver<IOSElement> ios();
	
}
