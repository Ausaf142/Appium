package Begining;


import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class Scroll_OnMobileWebPage {
	
	
@Test	
public void scroll() throws MalformedURLException, InterruptedException {
	  DesiredCapabilities capabilities = new DesiredCapabilities();
      capabilities.setCapability("deviceName", "Xiaomi Redmi Note 5 pro");
      capabilities.setCapability("platformName", "Android");
      capabilities.setCapability("platformVersion", "9");
      capabilities.setCapability("automationName", "uiautomator2");
      capabilities.setCapability("appPackage", "io.appium.android.apis");
      capabilities.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
   
      	URL url = URI.create("http://127.0.0.1:4723").toURL();
      
      // Initialize the driver
       AndroidDriver driver = new AndroidDriver(url, capabilities);
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       System.out.println("Application started");
       //click on view button
      driver.findElements(By.id("android:id/text1")).get(11).click();
      
      //scrolling
      /*Java mein double qoute string declard line with double qoute use krne k liye backward slash use krte quote ke pahle*/
      String MobEleToScroll = "Switches";
      WebElement switchElement = driver.findElement(AppiumBy.androidUIAutomator(
    		  "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().description(\""+MobEleToScroll+"\"));"));
     

      switchElement.click();
     
      //click on the monitored switch
      driver.findElement(By.id("io.appium.android.apis:id/monitored_switch")).click();
      Thread.sleep(2000);
      System.out.println("Operation Completed");
     
      driver.quit();
      
      
}
}
