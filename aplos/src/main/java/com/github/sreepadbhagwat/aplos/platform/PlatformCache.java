package com.github.sreepadbhagwat.aplos.platform;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlatformCache {
	
		private Map <String, Platform> map ; 
		
		  public PlatformCache(){
			  System.out.println("Creating new platform cache");
		      map= new HashMap();
		   }
		
		public Platform getPlatform(String platformName){
			
		Platform platform = map.get(platformName);
			if (platform==null){
				return platform;
			}
		
			return null;
		}
	
		public void addPlatform(Platform newPlatform){
		     
				boolean exists = false;
				Platform platform = map.get(newPlatform.getName());
				if (platform==null){
					map.put(newPlatform.getName(), newPlatform);
					 System.out.println("Register the platform :" +newPlatform.getName());
				} else {
					 System.out.println("Platform already registered :" +newPlatform.getName());

				}
		      
		      
		         
		         
		        
		      
		}
		
}
