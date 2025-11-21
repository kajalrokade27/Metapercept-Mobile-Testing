package appiumTests;
import java.net.MalformedURLException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.google.common.collect.ImmutableMap;
import base.BaseClass;
import io.appium.java_client.AppiumBy;
import utilities.ActionClass;


public class LongPress extends BaseClass {
	@Test
	public void LongPressGesture() throws MalformedURLException, InterruptedException {

		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Expandable Lists']")).click();
		driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();

		WebElement ele = driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));

		ActionClass.longPressGesture(ele);
		Assert.assertTrue(driver.findElement(By.id("android:id/title")).isDisplayed(),
				"Long press gesture not working");
		Reporter.log("Long press gesture working successfully", true);

		Thread.sleep(2000);
	}

}
