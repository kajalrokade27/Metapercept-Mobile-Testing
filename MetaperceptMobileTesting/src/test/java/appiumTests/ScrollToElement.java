package appiumTests;

import org.testng.annotations.Test;

import base.BaseClass;
import io.appium.java_client.AppiumBy;
import utilities.ActionClass;

public class ScrollToElement extends BaseClass

{
  @Test
  public void scrollToElementTest()
  {
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  //scroll to element
	  ActionClass.scrollToElement("WebView");
	  
  }
}
