package com.github.sreepadbhagwat.aplos.platform;

public enum PlatformConst {
	IOS("IOS"),
	ANDROID("Android"),
	WEB("Web");
	
	private String platform;
	private PlatformConst(String platform){
		this.platform=platform;
	}
	
	public String getValue(){
		return this.platform;
	}
// use Sample[] sample = sample.values() to get this in an array
}


