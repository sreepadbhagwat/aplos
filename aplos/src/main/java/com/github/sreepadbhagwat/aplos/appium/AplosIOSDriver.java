package com.github.sreepadbhagwat.aplos.appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class AplosIOSDriver {
	
	


	private IOSDriver<IOSElement> driver = null;
	public SampleDriver iosdriver=null;
	//public static Object driver = null;
	 DesiredCapabilities desiredCapabilities;
	 String stringplatform;
	 Caps caps = new Caps();
	
	/*
	
	public IOSDriver driver(){
		return ios(desiredcapabilities);		
	}
	*/
	

  public IOSDriver ios(DesiredCapabilities desiredCapabilities) {	
	try {
		//driver = new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub"), desiredCapabilities);
		iosdriver = new SampleDriver(new URL("http://0.0.0.0:4723/wd/hub"), desiredCapabilities);
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  return iosdriver;
  }
  

  public DesiredCapabilities dc() {
		 desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, caps.readCAPS("PLATFORM_VERSION"));
	    System.out.println(caps.readCAPS("PLATFORM_VERSION"));
	    desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone Simulator");
	    desiredCapabilities.setCapability(MobileCapabilityType.APP, "/Users/sreepadbhagwat/sample_app/UIKitCatalog.app");
	    desiredCapabilities.setCapability("appiumVersion", "1.4.13");
	    
	    return desiredCapabilities;	
	
}
 
 
  //public IOSDriver<IOSElement> getDriver
 
  public void startDriver(){	
		ios(dc());
		implicit_wait(30);
  }
  
  
  public void quitDriver() {
	  iosdriver.quit();
	  
  }
  
  public IOSDriver<IOSElement> getDriver(){
	  return iosdriver;
  }
	
  public void implicit_wait(int seconds){
		 iosdriver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}

  
	

}

