package actions;

import base.TestBase;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

public class Actions extends TestBase {
    AndroidDriver driver;

    public Actions(AndroidDriver driver){
        this.driver = driver;
    }

    public void swipeAction(WebElement ele, String direction) {
        ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture",
                ImmutableMap.of("elementId", ((RemoteWebElement) ele).getId(),

                        "direction", direction, "percent", 1));

    }
}
