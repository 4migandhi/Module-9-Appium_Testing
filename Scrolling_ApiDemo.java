//6] Write an Appium Program to connect with realdevice using APIDemo.app to perform scrolling the 
//   all option.
package Appium_Assignment;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class Scrolling_ApiDemo extends Base_ApiDemo {
@Test	
public void scroll() throws InterruptedException {
		
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		
		driver.findElement(AppiumBy.androidUIAutomator
				("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView3\"));")).click();
		
		Thread.sleep(3000);
		
	}

}
