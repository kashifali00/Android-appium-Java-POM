package api.apps.Pliro.lookingForDoctorPage;

import core.UiObject;
import core.UiSelector;

/**
 * Created by Kashif on 3/26/2018.
 */
public class LookingForDoctorPageUiObject {

    private static UiObject
    lookingForDoctor,
    findBestDoctor,
    signInFaceBook,
    signInWithEmail,
    skipThisStep,
    dontHaveAccount,
    signUpNow;

    public UiObject getLookingForDoctorText() {
        if(lookingForDoctor == null) lookingForDoctor = new UiSelector().text("Looking For Doctor?").makeUiObject();
        return lookingForDoctor;
    }

    public UiObject getFindBestDoctor() {
        if(findBestDoctor == null) findBestDoctor = new UiSelector().text("Find the best doctors nearby and book health appointments at available times.").makeUiObject();
        return findBestDoctor;
    }

    public UiObject getSignInFaceBook() {
        if(signInFaceBook == null) signInFaceBook = new UiSelector().text("SIGNIN WITH FACEBOOK").makeUiObject();
        return signInFaceBook;
    }

    public UiObject getSignInWithEmail() {
        if(signInWithEmail == null) signInWithEmail = new UiSelector().text("LOGIN WITH EMAIL").makeUiObject();
        return signInWithEmail;
    }

    public UiObject getSkipThisStep() {
        if(skipThisStep == null) skipThisStep = new UiSelector().text("Skip this step, and start using Pliro").makeUiObject();
        return skipThisStep;
    }

    public UiObject getDontHaveAccount() {
        if(dontHaveAccount == null) dontHaveAccount = new UiSelector().text("Don’t have an account?").makeUiObject();
        return dontHaveAccount;
    }

    public UiObject getSignUpNow() {
        if(signUpNow == null) signUpNow = new UiSelector().text("Sign Up Now").makeUiObject();
        return signUpNow;
    }

}


