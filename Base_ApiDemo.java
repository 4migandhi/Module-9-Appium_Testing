package Appium_Assignment;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.BeforeMethod;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Base_ApiDemo {
	
	public  AndroidDriver driver;
	AppiumDriverLocalService service;

	@BeforeMethod
	public void beforemethod() throws MalformedURLException, InterruptedException {
		
		//AppiumDriverLocalService service;
		service=new AppiumServiceBuilder().withAppiumJS(new File
				("C:\\Users\\gandh\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
						.withIPAddress("127.0.0.1")
						.withTimeout(Duration.ofSeconds(30))
						.usingPort(4723)
						.build();
		service.start();

		
		UiAutomator2Options options = new UiAutomator2Options();

		options.setDeviceName("charmi");
		
		options.setApp("D:\\Automation_Testing\\APK\\ApiDemos-debug.apk");
	
		driver= new AndroidDriver(new URL("http://127.0.0.1:4723/"),options);
	
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Thread.sleep(2000);
	}
	
	public void longPressAction(WebElement ele)
	{
		((JavascriptExecutor)driver).executeScript("mobile: longClickGesture",
				ImmutableMap.of("elementId",((RemoteWebElement)ele).getId(),
						"duration",2000));
	}

}
