package com.github.sreepadbhagwat.aplos.appium.ios.elements;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.github.sreepadbhagwat.aplos.appium.AplosDriver;
import com.github.sreepadbhagwat.aplos.appium.ios.AplosAppiumIOS;
import com.github.sreepadbhagwat.aplos.appium.ios.AplosElement;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

import static org.mockito.Mockito.*;






public class IOSButtonTest {

		final String mockedidentifier = "xpath";
		final String mockedlocator = "locator";
		IOSElement mockelement=mock(IOSElement.class);
		IOSDriver<IOSElement> mockdriver=mock(IOSDriver.class);
		IOSDriver<IOSElement> mockdriver1=mock(IOSDriver.class);

		
		IOSButton ib;

		public IOSElement oneElement(){
			return mockelement;
		}
		
		public IOSDriver<IOSElement> oneDriver(){
			return mockdriver;
		}


	@Before
	 public void setup(){
		// ib = new IOSButton();

		 
	  }
	  
	
	 
	@Test
	public  void clickTest(){
	/*	
		AplosDriver ad = new AplosDriver();
		AplosAppiumIOS aa = new AplosAppiumIOS();
		AplosElement ae = new AplosElement();
		
		ae.findelement(mockedidentifier, mockedidentifier).getDriver();
	
	AplosElement mockae = mock(AplosElement.class);
	AplosAppiumIOS mockaai = mock(AplosAppiumIOS.class);
	
	AplosDriver mockaplosdriver = mock(AplosDriver.class);
	System.out.println(mockdriver);
	
	when(mockaplosdriver.getDriver()).thenReturn(mockdriver);
	System.out.println(mockaplosdriver.getDriver());
	when(mockaai.getDriver()).thenReturn(mockdriver1);
	
//	when(mockae.getElement(mockedidentifier, mockedlocator)).thenReturn(mockaai.getDriver());
	
	
	//when(mockaplosdriver.getDriver()).thenReturn(mockdriver);
	//when(mockaai.getDriver()).thenReturn(mockaplosdriver.getDriver());

	//when(mockae.getElement(mockedidentifier, mockedlocator)).thenReturn(oneElement());
	
		//ib.click(mockedidentifier, mockedlocator);
		//when(ae.findelement(mockedidentifier,mockedlocator)).thenReturn(oneElement());
		
		//System.out.println(oneElement());
	    //when(AplosElement.findelement(identifier,locator)).thenReturn(e);
		// PowerMockito.when(AplosElement.findelement(identifier,locator)).thenReturn((IOSElement) oneElement());


		//ib.click(identifier, locator);
	   // System.out.println(ae.findelement(identifier,locator));
	
	
	
    


   
	
	 // assertEquals("Calculated wrong store sales", expectedStoreSales, storeSales);
      //verify(mockRepository, times(1)).loadSales();
	*/
	}

}
