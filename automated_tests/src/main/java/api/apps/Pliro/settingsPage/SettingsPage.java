package api.apps.Pliro.settingsPage;

import core.MyLogger;

import java.util.NoSuchElementException;

public class SettingsPage {

    public SettingsPageUiObject uiObject= new SettingsPageUiObject();

    public void tapLoginTextLink () {
        try {
            MyLogger.log.info("Clicking on login button on Home Screen page");
            uiObject.getloginTextLink().tap();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Settings button doesn't exits on Home Screen page, element absent or blocked");
        }
    }

    public String findLogoutTextLink () {
        try {
            MyLogger.log.info("Finding Logout Text on Settings page");
            MyLogger.log.info("Successfully found Field : " + uiObject.getLogoutTextLink().getText());
            return uiObject.getLogoutTextLink().getText();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Logout text doesn't exits on Settings ");
        }
    }


    public String findloginTextLink () {
        try {
            MyLogger.log.info("Finding Login Text on Settings page");
            MyLogger.log.info("Successfully found Field : " + uiObject.getloginTextLink().getText());
            return uiObject.getloginTextLink().getText();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Login text doesn't exits on Settings ");
        }
    }

    public void tapsettingsText () {
        try {
            MyLogger.log.info("Clicking on Settings button on Home Screen page");
            uiObject.getsettingsText().tap();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Settings button doesn't exits on Home Screen page, element absent or blocked");
        }
    }


    public void tapLogoutTextLink () {
        try {
            MyLogger.log.info("Clicking on logout button on Settings page");
            uiObject.getLogoutTextLink().tap();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Logout text link doesn't exits on Settings page, element absent or blocked");
        }
    }




}
