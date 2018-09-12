package tests;

import api.android.Android;
import core.managers.TestManager;
import org.testng.annotations.Test;

/**
 * Created by sundus on 5/17/18.
 */
public class DoctorSettingsPageTests extends TestManager {

    @Test(priority = 1)
    public void clickonsettingsText(){
        logger = report.createTest( "Verify user is able to click on settings button");
        Android.app.pliro.settingsPage.tapsettingsText();
    }


    @Test(priority = 2)
    public void findLogoutText(){
        logger= report.createTest("logout text is visibale on settings page");
        if (Android.app.pliro.settingsPage.findLogoutTextLink()!= null)
        {
            logger= report.createTest("User want to logout");
            Android.app.pliro.settingsPage.tapLogoutTextLink();
            Android.app.pliro.settingsPage.findloginTextLink();
        }
        else {
            logger = report.createTest( "Verify user is able to login on settings button");
            Android.app.pliro.settingsPage.findloginTextLink();
        }
    }
}
