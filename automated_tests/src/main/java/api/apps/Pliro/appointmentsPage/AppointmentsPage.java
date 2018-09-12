package api.apps.Pliro.appointmentsPage;

import core.MyLogger;

import java.util.NoSuchElementException;

public class AppointmentsPage {

    public AppointmentsPageUiObject uiObject= new AppointmentsPageUiObject();

    public void tapAppointmentsText () {
        try {
            MyLogger.log.info("Clicking on Appointments button on Home Screen page");
            uiObject.getAppointmentsText().tap();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Appointments button doesn't exits on Home Screen page, element absent or blocked");
        }
    }


    public String findRoleText() {
        try {
            MyLogger.log.info("Finding Role Text on Appointments page");
            MyLogger.log.info("Successfully found Field : " + uiObject.getRoleText().getText());
            return uiObject.getRoleText().getText();

        } catch (NoSuchElementException e) {
            throw new AssertionError("Role Text doesn't exits on Appointments page, element absent or blocked");
        }

    }

    public String findHealthCareText() {
        try {
            MyLogger.log.info("Finding Health Care Center on Appointments page");
            MyLogger.log.info("Successfully found Field : " + uiObject.getHealthCenterText().getText());
            return uiObject.getRoleText().getText();

        } catch (NoSuchElementException e) {
            throw new AssertionError("Health Care Center doesn't exits on Appointments page, element absent or blocked");
        }

    }


    public void tapPendingAppointmentsText () {
        try {
            MyLogger.log.info("Clicking on Pending Text on Appointments Screen page");
            uiObject.getPendingTextLink().tap();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Pending button doesn't exits on Home Screen page, element absent or blocked");
        }
    }










}
