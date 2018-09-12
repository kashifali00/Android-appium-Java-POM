package api.apps.Pliro.changeHealthCenter;

import core.MyLogger;

import java.util.NoSuchElementException;

public class HealthCenterPage {

    public HealthCenterPageUiObject uiObject= new HealthCenterPageUiObject();


    public String findHealthCenterChangeLinkText () {
        try {
            MyLogger.log.info("Finding Health Center Change link text on Appointments Screen page");
            MyLogger.log.info("Successfully found Field : " + uiObject.getHealthCenterChangeLinkText().getText());
            return uiObject.getHealthCenterChangeLinkText().getText();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Health Center Change link text doesn't exits on login page, element absent or blocked");
        }
    }

    public void tapHealthCenterChangeLinkText () {
        try {
            MyLogger.log.info("Clicking on Change Health Center on Appointments Screen page");
            uiObject.getHealthCenterChangeLinkText().tap();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Change Health Center link text doesn't exits on Appointments page, element absent or blocked");
        }
    }

    public String isHCVisible (String hc) {
        try {
            MyLogger.log.info("Finding location ["+hc+"]");
            MyLogger.log.info("Successfully found text : " + uiObject.getHealthCenter(hc).getText());
            return uiObject.getHealthCenter(hc).getText();

        }catch (NoSuchElementException e) {
            throw new AssertionError("location does't exist, Element not found or absent");
        }
    }
    public void tapHC (String selectedhc) {
        try {
            MyLogger.log.info("Clicking on Change Health Center["+selectedhc+"]");
            uiObject.getHealthCenter(selectedhc).tap();


        }catch (NoSuchElementException e) {
            throw new AssertionError("Doctor role doesn't exists, element absent or blocked");
        }
    }

    public String isHealthCenterFieldVisible () {
        try {
            MyLogger.log.info("Finding location search field");
            MyLogger.log.info("Successfully found text : " + uiObject.getHCField().getText());
            return uiObject.getHCField().getText();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Search field does't exist, Element not found or absent");
        }
    }


    public void sendHCToSearchField(String hc) {
        try {
            MyLogger.log.info("Sending text data to search field");
            uiObject.getHCField().sendText(hc);

        }catch (NoSuchElementException e) {
            throw new AssertionError("Search field doesn't exists, element absent or blocked");
        }

    }
}
