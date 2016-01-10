package com.github.sreepadbhagwat.aplos.platform;


import com.github.sreepadbhagwat.aplos.com.github.sreepadbhagwat.aplos.newdriver.DriverUtility;
import io.appium.java_client.ios.IOSDriver;

public class PlatformFactory {
	
	public Platform getPlatformInstance(String platform){
		//System.out.println("Inside platform factory");
		//System.out.println(platform);
		//System.out.println(PlatformConst.IOS.getValue());
		
		if (platform.equalsIgnoreCase(PlatformConst.IOS.getValue())){
			//
			//DriverUtility iosutility = new DriverUtility();
			//iosutility.getiosdriver();

			//System.out.println("factory inside ios");
			return  new AppiumIOSService();
		}
		else if (platform.equalsIgnoreCase(PlatformConst.ANDROID.getValue()))
			return  new AppiumAndService();	
		else
			return null;
	}
	
	
	

}
