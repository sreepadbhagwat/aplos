package com.github.sreepadbhagwat.aplos.platform;


public class PlatformLocator {
	private static PlatformCache platformcache;
	
	 static {
	      platformcache = new PlatformCache();		
	   }
	
	public static Platform getPlatform(String toolName){
		Platform platform_in_cache = platformcache.getPlatform(toolName);
		
		if (platform_in_cache!=null){
			System.out.println("service is not equal to null");
			return platform_in_cache;
		}
		
		System.out.println("creating new service");
		PlatformFactory platformfactory = new PlatformFactory();
		Platform platform = (Platform)platformfactory.getPlatformInstance(toolName);
		platformcache.addPlatform(platform);
		return platform;
		
	}

	
/*
	public static Service getService(String toolName){	
	
	System.out.println("1");
	InitialContext ic = new InitialContext();
	System.out.println("2");

	Service service=(Service) ic.lookup("Android");
	System.out.println("3");

	System.out.println(service.getName());
	System.out.println("4");
	System.out.println(service);
	if (service==null) {
		System.out.println("NULL ...........");
	}
	
	//AplosAppium obj=service.getServiceObject();
	return service;

	}
	*/
}
