package tests;

import api.android.Android;
import core.managers.TestManager;
import org.testng.annotations.Test;

public class HealthCenterTests extends TestManager{

    @Test(priority = 1)
    public void isHealthCenterChangeLinkTextVisible() {
        logger = report.createTest("Verify that HC change link/text is visible/available on Appointments screen");
        Android.app.pliro.HealthCenterPage.findHealthCenterChangeLinkText();
    }

    @Test(priority = 2)
    public void clickOnHCChangeDropDown() {
        logger = report.createTest("Verify that user is able to click at HC dropdown on Appointment screen/page");
        Android.app.pliro.HealthCenterPage.tapHealthCenterChangeLinkText();
    }

    @Test(priority = 3)
    public void isSearchFieldOnHCPageVisible() {
        logger = report.createTest("Verify that Role field is available on select Change Role page");
        Android.app.pliro.HealthCenterPage.isHealthCenterFieldVisible();
    }

    @Test(priority = 4)
    public void searchHC() {
        logger = report.createTest("Verify that user is able to select Role(Doctor) from the Change role drop down");
        Android.app.pliro.HealthCenterPage.sendHCToSearchField("The Dental Consultants, Jinnah Super");
        softAssert.assertEquals(Android.app.pliro.HealthCenterPage.isHCVisible("The Dental Consultants, Jinnah Super"), "Doctor");
        Android.app.pliro.HealthCenterPage.tapHC("The Dental Consultants, Jinnah Super");

    }



}
