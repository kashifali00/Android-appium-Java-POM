package tests;

import api.android.Android;
import com.aventstack.extentreports.gherkin.model.And;
import core.MyLogger;
import core.UiObject;
import core.managers.TestManager;
import org.testng.annotations.Test;

/**
 * Created by Kashif on 3/29/2018.
 */
public class AppointmentBookingPatientTests extends TestManager{

    @Test(priority = 1)
    public void isSearchDoctorLinkTextVisible() {
        logger = report.createTest("Verify that search Doctor link text is visible/available on Home screen/page");
        softAssert.assertEquals(Android.app.pliro.HomeScreenPage.findSearchDoctorButton(),"Search Doctor");
        softAssert.assertAll();
    }

    @Test(priority = 2, dependsOnMethods = "isSearchDoctorLinkTextVisible")
    public void isSearchDiagnosticLinkTextVisible() {
        logger = report.createTest("Verify that Search Diagnostic link text is visble/available on Home screen/page");
        softAssert.assertEquals(Android.app.pliro.HomeScreenPage.findSearchDiagnosticButton(),"Search Diagnostic");
        softAssert.assertAll();
    }

    @Test(priority = 3, dependsOnMethods = "isSearchDoctorLinkTextVisible")
    public void isTapToSelectLinkTextVisible() {
        logger = report.createTest("Verify that Speciality, doctor or health center drop down is visible/available on Home screen/page");
        softAssert.assertEquals(Android.app.pliro.HomeScreenPage.getTapToSelectText(),"Specialty, doctor, or health center");
        softAssert.assertAll();
    }

    @Test(priority = 4, dependsOnMethods = "isTapToSelectLinkTextVisible")
    public void isSelectionLocationLinkTextVisible() {
        logger = report.createTest("Verify that Selection location drop down is visible on Home screen");
        softAssert.assertEquals(Android.app.pliro.HomeScreenPage.isSelectionLinkTextVisible(),"Select location");
        softAssert.assertAll();
    }

    @Test(priority = 5, dependsOnMethods = "isSelectionLocationLinkTextVisible")
    public void isFindDoctorButtonVisible() {
        logger = report.createTest("Verify that FIND DOCTOR button is visible/available on Home screen");
        softAssert.assertEquals(Android.app.pliro.HomeScreenPage.isFindDoctorButtonVisible(),"FIND DOCTOR");
        softAssert.assertAll();
    }

    @Test(priority = 6, dependsOnMethods = "isFindDoctorButtonVisible")
    public void isMoreSpecialitiesLinkTextVisible() {
        logger = report.createTest("Verify that more specialities drop down link/text is visible/available on Home Screen");
        softAssert.assertEquals(Android.app.pliro.HomeScreenPage.findMoreSpecialitiesLinkText(),"More Specialities");
        softAssert.assertAll();
    }

    @Test(priority = 7, dependsOnMethods = "isMoreSpecialitiesLinkTextVisible")
    public void clickOnTapToSelectDropDown() {
        logger = report.createTest("Verify that user is able to click at Speciality, doctor or health center drop down on Home screen/page");
        Android.app.pliro.HomeScreenPage.tapSelectDoctor();
    }

    @Test(priority = 8, dependsOnMethods = "clickOnTapToSelectDropDown")
    public void isSearchVisible() {
        logger = report.createTest("Verify that Search Field is visible on Select Criteria Page");
        softAssert.assertEquals(Android.app.pliro.selectCriteria.isSearchFieldVisible(),"Search");
        softAssert.assertAll();
    }

    @Test(priority = 9, dependsOnMethods = "isSearchVisible")
    public void isCloseButtonVisible() {
        logger = report.createTest("Verify that Close button is visible on select Criteria page");
        softAssert.assertEquals(Android.app.pliro.selectCriteria.isCloseButtonVisible(),"CLOSE");
        softAssert.assertAll();
    }

    @Test(priority = 10, dependsOnMethods = "isCloseButtonVisible")
    public void isCloseButtonClickable() {
        logger = report.createTest("Verify that user is able to click on Close button visible on select Criteria page");
        Android.app.pliro.selectCriteria.tapCloseButton();
    }

    @Test(priority = 11, dependsOnMethods = "isCloseButtonClickable")
    public void clickTapToSelectDropDown() {
        logger = report.createTest("Verify that user is able to click at Speciality, doctor or health center drop down on Home screen/page");
        Android.app.pliro.HomeScreenPage.tapSelectDoctor();
    }

    @Test(priority = 12, dependsOnMethods = "clickTapToSelectDropDown")
    public void clickBackButton() {
        logger = report.createTest("Verify that user is able to click on Back button visible on select Criteria page");
        Android.app.pliro.selectCriteria.tapBackButton();
    }

    @Test(priority = 13, dependsOnMethods = "clickBackButton")
    public void clickTapToSelectDD() {
        logger = report.createTest("Verify that user is able to click at Speciality, doctor or health center drop down on Home screen/page");
        Android.app.pliro.HomeScreenPage.tapSelectDoctor();
    }

    @Test(priority = 14, dependsOnMethods = "clickTapToSelectDD")
    public void searchDoctor() {
        logger = report.createTest("Verify that user is able to select Dentist from the drop down");
        Android.app.pliro.selectCriteria.searchDoctor("dentis");
        MyLogger.log.info("i m inside searchDoctor method");
        softAssert.assertEquals(Android.app.pliro.selectCriteria.isDoctorVisible("Dentist"), "Dentist");
        Android.app.pliro.selectCriteria.tapDoctor("Dentist");

    }

