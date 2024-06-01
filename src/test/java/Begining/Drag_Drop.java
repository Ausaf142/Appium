 package Begining;

import java.lang.constant.DirectMethodHandleDesc.Kind;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;


public class Drag_Drop {
public static void main(String[] args) throws MalformedURLException {
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
    
    //click drag & drop
    driver.findElements(By.id("android:id/text1")).get(7).click();
    
    //Target Element
    WebElement source = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
   
    //Target Source
    WebElement target = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_2"));
          
    /*By Touch action(support ni kr rha hai qk depricated hai ye ab
       TouchAction action = new TouchAction(driver);  */
    
    //BY W3C action
         Point centreX = getCentre(source);
         Point centreY = getCentre(target);
         
         //Pointer input class for performing action sequence
         PointerInput finger1= new PointerInput(PointerInput.Kind.TOUCH, "finger1");
         
         //seq of Action, list of action that will perform
         Sequence seq = new Sequence(finger1,1)
        		 //move finger to the starting position
        		 .addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), centreX))
        		
        		 //finger coming down to cantct with screen
        		 .addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
        		
        		 //pause for a while
        		 .addAction(new Pause(finger1, Duration.ofMillis(588)))
        		
        		 //move finger to the end position
        		 .addAction(finger1.createPointerMove(Duration.ofMillis(588), PointerInput.Origin.viewport(), centreY))
        		
        		 //move the finger Up
        		 .addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

         	driver.perform(Arrays.asList(seq));
         	 System.out.println("Application close");
         
	
	
}
//method for centre location/coordinates
public static Point getCentre (WebElement ele){
	Point loc = ele.getLocation();  // point coordinates X,Y 
	Dimension size = ele.getSize(); //width and height
	Point p = new Point(loc.x + size.width/2,loc.y + size.width/2);
	return p;
}
}
