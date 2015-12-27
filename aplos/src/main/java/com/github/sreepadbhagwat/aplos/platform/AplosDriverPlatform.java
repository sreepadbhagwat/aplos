package com.github.sreepadbhagwat.aplos.platform;

import com.github.sreepadbhagwat.aplos.api.AplosAppium;

public class AplosDriverPlatform {
	
	public static AplosAppium loadPlatform(String platformName){
		//Platform platform= PlatformLocator.getPlatform(platformName);
		//AplosAppium aplosappium=platform.getPlatform();
		//PlatformFactory platform=new PlatformFactory();
		//AplosAppium aplosappium = (Platform)platform.getPlatformInstance(platformName);
		PlatformFactory platformfactory = new PlatformFactory();
		Platform platform = (Platform)platformfactory.getPlatformInstance(platformName);
		AplosAppium aplosappium=platform.getPlatform();
		
		return aplosappium;
	}

}
