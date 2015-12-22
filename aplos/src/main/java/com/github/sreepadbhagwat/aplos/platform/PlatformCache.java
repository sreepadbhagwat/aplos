package com.github.sreepadbhagwat.aplos.platform;

import java.util.ArrayList;
import java.util.List;

public class PlatformCache {
	
		private List<Platform> platforms;
		
		  public PlatformCache(){
			  System.out.println("Creating new platform cache");
		      platforms = new ArrayList<Platform>();
		   }
		
		public Platform getPlatform(String platformName){
			
			for (Platform platform:platforms) {

				if (platform.getName().equalsIgnoreCase(platformName)){
					return platform;
				}
			}
			return null;
		}
	
		public void addPlatform(Platform newPlatform){
		      boolean exists = false;
		      
		      for (Platform platform : platforms) {
		         if(platform.getName().equalsIgnoreCase(newPlatform.getName())){
		            exists = true;
		         }
		      }
		      if(!exists){
		         platforms.add(newPlatform);
		         System.out.println("Register the platform :" +newPlatform.getName());
		      }
		}
		
}
