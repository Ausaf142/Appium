package Begining;

	
	//import io.appium.java_client.MobileElement;
	import io.appium.java_client.android.AndroidDriver;
	import java.net.URI;
	import java.net.URL;
	import org.openqa.selenium.By;
	import org.openqa.selenium.remote.DesiredCapabilities;

	public class Apk_launching {
	    public static void main(String[] args) throws Exception {
	        DesiredCapabilities capabilities = new DesiredCapabilities();
	        capabilities.setCapability("deviceName", "Xiaomi Redmi Note 5 pro");
	        capabilities.setCapability("platformName", "Android");
	        capabilities.setCapability("automationName", "uiautomator2");
	        capabilities.setCapability("platformVersion", "9");
//	        capabilities.setCapability("app", "C:\\Users\\Dell\\Downloads\\appfkm.apk");
	      
	        capabilities.setCapability("appPackage", "com.freekaamaalindia");
	        capabilities.setCapability("appActivity", "com.freekaamaalindia.MainActivity");
	        
//	        capabilities.setCapability("appPackage", "com.cashora.india");
//	        capabilities.setCapability("appActivity", "com.cashora.india.MainActivity");
	        
	        		
	        	URL url = URI.create("http://127.0.0.1:4723").toURL();
	        	System.out.println("Application started");
	        // Initialize the driver
	         AndroidDriver driver = new AndroidDriver(url, capabilities);
	         Thread.sleep(5000);
	        
//	         driver.findElement(By.xpath("//android.widget.TextView[@text=\"SKIP\"]")).click();
	         Thread.sleep(2000);
	         driver.findElement(By.xpath("//android.widget.TextView[@text=\"Sign-in/Sign-up\"] ")).click();
	         System.out.println("Application started");
//	         driver.findElement(By.xpath("//android.widget.EditText[@text=\"Enter here\"]")).sendKeys("6200558678");
//	         driver.findElement(By.id("00000000-0000-0074-ffff-ffff00000000")).click();
	         
	         
	         
	         
	         
	        // Your test code goes here
	     
	        // Close the session
	    
//	        mCurrentFocus=Window{1ebea78 u0 com.freekaamaalindia/com.freekaamaalindia.MainActivity}
	    
	}

}
