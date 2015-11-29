package com.github.sreepadbhagwat.aplos.appium.ios;



import com.github.sreepadbhagwat.aplos.api.AplosAppium;
import com.github.sreepadbhagwat.aplos.api.Button;
import com.github.sreepadbhagwat.aplos.api.Text;
import com.github.sreepadbhagwat.aplos.api.TextField;
import com.github.sreepadbhagwat.aplos.appium.Caps;
import com.github.sreepadbhagwat.aplos.appium.ios.elements.IOSButton;
import com.github.sreepadbhagwat.aplos.appium.AplosDriver;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class AplosAppiumIOS implements AplosAppium {

	Caps caps = new Caps();
	Button button;
	Text text;
	TextField textfield;
	static AplosDriver ad;
	
public AplosAppiumIOS(){
	ad = new AplosDriver();	
}
	
public static IOSDriver<IOSElement> getDriver() {
	return ad.getDriver();
}

public void startDriver(){
	ad.startDriver();
}

public void quitDriver(){
	ad.quitDriver();
}
	public Button button() {
		button = new IOSButton(); 
		return button;	
	}
	
	public Text text() {
		return text;
	}

	public TextField textfield() {		
		return textfield;
	}

	
	

	

}
