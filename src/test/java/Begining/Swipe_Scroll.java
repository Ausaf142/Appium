package Begining;

import java.lang.constant.DirectMethodHandleDesc.Kind;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Swipe_Scroll {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability("deviceName", "Xiaomi Redmi Note 5 pro");
	capabilities.setCapability("platformName", "Android");
	capabilities.setCapability("platformVersion", "9");
	capabilities.setCapability("automationName", "uiautomator2");
	capabilities.setCapability("appPackage", "io.appium.android.apis");
	capabilities.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
	
	URL url = URI.create("http://127.0.0.1:4723/").toURL();
	AndroidDriver driver =new AndroidDriver(url, capabilities);
	   
	 System.out.println("Application started");
	 
     //click on view button
	 driver.findElements(By.id("android:id/text1")).get(11).click();
    
    //Screen size
    Dimension displaySize = driver.manage().window().getSize();
    //find initial point
    int startX = displaySize.getWidth()/2;
    int startY=displaySize.getHeight()/2;
    
    //destination pointor coordinates
    int endX= startX;
    int endY= (int)(displaySize.getHeight()*0.25);
    int endZ= (int)(displaySize.getHeight()*0.45);
    
    //Pointer class for the type of Action in sequence(like touch,pen,tip)
    PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
    
    //for the execution of every action in sequnce form or in list form
    Sequence seq = new Sequence(finger, 1)
    				.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX,startY))
    				.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
    				.addAction(new Pause(finger,Duration.ofMillis(900)))
    				.addAction(finger.createPointerMove(Duration.ofMillis(100),PointerInput.Origin.viewport(), endX,endY))
    				.addAction(new Pause(finger,Duration.ofMillis(2000)))
    				.addAction(finger.createPointerMove(Duration.ofMillis(100),PointerInput.Origin.viewport(), endX,endZ))
    				.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
    // for the performation of all listed sequnce action
//    driver.perform(Arrays.asList(seq));
    /*OR*/
    driver.perform(Collections.singletonList(seq));
    
    
    
    
}
}