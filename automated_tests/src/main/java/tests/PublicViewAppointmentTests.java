package tests;

import api.android.Android;
import core.MyLogger;
import core.managers.TestManager;
import org.testng.annotations.Test;

/**
 * Created by sundus on 5/21/18.
 */
public class PublicViewAppointmentTests  extends TestManager{

    @Test(priority = 1)
    public void isSearchButtonVisible() {
        logger = report.createTest("Verify that home screen page is visible/available on Home screen");
        Android.app.pliro.HomeScreenPage.tapHomeButton();
    }

//    @Test(priority = 1)
//    public void isSearchDoctorLinkTextVisible() {
//        logger = report.createTest("Verify that search Doctor link text is visible/available on Home screen/page");
//        softAssert.assertEquals(Android.app.pliro.HomeScreenPage.findSearchDoctorButton(),"Search Doctor");
//        softAssert.assertAll();
//    }

    @Test(priority = 2)
    public void isSearchDiagnosticLinkTextVisible() {
        logger = report.createTest("Verify that Search Diagnostic link text is visble/available on Home screen/page");
        softAssert.assertEquals(Android.app.pliro.HomeScreenPage.findSearchDiagnosticButton(),"Search Diagnostic");
        softAssert.assertAll();
    }

    @Test(priority = 3)
    public void isTapToSelectLinkTextVisible() {
        logger = report.createTest("Verify that Speciality, doctor or health center drop down is visible/available on Home screen/page");
        softAssert.assertEquals(Android.app.pliro.HomeScreenPage.getTapToSelectText(),"Specialty, doctor, or health center");
        softAssert.assertAll();
    }

    @Test(priority = 4)
    public void isSelectionLocationLinkTextVisible() {
        logger = report.createTest("Verify that Selection location drop down is visible on Home screen");
        softAssert.assertEquals(Android.app.pliro.HomeScreenPage.isSelectionLinkTextVisible(),"Select location");
        softAssert.assertAll();
    }

    @Test(priority = 5)
    public void isFindDoctorButtonVisible() {
        logger = report.createTest("Verify that FIND DOCTOR button is visible/available on Home screen");
        softAssert.assertEquals(Android.app.pliro.HomeScreenPage.isFindDoctorButtonVisible(),"FIND DOCTOR");
        softAssert.assertAll();
    }

    @Test(priority = 6)
    public void isMoreSpecialitiesLinkTextVisible() {
        logger = report.createTest("Verify that more specialities drop down link/text is visible/available on Home Screen");
        softAssert.assertEquals(Android.app.pliro.HomeScreenPage.findMoreSpecialitiesLinkText(),"More Specialities");
        softAssert.assertAll();
    }

    @Test(priority = 7)
    public void clickOnTapToSelectDropDown() {
        logger = report.createTest("Verify that user is able to click at Speciality, doctor or health center drop down on Home screen/page");
        Android.app.pliro.HomeScreenPage.tapSelectDoctor();
    }

