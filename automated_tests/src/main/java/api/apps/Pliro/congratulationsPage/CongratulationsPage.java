package api.apps.Pliro.congratulationsPage;

import core.MyLogger;

import java.util.NoSuchElementException;

/**
 * Created by Kashif on 4/4/2018.
 */
public class CongratulationsPage {

    public congratulationsPageUiObject uiObject = new congratulationsPageUiObject();

    public String isCongratulationsTextVisible() {
        try {
            MyLogger.log.info("Finding Congratulations text on Congratulations Page");
            MyLogger.log.info("Successfully found Field : " + uiObject.getCongratulationsText().getText());
            return uiObject.getCongratulationsText().getText();

        } catch (NoSuchElementException e) {
            throw new AssertionError("Congratulations text doesn't exits, element absent or blocked");
        }
    }

    public String isAppointmentCompletedTextVisible() {
        try {
            MyLogger.log.info("Finding Appointment completed text on Congratulations Page");
            MyLogger.log.info("Successfully found Field : " + uiObject.getAppointmentSuccessfulText().getText());
            return uiObject.getAppointmentSuccessfulText().getText();

        } catch (NoSuchElementException e) {
            throw new AssertionError("Appointment successful text doesn't exits, element absent or blocked");
        }
    }

    public String isContinueUsingPliroButtonVisible() {
        try {
            MyLogger.log.info("Finding Continue using pliro button on Congratulations Page");
            MyLogger.log.info("Successfully found Field : " + uiObject.getContinueUsingPliroButton().getText());
            return uiObject.getContinueUsingPliroButton().getText();

        } catch (NoSuchElementException e) {
            throw new AssertionError("Continue using pliro doesn't exits, element absent or blocked");
        }
    }

    public void tapContinueUsingPliroButton () {
        try {
            MyLogger.log.info("Clicking on Continue Using pliro button on Home Screen page");
            uiObject.getContinueUsingPliroButton().tap();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Continue using pliro button doesn't exits on Home Screen page, element absent or blocked");
        }
    }

}
