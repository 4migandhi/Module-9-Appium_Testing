// 7] Write an Appium Program to connect with realdevice using APIDemo.app to open the calculator

//    and calculate all the operation like (addition, substraction, multiplication, division).
package Appium_Assignment;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;

public class Cal_Operation {
	
	@Test
	public void opencalc() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap=new DesiredCapabilities();
		
		cap.setCapability("deviceName", "motorola edge 40");
		cap.setCapability("udid","ZD222F4B6R");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "14.0");
		cap.setCapability( "appPackage","com.dencreak.dlcalculator");
		cap.setCapability("appActivity","com.dencreak.dlcalculator.DLCalculatorActivity");
		cap.setCapability("automationName", "UIAutomator2");
		
		AppiumDriver driver= new AppiumDriver(new URL("http://127.0.0.1:4723/"),cap);
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_btn_b_a")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_img_d_d")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_btn_b_a")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_img_e_d")).click();
		Thread.sleep(2000);
		

		String ans= driver.findElement(By.id("com.dencreak.dlcalculator:id/lay_normal_body_val")).getText();
		System.out.println("Ans is:"+ans);
		Thread.sleep(3000);
		
		driver.quit();
	
	}


}
