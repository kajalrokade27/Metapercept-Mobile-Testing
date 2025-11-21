package appiumTests;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;
import base.BaseClass;
import io.appium.java_client.AppiumBy;


public class WifiSetupTest extends BaseClass {

    @Test
    public void sampleTest() throws Exception 
    {
        System.out.println("Test Started Successfully");
        driver.findElement(AppiumBy.accessibilityId("Preference")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]")).click();
        driver.findElement(By.id("android:id/checkbox")).click();
        driver.findElement(By.xpath("//android.widget.ListView[@resource-id=\"android:id/list\"]/android.widget.LinearLayout[2]/android.widget.RelativeLayout")).click();
        driver.findElement(By.id("android:id/edit")).sendKeys("HelloWifi");
        driver.findElement(By.id("android:id/button1")).click();
        Reporter.log("Wifi Setup Completed Successfully", true);
        
     }
}
