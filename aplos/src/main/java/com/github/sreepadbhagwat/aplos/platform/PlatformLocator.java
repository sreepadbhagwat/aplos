package com.github.sreepadbhagwat.aplos.platform;


public class PlatformLocator {
	/*
	private static PlatformCache platformcache;
	
	 static {
	      platformcache = new PlatformCache();		
	   }
	*/
	public static Platform getPlatform(String toolName){
		/*Platform platform_in_cache = platformcache.getPlatform(toolName);
		
		if (platform_in_cache!=null){
			System.out.println("service is not equal to null");
			return platform_in_cache;
		}*/
		
		PlatformFactory platformfactory = new PlatformFactory();
		Platform platform = (Platform)platformfactory.getPlatformInstance(toolName);
		//platformcache.addPlatform(platform);
		return platform;
		
	}
}
