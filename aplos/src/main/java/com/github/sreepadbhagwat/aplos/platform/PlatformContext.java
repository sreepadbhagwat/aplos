package com.github.sreepadbhagwat.aplos.platform;

public class PlatformContext {
	
	public Object lookup(String platform){
		if (platform.equalsIgnoreCase(PlatformConst.IOS.getValue()))
			return new AppiumIOSService();
		else if (platform.equalsIgnoreCase(PlatformConst.ANDROID.getValue()))
			return new AppiumAndService();	
		else
			return null;
	}

}
