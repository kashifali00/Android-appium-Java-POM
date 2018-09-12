package api.apps.Pliro.loginPage;

import core.UiObject;
import core.UiSelector;

/**
 * Created by Kashif on 3/28/2018.
 */
public class LoginPageUiObject {
    private static UiObject
         emailField,
         passwordField,
         signInButton,
         dontHaveAccountLinkText,
         continueLinkText,
         signUpNowLinkText;

    public UiObject getEmailField() {
        if(emailField == null) emailField = new UiSelector().text("Email").makeUiObject();
        return emailField;
    }

    public UiObject getPasswordField() {
        if(passwordField == null) passwordField = new UiSelector().text("Password").makeUiObject();
        return passwordField;
    }

    public  UiObject getSignInButton() {
        if(signInButton == null) signInButton = new UiSelector().text("SIGN IN").makeUiObject();
        return signInButton;
    }

    public  UiObject getDontHaveAccountLinkText() {
        if(dontHaveAccountLinkText == null) dontHaveAccountLinkText = new UiSelector().text("Don't have an account?").makeUiObject();
        return dontHaveAccountLinkText;
    }

    public  UiObject getSignUpNowLinkText() {
        if(signUpNowLinkText == null) signUpNowLinkText = new UiSelector().text("Sign Up Now").makeUiObject();
        return signUpNowLinkText;
    }

    public  UiObject getContinueLinkText() {
        if(continueLinkText == null) continueLinkText = new UiSelector().text("CONTINUE").makeUiObject();
        return continueLinkText;
    }

}
