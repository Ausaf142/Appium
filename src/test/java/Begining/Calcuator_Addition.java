package Begining;

//import java.net.MalformedURLException;
//import java.net.URI;
//import java.net.URL;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.android.AndroidDriver;
import java.net.URI;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Calcuator_Addition {
	
	   public static void main(String[] args) throws Exception {
	        DesiredCapabilities capabilities = new DesiredCapabilities();
	        capabilities.setCapability("deviceName", "Xiaomi Redmi Note 5 pro");
	        capabilities.setCapability("platformName", "Android");
	        capabilities.setCapability("platformVersion", "9");
	        capabilities.setCapability("automationName", "uiautomator2");
	        capabilities.setCapability("appPackage", "com.miui.calculator");
	        capabilities.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");
	     
	        	URL url = URI.create("http://127.0.0.1:4723").toURL();
	        
	        // Initialize the driver
	         AndroidDriver driver = new AndroidDriver(url, capabilities);
	         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	         System.out.println("Application started");
	       
	         
	         //click on 2
	        driver.findElement(By.id("com.miui.calculator:id/btn_2_s")).click();
	      
	
	       // click on the addition
	        driver.findElement(By.id("com.miui.calculator:id/btn_plus_s")).click();
	      
	        
	        //click on 8
	        driver.findElements(By.id("com.miui.calculator:id/btn_8_s")).get(1).click();
	       
	        
	        //equals to
	        driver.findElement(By.id("com.miui.calculator:id/btn_equal_s")).click();
	       
	        
	       String res = driver.findElement(By.id("com.miui.calculator:id/expression")).getText();
	        if(res=="10") {
	        	System.out.println("pass");
	        }
	        
    
}
}
