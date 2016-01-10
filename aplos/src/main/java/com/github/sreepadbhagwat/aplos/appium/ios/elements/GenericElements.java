package com.github.sreepadbhagwat.aplos.appium.ios.elements;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

import com.github.sreepadbhagwat.aplos.api.AplosDriverI;
import com.github.sreepadbhagwat.aplos.api.Driver;
import com.github.sreepadbhagwat.aplos.appium.AplosIOSDriver;
//import com.github.sreepadbhagwat.aplos.appium.CDriver;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class GenericElements {

	Class<?> searchElement;
	Object obj;
	Method method;
	AplosIOSDriver driver;

  public GenericElements(AplosIOSDriver driver) {
this.driver=driver;
	  searchElement=SearchElements.class;
	  try {
		  searchElement = Class.forName("com.github.sreepadbhagwat.aplos.appium.ios.elements.SearchElements");
	  }catch(ClassNotFoundException e){e.printStackTrace();}
  }



 public WebElement execute(String identifier,String locator) {

	 try {
		 obj = searchElement.newInstance();
		 method = getMethod(identifier);
		// method = searchElement.getDeclaredMethod("findElementByName", String.class,AplosIOSDriver.class);
		 System.out.println("sreepad");
		return (WebElement)method.invoke(obj, locator,driver);
	 } catch (InstantiationException e) {
		 e.printStackTrace();
	 } catch (IllegalAccessException e) {
		 e.printStackTrace();
	 } catch (InvocationTargetException e) {
		 e.printStackTrace();
	 }
	return null;

 }


	public Method getMethod(String identifier){



		try {
			obj = searchElement.newInstance();

			while (obj!=null) {
				//method = searchElement.getDeclaredMethod("findElementByName", String.class,AplosIOSDriver.class);
				Method[] methods = searchElement.getDeclaredMethods();
				System.out.println("1111111");

				for (Method method : methods){
					System.out.println(method.getName());

					if (method.getName().contains(identifier)){
						System.out.println("33333");
						return method;
					} else {
						System.out.println("Not found");
						return null;
					}
				}


			}

			System.out.println("sreepad");
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}




}
