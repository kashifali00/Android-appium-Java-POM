package api.apps.Pliro.loginPage;

import core.MyLogger;

import java.util.NoSuchElementException;

/**
 * Created by Kashif on 3/28/2018.
 */
public class LoginPage {

    public LoginPageUiObject uiObject = new LoginPageUiObject();

    public String findEmailField () {
        try {
            MyLogger.log.info("Finding Sign in field on Login page");
            MyLogger.log.info("Successfully found Field : " + uiObject.getEmailField().getText());
            return uiObject.getEmailField().getText();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Email field doesn't exits on login page, element absent or blocked");
        }
    }

    public String findPasswordField () {
        try {
            MyLogger.log.info("Finding password field on Login page");
            MyLogger.log.info("Successfully found Field : "+uiObject.getPasswordField().getText());
            return uiObject.getPasswordField().getText();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Password field doesn't exits on login page, element absent or blocked");
        }
    }

    public String findSignInButton () {
        try {
            MyLogger.log.info("Finding Sign in field on Login page");
            MyLogger.log.info("Successfully found Field : " + uiObject.getSignInButton().getText());
            return uiObject.getSignInButton().getText();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Sign in doesn't exits on login page, element absent or blocked");
        }
    }

    public void tapSignInButton () {
        try {
            MyLogger.log.info("Clicking on Sign in on Login page");
            uiObject.getSignInButton().tap();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Sign in doesn't exits on login page, element absent or blocked");
        }
    }

    public void tapContinueLinkText () {
        try {
            MyLogger.log.info("Clicking on CONTINUE Button");
            uiObject.getContinueLinkText().tap();

        }catch (NoSuchElementException e) {
            throw new AssertionError("CONTINUE Button, element absent or blocked");
        }
    }

    public String findDontHaveAccount () {
        try {
            MyLogger.log.info("Finding Dont have account link text on Login page");
            MyLogger.log.info("Successfully found Field : " + uiObject.getDontHaveAccountLinkText().getText());
            return uiObject.getDontHaveAccountLinkText().getText();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Don't have account link text doesn't exits on login page, element absent or blocked");
        }
    }

    public void tapDontHaveAccountLinkText () {
        try {
            MyLogger.log.info("Clicking on Sign in on Login page");
            uiObject.getDontHaveAccountLinkText().tap();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Dont have account link text doesn't exits on login page, element absent or blocked");
        }
    }

    public String findSignUpNow () {
        try {
            MyLogger.log.info("Finding Sign up now link text on Login page");
            MyLogger.log.info("Successfully found Field : " + uiObject.getSignUpNowLinkText().getText());
            return uiObject.getSignUpNowLinkText().getText();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Sign up now link text doesn't exits on login page, element absent or blocked");
        }
    }


    public void tapDontSignUpNowLinkText () {
        try {
            MyLogger.log.info("Clicking on Sign up now on Login page");
            uiObject.getSignUpNowLinkText().tap();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Sign up now link text doesn't exits on login page, element absent or blocked");
        }
    }

}
