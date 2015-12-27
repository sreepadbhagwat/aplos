package com.github.sreepadbhagwat.aplos.appium.ios;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.github.sreepadbhagwat.aplos.api.AplosAppium;
import com.github.sreepadbhagwat.aplos.api.IButton;
import com.github.sreepadbhagwat.aplos.api.Text;
import com.github.sreepadbhagwat.aplos.api.TextField;
import com.github.sreepadbhagwat.aplos.appium.AplosIOSDriver;
import com.github.sreepadbhagwat.aplos.appium.Caps;
import com.github.sreepadbhagwat.aplos.appium.ios.elements.GenericElements;
import com.github.sreepadbhagwat.aplos.appium.ios.elements.IOSButton;

import io.appium.java_client.remote.MobileCapabilityType;



public class AplosAppiumIOS implements AplosAppium {

	private IButton button;
	private Text text;
	private TextField textfield;
	private AplosIOSDriver aplosdriver;
	private GenericElements ge;
	DesiredCapabilities desiredCapabilities;
	
	public AplosAppiumIOS(){
		
			aplosdriver = new AplosIOSDriver();
	
		ge=new GenericElements(aplosdriver);
	    button=new IOSButton(aplosdriver);
	}
	
	
	public void startDriver(){
		aplosdriver.startDriver();
	}

	public void quitDriver(){
		aplosdriver.quitDriver();
	}
	
	
	
	public IButton button() {
		return button;	
	}
	
	public Text text() {
		return text;
	}

	public TextField textfield() {		
		return textfield;
	}
	
	
	
	
	
}
