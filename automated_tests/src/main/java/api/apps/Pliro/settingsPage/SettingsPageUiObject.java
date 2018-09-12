package api.apps.Pliro.settingsPage;

import core.UiObject;
import core.UiSelector;

public class SettingsPageUiObject {

    public static UiObject
            settingsText,
            settingsButton,
            logoutTextLink,
            loginTextLink;


    public UiObject getsettingsText() {
        if(settingsText == null) settingsText = new UiSelector().xPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[4]/android.widget.ImageView").makeUiObject();
        return settingsText;
    }

    public  UiObject getLogoutTextLink() {
        if(logoutTextLink == null) logoutTextLink = new UiSelector().text("Logout").makeUiObject();
        return logoutTextLink;
    }

    public  UiObject getloginTextLink() {
        if(loginTextLink == null) loginTextLink = new UiSelector().text("Login").makeUiObject();
        return loginTextLink;
    }


}
