package com.github.sreepadbhagwat.aplos.platform;

import com.github.sreepadbhagwat.aplos.api.AplosAppium;

public class AplosDriverPlatform {
	
	public static AplosAppium loadPlatform(String platformName){
		Platform service= PlatformLocator.getService(platformName);
		AplosAppium obj=service.getPlatform();
		return obj;
	}

}
