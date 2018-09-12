package tests;

import api.android.Android;
import com.aventstack.extentreports.gherkin.model.And;
import core.managers.TestManager;
import org.testng.annotations.Test;

public class AppointmentConfirmTests extends TestManager{


    @Test(priority = 1)
    public void clickOnConfirmLinkText () {
        logger = report.createTest("Verify that user is able to click at confirm Link Text on Pending Appointments screen/page");
//        Android.app.pliro.PendingPage.findNoPendingAppointments();
        Android.app.pliro.PendingPage.tapConfirmLinkText();
    }
    @Test(priority = 2)
    public void isConfirmAppointmentTextVisible() {
        logger = report.createTest("Verify that Confirm Appointment text is visible/available on Pending Appointments screen");
        Android.app.pliro.AppointmentConfirm.findConfirmAppointmentText();
    }

    @Test(priority = 3, dependsOnMethods = "clickOnConfirmLinkText")
    public void isCancelTextVisible() {
        logger = report.createTest("Verify that Cancel text is visible/available on Pending Appointments screen");
        Android.app.pliro.AppointmentConfirm.findCancelLinkText();
    }

    @Test(priority = 4, dependsOnMethods = "clickOnConfirmLinkText")
    public void isOkTextVisible() {
        logger = report.createTest("Verify that Confirm text is visible/available on Pending Appointments screen");
        Android.app.pliro.AppointmentConfirm.findOkLinkText();
    }

    @Test(priority = 5, dependsOnMethods = "clickOnConfirmLinkText")
    public void clickOnCancelLinkText() {
        logger = report.createTest("Verify that user is able to click at confirm Link Text on Pending Appointments screen/page");
        Android.app.pliro.AppointmentConfirm.tapCancelLinkText();
    }

//    @Test(priority = 5)
//    public void clickOnConfirmLinkText() {
//        logger = report.createTest("Verify that user is able to click at confirm Link Text on Pending Appointments screen/page");
//        Android.app.pliro.PendingPage.tapConfirmLinkText();
//    }

    @Test(priority = 6, dependsOnMethods = "clickOnConfirmLinkText")
    public void clickOnCancelOklLinkText() {
        logger = report.createTest("Verify that user is able to click at confirm Link Text on Pending Appointments screen/page");
        Android.app.pliro.PendingPage.tapConfirmLinkText();
        Android.app.pliro.AppointmentConfirm.tapOkLinkText();

    }


}
