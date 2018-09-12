package api.apps.Pliro.codePage;

import api.apps.Pliro.publicViewAppointmentPage.PublicViewAppointmentUiObject;
import core.MyLogger;

import java.util.NoSuchElementException;

/**
 * Created by sundus on 5/23/18.
 */
public class CodePage {

    public CodePageUiObject uiObject = new CodePageUiObject();


    public String findCheckYourEmailText() {
        try {
            MyLogger.log.info("Finding Check Your Email Text on Code page");
            MyLogger.log.info("Successfully found Field : " + uiObject.getCheckYourEmailText().getText());
            return uiObject.getCheckYourEmailText().getText();

        } catch (NoSuchElementException e) {
            throw new AssertionError("Check Your Email Text on Code page doesn't exits, element absent or blocked");
        }
    }

    public String findOrPhoneText() {
        try {
            MyLogger.log.info("Finding Or Phone Text on Code page");
            MyLogger.log.info("Successfully found Field : " + uiObject.getOrPhoneText().getText());
            return uiObject.getOrPhoneText().getText();

        } catch (NoSuchElementException e) {
            throw new AssertionError("Or Phone Text on Code page doesn't exits, element absent or blocked");
        }
    }


    public String findCodeValue1Field() {
        try {
            MyLogger.log.info("Finding code value 1 Field on Code page");
            MyLogger.log.info("Successfully found Field : " + uiObject.getCodeValue1Field().getText());
            System.out.println("valueForFirstDigit::" +uiObject.getCodeValue1Field().getText());
            return uiObject.getCodeValue1Field().getText();

        } catch (NoSuchElementException e) {
            throw new AssertionError("Code Value 1 Field on Code page doesn't exits, element absent or blocked");
        }
    }

    public String findCodeValue2Field() {
        try {
            MyLogger.log.info("Finding code value 2 Field on Code page");
            MyLogger.log.info("Successfully found Field : " + uiObject.getCodeValue2Field().getText());
            return uiObject.getCodeValue2Field().getText();

        } catch (NoSuchElementException e) {
            throw new AssertionError("Code Value 2 Field on Code page doesn't exits, element absent or blocked");
        }
    }

    public String findCodeValue3Field() {
        try {
            MyLogger.log.info("Finding code value 3 Field on Code page");
            MyLogger.log.info("Successfully found Field : " + uiObject.getCodeValue3Field().getText());
            return uiObject.getCodeValue3Field().getText();

        } catch (NoSuchElementException e) {
            throw new AssertionError("Code Value 3 Field on Code page doesn't exits, element absent or blocked");
        }
    }

    public String findCodeValue4Field() {
        try {
            MyLogger.log.info("Finding code value 4 Field on Code page");
            MyLogger.log.info("Successfully found Field : " + uiObject.getCodeValue4Field().getText());
            return uiObject.getCodeValue4Field().getText();

        } catch (NoSuchElementException e) {
            throw new AssertionError("Code Value 4 Field on Code page doesn't exits, element absent or blocked");
        }
    }


}
