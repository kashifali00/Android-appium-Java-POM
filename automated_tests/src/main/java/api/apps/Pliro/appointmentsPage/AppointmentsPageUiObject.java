package api.apps.Pliro.appointmentsPage;

import core.UiObject;
import core.UiSelector;

public class AppointmentsPageUiObject {
    private static UiObject

            appointmentsText,
            roleText,
            healthCenterText,
            createAppointmentButton,
            pendingTextLink,
            bookedTextLink,
            fullfilledTextLink,
            othersTextLink;

    public UiObject getAppointmentsText() {
        if(appointmentsText == null) appointmentsText = new UiSelector().xPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ImageView").makeUiObject();
        return appointmentsText;
    }
    public UiObject getRoleText() {
        if(roleText == null) roleText = new UiSelector().text("Viewing as ").makeUiObject();
        return roleText;
    }

    public UiObject getHealthCenterText() {
        if(healthCenterText == null) healthCenterText = new UiSelector().text("Health Center").makeUiObject();
        return healthCenterText;
    }

    public UiObject getPendingTextLink() {
        if(pendingTextLink == null) pendingTextLink = new UiSelector().text("Pending").makeUiObject();
        return pendingTextLink;
    }




}
