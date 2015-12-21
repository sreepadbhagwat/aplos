package com.github.sreepadbhagwat.aplos.appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.github.sreepadbhagwat.aplos.api.AplosAppium;
import com.github.sreepadbhagwat.aplos.api.AplosDriverI;
import com.github.sreepadbhagwat.aplos.api.Driver;
import com.github.sreepadbhagwat.aplos.appium.ios.AplosAppiumIOS;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class AplosDriver{
	public IOSDriver<IOSElement> driver = null;
	//public static Object driver = null;
	 DesiredCapabilities desiredcapabilities;
	 String stringplatform;
	 Caps caps = new Caps();

	 
	 
	
	
	
	public RemoteWebDriver Platform(){
		return ios(desiredcapabilities);		
	}
	
  public IOSDriver ios(DesiredCapabilities desiredCapabilities) {	
	try {
		driver = new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub"), desiredCapabilities);
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  return driver;
  }
  

  
  public DesiredCapabilities dc() {
		desiredcapabilities = new DesiredCapabilities();
		desiredcapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, caps.readCAPS("PLATFORM_VERSION"));
	    System.out.println(caps.readCAPS("PLATFORM_VERSION"));
	    desiredcapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone Simulator");
	    desiredcapabilities.setCapability(MobileCapabilityType.APP, "/Users/sreepadbhagwat/sample_app/UIKitCatalog.app");
	    desiredcapabilities.setCapability("appiumVersion", "1.4.13");
	    
	    return desiredcapabilities;	
	
}
 
  //public IOSDriver<IOSElement> getDriver
  
  public void startDriver(){	
		ios(dc());
		implicit_wait(30);
  }
  
  
  public void quitDriver() {
	  driver.quit();
	  
  }
  
  public IOSDriver<IOSElement> getDriver(){
	  return driver;
  }
	
  public void implicit_wait(int seconds){
		 driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}

}

