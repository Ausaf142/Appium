package Begining;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Automate_Web_Browser {
public static void main(String[] args) throws MalformedURLException {
//	Gathered Desired Capability
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability("deviceName", "Xiaomi Redmi Note 5 pro");
	capabilities.setCapability("platformName", "Android");
	capabilities.setCapability("platformVersion", "9");
	capabilities.setCapability("automationName", "uiautomator2");
	capabilities.setCapability("browserName", "Chrome");
	capabilities.setCapability("chromedriverExecutable", "C:\\Users\\Dell\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	
	URL url = URI.create("http://127.0.0.1:4723/").toURL();
	AndroidDriver driver =new AndroidDriver(url, capabilities);
	   
	 System.out.println("Application started");
	 driver.get("https://mdev.freekaamaal.com");
		JavascriptExecutor js =(JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,500)");
		WebElement targetElement = driver.findElement(By.className("hotdeal-bottom-wrapper"));
		js.executeScript("arguments[0].scrollIntoView(true);", targetElement);
		targetElement.click();
		
	 
//	driver.findElement(By.name("q")).sendKeys("Taj Mahal");
//	driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	
	
	 
}
}
