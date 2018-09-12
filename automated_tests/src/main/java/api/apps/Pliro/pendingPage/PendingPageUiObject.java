package api.apps.Pliro.pendingPage;

import core.UiObject;
import core.UiSelector;

public class PendingPageUiObject {

    private static UiObject

            noPending,
            reschedule,
            confirm,
            decline;

    public UiObject getNoPendingText() {
        if(noPending == null) noPending = new UiSelector().text("No Pending Appointment").makeUiObject();
        return noPending;
    }

    public  UiObject getRescheduleText() {
        if(reschedule == null) reschedule = new UiSelector().text("Reschedule").makeUiObject();
        return reschedule;
    }
    public UiObject getConfirm() {
        if(confirm == null) confirm = new UiSelector().text("Confirm").makeUiObject();
        return confirm;
    }

    public UiObject getDecline() {
        if(decline == null) decline = new UiSelector().text("Decline").makeUiObject();
        return decline;
    }

    public UiObject getNoPending(String setStatus) {
        if(noPending == null) noPending = new UiSelector().text(setStatus).makeUiObject();
        return noPending;
    }







}
