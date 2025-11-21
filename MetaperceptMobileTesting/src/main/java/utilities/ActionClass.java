package utilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import com.google.common.collect.ImmutableMap;
import base.BaseClass;
import io.appium.java_client.AppiumBy;

             //utility class to perform different actions
public class ActionClass extends BaseClass
{
   //long press gesture
   public static void longPressGesture(WebElement ele)
   {
		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture",
				ImmutableMap.of(
						"elementId", ((RemoteWebElement) ele).getId(),
						"duration", 2000
						)
				);
   }
   
   //scroll to an element
  public static void scrollToElement(String visibleText)
   {
	  driver.findElement(AppiumBy.androidUIAutomator(
			  "new UiScrollable(new UiSelector()).scrollIntoView("
			  + "new UiSelector().text(\""+visibleText+"\"));"));
   } 
   
   
}
