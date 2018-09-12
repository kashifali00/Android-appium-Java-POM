package api.apps.Pliro.searchResults;

import core.MyLogger;

import java.util.NoSuchElementException;

/**
 * Created by Kashif on 3/30/2018.
 */
public class SearchResultsPage {

    public SearchResultsPageUiObject uiObject = new SearchResultsPageUiObject();

    public String isDoctorVisible (String docName) {
        try {
            MyLogger.log.info("Finding ["+docName+"] at search results page"+docName);
            MyLogger.log.info("Successfully found text : " + uiObject.getDoctor(docName).getText());
            return uiObject.getDoctor(docName).getText();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Doctor not found");
        }
    }

    public void tapDoctor(String docName) {
        try {
            MyLogger.log.info("Clicking ["+docName+"] on Select results page"+docName);
            uiObject.getDoctor(docName).tap();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Doctor doesn't exits, element absent or blocked");
        }
    }

    public String isAppointmentBookingButtonVisible () {
        try {
            MyLogger.log.info("Finding Appointment Booking at search results page");
            MyLogger.log.info("Successfully found text : " + uiObject.getBookAppointment().getText());
            return uiObject.getBookAppointment().getText();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Element not found");
        }
    }

    public void tapAppointmentBookingButton() {
        try {
            MyLogger.log.info("Clicking Appointment Booking on Select results page");
            uiObject.getBookAppointment().tap();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Appointment doesn't exits, element absent or blocked");
        }
    }


}
