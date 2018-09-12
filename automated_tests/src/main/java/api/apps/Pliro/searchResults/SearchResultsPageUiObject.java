package api.apps.Pliro.searchResults;

import core.UiObject;
import core.UiSelector;

/**
 * Created by Kashif on 3/30/2018.
 */
public class SearchResultsPageUiObject {

    private static UiObject
    findDoctor,
    bookAppointment;

    public UiObject getDoctor(String doctorName) {
        if(findDoctor == null) findDoctor = new UiSelector().text(doctorName).makeUiObject();
        return findDoctor;
    }

    public UiObject getBookAppointment() {
        if(bookAppointment == null) bookAppointment = new UiSelector().text("Book Appointment").makeUiObject();
        return bookAppointment;
    }


}
