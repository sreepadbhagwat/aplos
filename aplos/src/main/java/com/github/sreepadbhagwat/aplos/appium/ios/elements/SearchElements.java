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

    public WebElement findElementById(String locator,AplosIOSDriver driver){
        return driver.getDriver().findElementById(locator);
    }

    public WebElement findElementByXPath(String locator,AplosIOSDriver driver){
        return driver.getDriver().findElementByXPath(locator);
    }

    public WebElement findElementByTagName(String locator,AplosIOSDriver driver){
        return driver.getDriver().findElementByTagName(locator);
    }

    public WebElement findElementByAccessibilityId(String locator,AplosIOSDriver driver){
        return driver.getDriver().findElementByAccessibilityId(locator);
    }


    public WebElement findElementByCssSelector(String locator,AplosIOSDriver driver){
        return driver.getDriver().findElementByCssSelector(locator);
    }
    
}
