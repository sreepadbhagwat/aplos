package com.github.sreepadbhagwat.aplos.appium.ios;

import com.github.sreepadbhagwat.aplos.api.AplosAppium;
import com.github.sreepadbhagwat.aplos.api.AplosDriverI;
import com.github.sreepadbhagwat.aplos.api.IButton;
import com.github.sreepadbhagwat.aplos.api.Text;
import com.github.sreepadbhagwat.aplos.api.TextField;
import com.github.sreepadbhagwat.aplos.appium.AplosDriver;
import com.github.sreepadbhagwat.aplos.appium.ios.elements.GenericElements;
import com.github.sreepadbhagwat.aplos.appium.ios.elements.IOSButton;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class AplosAppiumIOS implements AplosAppium {

	private IButton button;
	private Text text;
	private TextField textfield;
	private AplosDriver aplosdriver;
	private GenericElements ge;

	public AplosAppiumIOS(){
		aplosdriver = new AplosDriver();	
		ge=new GenericElements(aplosdriver);
	    button=new IOSButton(aplosdriver);
	}
	
	public void createDriver(){
		
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
