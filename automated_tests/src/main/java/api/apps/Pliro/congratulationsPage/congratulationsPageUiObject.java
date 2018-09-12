package api.apps.Pliro.congratulationsPage;

import core.UiObject;
import core.UiSelector;

/**
 * Created by Kashif on 4/4/2018.
 */
public class congratulationsPageUiObject {
    private static UiObject

    congratulationsText,
    appointmentSuccessfulText,
    continueUsingPliroButton;

    public UiObject getCongratulationsText() {
        if(congratulationsText == null) congratulationsText = new UiSelector().text("Congratulations").makeUiObject();
        return congratulationsText;
    }

    public UiObject getAppointmentSuccessfulText() {
        if(appointmentSuccessfulText == null) appointmentSuccessfulText = new UiSelector().text("Your Appointment Successfully Completed").makeUiObject();
        return appointmentSuccessfulText;
    }

    public UiObject getContinueUsingPliroButton() {
        if(continueUsingPliroButton == null) continueUsingPliroButton = new UiSelector().text("Continue Using Pliro").makeUiObject();
        return continueUsingPliroButton;
    }


}
