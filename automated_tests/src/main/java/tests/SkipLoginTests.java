package tests;

import api.android.Android;
import core.managers.TestManager;
import org.testng.annotations.Test;

/**
 * Created by sundus on 5/25/18.
 */
public class SkipLoginTests extends TestManager {

    @Test(priority = 1)
    public void isFindBestDoctorTextVisible() {
        logger = report.createTest("Verify that Find the best doctors nearby and book health appointments at available times.text is visible on Looking for Doctor page");
        softAssert.assertEquals(Android.app.pliro.lookingForDoctorPage.findBestDoctorText(), "Find the best doctors nearby and book health appointments at available times.");
        softAssert.assertAll();
    }

    @Test(priority = 2, dependsOnMethods = "isFindBestDoctorTextVisible")
    public void isLoginWithEmailButtonVisible() {
        logger = report.createTest("Verify that LOGIN WITH EMAIL button is visible");
        softAssert.assertEquals(Android.app.pliro.lookingForDoctorPage.isSignWithEmailEnabled(), "LOGIN WITH EMAIL");
        softAssert.assertAll();
    }
    
    @Test(priority = 3, dependsOnMethods = {"isLoginWithEmailButtonVisible"})
    public void isSkipThisStepTextVisible() {
        logger = report.createTest("Verify that Skip this step, and start using Pliro link text is visible");
        softAssert.assertEquals(Android.app.pliro.lookingForDoctorPage.findSkipThisStepLinkText(), "Skip this step, and start using Pliro");
        softAssert.assertAll();
    }

    @Test(priority = 4, dependsOnMethods = {"isSkipThisStepTextVisible"})
    public void isDontHaveAccountTextVisible() {
        logger = report.createTest("Verify that Skip this step, and start using Pliro link text is visible");
        softAssert.assertEquals(Android.app.pliro.lookingForDoctorPage.findSkipThisStepLinkText(), "Skip this step, and start using Pliro");
        softAssert.assertAll();
    }

    @Test(priority = 5, dependsOnMethods = {"isDontHaveAccountTextVisible"})
    public void isSignupTextVisible() {
        logger = report.createTest("Verify that Sign up now  link text is visible ");
        softAssert.assertEquals(Android.app.pliro.lookingForDoctorPage.findSignupNowLinkText(), "Sign Up Now");
        softAssert.assertAll();
    }

    @Test(priority = 6, dependsOnMethods = {"isSignupTextVisible"})
    public void tabSkipThisStepLinkText() {
        logger = report.createTest("Verify that Skip this step, and start using Pliro link text is visible");
        Android.app.pliro.lookingForDoctorPage.tapSkipThisStepLinkText();
    }

    @Test(priority = 7, dependsOnMethods = "tabSkipThisStepLinkText")
    public void clickOnCONTINUEButton() {
        logger = report.createTest("Verify that User is able to click on CONTINUE button");
        Android.app.pliro.loginPage.tapContinueLinkText();
    }
}
