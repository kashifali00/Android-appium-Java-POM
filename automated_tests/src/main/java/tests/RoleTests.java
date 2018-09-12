package tests;

import api.android.Android;
import core.managers.TestManager;
import org.testng.annotations.Test;

public class RoleTests extends TestManager {

    @Test(priority = 1)
    public void isRoleChangeLinkTextVisible() {
        logger = report.createTest("Verify that Role change link/text is visible/available on Appointments screen");
        Android.app.pliro.RolePage.findRoleChangeLinkText();
    }

    @Test(priority = 2)
    public void clickOnRoleChangeDropDown() {
        logger = report.createTest("Verify that user is able to click at Speciality, doctor or health center drop down on Home screen/page");
        Android.app.pliro.RolePage.tapRoleChangeLinkText();
    }

    @Test(priority = 3)
    public void isSearchFieldOnLocationPageVisible() {
        logger = report.createTest("Verify that Role field is available on select Change Role page");
        Android.app.pliro.RolePage.isRoleFieldVisible();
    }

    @Test(priority = 4)
    public void searchRole() {
        logger = report.createTest("Verify that user is able to select Role(Doctor) from the Change role drop down");
        Android.app.pliro.RolePage.sendRoleToSearchField("Doctor");
        softAssert.assertEquals(Android.app.pliro.RolePage.isRoleVisible("Doctor"), "Doctor");
        Android.app.pliro.RolePage.tapRole("Doctor");

    }

}
