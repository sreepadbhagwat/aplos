package com.github.sreepadbhagwat.aplos.platform;

import com.github.sreepadbhagwat.aplos.api.AplosAppium;
import com.github.sreepadbhagwat.aplos.appium.ios.AplosAppiumIOS;


@SuppressWarnings("hiding")
public class AppiumIOSService<AplosAppium> implements Platform{

	
	public AppiumIOSService(){
		
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		System.out.println("getname inside appium service");
		return "IOS";
	}


	
	@Override
	public com.github.sreepadbhagwat.aplos.api.AplosAppium getPlatform() {
		// TODO Auto-generated method stub
		AplosAppium iosPlatform = (AplosAppium) new AplosAppiumIOS();
		return (com.github.sreepadbhagwat.aplos.api.AplosAppium) iosPlatform;
	}

}
