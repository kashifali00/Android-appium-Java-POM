package tests;

import api.android.Android;
import core.managers.TestManager;
import org.testng.annotations.Test;

public class AppointmentDeclineTests extends TestManager {

    @Test(priority = 1)
    public void clickOnDeclineLinkText () {
        logger = report.createTest("Verify that user is able to click at confirm Link Text on Pending Appointments screen/page");
        Android.app.pliro.PendingPage.tapDeclineLinkText();
    }

    @Test(priority = 2, dependsOnMethods = "clickOnDeclineLinkText")
    public void isConfirmDeclineAppointmentTextVisible() {
        logger = report.createTest("Verify that Confirm Appointment text is visible/available on Pending Appointments screen");
        Android.app.pliro.AppointmentConfirm.findDeclineAppointmentText();
    }

    @Test(priority = 3, dependsOnMethods = "clickOnDeclineLinkText")
    public void isCancelTextVisible() {
        logger = report.createTest("Verify that Cancel text is visible/available on Pending Appointments screen");
        Android.app.pliro.AppointmentConfirm.findCancelLinkText();
    }

    @Test(priority = 4, dependsOnMethods = "clickOnDeclineLinkText")
    public void isOkTextVisible() {
        logger = report.createTest("Verify that Confirm text is visible/available on Pending Appointments screen");
        Android.app.pliro.AppointmentConfirm.findOkLinkText();
    }

    @Test(priority = 5, dependsOnMethods = "clickOnDeclineLinkText")
    public void clickOnCancelLinkText() {
        logger = report.createTest("Verify that user is able to click at confirm Link Text on Pending Appointments screen/page");
        Android.app.pliro.AppointmentConfirm.tapCancelLinkText();
    }

    @Test(priority = 6, dependsOnMethods = "clickOnDeclineLinkText")
    public void clickOnDeclineOklLinkText() {
        logger = report.createTest("Verify that user is able to click at confirm Link Text on Pending Appointments screen/page");
        Android.app.pliro.PendingPage.tapDeclineLinkText();
        Android.app.pliro.AppointmentConfirm.tapOkLinkText();

    }
//    @Test(priority = 7, dependsOnMethods = "clickOnDeclineOklLinkText")
//    public void clickOnOkWhileBookingLinkText() {
//        logger = report.createTest("Verify that user is able to click at confirm Link Text on Pending Appointments screen/page");
//        Android.app.pliro.AppointmentConfirm.findDeclineOkLinkText();
//        Android.app.pliro.AppointmentConfirm.tapDeclineOkLinkText();
//
//    }
}
