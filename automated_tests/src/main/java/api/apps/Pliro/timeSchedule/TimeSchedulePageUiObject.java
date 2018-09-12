package api.apps.Pliro.timeSchedule;

import core.UiObject;
import core.UiSelector;

/**
 * Created by Kashif on 3/30/2018.
 */
public class TimeSchedulePageUiObject {

    private static UiObject
    timeSchedule,
    closeButton,
    confirmAppointmentButton,
    nextTimeSlot,
    availableSlot,
    noFreeSlot,
    timeSlot;

    public UiObject getTimeSchedule() {
        if(timeSchedule == null) timeSchedule = new UiSelector().text("Time Schedule").makeUiObject();
        return timeSchedule;
    }

    public UiObject getCloseButton(){
        if(closeButton == null) closeButton = new UiSelector().xPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView").makeUiObject();
        return closeButton;
    }

    public UiObject getTimeSlot(String date) {
        if(timeSlot == null) timeSlot = new UiSelector().text(date).makeUiObject();
        return timeSlot;
    }

    public UiObject getConfirmAppointmentButton() {
        if(confirmAppointmentButton == null) confirmAppointmentButton = new UiSelector().text("CONFIRM APPOINTMENT").makeUiObject();
        return confirmAppointmentButton;
    }

    public UiObject getNextTimeSlot() {
        if(nextTimeSlot == null) nextTimeSlot = new UiSelector().xPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[3]/android.widget.TextView").makeUiObject();
        return nextTimeSlot;
    }

    public UiObject getNoFreeSlot() {
        if(noFreeSlot == null) noFreeSlot = new UiSelector().text("No Free Slot Available For This Date").makeUiObject();
        return noFreeSlot;
    }

    public UiObject getAvailableSlot(String date) {
         availableSlot = new UiSelector().text(date).makeUiObject();
        return availableSlot;
    }
}
