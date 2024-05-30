package Begining;

import java.net.URI;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

/*Agar path or target elements duplicate hai to findelements use krna hai ar sath mein index use krna hai, agar unique hai to koi dikkat n hai findelement use karo
 * */


public class ApiDebugAPK {
	 public static void main(String[] args) throws Exception {
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
	        
	        //click on control
	         driver.findElements(By.id("android:id/text1")).get(4).click();
	         
	         //Click on the Light theme
	         driver.findElements(By.id("android:id/text1")).get(0).click();
	         
	         //click and provide text resource id
	         driver.findElement(By.id("io.appium.android.apis:id/edit")).sendKeys("Ausaf");
	         
	         //click on the checkbox
	         driver.findElement(By.id("io.appium.android.apis:id/check1")).click();
	         
	         //radio button
	         driver.findElement(By.id("io.appium.android.apis:id/radio1")).click();
	         
	         Thread.sleep(2000);
	         driver.quit();
	         
	         
	         
	         
}
}