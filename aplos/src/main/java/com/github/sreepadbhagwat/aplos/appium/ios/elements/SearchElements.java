package com.github.sreepadbhagwat.aplos.appium.ios.elements;

import com.github.sreepadbhagwat.aplos.appium.AplosIOSDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.WebElement;

/**
 * Created by sreepadbhagwat on 1/9/16.
 */
public class SearchElements {
   // AplosIOSDriver driver;




    public WebElement findElementByName(String locator,AplosIOSDriver driver){
        System.out.println("inside findelementbyname");
        return driver.getDriver().findElementByName(locator);
    }

}
