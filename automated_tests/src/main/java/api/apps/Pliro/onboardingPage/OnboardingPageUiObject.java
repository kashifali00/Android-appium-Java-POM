package api.apps.Pliro.onboardingPage;

import core.UiObject;
import core.UiSelector;

/**
 * Created by Kashif on 3/15/2018.
 */
public class OnboardingPageUiObject {

    private static UiObject
        specialityText,
        doctorCoverageText,
        skipButton,
        nextButton,
        appointmentText,
        bestDoctorsText,
        questionText,
        doneButton;

    public UiObject getSpecialityText () {
        if(specialityText == null) specialityText = new UiSelector().text("Find Good Doctor by Speciality!").makeUiObject();
        return specialityText;
    }

    public UiObject getDoctorCoverageText () {
        if(doctorCoverageText == null) doctorCoverageText = new UiSelector().text("Find more then 20,000+ doctor & 100+ specialties all over pakistan").makeUiObject();
        return doctorCoverageText;
    }

    public UiObject getSkipButton () {
        if(skipButton == null) skipButton = new UiSelector().text("Skip").makeUiObject();
        return skipButton;
    }

    public UiObject getNextButtonText () {
        if(nextButton == null) nextButton = new UiSelector().xPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.TextView").makeUiObject();
        return nextButton;
    }

    public UiObject getNextButtonOnPage2 () {
        if(nextButton == null) nextButton = new UiSelector().text("›").makeUiObject();
        return nextButton;
    }

    public UiObject getAppointmentText () {
        if(appointmentText == null) appointmentText = new UiSelector().text("Appointments on the Go!").makeUiObject();
        return appointmentText;
    }
    public UiObject getBestDoctorsText () {
        if(bestDoctorsText == null) bestDoctorsText = new UiSelector().text("Find the best doctors nearby and book health appointments at available times").makeUiObject();
        return bestDoctorsText;
    }

    public UiObject getQuestionText () {
        if(questionText == null) questionText = new UiSelector().text("Ask free health-related Questions?").makeUiObject();
        return questionText;
    }

    public UiObject getDoneButton () {
        if(doneButton == null) doneButton = new UiSelector().text("Done").makeUiObject();
        return doneButton;
    }





}
