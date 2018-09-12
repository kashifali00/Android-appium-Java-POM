package tests;

import api.android.Android;
import core.managers.TestManager;
import org.testng.annotations.Test;

/**
 * Created by Kashif on 3/28/2018.
 */
public class LoginPageTests extends TestManager {

    @Test(priority = 1)
    public void clickOnLoginWithEmailButton() {

            logger = report.createTest("Verify that  user is able to click on LOGIN WITH EMAIL button");
            Android.app.pliro.lookingForDoctorPage.tapSigninWithEmailButton();

    }

    @Test(priority = 2, dependsOnMethods = "clickOnLoginWithEmailButton")
    public void isEmailFieldVisible() {
        logger = report.createTest("Verify that Email field is visible/available on Login screen");
        softAssert.assertEquals(Android.app.pliro.loginPage.findEmailField(),"Email");
        softAssert.assertAll();
    }

    @Test(priority = 3, dependsOnMethods = "isEmailFieldVisible")
    public void enterEmail() {
        logger = report.createTest("Verify that User is able to enter danyal1@email.com in Email field visible on Login screen");
        Android.app.pliro.loginPage.uiObject.getEmailField().sendText("danyal1@email.com");
    }

    @Test(priority = 4, dependsOnMethods = "enterEmail")
    public void isPasswordFieldVisible() {
        logger = report.createTest("Verify that Password field is visible/available on Login screen");
        softAssert.assertEquals(Android.app.pliro.loginPage.findPasswordField(),"Password");
        softAssert.assertAll();
    }

    @Test(priority = 5, dependsOnMethods = "isPasswordFieldVisible")
    public void enterPassword() {
        logger = report.createTest("Verify that User is able to enter password test12 in Password field visible on Login screen");
        Android.app.pliro.loginPage.uiObject.getPasswordField().sendText("test12");
    }

    @Test(priority = 6, dependsOnMethods = "enterPassword")
    public void isSignInButtonVisible() {
        logger = report.createTest("Verify that SIGN IN button is visible on Login screen/page");
        softAssert.assertEquals(Android.app.pliro.loginPage.findSignInButton(),"SIGN IN");
        softAssert.assertAll();
    }

    @Test(priority = 7, dependsOnMethods = "isSignInButtonVisible")
    public void isDontHaveAccountLinkTextVisible() {
        logger = report.createTest("Verify that Dont have account? link text is visible on Login page");
        softAssert.assertEquals(Android.app.pliro.loginPage.findDontHaveAccount(),"Don't have an account?");
        softAssert.assertAll();
    }

    @Test(priority = 8, dependsOnMethods = "isDontHaveAccountLinkTextVisible")
    public void isSignUpNowLinkTextVisible() {
        logger = report.createTest("Verify that Sign Up Now link text is visible on Login page");
        softAssert.assertEquals(Android.app.pliro.loginPage.findSignUpNow(),"Sign Up Now");
        softAssert.assertAll();
    }

    @Test(priority = 6, dependsOnMethods = "isSignUpNowLinkTextVisible")
    public void clickOnSignInButton() {
        logger = report.createTest("Verify that  user is able to click on SIGN IN button");
        Android.app.pliro.loginPage.tapSignInButton();
    }

    @Test(priority = 7, dependsOnMethods = "clickOnSignInButton")
    public void clickOnCONTINUEButton() {
        logger = report.createTest("Verify that User is able to click on CONTINUE button");
        Android.app.pliro.loginPage.tapContinueLinkText();
    }
}
