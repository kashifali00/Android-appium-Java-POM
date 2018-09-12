package api.apps.Pliro.pendingAppointment;

import api.apps.Pliro.pendingPage.PendingPageUiObject;
import core.MyLogger;

import java.util.NoSuchElementException;

public class PendingAppointmentPage {

    public PendingAppointmentUiObject uiObject =new PendingAppointmentUiObject();
    public PendingPageUiObject uiObject1 =new PendingPageUiObject();


    public String findConfirmAppointmentText () {
        try {
            if (false == uiObject1.getNoPendingText().elementExists()) {

                MyLogger.log.info("Finding Confirm Appointment text on Pending page");
                MyLogger.log.info("Successfully found Field : " + uiObject.getConfirmAppointment().getText());
                return uiObject.getConfirmAppointment().getText();
            }
            else
            {
                return uiObject1.getNoPendingText().getText();

            }

        }catch (NoSuchElementException e) {
            throw new AssertionError("Confirm Appointment text doesn't exits on Pending page, element absent or blocked");
        }
    }

    public String findDeclineAppointmentText () {
        try {
            if (false== uiObject1.getNoPendingText().elementExists()) {
                MyLogger.log.info("Finding Confirm Appointment text on Pending page");
                MyLogger.log.info("Successfully found Field : " + uiObject.getDeclineAppointment().getText());
                return uiObject.getDeclineAppointment().getText();
            }
            else
            {
                return uiObject1.getNoPendingText().getText();

            }
        }catch (NoSuchElementException e) {
            throw new AssertionError("Confirm Appointment text doesn't exits on Pending page, element absent or blocked");
        }
    }
    public String findTimeScheduleAppointmentText () {
        try {
            MyLogger.log.info("Finding Reschedule Appointment text on Pending page");
            MyLogger.log.info("Successfully found Field : " + uiObject.getRescheduleLinkText().getText());
            return uiObject.getTimeScheduleText().getText();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Reschedule Appointment text doesn't exits on Pending page, element absent or blocked");
        }
    }

    public String findCancelLinkText () {
        try {
            if (false== uiObject1.getNoPendingText().elementExists()) {
                MyLogger.log.info("Finding Cancel Link text on Pending page");
                MyLogger.log.info("Successfully found Field : " + uiObject.getCancel().getText());
                return uiObject.getCancel().getText();
            }
            else
            {
                return uiObject1.getNoPendingText().getText();

            }
        }catch (NoSuchElementException e) {
            throw new AssertionError("Cancel Link text doesn't exits on Pending page, element absent or blocked");
        }
    }


    public String findOkLinkText () {
        try {

            if (false== uiObject1.getNoPendingText().elementExists()) {
                MyLogger.log.info("Finding OK Link text on Pending page");
                MyLogger.log.info("Successfully found Field : " + uiObject.getOkLinkText().getText());
                return uiObject.getOkLinkText().getText();
            }
            else
            {
                return uiObject1.getNoPendingText().getText();

            }
        }catch (NoSuchElementException e) {
            throw new AssertionError("OK Link text doesn't exits on Pending page, element absent or blocked");
        }
    }
    public String findDeclineOkLinkText () {
        try {
            MyLogger.log.info("Finding OK Link text on Decline page");
            MyLogger.log.info("Successfully found Field : " + uiObject.getDeclineOkLinkText().getText());
            return uiObject.getDeclineOkLinkText().getText();

        }catch (NoSuchElementException e) {
            throw new AssertionError("OK Link text doesn't exits on Decline page, element absent or blocked");
        }
    }

    public void tapCancelLinkText () {
        try {
            if (false==uiObject1.getNoPendingText().elementExists()) {
                MyLogger.log.info("Clicking on Cancel link text on Pending appointments page");
                uiObject.getCancel().tap();
            }
            else
            {
                 uiObject1.getNoPendingText().getText();

            }
        }catch (NoSuchElementException e) {
            throw new AssertionError("Confirm link text doesn't exits on Pending Appointments page, element absent or blocked");
        }
    }

    public void tapOkLinkText () {
        try {
            if (false == uiObject1.getNoPendingText().elementExists()) {
                MyLogger.log.info("Clicking on Ok link text on Pending appointments page");
                uiObject.getOkLinkText().tap();
            }
            else
            {
                uiObject1.getNoPendingText().getText();

            }
        }catch (NoSuchElementException e) {
            throw new AssertionError("Ok link text doesn't exits on Pending Appointments page, element absent or blocked");
        }
    }

    public void tapDeclineOkLinkText () {
        try {
            MyLogger.log.info("Clicking on Ok link text on Decline appointments page");
            uiObject.getDeclineOkLinkText().tap();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Ok link text doesn't exits on Decline Appointments page, element absent or blocked");
        }
    }

    public void tapRescheduleLinkText () {
        try {
            MyLogger.log.info("Clicking on Reschedule link text on Pending appointments page");
            uiObject.getRescheduleLinkText().tap();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Reschedule link text doesn't exits on Pending Appointments page, element absent or blocked");
        }
    }

    public void tapCrossLink () {
        try {
            MyLogger.log.info("Clicking on Cancel link on Time Schedule appointments page");
            uiObject.getCrossLink().tap();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Cancel link text doesn't exits on Time Schedule appointments page, element absent or blocked");
        }
    }


}
