package com.github.sreepadbhagwat.aplos.appium.ios.elements;

import com.github.sreepadbhagwat.aplos.appium.ios.AplosElement;

public class IOSElements {
	public AplosElement aploselement = new AplosElement();
	  static int count = 0;

	  public IOSElements(){
		  count++;
	  }
	  
	  public int getCount(){
		  return count;
	  }
	

}
