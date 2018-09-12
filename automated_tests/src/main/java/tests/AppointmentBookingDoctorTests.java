package tests;

import api.android.Android;
import core.managers.TestManager;
import org.testng.annotations.Test;

public class AppointmentBookingDoctorTests extends TestManager {

    @Test(priority = 1)
    public void isTabToAppointmentTextVisible() {
        logger = report.createTest("Verify user is able to click on appointments button");
        Android.app.pliro.AppointmentsPage.tapAppointmentsText();

    }

    @Test(priority = 2, dependsOnMethods = "isTabToAppointmentTextVisible")
    public void isRoleTextVisible() {
        logger = report.createTest("Verify that Speciality, doctor or health center drop down is visible/available on Home screen/page");
        Android.app.pliro.AppointmentsPage.findRoleText();

    }

    @Test(priority = 3, dependsOnMethods = "isTabToAppointmentTextVisible")
    public void isHealthCareTextVisible() {
        logger = report.createTest("Verify that health center text is visible/available on Appointments screen/page");
        Android.app.pliro.AppointmentsPage.findHealthCareText();

    }

    @Test(priority = 4, dependsOnMethods = "isTabToAppointmentTextVisible")
    public void isPendingTextVisible() {
        logger = report.createTest("Verify that pending text is visible/available on Appointments screen/page");
        Android.app.pliro.AppointmentsPage.tapPendingAppointmentsText();

    }



}
