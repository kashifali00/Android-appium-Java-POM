package api.apps.Pliro.selectCriteria;

import core.UiObject;
import core.UiSelector;

/**
 * Created by Kashif on 3/29/2018.
 */
public class SelectCriteriaPageUiObject {

    private static UiObject
    backButton,
    closeButton,
    searchField,
    doctor,
    suggestions;

    public UiObject getBackButton() {
        if(backButton == null) backButton= new UiSelector().xPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageButton").makeUiObject();
        return backButton;
                
    }

    public UiObject getCloseButton() {
        if(closeButton == null) closeButton = new UiSelector().text("CLOSE").makeUiObject();
        return closeButton;
    }

    public UiObject getSearchField() {
        if(searchField == null) searchField = new UiSelector().text("Search").makeUiObject();
        return searchField;
    }

    public UiObject getSuggestions() {
        if(suggestions == null) suggestions = new UiSelector().text("Suggestions").makeUiObject();
        return suggestions;
    }

    public UiObject getDoctor(String doc) {
        if(doctor == null) doctor = new UiSelector().text(doc).makeUiObject();
        return doctor;
    }

}
