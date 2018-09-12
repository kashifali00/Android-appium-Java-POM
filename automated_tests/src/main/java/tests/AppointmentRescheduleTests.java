package tests;

import api.android.Android;
import api.apps.Pliro.pendingPage.PendingPageUiObject;
import core.managers.TestManager;
import org.testng.annotations.Test;

/**
 * Created by sundus on 4/23/18.
 */
public class AppointmentRescheduleTests extends TestManager {

    public PendingPageUiObject uiObject2 =new PendingPageUiObject();

    @Test(priority = 1)
    public void clickOnRescheduleCancelLinkText () {

        logger = report.createTest("Verify that user is able to cancel reschedule appointment on Pending Appointments screen/page");
        if (false==uiObject2.getNoPendingText().elementExists())
        {
            Android.app.pliro.PendingPage.tapRescheduleLinkText();
            Android.app.pliro.timeSchedule.isTimeScheduleWindowVisible();
            Android.app.pliro.timeSchedule.tapTimeSlot();
            Android.app.pliro.AppointmentConfirm.tapCancelLinkText();
            Android.app.pliro.AppointmentConfirm.tapCrossLink();
        }
        else
        {
            uiObject2.getNoPendingText().getText();
        }

    }
    @Test(priority = 2)
    public void clickOnRescheduleConfirmLinkText () {
        logger = report.createTest("Verify that user is able to confirm reschedule appointment on Pending Appointments screen/page");

        if (false==uiObject2.getNoPendingText().elementExists())
        {
            Android.app.pliro.PendingPage.tapRescheduleLinkText();
            Android.app.pliro.timeSchedule.isTimeScheduleWindowVisible();
            Android.app.pliro.timeSchedule.tapTimeSlot();
            Android.app.pliro.AppointmentConfirm.tapOkLinkText();
        }
        else
        {
            uiObject2.getNoPendingText().getText();
        }

    }

//    @Test(priority = 2, dependsOnMethods = "clickOnRescheduleLinkText")
//    public void isConfirmTimeScheduleTextVisible() {
//        logger = report.createTest("Verify that Time Schedule text is visible/available on Pending Appointments screen");
//        Android.app.pliro.AppointmentConfirm.findTimeScheduleAppointmentText();
//    }
//
//    @Test(priority = 3, dependsOnMethods = "clickOnRescheduleLinkText")
//    public void isTimeScheduleWindowPageAvailable() {
//        logger = report.createTest("Verify that Time schedule window page is visible");
//        softAssert.assertEquals(Android.app.pliro.timeSchedule.isTimeScheduleWindowVisible(), "Time Schedule");
//        softAssert.assertAll();
//    }
//
//    @Test(priority = 4, dependsOnMethods = "clickOnRescheduleLinkText")
//    public void isTimeSlotAvailable() {
//        logger = report.createTest("Verify that user can select current time slot for booking");
//        //String date = Android.app.pliro.timeSchedule.uiObject.getAvailableSlot("04:30PM - 05:00PM").getText();
//        //System.out.println("Found Available slot :: "+date);
//        Android.app.pliro.timeSchedule.tapTimeSlot();
//        Android.app.pliro.AppointmentConfirm.tapOkLinkText();
//
//    }



    }
