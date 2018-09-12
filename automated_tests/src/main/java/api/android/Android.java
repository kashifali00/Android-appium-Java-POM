package api.android;

import api.apps.Apps;
import core.ADB;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Kashif on 3/12/2018.
 */

// Reference everything here
public class Android {

    public static WebDriverWait wait;
    public static AndroidDriver driver;
    public static ADB adb;
    public static Apps app = new Apps();

}
