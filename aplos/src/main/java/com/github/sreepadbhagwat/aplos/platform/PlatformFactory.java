package com.github.sreepadbhagwat.aplos.platform;

import com.github.sreepadbhagwat.aplos.api.AplosAppium;

public class PlatformFactory {
	
	public Platform getPlatformInstance(String platform){
		if (platform.equalsIgnoreCase(PlatformConst.IOS.getValue()))
			return  new AppiumIOSService();
		else if (platform.equalsIgnoreCase(PlatformConst.ANDROID.getValue()))
			return  new AppiumAndService();	
		else
			return null;
	}

}
