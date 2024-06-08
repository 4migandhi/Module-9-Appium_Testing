// 2) Write an Appium Program to connect with Realdevice and open APIdemo.app application on your 
//    realdevice.
package Appium_Assignment;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;

public class Open_Application_In_RealDevice {
	
	@Test
	public void opencalc() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap=new DesiredCapabilities();
		
		cap.setCapability("deviceName", "motorola edge 40");
		cap.setCapability("udid","ZD222F4B6R");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "14.0");
		cap.setCapability( "appPackage","io.appium.android.apis");
		cap.setCapability("appActivity","io.appium.android.apis.ApiDemos");
		cap.setCapability("automationName", "UIAutomator2");
		
		AppiumDriver driver= new AppiumDriver(new URL("http://127.0.0.1:4723/"),cap);
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Thread.sleep(2000);
	}
}
