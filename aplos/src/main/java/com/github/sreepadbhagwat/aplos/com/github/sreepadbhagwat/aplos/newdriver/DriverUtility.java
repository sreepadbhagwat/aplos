package com.github.sreepadbhagwat.aplos.com.github.sreepadbhagwat.aplos.newdriver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.Capabilities;

/**
 * Created by sreepadbhagwat on 12/29/15.
 */
public class DriverUtility {
    Capabilities capabilities=null;

    public IOSDriver getiosdriver(){
        return new IOSDriver<IOSElement>(capabilities);
    }

    public AndroidDriver getandroiddriver(){
        return new AndroidDriver(capabilities);
    }
}
