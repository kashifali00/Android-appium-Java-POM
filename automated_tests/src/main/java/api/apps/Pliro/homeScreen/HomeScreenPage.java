package api.apps.Pliro.homeScreen;

import core.MyLogger;

import java.util.NoSuchElementException;

public class HomeScreenPage {


    public HomeScreenPageUiObject uiObject = new HomeScreenPageUiObject();

    public String findSearchDoctorButton() {
        try {
            MyLogger.log.info("Finding Search Doctor button on Home Screen page");
            MyLogger.log.info("Successfully found Field : " + uiObject.getSearchDoctorButton().getText());
            return uiObject.getSearchDoctorButton().getText();

        } catch (NoSuchElementException e) {
            throw new AssertionError("Search Doctor Button doesn't exits on Home Screen page, element absent or blocked");
        }
    }

    public String findSearchDiagnosticButton() {
        try {
            MyLogger.log.info("Finding Search Diagnostic button on Home Screen page");
            MyLogger.log.info("Successfully found Field : " + uiObject.getSearchDiagnosticButton().getText());
            return uiObject.getSearchDiagnosticButton().getText();

        } catch (NoSuchElementException e) {
            throw new AssertionError("Search Diagnostic doesn't exits on Home Screen page, element absent or blocked");
        }
    }

    public String getTapToSelectText() {
        try {
            MyLogger.log.info("Finding Tap to Select button on Home Screen page");
            MyLogger.log.info("Successfully found Field : " + uiObject.getLocationLinkText().getText());
            return uiObject.getLocationLinkText().getText();

        } catch (NoSuchElementException e) {
            throw new AssertionError("Tap to select button doesn't exits on Home Screen page, element absent or blocked");
        }

    }

    public void tapSelectDoctor () {
        try {
            MyLogger.log.info("Clicking on tap to select link text on Home Screen page");
            uiObject.getLocationLinkText().tap();

        }catch (NoSuchElementException e) {
            throw new AssertionError("tap to select link text doesn't exits on Home Screen page, element absent or blocked");
        }
    }

    public void tapSearchDoctorButton () {
        try {
            MyLogger.log.info("Clicking on Search Doctor Button on Home Screen page");
            uiObject.getSearchDoctorButton().tap();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Search Doctor doesn't exits on Home Screen page, element absent or blocked");
        }
    }

    public void tapSearchDiagnosticButton () {
        try {
            MyLogger.log.info("Clicking on Search Diagnostic Button in on Home Screen page");
            uiObject.getSearchDiagnosticButton().tap();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Search Diagnostic Button doesn't exits on Home Screen page, element absent or blocked");
        }
    }

    public String isSelectionLinkTextVisible() {
        try {
            MyLogger.log.info("Finding Select location Text on Home Screen page");
            MyLogger.log.info("Successfully found Field : " + uiObject.selectLocation().getText());
            return uiObject.selectLocation().getText();

        } catch (NoSuchElementException e) {
            throw new AssertionError("Select location Text doesn't exits on Home Screen page, element absent or blocked");
        }
    }

    public void tapSelectionLocationButton () {
        try {
            MyLogger.log.info("Clicking on Select Location link text in on Home Screen page");
            uiObject.selectLocation().tap();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Select Location link text doesn't exits on Home Screen page, element absent or blocked");
        }
    }


    public String findCommonlySearchedSpecialtiesText () {
        try {
            MyLogger.log.info("Finding Commonly Searched Specialties text on Home Screen page");
            MyLogger.log.info("Successfully found Field : " + uiObject.getCommonlySearchedSpecialtiesText().getText());
            return uiObject.getCommonlySearchedSpecialtiesText().getText();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Commonly Searched Specialties text doesn't exits on Home Screen page, element absent or blocked");
        }
    }

    public String findMoreSpecialitiesLinkText () {
        try {
            MyLogger.log.info("Finding More Specialities link text on Home Screen page");
            MyLogger.log.info("Successfully found Field : " + uiObject.getMoreSpecialitiesLinkText().getText());
            return uiObject.getMoreSpecialitiesLinkText().getText();

        }catch (NoSuchElementException e) {
            throw new AssertionError("More Specialities link text doesn't exits on login page, element absent or blocked");
        }
    }


    public void tapMoreSpecialitiesLinkText () {
        try {
            MyLogger.log.info("Clicking on More Specialities on Home Screen page");
            uiObject.getMoreSpecialitiesLinkText().tap();

        }catch (NoSuchElementException e) {
            throw new AssertionError("More Specialities link text doesn't exits on login page, element absent or blocked");
        }
    }
    public String findDentistLinkText () {
        try {
            MyLogger.log.info("Finding Dentist link text on Home Screen page");
            MyLogger.log.info("Successfully found Field : " + uiObject.getDentistLinkText().getText());
            return uiObject.getDentistLinkText().getText();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Dentist link text doesn't exits on Home Screen page, element absent or blocked");
        }
    }

    public void tapDentistLinkText () {
        try {
            MyLogger.log.info("Clicking on Dentist Link Text on Home Screen page");
            uiObject.getDentistLinkText().tap();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Dentist link text doesn't exits on login page, element absent or blocked");
        }
    }
    public String isFindDoctorButtonVisible() {
        try {
            MyLogger.log.info("Finding FIND DOCTOR Button text on Home Screen page");
            MyLogger.log.info("Successfully found Field : " + uiObject.getFindDoctorButton().getText());
            return uiObject.getFindDoctorButton().getText();

        }catch (NoSuchElementException e) {
            throw new AssertionError("FIND DOCTOR Button text doesn't exits on Home Screen page, element absent or blocked");
        }
    }

    public void tapFindDoctorButton() {
        try {
            MyLogger.log.info("Clicking on FIND DOCTOR button Link Text on Home Screen page");
            uiObject.getFindDoctorButton().tap();

        }catch (NoSuchElementException e) {
            throw new AssertionError("FIND DOCTOR Button doesn't exits on Home Screen page, element absent or blocked");
        }
    }

    public String findOkButton () {
        try {
            MyLogger.log.info("Finding FIND DOCTOR Button text on Home Screen page");
            MyLogger.log.info("Successfully found Field : " + uiObject.getOkButton().getText());
            return uiObject.getOkButton().getText();

        }catch (NoSuchElementException e) {
            throw new AssertionError("FIND DOCTOR Button text doesn't exits on Home Screen page, element absent or blocked");
        }
    }

    public void tapOkButton () {
        try {
            MyLogger.log.info("Clicking on FIND DOCTOR button Link Text on Home Screen page");
            uiObject.getOkButton().tap();

        }catch (NoSuchElementException e) {
            throw new AssertionError("FIND DOCTOR Button doesn't exits on Home Screen page, element absent or blocked");
        }
    }


}