    @Test(priority = 8)
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
        logger = report.createTest("Verify that user is able to select test from the drop down");
        Android.app.pliro.selectCriteria.searchDoctor("pliromobiletestingformobile123potterkilledvoldemort");
        MyLogger.log.info("i m inside searchDoctor method");
        softAssert.assertEquals(Android.app.pliro.selectCriteria.isDoctorVisible("Test"), "Test");
        Android.app.pliro.selectCriteria.tapDoctor("Test");

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
        logger = report.createTest("Verify that user is able to search location(Testcity) from the location drop down");
        Android.app.pliro.selectLocation.sendTextToSearchField("pliromobiletestingformobile123potterkilledvoldemort");
        softAssert.assertEquals(Android.app.pliro.selectLocation.isLocationVisible("Testcity"),"Testcity");
        Android.app.pliro.selectLocation.tapLocation("Testcity");
    }

    @Test(priority = 18, dependsOnMethods = "searchLocation")
    public void tapFindDoctorButton() {
        logger = report.createTest("Verify that user is able to click on FIND DOCTOR button");
        Android.app.pliro.HomeScreenPage.tapFindDoctorButton();
    }

    @Test(priority = 19, dependsOnMethods = "tapFindDoctorButton")
    public void selectDoctor() {
        logger = report.createTest("Verify that user is able to click on Dr Test Doctor profile");
        if(Android.app.pliro.searchResults.isDoctorVisible("Dr. Test Doctor").contains("Dr. Test Doctor")){
            Android.app.pliro.searchResults.tapDoctor("Dr. Test Doctor");
        } else {
            throw new AssertionError("Dr. Test Doctor doesn't exists");
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
    public void isEnterNameFieldVisible() {
        logger = report.createTest("Verify that enter name field is visible/available on patient info screen");
        softAssert.assertEquals(Android.app.pliro.PublicViewAppointmentPage.findEnterNameTextField(), "ENTER NAME");
        softAssert.assertAll();
    }

    @Test(priority = 23, dependsOnMethods = "isEnterNameFieldVisible")
    public void enterName() {
        logger = report.createTest("Verify that User is able to enter sundus in Enter Name field visible on Patient info screen");
        Android.app.pliro.publicViewAppointment.getEnterNameTextField().sendText("sundus");
    }

    @Test(priority = 24, dependsOnMethods = "enterName")
    public void isPhoneNumberFieldVisible() {
        logger = report.createTest("Verify that Password field is visible/available on Login screen");
        String phone = Android.app.pliro.PublicViewAppointmentPage.findEnterPhoneNumberTextField();
        System.out.println("PHONENUMBERFROMTest ::"+phone);
    }

    @Test(priority = 25, dependsOnMethods = "isPhoneNumberFieldVisible" )
    public void isPatientInfoTextVisible() {
        logger = report.createTest("Verify that phone number field is visible/available on patient info screen");
        Android.app.pliro.PublicViewAppointmentPage.findPatientInfo();
    }

    @Test(priority = 26, dependsOnMethods = "isPhoneNumberFieldVisible")
    public void enterPhonenumber() {
        logger = report.createTest("Verify that User is able to enter 03235508124 in Phone Number field visible on Patient info screen");
        Android.app.pliro.publicViewAppointment.getEnterPhoneTextField().clearText();
        Android.app.pliro.publicViewAppointment.getEnterPhoneTextField().sendText("03235508124");

    }

    @Test(priority = 27, dependsOnMethods = "enterPhonenumber")
    public void clickOnConfirmAppointmentButton() {
        logger = report.createTest("Verify that  user is able to click on SIGN IN button");
        Android.app.pliro.PublicViewAppointmentPage.tapConfirmAppointmentButton();
    }

    @Test(priority = 28, dependsOnMethods = "clickOnConfirmAppointmentButton")
    public void clickOnConfirmAppointmentButtonAgain() {
        logger = report.createTest("Verify that  user is able to click on SIGN IN button");
        Android.app.pliro.PublicViewAppointmentPage.tapConfirmAppointmentButton();
    }

    @Test(priority = 29, dependsOnMethods = "clickOnConfirmAppointmentButtonAgain")
    public void isTimeScheduleWindowPageAvailable() {
        logger = report.createTest("Verify that Time schedule window page is visible");
        Android.app.pliro.timeSchedule.isTimeScheduleWindowVisible();
        softAssert.assertAll();
    }

    @Test(priority = 30, dependsOnMethods = "isTimeScheduleWindowPageAvailable")
    public void isTimeSlotAvailable() {
        logger = report.createTest("Verify that user can select current time slot for booking");
        //String date = Android.app.pliro.timeSchedule.uiObject.getAvailableSlot("04:30PM - 05:00PM").getText();
        //System.out.println("Found Available slot :: "+date);
        Android.app.pliro.timeSchedule.tapTimeSlot();
    }

    @Test(priority = 31, dependsOnMethods = "isTimeSlotAvailable")
    public void isConfirmAppointmentButtonVisible() {
        logger = report.createTest("Verify that Confirm appointment button is visible on Time Schedule Page");
        softAssert.assertEquals(Android.app.pliro.timeSchedule.isConfirmAppointmentButtonVisible(),"CONFIRM APPOINTMENT");
        softAssert.assertAll();
    }

    @Test(priority = 32, dependsOnMethods = "isConfirmAppointmentButtonVisible")
    public void tapConfirmAppointmentButton() {
        logger = report.createTest("Verify that user is able to click on Confirm Appointment button");
        Android.app.pliro.timeSchedule.tapConfirmAppointmentButton();
    }


    @Test(priority = 33, dependsOnMethods = "tapConfirmAppointmentButton")
    public void isCheckYourEmailTextVisible() {
        logger = report.createTest("Verify that Check Your Email is visible/available on Verification code screen");
        softAssert.assertEquals(Android.app.pliro.codePage.findCheckYourEmailText(), "CHECK YOUR EMAIL");
        softAssert.assertAll();
    }

    @Test(priority = 34, dependsOnMethods = "isCheckYourEmailTextVisible")
    public void isOrPhoneTextVisible() {
        logger = report.createTest("Verify that Or Phone Text is visible/available on Verification code screen");
        softAssert.assertEquals(Android.app.pliro.codePage.findOrPhoneText(), "OR PHONE");
        softAssert.assertAll();
    }

    @Test(priority = 35, dependsOnMethods = "isOrPhoneTextVisible")
    public void isCodeValue1FieldVisible() {
        logger = report.createTest("Verify that code value 1 field is visible/available on Verification code screen");
        Android.app.pliro.codePage.findCodeValue1Field();
    }

    @Test(priority = 36, dependsOnMethods = "isCodeValue1FieldVisible")
    public void enterCodeValue1Field() throws InterruptedException {
        logger = report.createTest("Verify that User is able to enter 0 in Code Value 1 field visible on Verification code screen");
        Android.app.pliro.codePageUiObject.getCodeValue1Field().clearText();
        Thread.sleep(2000);
        Android.app.pliro.codePageUiObject.getCodeValue1Field().sendText(" 0");
        System.out.println("ValueOfCodeField1::" + Android.app.pliro.codePageUiObject.getCodeValue1Field().getText());
    }

    @Test(priority = 37, dependsOnMethods = "enterCodeValue1Field")
    public void isCodeValue2FieldVisible() {
        logger = report.createTest("Verify that code value 2 field is visible/available on Verification code screen");
        Android.app.pliro.codePage.findCodeValue2Field();
    }

    @Test(priority = 38, dependsOnMethods = "isCodeValue2FieldVisible")
    public void enterCodeValue2Field() throws InterruptedException {
        logger = report.createTest("Verify that User is able to enter 0 in Code Value 2 field visible on Verification code screen");
        Android.app.pliro.codePageUiObject.getCodeValue2Field().clearText();
        Thread.sleep(2000);
        Android.app.pliro.codePageUiObject.getCodeValue2Field().sendText(" 0");
    }

    @Test(priority = 39, dependsOnMethods = "enterCodeValue2Field")
    public void isCodeValue3FieldVisible() {
        logger = report.createTest("Verify that code value 3 field is visible/available on Verification code screen");
        Android.app.pliro.codePage.findCodeValue3Field();
    }

    @Test(priority = 40, dependsOnMethods = "isCodeValue3FieldVisible")
    public void enterCodeValue3Field() {
        logger = report.createTest("Verify that User is able to enter 0 in Code Value 3 field visible on Verification code screen");
        Android.app.pliro.codePageUiObject.getCodeValue3Field().clearText();
        Android.app.pliro.codePageUiObject.getCodeValue3Field().sendText(" 0");
    }

    @Test(priority = 41, dependsOnMethods = "enterCodeValue3Field")
    public void isCodeValue4FieldVisible() {
        logger = report.createTest("Verify that code value 4 field is visible/available on Verification code screen");
        Android.app.pliro.codePage.findCodeValue4Field();
    }

    @Test(priority = 42, dependsOnMethods = "isCodeValue4FieldVisible")
    public void enterCodeValue4Field() {
        logger = report.createTest("Verify that User is able to enter 0 in Code Value 4 field visible on Verification code screen");
        Android.app.pliro.codePageUiObject.getCodeValue4Field().clearText();
        Android.app.pliro.codePageUiObject.getCodeValue4Field().sendText(" 0");
    }

    @Test(priority = 43, dependsOnMethods = "enterCodeValue4Field")
    public void congratulationsText() {
        logger = report.createTest("Verify that Congratulations text is visible upon successful appointment booking");
        softAssert.assertEquals(Android.app.pliro.congratulationsPage.isCongratulationsTextVisible(),"Congratulations");
        softAssert.assertAll();
    }

    @Test(priority = 44, dependsOnMethods = "congratulationsText")
    public void appointmentCompletedSuccessfullyText() {
        logger = report.createTest("Verify that Appointment Completed successfully text is visible upon successful appointment booking");
        softAssert.assertEquals(Android.app.pliro.congratulationsPage.isAppointmentCompletedTextVisible(),"Your Appointment Successfully Completed");
        softAssert.assertAll();
    }


}
