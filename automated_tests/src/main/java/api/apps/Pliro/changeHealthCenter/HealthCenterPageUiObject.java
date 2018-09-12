package api.apps.Pliro.changeHealthCenter;

import core.UiObject;
import core.UiSelector;

public class HealthCenterPageUiObject {

    private static UiObject

            healthCenterChangeLinkText,
            healthCenter,
            hcField;

    public  UiObject getHealthCenterChangeLinkText() {
        if(healthCenterChangeLinkText == null) healthCenterChangeLinkText = new UiSelector().xPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView[2]").makeUiObject();
        return healthCenterChangeLinkText;
    }
    public UiObject getHealthCenter(String setHC) {
        if(healthCenter == null) healthCenter = new UiSelector().text(setHC).makeUiObject();
        return healthCenter;
    }

    public UiObject getHCField() {
        if(hcField == null) hcField = new UiSelector().text("The Dental Consultants, Jinnah Super").makeUiObject();
        return hcField;
    }
}
