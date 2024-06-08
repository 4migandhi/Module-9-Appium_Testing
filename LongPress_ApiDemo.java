//5] Write an Appium Program to connect with realdevice using APIDemo.app to perform longpress to open
//   to side menu.
package Appium_Assignment;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class LongPress_ApiDemo extends Base_ApiDemo {
	
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
	
		driver.findElement(AppiumBy.androidUIAutomator
				("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Views\"));")).click();
		
		Thread.sleep(3000);
		
		
		driver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath
				("//android.widget.TextView[@content-desc=\"1. Custom Adapter\"]")).click();
		Thread.sleep(2000);
		
		//Dynamic xpath syntex://class_value[@text='text_value']
		
		WebElement log=driver.findElement
				(By.xpath("//android.widget.TextView[@text='People Names']"));
		longPressAction(log);
		Thread.sleep(2000);
		
		String msg= driver.findElement(By.id("android:id/title")).getText();
		assertEquals(msg, "Sample menu");
	}

	}
	
