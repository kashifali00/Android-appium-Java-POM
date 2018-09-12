package api.apps.Pliro.publicViewAppointmentPage;

import core.MyLogger;

import java.util.NoSuchElementException;

/**
 * Created by sundus on 5/18/18.
 */
public class PublicViewAppointmentPage {

    public PublicViewAppointmentUiObject uiObject =new PublicViewAppointmentUiObject();

    public String findEnterNameTextField() {
        try {
            MyLogger.log.info("Finding Enter Name Text Field on Patient Info page");
            MyLogger.log.info("Successfully found Field : " + uiObject.getEnterNameTextField().getText());
            return uiObject.getEnterNameTextField().getText();

        } catch (NoSuchElementException e) {
            throw new AssertionError("Enter Name Text Field on Patient Info page doesn't exits, element absent or blocked");
        }
    }


    public String findEnterPhoneNumberTextField() {
        try {
            MyLogger.log.info("Finding Phone Number Text Field on Patient Info page");
            MyLogger.log.info("Successfully found Field : " + uiObject.getEnterPhoneTextField().getText());
            System.out.println("find phone number text" +uiObject.getEnterPhoneTextField().getText());
            return uiObject.getEnterPhoneTextField().getText();

        } catch (NoSuchElementException e) {
            throw new AssertionError("Enter Phone Number Text Field on Patient Info page doesn't exits, element absent or blocked");
        }
    }

    public String findPhoneNumber() {
        try {
            MyLogger.log.info("Finding Phone Number Text Field on Patient Info page");
            MyLogger.log.info("Successfully found Field : " + uiObject.getPhoneNumber().getText());
            return uiObject.getPhoneNumber().getText();

        } catch (NoSuchElementException e) {
            throw new AssertionError("Enter Phone Number Text Field on Patient Info page doesn't exits, element absent or blocked");
        }
    }

    public String findPatientInfo() {
        try {
            MyLogger.log.info("Finding Patient Info Text Field on Patient Info page");
            MyLogger.log.info("Successfully found Field : " + uiObject.getEnterPatientInfoText().getText());
            return uiObject.getEnterPatientInfoText().getText();

        } catch (NoSuchElementException e) {
            throw new AssertionError("Enter Patient Info Text on Patient Info page doesn't exits, element absent or blocked");
        }
    }

    public void tapConfirmAppointmentButton () {
        try {
            MyLogger.log.info("Clicking on Confirm Appointment Button on Patient Info page");
            uiObject.getConfirmButton().tap();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Confirm Appointment button doesn't exits on Patient Info page, element absent or blocked");
        }
    }
}
