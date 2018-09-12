package api.apps.Pliro.selectLocation;

import core.MyLogger;

import java.util.NoSuchElementException;

/**
 * Created by Kashif on 3/29/2018.
 */
public class SelectLocationPage {

    public SelectLocationPageUiObject uiObject = new SelectLocationPageUiObject();

    public String isLocationVisible (String loc) {
        try {
            MyLogger.log.info("Finding location ["+loc+"]");
            MyLogger.log.info("Successfully found text : " + uiObject.getLocation(loc).getText());
            return uiObject.getLocation(loc).getText();

        }catch (NoSuchElementException e) {
            throw new AssertionError("location does't exist, Element not found or absent");
        }
    }

    public String isSearchFieldVisible () {
        try {
            MyLogger.log.info("Finding location search field");
            MyLogger.log.info("Successfully found text : " + uiObject.getSearchField().getText());
            return uiObject.getSearchField().getText();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Search field does't exist, Element not found or absent");
        }
    }


    public void sendTextToSearchField(String location) {
        try {
            MyLogger.log.info("Sending text data to search field");
            uiObject.getSearchField().sendText(location);

        }catch (NoSuchElementException e) {
            throw new AssertionError("Search field doesn't exists, element absent or blocked");
        }

    }

    public void tapLocation (String currentLocation) {
        try {
            MyLogger.log.info("Clicking on location["+currentLocation+"]");
            uiObject.getLocation(currentLocation).tap();
            uiObject.getLocation(currentLocation).tap();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Islamabad location doesn't exists, element absent or blocked");
        }
    }

}
