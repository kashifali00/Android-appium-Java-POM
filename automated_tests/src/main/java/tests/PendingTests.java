package tests;
import api.android.Android;
import core.managers.TestManager;
import org.testng.annotations.Test;

public class PendingTests extends TestManager {

    @Test(priority = 1)
    public void selectPendingAppointments() {
        logger = report.createTest("Verify that user is able to click on Pending Appointments");
        Android.app.pliro.PendingPage.findNoPendingAppointments();
    }

    @Test(priority = 2)
    public void isRescheduleLinkTextVisible() {
        logger = report.createTest("Verify that Reschedule link/text is visible/available on Appointments screen");
        Android.app.pliro.PendingPage.findRescheduleText();
    }

    @Test(priority = 3)
    public void isDeclineLinkTextVisible () {
        logger = report.createTest("Verify that Decline link/text is visible/available on Appointments screen");
        Android.app.pliro.PendingPage.findDeclineText();
    }

    @Test(priority = 4)
    public void isConfirmLinkTextVisible () {
        logger = report.createTest("Verify that Confirm link/text is visible/available on Appointments screen");
        Android.app.pliro.PendingPage.findConfirmText();
    }



}
