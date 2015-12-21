package com.github.sreepadbhagwat.aplos.platform;


public class PlatformLocator {
	private static PlatformCache platformcache;
	
	 static {
	      platformcache = new PlatformCache();		
	   }
	
	public static Platform getService(String toolName){
		Platform service = platformcache.getPlatform(toolName);
		
		if (service!=null){
			return service;
		}
		
		PlatformContext context = new PlatformContext();
		Platform service1 = (Platform)context.lookup(toolName);
		return service1;
		
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
