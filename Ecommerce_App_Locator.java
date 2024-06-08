// 3) Write an Appium Program to connect with emulator wit ecommerce based application using 


//    Generalstore.app to perform locators like name, dropdown etc.
package Appium_Assignment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class Ecommerce_App_Locator extends BaseClass{
	
	@Test
	public void First() throws InterruptedException {
		
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField"))
					.sendKeys("charmi");
		Thread.sleep(2000);
		
		driver.findElement(By.id("android:id/text1")).click();
		Thread.sleep(2000);
		
		driver.findElement(AppiumBy.androidUIAutomator
				("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Benin\"));")).click();
		Thread.sleep(2000);
		
	}
}