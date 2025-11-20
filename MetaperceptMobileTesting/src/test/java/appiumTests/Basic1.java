package appiumTests;

import java.io.File;
import java.net.URI;
import java.net.URL;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Basic1 {

    @Test
    public void sampleTest() throws Exception {
            //code to start a server
    	AppiumDriverLocalService service= new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\Admin\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js")).withIPAddress("127.0.0.1").usingPort(4723).build();
    	service.start();
          UiAutomator2Options options = new UiAutomator2Options()
            .setDeviceName("Pixel_9_Pro_API_36")
            .setPlatformName("Android")
            .setApp("C:\\Users\\Admin\\eclipse-workspace\\MetaperceptMobileTesting\\src\\test\\java\\resources\\ApiDemos-debug.apk")
            .setAutomationName("UiAutomator2"); // same as setCapability("automationName", ...)

        // ✔ Modern Java URL creation (no deprecation)
        URL serverUrl = URI.create("http://127.0.0.1:4723").toURL();

        // ✔ Avoid ambiguous constructor by using generic type + diamond operator
        AndroidDriver driver = new AndroidDriver(serverUrl, options);
       
        System.out.println("Test Started Successfully");
        driver.findElement(AppiumBy.accessibilityId("Preference")).click();
        
        driver.quit();
        service.stop();
    }
}
