package com.github.sreepadbhagwat.aplos.appium;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;

import java.util.HashMap;
import java.util.Map;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class Caps{
	
	ObjectMapper mapper = new ObjectMapper();;		
    Map<String,Object> capsDataMap = new HashMap<String,Object>();
    Map<String,Object> capreadDataMap = new HashMap<String,Object>();
    

    public Caps(){
    	try {
    		File a = new File("appium.json");
    		///aplos/src/main/java/com/github/sreepadbhagwat/aplos/appium/appium.json
    		capreadDataMap = mapper.readValue(a, Map.class);
    		} catch (JsonParseException e) {
    			e.printStackTrace();
    		} catch (JsonMappingException e) {
    			e.printStackTrace();
    		} catch (IOException e) {
    			e.printStackTrace();
    		}
    }

	public void addCAPS(String key, String value){
		capsDataMap.put(key,value);
	}

	public String readCAPS(String key){
		//capreadDataMap = mapper.readValue(new File("appium.json"), Map.class);
		return (String) capreadDataMap.get(key);
	}
	
	public void createAppiumJSON(){
		
		try {
			capsDataMap.put("PLATFORM_VERSION","9.0");
			capsDataMap.put("DEVICE_NAME","iPhone Simulator");
			capsDataMap.put("APP","/Users/sreepadbhagwat/sample_app/UIKitCatalog.app");
			capsDataMap.put("appiumVersion","1.4.13");
			mapper.writeValue(new File("appium.json"), capsDataMap);
		
	} catch (JsonGenerationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (JsonMappingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
	
}
	
}
