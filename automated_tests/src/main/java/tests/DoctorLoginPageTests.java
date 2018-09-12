package tests;

import api.android.Android;
import core.managers.TestManager;
import org.testng.annotations.Test;

/**
 * Created by sundus on 5/17/18.
 */
public class DoctorLoginPageTests extends TestManager{
    @Test(priority = 1)
    public void clickOnLoginWithEmailButton() {

        logger = report.createTest("Verify that  user is able to click on LOGIN WITH EMAIL button");
        //Android.app.pliro.lookingForDoctorPage.tapSigninWithEmailButton();
        Android.app.pliro.settingsPage.tapLoginTextLink();
    }

    @Test(priority = 2)
    public void enterEmail() {
        logger = report.createTest("Verify that User is able to enter danyal1@email.com in Email field visible on Login screen");
        Android.app.pliro.loginPage.uiObject.getEmailField().sendText("test5@email.com");
    }

    @Test(priority = 3)
    public void isPasswordFieldVisible() {
        logger = report.createTest("Verify that Password field is visible/available on Login screen");
        Android.app.pliro.loginPage.findPasswordField();
    }

    @Test(priority = 4)
    public void enterPassword() {
        logger = report.createTest("Verify that User is able to enter password test12 in Password field visible on Login screen");
        Android.app.pliro.loginPage.uiObject.getPasswordField().sendText("test12");
    }

    @Test(priority = 5)
    public void isSignInButtonVisible() {
        logger = report.createTest("Verify that SIGN IN button is visible on Login screen/page");
        Android.app.pliro.loginPage.findSignInButton();
    }

    @Test(priority = 6)
    public void clickOnSignInButton() {
        logger = report.createTest("Verify that  user is able to click on SIGN IN button");
        Android.app.pliro.loginPage.tapSignInButton();
    }

}
