package com.github.sreepadbhagwat.aplos.platform;

import com.github.sreepadbhagwat.aplos.api.AplosAppium;

public class AplosDriverPlatform {
	
	public static AplosAppium loadPlatform(String platformName){
		Platform platform= PlatformLocator.getPlatform(platformName);
		AplosAppium aplosappium=platform.getPlatform();
		return aplosappium;
	}

}
