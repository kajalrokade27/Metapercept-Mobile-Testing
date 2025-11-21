package base;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseClass 
{
	public static AndroidDriver driver ;
	AppiumDriverLocalService service;
	
	@BeforeMethod
    public void preCondition() throws MalformedURLException
   {
	 //code to start a server
	service= new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\Admin\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js")).withIPAddress("127.0.0.1").usingPort(4723).build();
	service.start();
    UiAutomator2Options options = new UiAutomator2Options()
        .setDeviceName("Pixel_9_Pro_API_36")
        .setPlatformName("Android")
        .setApp("C:\\Users\\Admin\\git\\Appium\\MetaperceptMobileTesting\\src\\test\\java\\resources\\ApiDemos-debug.apk")
        .setAutomationName("UiAutomator2"); // same as setCapability("automationName", ...)

    // ✔ Modern Java URL creation (no deprecation)
    URL serverUrl = URI.create("http://127.0.0.1:4723").toURL();

    // ✔ Avoid ambiguous constructor by using generic type + diamond operator
     driver = new AndroidDriver(serverUrl, options);
     
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
	
	@AfterMethod
	public void postCondition()
	{
		 driver.quit();
	     service.stop();
	}

}
