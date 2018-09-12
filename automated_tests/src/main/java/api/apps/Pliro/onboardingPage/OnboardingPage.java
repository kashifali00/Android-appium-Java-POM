package api.apps.Pliro.onboardingPage;

import core.MyLogger;

import java.util.NoSuchElementException;

/**
 * Created by Kashif on 3/15/2018.
 */
public class OnboardingPage {

    public OnboardingPageUiObject uiObject = new OnboardingPageUiObject();

    public String findGoodDoctorTextonPage1 () {
        try {
            MyLogger.log.info("Finding Good Doctor Text on onboarding page (1)");
            MyLogger.log.info("Successfully found text : "+uiObject.getSpecialityText().getText());
            return uiObject.getSpecialityText().getText();

        }catch (NoSuchElementException e) {
            return null;
        }
    }

    public String findDoctorCoverageTextonPage1 () {
        try {
            MyLogger.log.info("Finding Good Doctor Coverage Text on onboarding page (1)");
            MyLogger.log.info("Successfully found text : "+uiObject.getDoctorCoverageText().getText());
            return uiObject.getDoctorCoverageText().getText();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Can't get the text on onboarding page 1, element absent or blocked");
        }
    }

    public void tapNextButton () {
        try {
            MyLogger.log.info("Clicking on Next > button");
            uiObject.getNextButtonText().tap();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Can't get the next > button on onboarding page 1, element absent or blocked");
        }
    }

    public void tapNextButtonOnPage2 () {
        try {
            MyLogger.log.info("Clicking on Next > button");
            uiObject.getNextButtonOnPage2().tap();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Can't get the next > button on onboarding page 1, element absent or blocked");
        }
    }

    public void tapSkipButton () {
        try {
            MyLogger.log.info("Clicking on Skip button");
            uiObject.getSkipButton().tap();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Can't get Skip button on onboarding page 1, element absent or blocked");
        }
    }


    public void tapDoneButton () {
        try {
            MyLogger.log.info("Clicking on Done button");
            uiObject.getDoneButton().tap();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Can't get the next > button on onboarding page 1, element absent or blocked");
        }
    }

    public String findAppointmentTextonPage2 () {
        try {
            MyLogger.log.info("Finding Appointment Text on onboarding page (2)");
            MyLogger.log.info("Successfully found text : "+uiObject.getAppointmentText().getText());
            return uiObject.getAppointmentText().getText();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Can't get the text on onboarding page 2, element absent or blocked");
        }
    }

    public String findBestDoctorTextonPage2 () {
        try {
            MyLogger.log.info("Finding Best Doctor Text on onboarding page (2)");
            MyLogger.log.info("Successfully found text : "+uiObject.getBestDoctorsText().getText());
            return uiObject.getBestDoctorsText().getText();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Can't get the text on onboarding page 2, element absent or blocked");
        }
    }

    public String findQuestionsTextonPage3 () {
        try {
            MyLogger.log.info("Finding Questions Text on onboarding page (3)");
            MyLogger.log.info("Successfully found text : "+uiObject.getQuestionText().getText());
            return uiObject.getQuestionText().getText();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Can't get the text on onboarding page 3, element absent or blocked");
        }
    }

    public String findBestDoctorTextonPage3 () {
        try {
            MyLogger.log.info("Finding Best Doctor Text on onboarding page (3)");
            MyLogger.log.info("Successfully found text : "+uiObject.getBestDoctorsText().getText());
            return uiObject.getBestDoctorsText().getText();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Can't get the text on onboarding page 3, element absent or blocked");
        }
    }
}
