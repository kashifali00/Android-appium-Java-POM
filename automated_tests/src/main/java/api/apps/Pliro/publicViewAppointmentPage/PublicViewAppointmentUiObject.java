package api.apps.Pliro.publicViewAppointmentPage;

import core.UiObject;
import core.UiSelector;
import core.managers.TestManager;

/**
 * Created by sundus on 5/18/18.
 */
public class PublicViewAppointmentUiObject {

    private static UiObject
            enterNameTextField,
            enterPhoneTextField,
            phoneNumber,
            enterPatientInfo,
            cancelButton,
            confirmButton;


    public UiObject getEnterNameTextField() {
        if(enterNameTextField == null) enterNameTextField= new UiSelector().text("ENTER NAME").makeUiObject();
        return enterNameTextField;
    }

    public UiObject getEnterPatientInfoText() {
        if(enterPatientInfo == null) enterPatientInfo= new UiSelector().text("ENTER PATIENT INFO").makeUiObject();
        return enterPatientInfo;
    }

    public UiObject getEnterPhoneTextField() {
        if(null == enterPhoneTextField) enterPhoneTextField = new UiSelector().text("ENTER PHONE NUMBER").makeUiObject();
        System.out.println("Enter phone text field" + enterPhoneTextField );
        return enterPhoneTextField;
    }

    public UiObject getPhoneNumber() {
        if(phoneNumber == null) phoneNumber= new UiSelector().xPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.EditText").makeUiObject();
        return phoneNumber;
    }

    public UiObject getCancelButton() {
        if(cancelButton == null) cancelButton= new UiSelector().xPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView").makeUiObject();
        return cancelButton;

    }

    public UiObject getConfirmButton() {
        if(confirmButton == null) confirmButton= new UiSelector().text("CONFIRM APPOINTMENT").makeUiObject();
        return confirmButton;

    }
}
