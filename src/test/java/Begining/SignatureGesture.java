package Begining;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;


import io.appium.java_client.android.AndroidDriver;


public class SignatureGesture {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability("deviceName", "Xiaomi Redmi Note 5 pro");
	capabilities.setCapability("platformName", "Android");
	capabilities.setCapability("platformVersion", "9");
	capabilities.setCapability("automationName", "uiautomator2");

	capabilities.setCapability("appPackage", "com.kanishka_developer.SketchPad");
  capabilities.setCapability("appActivity", "io.kodular.kanishka_developer.SketchPad_220.Screen1");

	URL url = URI.create("http://127.0.0.1:4723/").toURL();
	AndroidDriver driver =new AndroidDriver(url, capabilities);
	   
	System.out.println("Application started");
	Thread.sleep(1000);
	driver.findElement(By.id("android:id/button3")).click();
	 driver.findElement(By.className("android.widget.ImageView")).click();
		Thread.sleep(1000);
		 driver.findElement(By.xpath("//android.widget.Button[@text=\"keyboard_arrow_down\"]")).click();

		 
	//Direct With the Help of Co-ordinates	 
//	 PointerInput point =new PointerInput(PointerInput.Kind.TOUCH, "point");
//Sequence seq =new Sequence(point, 1)
//	.addAction(point.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), 243, 760))
//	.addAction(point.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
//	.addAction(point.createPointerMove(Duration.ofMillis(1000), PointerInput.Origin.viewport(),711,760))
//	.addAction(point.createPointerMove(Duration.ofMillis(1000), PointerInput.Origin.viewport(),711,447))
//	.addAction(point.createPointerMove(Duration.ofMillis(1000), PointerInput.Origin.viewport(),243,447))
//	.addAction(point.createPointerMove(Duration.ofMillis(1000), PointerInput.Origin.viewport(),243,760))
//	.addAction(point.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
//	
//Sequence seq2 =new Sequence(point, 2)
//	.addAction(point.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), 243, 447))
//	.addAction(point.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
//	.addAction(point.createPointerMove(Duration.ofMillis(1000), PointerInput.Origin.viewport(),500,740))
//	.addAction(point.createPointerMove(Duration.ofMillis(1000), PointerInput.Origin.viewport(),711,447));
			
		 WebElement panel = driver.findElement(By.xpath("//android.view.View"));
		 Dimension winSize = panel.getSize();
		 Point winPoint = panel.getLocation();
		
		 int initialPointX = winPoint.x+(winSize.width/2);
		 int initialPointY = winPoint.y+(winSize.height/10);
		
		 
		 int FinalPointX = initialPointX;
		 int FinalPointY = initialPointY+800;
		 
			
		 PointerInput point =new PointerInput(PointerInput.Kind.TOUCH, "point");
		Sequence seq =new Sequence(point, 1)
				.addAction(point.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), initialPointX, initialPointY))
				.addAction(point.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
				.addAction(point.createPointerMove(Duration.ofMillis(1000), PointerInput.Origin.viewport(), FinalPointX, FinalPointY));

	
	 driver.perform(Arrays.asList(seq));
	 
//	 driver.perform(Arrays.asList(seq2));
	 
	 
	 
	 
	 
	 
}
}
 