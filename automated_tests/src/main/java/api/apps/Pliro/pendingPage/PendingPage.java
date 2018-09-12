package api.apps.Pliro.pendingPage;

import core.MyLogger;

import java.util.NoSuchElementException;

public class PendingPage {

    public PendingPageUiObject uiObject =new PendingPageUiObject();


    public String findRescheduleText ()
    {
        try
        {

            if (false == uiObject.getNoPendingText().elementExists())
            {
                System.out.println("Pending Appointment is available to Reschedule :: " + uiObject.getRescheduleText().getText());

                MyLogger.log.info("Finding Reschedule link text on Pending page");
                MyLogger.log.info("Successfully found Field : " + uiObject.getRescheduleText().getText());
                return uiObject.getRescheduleText().getText();
            }
            else
            {
                return uiObject.getNoPendingText().getText();
            }

        }
        catch (NoSuchElementException e)
        {
            throw new AssertionError("Reschedule link text doesn't exits on Pending page, element absent or blocked");
        }
    }

    public String findConfirmText ()
    {
        try
        {
            if (false == uiObject.getNoPendingText().elementExists())
            {
                MyLogger.log.info("Finding Confirm link text on Pending page");
                MyLogger.log.info("Successfully found Field : " + uiObject.getConfirm().getText());
                return uiObject.getConfirm().getText();
            }
            else
            {
                return uiObject.getNoPendingText().getText();
            }

        }
        catch (NoSuchElementException e)
        {
            throw new AssertionError("Confirm link text doesn't exits on Pending page, element absent or blocked");
        }
    }

    public String findDeclineText () {
        try
        {
            if (false== uiObject.getNoPendingText().elementExists()) {
                MyLogger.log.info("Finding Decline link text on Pending page");
                MyLogger.log.info("Successfully found Field : " + uiObject.getDecline().getText());
                return uiObject.getDecline().getText();
            }
            else {
                return uiObject.getNoPendingText().getText();
            }

        }catch (NoSuchElementException e) {
            throw new AssertionError("Decline link text doesn't exits on Pending page, element absent or blocked");
        }
    }


    public String findNoPendingAppointmentText () {
        try {
            MyLogger.log.info("Finding No Pending Appointment text on Pending page");
            MyLogger.log.info("Successfully found Field : "+uiObject.getNoPendingText().getText());
            return uiObject.getNoPendingText().getText();

        }catch (NoSuchElementException e) {
            throw new AssertionError("No Pending Appointment text doesn't exits on Pending page, element absent or blocked");
        }
    }

    public String findNoPendingAppointments()
    {
        try {
            System.out.println("getNoPending() :: elementExist() ::  " + uiObject.getNoPendingText().elementExists());
            if (false == uiObject.getNoPendingText().elementExists())
            {
                System.out.println("Reschedule Appointment text is available :: " + uiObject.getRescheduleText().getText());
                return uiObject.getRescheduleText().getText();
            }
            else
            {
                System.out.println("Pending Appointment is not available :: " + uiObject.getNoPendingText().getText());
                return uiObject.getNoPendingText().getText();

            }

            }
        catch (Exception exp)
        {
            MyLogger.log.error("No Pending Appointment");
            throw new AssertionError("No Pending Appointment");
        }
    }
    public void tapConfirmLinkText () {
        try {

            if (false == uiObject.getNoPendingText().elementExists()) {
                MyLogger.log.info("Clicking on confirm link text on Pending appointments page");
                uiObject.getConfirm().tap();
            }
            else
            {
                uiObject.getNoPendingText().getText();
            }

        }catch (NoSuchElementException e) {
            throw new AssertionError("Confirm link text doesn't exits on Pending Appointments page, element absent or blocked");
        }
    }

    public void tapDeclineLinkText () {
        try {
            if (false==uiObject.getNoPendingText().elementExists()) {
                MyLogger.log.info("Clicking on Decline link text on Pending appointments page");
                uiObject.getDecline().tap();
            }
            else {
                uiObject.getNoPendingText().getText();

            }

        }catch (NoSuchElementException e) {
            throw new AssertionError("Decline link text doesn't exits on Pending Appointments page, element absent or blocked");
        }
    }

    public void tapRescheduleLinkText () {
        try {
            if (false==uiObject.getNoPendingText().elementExists()) {
                MyLogger.log.info("Clicking on Reschedule link text on Pending appointments page");
                uiObject.getRescheduleText().tap();
            }
            else
            {
                uiObject.getNoPendingText().getText();

            }
        }catch (NoSuchElementException e) {
            throw new AssertionError("Reschedule link text doesn't exits on Pending Appointments page, element absent or blocked");
        }
    }

}
