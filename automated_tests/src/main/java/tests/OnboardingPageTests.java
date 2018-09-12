package tests;

import api.android.Android;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import core.MyLogger;
import core.managers.DriverManager;
import core.managers.TestManager;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * Created by Kashif on 3/16/2018.
 */
public class OnboardingPageTests extends TestManager {

    @Test(priority = 1)
    public void findGoodDoctorTextTest() {

            logger = report.createTest("Verify that Find Good Doctory by Speciality text is visible on onboarding page 1");
            String text = Android.app.pliro.onboardingPage.findGoodDoctorTextonPage1();
            softAssert.assertEquals(text, "Find Good Doctor by Speciality!");
            softAssert.assertAll();
    }

    @Test(priority = 2, dependsOnMethods = "findGoodDoctorTextTest")
    public void findDoctorCoverageTextTest() {
        logger = report.createTest("Verify that Find more than 20,000+ doctor text is visible on onboarding page 1");
        String textDocCov = Android.app.pliro.onboardingPage.findDoctorCoverageTextonPage1();
        softAssert.assertEquals(textDocCov, "Find more then 20,000+ doctor & 100+ specialties all over pakistan");
        softAssert.assertAll();
    }

    @Test(priority = 3, dependsOnMethods = {"findDoctorCoverageTextTest","findGoodDoctorTextTest"})
    public void visibilityOfSkipButton() {
        logger = report.createTest("Verify that Skip button is visible on onboarding page 1");
        softAssert.assertEquals(Android.app.pliro.onboardingPage.uiObject.getSkipButton().getText(), "Skip");
        softAssert.assertAll();
    }

    @Test(priority = 4, dependsOnMethods = {"visibilityOfSkipButton"})
    public void isSkipButtonEnabled() {
        logger = report.createTest("Verify that Skip button is Enabled on onboarding page 1");
        softAssert.assertEquals(Android.app.pliro.onboardingPage.uiObject.getSkipButton().isEnabled(), true);
        softAssert.assertAll();
    }


    @Test(priority = 5, dependsOnMethods = {"isSkipButtonEnabled", "visibilityOfSkipButton"})
    public void clickOnNextPageButton() {
        logger = report.createTest("Verify that onboarding page 2 is visible when user click on > next page button");
        Android.app.pliro.onboardingPage.tapNextButton();
        softAssert.assertEquals(Android.app.pliro.onboardingPage.findAppointmentTextonPage2(), "Appointments on the Go!");
        softAssert.assertAll();

    }

    @Test(priority = 6, dependsOnMethods = "clickOnNextPageButton")
    public void visibilityOfAppointmentOnTheGoText() {
        logger = report.createTest("Verify that Appointment on the Go! text is visible on onboarding page 2");
        softAssert.assertEquals(Android.app.pliro.onboardingPage.findAppointmentTextonPage2(), "Appointments on the Go!");
        softAssert.assertAll();
    }

    @Test(priority = 7, dependsOnMethods = "visibilityOfAppointmentOnTheGoText")
    public void visibilityOfFindBestDocText() {
        logger = report.createTest("Verify that Find the best doctor nearby text on onboarding page 2");
        softAssert.assertEquals(Android.app.pliro.onboardingPage.findBestDoctorTextonPage2(), "Find the best doctors nearby and book health appointments at available times");
        softAssert.assertAll();
    }

    @Test(priority = 8, dependsOnMethods = "visibilityOfFindBestDocText")
    public void visibilityOfSkipButtonOnPage2() {
        logger = report.createTest("Verify that Skip button is visible on onboarding page 2");
        softAssert.assertEquals(Android.app.pliro.onboardingPage.uiObject.getSkipButton().getText(), "Skip");
        softAssert.assertAll();
    }

    @Test(priority = 9, dependsOnMethods = {"visibilityOfSkipButtonOnPage2"})
    public void againClickOnNextPageButton() {
        logger = report.createTest("Verify that onboarding page 3 is visible when user click on > next page button");
        Android.app.pliro.onboardingPage.tapNextButton();
    }

    @Test(priority = 11, dependsOnMethods = {"againClickOnNextPageButton"})
    public void visibilityOfFindQuestionsText() {
        logger = report.createTest("Verify Ask free health-related Questions text is visible on onboarding page 3");
        softAssert.assertEquals(Android.app.pliro.onboardingPage.uiObject.getQuestionText().getText(), "Ask free health-related Questions?");
        softAssert.assertAll();

    }


    @Test(priority = 10, dependsOnMethods = {"visibilityOfFindQuestionsText"})
    public void visibilityOfFindBestDocTextonPage3() {
        logger = report.createTest("Verify that Find the best doctor nearby on onboarding page 3");
        softAssert.assertEquals(Android.app.pliro.onboardingPage.findBestDoctorTextonPage3(), "Find the best doctors nearby and book health appointments at available times");
        softAssert.assertAll();
    }

    @Test(priority = 12, dependsOnMethods = {"visibilityOfFindBestDocTextonPage3"})
    public void tapDoneButton() {
        logger = report.createTest("Verify that Done button is Enabled on onboarding page 3");
        Android.app.pliro.onboardingPage.tapDoneButton();
    }

    @Test(priority = 13, dependsOnMethods = {"tapDoneButton"})
    public void lookingForDoctorPage() {
        logger = report.createTest("Verify that Looking for Doctor? screen/page is visible when user clicks on Done button on onboarding page 3");
        softAssert.assertEquals(Android.app.pliro.lookingForDoctorPage.findLookingForDoctorPageText(), "Looking For Doctor?");
        softAssert.assertAll();

    }

    @Test(priority = 14, dependsOnMethods = {"lookingForDoctorPage"})
    public void clickOnSkipButtonOnOnboardingPage1() {
        logger = report.createTest("Verify that Looking for Doctor? screen/page is visible when user clicks on Skip button on onboarding page 1");
        DriverManager.killDriver();
        DriverManager.createDriver();
        Android.app.pliro.onboardingPage.tapSkipButton();
        softAssert.assertEquals(Android.app.pliro.lookingForDoctorPage.findLookingForDoctorPageText(), "Looking For Doctor?");
        softAssert.assertAll();

    }

//    @Test(priority = 15, dependsOnMethods = {"clickOnSkipButtonOnOnboardingPage1"})
//    public void clickOnSkipButtonOnOnboardingPage2() {
//        logger = report.createTest("Verify that Looking for Doctor? screen/page is visible when user clicks on Skip button on onboarding page 2");
//        DriverManager.killDriver();
//        DriverManager.createDriver();
//        Android.app.pliro.onboardingPage.tapNextButton();
//        Android.app.pliro.onboardingPage.tapSkipButton();
//        softAssert.assertEquals(Android.app.pliro.lookingForDoctorPage.findLookingForDoctorPageText(), "Looking For Doctor?");
//        softAssert.assertAll();
//
//    }
}