    @Test(priority = 15, dependsOnMethods = "searchDoctor")
    public void clickLocationDD() {
        logger = report.createTest("Verify that user is able to click at location drop down");
        Android.app.pliro.HomeScreenPage.tapSelectionLocationButton();
    }


    @Test(priority = 16, dependsOnMethods = "clickLocationDD")
    public void isSearchFieldOnLocationPageVisible() {
        logger = report.createTest("Verify that Search field is available on select location page");
        softAssert.assertEquals(Android.app.pliro.selectLocation.isSearchFieldVisible(),"Search");
        softAssert.assertAll();
    }

    @Test(priority = 17, dependsOnMethods = "isSearchFieldOnLocationPageVisible")
    public void searchLocation() {
        logger = report.createTest("Verify that user is able to search location(Islamabad) from the location drop down");
        Android.app.pliro.selectLocation.sendTextToSearchField("Islamaba");
        softAssert.assertEquals(Android.app.pliro.selectLocation.isLocationVisible("Islamabad"),"Islamabad");
        Android.app.pliro.selectLocation.tapLocation("Islamabad");
    }

    @Test(priority = 18, dependsOnMethods = "searchLocation")
    public void tapFindDoctorButton() {
        logger = report.createTest("Verify that user is able to click on FIND DOCTOR button");
        Android.app.pliro.HomeScreenPage.tapFindDoctorButton();
    }

    @Test(priority = 19, dependsOnMethods = "tapFindDoctorButton")
    public void selectDoctor() {
        logger = report.createTest("Verify that user is able to click on Dr Waleed Zaman profile");
        if(Android.app.pliro.searchResults.isDoctorVisible("Dr. Waleed Zaman").contains("Dr. Waleed Zaman")){
            Android.app.pliro.searchResults.tapDoctor("Dr. Waleed Zaman");
        } else {
            throw new AssertionError("Dr. Waleed Zaman doesn't exists");
        }

    }

    @Test(priority = 20, dependsOnMethods = "selectDoctor")
    public void isBookAppointmentButtonVisible() {
        logger = report.createTest("Verify that Book Appointment button is visible");
        softAssert.assertEquals(Android.app.pliro.searchResults.isAppointmentBookingButtonVisible(),"Book Appointment");
        softAssert.assertAll();
    }

    @Test(priority = 21, dependsOnMethods = "isBookAppointmentButtonVisible")
    public void tapBookAppointmentButton() {
        logger = report.createTest("Verify that user is able to click on BookAppointment button");
        Android.app.pliro.searchResults.tapAppointmentBookingButton();
    }

    @Test(priority = 22, dependsOnMethods = "tapBookAppointmentButton")
    public void isTimeScheduleWindowPageAvailable() {
        logger = report.createTest("Verify that Time schedule window page is visible");
        softAssert.assertEquals(Android.app.pliro.timeSchedule.isTimeScheduleWindowVisible(), "Time Schedule");
        softAssert.assertAll();
    }

    @Test(priority = 23, dependsOnMethods = "isTimeScheduleWindowPageAvailable")
    public void isTimeSlotAvailable() {
        logger = report.createTest("Verify that user can select current time slot for booking");
        //String date = Android.app.pliro.timeSchedule.uiObject.getAvailableSlot("04:30PM - 05:00PM").getText();
        //System.out.println("Found Available slot :: "+date);
        Android.app.pliro.timeSchedule.tapTimeSlot();
    }

    @Test(priority = 24, dependsOnMethods = "isTimeSlotAvailable")
    public void isConfirmAppointmentButtonVisible() {
        logger = report.createTest("Verify that Confirm appointment button is visible on Time Schedule Page");
        softAssert.assertEquals(Android.app.pliro.timeSchedule.isConfirmAppointmentButtonVisible(),"CONFIRM APPOINTMENT");
        softAssert.assertAll();
    }

    @Test(priority = 25, dependsOnMethods = "isConfirmAppointmentButtonVisible")
    public void tapConfirmAppointmentButton() {
        logger = report.createTest("Verify that user is able to click on Confirm Appointment button");
        Android.app.pliro.timeSchedule.tapConfirmAppointmentButton();
    }

    @Test(priority = 26, dependsOnMethods = "tapConfirmAppointmentButton")
    public void congratulationsText() {
        logger = report.createTest("Verify that Congratulations text is visible upon successful appointment booking");
        softAssert.assertEquals(Android.app.pliro.congratulationsPage.isCongratulationsTextVisible(),"Congratulations");
        softAssert.assertAll();
    }

    @Test(priority = 27, dependsOnMethods = "congratulationsText")
    public void appointmentCompletedSuccessfullyText() {
        logger = report.createTest("Verify that Appointment Completed successfully text is visible upon successful appointment booking");
        softAssert.assertEquals(Android.app.pliro.congratulationsPage.isAppointmentCompletedTextVisible(),"Your Appointment Successfully Completed");
        softAssert.assertAll();
    }

    @Test(priority = 28, dependsOnMethods = "appointmentCompletedSuccessfullyText")
    public void continueUsingPliroButton() {
        logger = report.createTest("Verify that Continue using pliro button is visible upon successful appointment booking");
        softAssert.assertEquals(Android.app.pliro.congratulationsPage.isContinueUsingPliroButtonVisible(),"Continue Using Pliro");
        softAssert.assertAll();
    }

    @Test(priority = 29, dependsOnMethods = "continueUsingPliroButton")
    public void tapContinueUsingPliroButton() {
        logger = report.createTest("Verify that user is able to click on Continue using pliro button visible upon successful appointment booking");
        Android.app.pliro.congratulationsPage.tapContinueUsingPliroButton();
    }

}
