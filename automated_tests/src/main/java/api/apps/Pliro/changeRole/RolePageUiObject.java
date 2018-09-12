package api.apps.Pliro.changeRole;

import core.UiObject;
import core.UiSelector;

public class RolePageUiObject {

    private static UiObject

            roleChangeLinkText,
            role,
            roleField;

    public  UiObject getRoleChangeLinkText() {
        if(roleChangeLinkText == null) roleChangeLinkText = new UiSelector().xPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]").makeUiObject();
        return roleChangeLinkText;
    }
    public UiObject getRole(String setRole) {
        if(role == null) role = new UiSelector().text(setRole).makeUiObject();
        return role;
    }

    public UiObject getRoleField() {
        if(roleField == null) roleField = new UiSelector().text("Doctor").makeUiObject();
        return roleField;
    }
}
