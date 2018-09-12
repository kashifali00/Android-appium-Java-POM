package api.apps.Pliro.pendingAppointment;

import core.UiObject;
import core.UiSelector;

public class PendingAppointmentUiObject {

    private static UiObject

            confirmAppointment,
            declineAppointment,
            cancel,
            okLinkText,
            declineOkLinkText,
            rescheduleLinkText,
            timeScheduleText,
            crosslink;

    public UiObject getConfirmAppointment() {
        if(confirmAppointment == null) confirmAppointment = new UiSelector().text("Confirm Appointment").makeUiObject();
        return confirmAppointment;
    }
    public UiObject getDeclineAppointment() {
        if(declineAppointment == null) declineAppointment = new UiSelector().text("Decline Appointment").makeUiObject();
        return declineAppointment;
    }

    public UiObject getCancel() {
        if(cancel == null) cancel = new UiSelector().text("CANCEL").makeUiObject();
        return cancel;
    }

    public UiObject getOkLinkText() {
        if(okLinkText == null) okLinkText = new UiSelector().text("OK").makeUiObject();
        return okLinkText;
    }

    public UiObject getDeclineOkLinkText() {
        if(declineOkLinkText == null) declineOkLinkText = new UiSelector().text("OK").makeUiObject();
        return declineOkLinkText;
    }

    public UiObject getRescheduleLinkText() {
        if(rescheduleLinkText == null) rescheduleLinkText = new UiSelector().text("Reschedule").makeUiObject();
        return rescheduleLinkText;
    }

    public UiObject getTimeScheduleText() {
        if(timeScheduleText == null) timeScheduleText = new UiSelector().text("Time Schedule").makeUiObject();
        return timeScheduleText;
    }
    public UiObject getCrossLink() {
        if(crosslink == null) crosslink = new UiSelector().xPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView").makeUiObject();
        return crosslink;
    }

}
