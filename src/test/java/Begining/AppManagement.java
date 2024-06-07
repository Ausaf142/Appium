package Begining;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.asynchttpclient.uri.Uri;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;



public class AppManagement {
public static void main(String[] args) throws MalformedURLException, InterruptedException {
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability("deviceName", "Xiaomi Redmi Note 5 pro");
	capabilities.setCapability("platformName", "Android");
	capabilities.setCapability("platformVersion", "9");
	capabilities.setCapability("automationName", "uiautomator2");
//	capabilities.setCapability("appPackage", "io.appium.android.apis");
//	capabilities.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
	
	URL url = URI.create("http://127.0.0.1:4723/").toURL();
	AndroidDriver driver = new AndroidDriver(url, capabilities);
	Thread.sleep(2000);
	String PackageName = "com.freekaamaalindia";
	
	//remove kr skte hai app aise
//	driver.removeApp(PackageName);
	
	
	/*yaha simple hai install krne k liye "installApp(path)
	if else me check kr skte hai installed hai already to ni hoga agr nai hai to hoga 
	dono case maine activate kiya hai matlab launch hoga installed hai to ni hai to instal hokr 
	abhi ek condition maine remove wala upar lagaya hai k nicghe wala check ho jye condition.*/
	
	if(!driver.isAppInstalled(PackageName)) {
		System.out.println("Installing");
		driver.installApp("C:\\Users\\Dell\\Downloads\\appfkm.apk");
	}
	else {
		System.out.println("Already installed");
	}
	System.out.println("Launching your app");
	driver.activateApp(PackageName);
	
	//band kr skte hai app
	Thread.sleep(2000);
	driver.terminateApp(PackageName);
//	driver.quit();
	
	
	
}
}
