package api.apps.Pliro.homeScreen;

import core.UiObject;
import core.UiSelector;

public class HomeScreenPageUiObject {
    private static UiObject
            searchDoctorButton,
            searchDiagnosticButton,
            locationText,
            tapToSelect,
            selectLocation,
            moreSpecialitiesLinkText,
            dentistLinkText,
            tapToSelectField,
            locationField,
            findDoctorButton,
            okButton,
            nearByDoctorButton,
            SearchButton;

    public UiObject getSearchDoctorButton() {
        if(searchDoctorButton == null) searchDoctorButton = new UiSelector().text("Search Doctor").makeUiObject();
        return searchDoctorButton;
    }

    public UiObject getSearchDiagnosticButton() {
       if (searchDiagnosticButton == null) searchDiagnosticButton = new UiSelector().text("Search Diagnostic").makeUiObject();
        return searchDiagnosticButton;

    }

    public UiObject getLocationLinkText() {
        if (tapToSelect == null) tapToSelect = new UiSelector().text("Specialty, doctor, or health center").makeUiObject();
        return tapToSelect;
    }

    public UiObject selectLocation() {
        if (locationText == null) locationText = new UiSelector().text("Select location").makeUiObject();
        return locationText;

    }
    public  UiObject getCommonlySearchedSpecialtiesText() {
        if(selectLocation == null) selectLocation = new UiSelector().text("Commonly Searched Specialties").makeUiObject();
        return selectLocation;
    }

    public  UiObject getMoreSpecialitiesLinkText() {
        if(moreSpecialitiesLinkText == null) moreSpecialitiesLinkText = new UiSelector().text("More Specialities").makeUiObject();
        return moreSpecialitiesLinkText;
    }
    public  UiObject getDentistLinkText() {
        if(dentistLinkText == null) dentistLinkText = new UiSelector().text("Dentist").makeUiObject();
        return dentistLinkText;
    }
    public  UiObject getFindDoctorButton() {
        if(findDoctorButton == null) findDoctorButton = new UiSelector().text("FIND DOCTOR").makeUiObject();
        return findDoctorButton;
    }

    public  UiObject getOkButton() {
        if(okButton == null) okButton = new UiSelector().text("OK").makeUiObject();
        return okButton;
    }

}
