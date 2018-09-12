package api.apps.Pliro.lookingForDoctorPage;

import core.MyLogger;

import java.util.NoSuchElementException;

/**
 * Created by Kashif on 3/26/2018.
 */
public class LookingForDoctorPage {

    public LookingForDoctorPageUiObject uiObject = new LookingForDoctorPageUiObject();

    public String findLookingForDoctorPageText () {
        try {
            MyLogger.log.info("Finding Looking For Doctor Page Text");
            MyLogger.log.info("Successfully found text : " + uiObject.getLookingForDoctorText().getText());
            return uiObject.getLookingForDoctorText().getText();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Looking for Doctor Page doesn't exits");
        }
    }

    public String findBestDoctorText () {
        try {
            MyLogger.log.info("Finding Best Doctor near by text");
            MyLogger.log.info("Successfully found text : " + uiObject.getFindBestDoctor().getText());
            return uiObject.getFindBestDoctor().getText();

        }catch (NoSuchElementException e) {
            return null;
        }
    }

    public boolean isSignInWithFacebookEnabled () {
        try {
            MyLogger.log.info("Checking if Signin With Facebook button exists");
            MyLogger.log.info("Successfully found button : " + uiObject.getSignInFaceBook().getText());
            return uiObject.getSignInFaceBook().isEnabled();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Signin with Facebook button doesn't exits");
        }

    }

    public void tapSigninWithFacebookButton () {
        try {
            MyLogger.log.info("Clicking on SignInWithFacebookButton");
            uiObject.getSignInFaceBook().tap();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Signin with Facebook button doesn't exits");
        }
    }

    public String isSignWithEmailEnabled () {
        try {
            MyLogger.log.info("Checking if Sign in With Email button exists");
            MyLogger.log.info("Successfully found button : " + uiObject.getSignInWithEmail().getText());
            return uiObject.getSignInWithEmail().getText();

        }catch (NoSuchElementException e) {
           return null;
        }

    }

    public void tapSigninWithEmailButton () {
        try {
            MyLogger.log.info("Clicking on SignInWithEmailButton");
            uiObject.getSignInWithEmail().tap();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Signin with Email button doesn't exits");
        }
    }

    public String findSkipThisStepLinkText () {
        try {
            MyLogger.log.info("Finding Skip this step, link text");
            MyLogger.log.info("Successfully found text : " + uiObject.getSkipThisStep().getText());
            return uiObject.getSkipThisStep().getText();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Skip this step link text doesn't exist on Looking for Doctor? page/screen");
        }
    }

    public void tapSkipThisStepLinkText () {
        try {
            MyLogger.log.info("Clicking on Skip this step link text");
            uiObject.getSkipThisStep().tap();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Skip this step link text doesn't exist on Looking for Doctor? page/screen");
        }
    }

    public String findDontHaveAccountLinkText () {
        try {
            MyLogger.log.info("Finding Don't have account?, link text");
            MyLogger.log.info("Successfully found text : " + uiObject.getDontHaveAccount().getText());
            return uiObject.getDontHaveAccount().getText();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Don't have account link text doesn't exist on Looking for Doctor? page/screen");
        }
    }

    public void tapDontHaveAccountLinkText () {
        try {
            MyLogger.log.info("Clicking on Don't have account? link text");
            uiObject.getDontHaveAccount().tap();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Don't have account link text doesn't exist on Looking for Doctor? page/screen");
        }
    }

    public String findSignupNowLinkText () {
        try {
            MyLogger.log.info("Finding Signup now , link text");
            MyLogger.log.info("Successfully found text : " + uiObject.getSignUpNow().getText());
            return uiObject.getSignUpNow().getText();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Sign Up Now link text doesn't exist on Looking for Doctor? page/screen");
        }
    }

    public void tapSignUpNowLinkText () {
        try {
            MyLogger.log.info("Clicking on Sign Up Now link text");
            uiObject.getSignUpNow().tap();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Sign Up Now link text doesn't exist on Looking for Doctor? page/screen");
        }
    }




}
