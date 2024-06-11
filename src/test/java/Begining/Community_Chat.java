package Begining;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;



public class Community_Chat {
	 public static void main(String[] args) throws Exception {
	        DesiredCapabilities capabilities = new DesiredCapabilities();
	        capabilities.setCapability("deviceName", "Xiaomi Redmi Note 5 pro");
	        capabilities.setCapability("platformName", "Android");
	        capabilities.setCapability("automationName", "uiautomator2");
	        capabilities.setCapability("platformVersion", "9");
	        capabilities.setCapability("appPackage", "com.freekaamaalindia");
	        capabilities.setCapability("appActivity", "com.freekaamaalindia.MainActivity");
	        
	        URL url = URI.create("http://127.0.0.1:4723").toURL();
	        String PackageName = "com.freekaamaalindia";
	        
	        // Initialize the driver
	         AndroidDriver driver = new AndroidDriver(url, capabilities);
	         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	         if(!driver.isAppInstalled(PackageName)) {
	        	 System.out.println("Installing");
	        	 driver.installApp("C:\\Users\\Dell\\Downloads\\appfkm.apk");
	         }
	         else {
	        	 System.out.println("Already installed");
	         }
	         System.out.println("Launching your app");
//	         driver.activateApp(PackageName);
	         System.out.println("Application started");
	         
	         Thread.sleep(5000);
	         driver.findElement(By.xpath("//android.widget.TextView[@text=\"SKIP\"]")).click();
	         Thread.sleep(3000);
	         			//android.widget.TextView[@contains(text,'Sign-in/Sign-up')]
	         driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.View/android.view.View[3]/android.widget.ImageView")).click();
	         Thread.sleep(2000);
	         driver.findElement(By.xpath("//android.widget.EditText[@text=\"Enter here\"]")).sendKeys("3322332233");
	         driver.findElement(By.xpath("//android.widget.TextView[@text=\"Get OTP \"]")).click();
	         Thread.sleep(1000);
	         

	         driver.findElement(By.xpath("(//android.widget.EditText[@resource-id=\"textInput\"])[1]")).sendKeys("2");
	         driver.findElement(By.xpath("(//android.widget.EditText[@resource-id=\"textInput\"])[2]")).sendKeys("2");
	         driver.findElement(By.xpath("(//android.widget.EditText[@resource-id=\"textInput\"])[3]")).sendKeys("4");
	         driver.findElement(By.xpath("(//android.widget.EditText[@resource-id=\"textInput\"])[4]")).sendKeys("4");
	         driver.findElement(By.xpath("(//android.widget.EditText[@resource-id=\"textInput\"])[5]")).sendKeys("2");
	         driver.findElement(By.xpath("(//android.widget.EditText[@resource-id=\"textInput\"])[6]")).sendKeys("2");
	         driver.findElement(By.xpath("//android.widget.TextView[@text=\"Proceed\"]")).click();
	         Thread.sleep(1000);
	         driver.findElement(By.xpath("//android.widget.TextView[@text=\"SKIP\"]")).click();
	         Thread.sleep(1000);
	         driver.findElement(By.xpath("//android.widget.TextView[@text=\"group1\"]")).click();
	         Thread.sleep(1000);
//	         driver.findElement(By.xpath("//android.widget.TextView[@text=\"Join now\"]")).click();
	         Thread.sleep(1000);
	         driver.findElement(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup")).click();
	         Thread.sleep(1000);
	         driver.findElement(By.xpath("//android.widget.EditText[@text=\"Type your reply\"]")).sendKeys("Hi FKM ADMIN");
	         driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView")).click();
	        
	 }  
     
}


