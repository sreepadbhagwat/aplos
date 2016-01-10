package com.github.sreepadbhagwat.aplos.platform;

import com.github.sreepadbhagwat.aplos.api.AplosAppium;

public class AplosDriverPlatform {
	
	public static AplosAppium loadPlatform(String platformName){

		/*
		1. Set the platform name
		2. load the driver instance
		3. get the service and pass the driver
		 */

		PlatformFactory platformfactory = new PlatformFactory();
		
		Platform platform = (Platform)platformfactory.getPlatformInstance(platformName);
		AplosAppium aplosappium=platform.getPlatform();
		
		return aplosappium;
	}

}
