package com.github.sreepadbhagwat.aplos.com.github.sreepadbhagwat.aplos.newdriver;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * Created by sreepadbhagwat on 12/29/15.
 */
public class DriverFactory implements newdriver {
    String platformName;
    IOSDriver iosDriver;

    public DriverFactory(String platformName){
        this.platformName=platformName;
    }


    @Override
    public RemoteWebDriver getDriver() {
        return iosDriver;
    }


}

