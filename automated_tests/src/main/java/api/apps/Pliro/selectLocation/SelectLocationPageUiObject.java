package api.apps.Pliro.selectLocation;

import core.UiObject;
import core.UiSelector;

/**
 * Created by Kashif on 3/29/2018.
 */
public class SelectLocationPageUiObject {

    private static UiObject
            location,
            searchField;



    public UiObject getLocation(String setLocation) {
        if(location == null) location = new UiSelector().text(setLocation).makeUiObject();
        return location;
    }

    public UiObject getSearchField() {
        if(searchField == null) searchField = new UiSelector().text("Search").makeUiObject();
        return searchField;
    }

}
