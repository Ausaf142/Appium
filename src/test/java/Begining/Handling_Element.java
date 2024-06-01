package Begining;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Handling_Element {
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
    
    //click control
    driver.findElements(By.id("android:id/text1")).get(4).click();
    
    //light theme cick
    driver.findElements(By.id("android:id/text1")).get(0).click();
    
    //drop down
    driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\"]")).click();
    
    driver.findElements(By.id("android:id/text1")).get(0).click();
    
    Thread.sleep(1000);
    driver.quit();
}
}