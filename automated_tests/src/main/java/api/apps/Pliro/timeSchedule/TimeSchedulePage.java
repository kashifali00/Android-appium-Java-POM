package api.apps.Pliro.timeSchedule;

import api.android.Android;
import core.MyLogger;

import java.util.NoSuchElementException;

/**
 * Created by Kashif on 3/30/2018.
 */
public class TimeSchedulePage {

    public TimeSchedulePageUiObject uiObject = new TimeSchedulePageUiObject();

    public String isTimeScheduleWindowVisible () {
        try {
            MyLogger.log.info("Finding Time Schedule Window");
            MyLogger.log.info("Successfully found text : " + uiObject.getTimeSchedule().getText());
            return uiObject.getTimeSchedule().getText();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Time Schedule window does't exist, Element not found or absent");
        }
    }

    public String isConfirmAppointmentButtonVisible () {
        try {
            MyLogger.log.info("Finding Confirm appointment button");
            MyLogger.log.info("Successfully found text : " + uiObject.getConfirmAppointmentButton().getText());
            return uiObject.getConfirmAppointmentButton().getText();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Confirm appointment button does't exist, Element not found or absent");
        }
    }

    public void tapConfirmAppointmentButton () {
        try {
            MyLogger.log.info("Clicking on Confirm Appointment button at Time schedule widnow");
            uiObject.getConfirmAppointmentButton().tap();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Close button doesn't exists, element absent or blocked");
        }
    }

    public void tapCloseButton () {
        try {
            MyLogger.log.info("Clicking on Close button at Time schedule widnow");
            uiObject.getCloseButton().tap();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Close button doesn't exists, element absent or blocked");
        }
    }

    public String findAvailableSlot() {

        String [] timeSlots = {"11:00AM - 11:30AM","11:30AM - 12:00PM","12:00PM - 12:30PM","12:30PM - 01:00PM","01:00PM - 01:30PM",
                               "02:00PM - 02:30PM","02:30PM - 03:00PM","03:00PM - 03:30PM","03:30PM - 04:00PM","04:00PM - 04:30PM",
                               "04:30PM - 05:00PM","05:00PM - 05:30PM","05:30PM - 06:00PM","06:00PM - 06:30PM","06:30PM - 07:00PM"};
        try{
            for (;;) {
                System.out.println("getNoFreeSlot() :: elementExist() ::"+uiObject.getNoFreeSlot().elementExists());
                if(uiObject.getNoFreeSlot().elementExists()) {
                    uiObject.getNextTimeSlot().tap();
                    if(!uiObject.getNoFreeSlot().elementExists()) {
                        for (String date : timeSlots) {
                            System.out.println("Is Slot [" + date + "] available ? :: " + uiObject.getAvailableSlot(date).elementExists());
                            if (uiObject.getAvailableSlot(date).elementExists()) {
                                return uiObject.getAvailableSlot(date).getText();

                            }
                        }
                    }
                } else if(!uiObject.getNoFreeSlot().elementExists()) {
                    for (String date : timeSlots) {
                        System.out.println("Is Slot ["+date+"] available ? :: "+uiObject.getAvailableSlot(date).elementExists());
                        if(uiObject.getAvailableSlot(date).elementExists()) {
                            return uiObject.getAvailableSlot(date).getText();

                        }
                    }
                }
            }

        } catch (Exception exp) {
            MyLogger.log.error("No slot available today");
            throw new AssertionError("No slot available today");
        }
    }


    public void tapTimeSlot () {
        try {
            MyLogger.log.info("Selecting time slot at Time schedule window");
            String slot = findAvailableSlot();
            uiObject.getTimeSlot(slot).tap();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Time slot doesn't exists, element absent or blocked");
        }
    }

    public void tapNextTimeSlot () {
        try {
            MyLogger.log.info("Selecting time slot at Time schedule window");
            uiObject.getNextTimeSlot().tap();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Time slot doesn't exists, element absent or blocked");
        }
    }


}
