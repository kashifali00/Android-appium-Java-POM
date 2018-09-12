package api.apps.Pliro.selectCriteria;

import core.MyLogger;

import java.util.NoSuchElementException;

/**
 * Created by Kashif on 3/29/2018.
 */
public class SelectCriteriaPage {

    public SelectCriteriaPageUiObject uiObject = new SelectCriteriaPageUiObject();

    public void tapBackButton() {
        try {
            MyLogger.log.info("Clicking on Back button on Select Criteria page");
            uiObject.getBackButton().tap();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Back button doesn't exits, element absent or blocked");
        }
    }

    public String isCloseButtonVisible () {
        try {
            MyLogger.log.info("Finding CLOSE button at Select Criteria Page");
            MyLogger.log.info("Successfully found text : " + uiObject.getCloseButton().getText());
            return uiObject.getCloseButton().getText();

        }catch (NoSuchElementException e) {
            return null;
        }
    }

    public void tapCloseButton() {
        try {
            MyLogger.log.info("Clicking on Close button on Select Criteria page");
            uiObject.getCloseButton().tap();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Close button doesn't exits, element absent or blocked");
        }
    }

    public String isSearchFieldVisible () {
        try {
            MyLogger.log.info("Finding SearchField at Select Criteria Page");
            MyLogger.log.info("Successfully found text : " + uiObject.getSearchField().getText());
            return uiObject.getSearchField().getText();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Element not found");
        }
    }

    public void searchDoctor(String doc) {
        try {
            MyLogger.log.info("sending text to search field on Select Criteria page");
            uiObject.getSearchField().sendText(doc);

        }catch (NoSuchElementException e) {
            throw new AssertionError("Search Field doesn't exits, element absent or blocked");
        }
    }

    public String isDoctorVisible (String doc) {
        try {
            MyLogger.log.info("Finding ["+doc+"] at Select Criteria Page"+doc);
            MyLogger.log.info("Successfully found text : " + uiObject.getDoctor(doc).getText());
            return uiObject.getDoctor(doc).getText();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Element not found");
        }
    }

    public void tapDoctor(String doctor) {
        try {
            MyLogger.log.info("tap doctor ["+doctor+"] on Select Criteria page"+doctor);
            uiObject.getDoctor(doctor).tap();
            uiObject.getDoctor(doctor).tap();

        }catch (NoSuchElementException e) {
            throw new AssertionError("doctor doesn't exits, element absent or blocked");
        }
    }

    public void enter() {
        try {
            MyLogger.log.info("pressing enter on search bar on Select Criteria page");
            uiObject.getSearchField().sendText("\n");
            uiObject.getSearchField().sendText("\n");

        }catch (NoSuchElementException e) {
            throw new AssertionError("Tooth doctor doesn't exits, element absent or blocked");
        }
    }

    public String isSuggestionTextVisible () {
        try {
            MyLogger.log.info("Finding Suggestion Text at Select Criteria Page");
            MyLogger.log.info("Successfully found text : " + uiObject.getSuggestions().getText());
            return uiObject.getSuggestions().getText();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Element not found");
        }
    }

}
