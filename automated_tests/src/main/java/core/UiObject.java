package core;

import api.android.Android;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;

/**
 * Created by Kashif on 3/9/2018.
 */

// represent the wrapper for Appium, lowest level class
public class UiObject {

    private String locator=null;

    UiObject (String locator) {
        this.locator = locator;
    }

    private boolean isXpath(){
        return !locator.contains("UiSelector");
    }

    public boolean elementExists(){
        WebElement element=null;
        try {
            MyLogger.log.info("Locator::"+locator);
            if (isXpath()) element = Android.driver.findElementByXPath(locator);
            else element = Android.driver.findElementByAndroidUIAutomator(locator);



            return element.isDisplayed();
        }catch (Exception exp){
            MyLogger.log.error("Unfortunately Element["+locator+"] doesn't exist"+locator);
            return false;
        }
    }

    public boolean isChecked(){
        MyLogger.log.info("Locator::"+locator);
        WebElement element;
        if (isXpath()) element = Android.driver.findElementByXPath(locator);
        else element = Android.driver.findElementByAndroidUIAutomator(locator);
        return element.getAttribute("checked").equals("true");
    }

    public boolean isClickable(){
        MyLogger.log.info("Locator::"+locator);
        WebElement element;
        if (isXpath()) element = Android.driver.findElementByXPath(locator);
        else element = Android.driver.findElementByAndroidUIAutomator(locator);
        return element.getAttribute("clickable").equals("true");
    }

    public boolean isEnabled(){
        WebElement element;
        MyLogger.log.info("Locator::"+locator);
        if (isXpath()) element = Android.driver.findElementByXPath(locator);
        else element = Android.driver.findElementByAndroidUIAutomator(locator);
        return element.getAttribute("enabled").equals("true");
    }

    public boolean isFocusable(){
        WebElement element;
        MyLogger.log.info("Locator::"+locator);
        if (isXpath()) element = Android.driver.findElementByXPath(locator);
        else element = Android.driver.findElementByAndroidUIAutomator(locator);
        return element.getAttribute("focusable").equals("true");
    }

    public boolean isFocused(){
        WebElement element;
        MyLogger.log.info("Locator::"+locator);
        if (isXpath()) element = Android.driver.findElementByXPath(locator);
        else element = Android.driver.findElementByAndroidUIAutomator(locator);
        return element.getAttribute("focused").equals("true");
    }

    public boolean isScrollable(){
        WebElement element;
        MyLogger.log.info("Locator::"+locator);
        if (isXpath()) element = Android.driver.findElementByXPath(locator);
        else element = Android.driver.findElementByAndroidUIAutomator(locator);
        return element.getAttribute("scrollable").equals("true");
    }

    public boolean isLongClickable(){
        WebElement element;
        MyLogger.log.info("Locator::"+locator);
        if (isXpath()) element = Android.driver.findElementByXPath(locator);
        else element = Android.driver.findElementByAndroidUIAutomator(locator);
        return element.getAttribute("longClickable").equals("true");
    }

    public boolean isSelected(){
        WebElement element;
        MyLogger.log.info("Locator::"+locator);
        if (isXpath()) element = Android.driver.findElementByXPath(locator);
        else element = Android.driver.findElementByAndroidUIAutomator(locator);
        return element.getAttribute("selected").equals("true");
    }

    public Point getLocation(){
        WebElement element;
        MyLogger.log.info("Locator::"+locator);
        if (isXpath()) element = Android.driver.findElementByXPath(locator);
        else element = Android.driver.findElementByAndroidUIAutomator(locator);
        return element.getLocation();
    }

    public String getText(){
        WebElement element;
        MyLogger.log.info("Locator::"+locator);
        if (isXpath()) element = Android.driver.findElementByXPath(locator);
        else element = Android.driver.findElementByAndroidUIAutomator(locator);
        System.out.println("SundusLocator::" +locator);
        System.out.println("SundusElement::" +element);
        System.out.println("ElementFound::"+element.getAttribute("name"));
        return element.getAttribute("name");
    }

    public String getResourceI(){
        WebElement element;
        MyLogger.log.info("Locator::"+locator);
        if (isXpath()) element = Android.driver.findElementByXPath(locator);
        else element = Android.driver.findElementByAndroidUIAutomator(locator);
        return element.getAttribute("name");
    }

    public String getClassName(){
        WebElement element;
        MyLogger.log.info("Locator::"+locator);
        if (isXpath()) element = Android.driver.findElementByXPath(locator);
        else element = Android.driver.findElementByAndroidUIAutomator(locator);
        return element.getAttribute("className");
    }

    public String getContentDesc(){
        WebElement element;
        MyLogger.log.info("Locator::"+locator);
        if (isXpath()) element = Android.driver.findElementByXPath(locator);
        else element = Android.driver.findElementByAndroidUIAutomator(locator);
        System.out.println("SundusLocator::" +locator);
        System.out.println("SundusElement::" +element);
        return element.getAttribute("content-desc");
    }

    public UiObject clearText(){
        MyLogger.log.info("Locator::"+locator);
        if (isXpath()) Android.driver.findElementByXPath(locator).clear();
        else Android.driver.findElementByAndroidUIAutomator(locator).clear();
        return this;
    }

    public UiObject sendText(String text){
        MyLogger.log.info("Locator::"+locator);
        if (isXpath()) Android.driver.findElementByXPath(locator).sendKeys(text);
        else Android.driver.findElementByAndroidUIAutomator(locator).sendKeys(text);
        return this;
    }

    public UiObject sendNumber(Integer text){
        MyLogger.log.info("Locator::"+locator);
        if (isXpath()) {
            Android.driver.findElementByXPath(locator).sendKeys();
        }
        else Android.driver.findElementByAndroidUIAutomator(locator).sendKeys();
        return this;
    }

    public UiObject tap(){
        MyLogger.log.info("Locator::"+locator);
        if (isXpath()) Android.driver.findElementByXPath(locator).click();
        else Android.driver.findElementByAndroidUIAutomator(locator).click();
        return this;
    }

    public UiObject waitForVisibilityOfElement(){
        MyLogger.log.info("Locator::"+locator);
        if (isXpath()) Android.wait.until(ExpectedConditions.visibilityOf(Android.driver.findElementByAndroidUIAutomator(locator)));
        else Android.wait.until(ExpectedConditions.visibilityOf(Android.driver.findElementByAndroidUIAutomator(locator))).isDisplayed();
        return this;
    }

    public UiObject waitForElementToBeClickable(){
        MyLogger.log.info("Locator::"+locator);
        System.out.println("waitForElementToBeClickable Locator :"+locator);
        if (isXpath()) Android.wait.until(ExpectedConditions.elementToBeClickable(Android.driver.findElementByAndroidUIAutomator(locator)));
        else Android.wait.until(ExpectedConditions.elementToBeClickable(Android.driver.findElementByAndroidUIAutomator(locator))).isDisplayed();
        return this;
    }

    public UiObject waitForAlert(){
        MyLogger.log.info("Locator::"+locator);
        if (isXpath()) Android.wait.until(ExpectedConditions.alertIsPresent());
        else Android.wait.until(ExpectedConditions.alertIsPresent());
        return this;
    }

    public UiObject waitForElementToBeSelected(){
        MyLogger.log.info("Locator::"+locator);
        if (isXpath()) Android.wait.until(ExpectedConditions.elementToBeSelected(Android.driver.findElementByAndroidUIAutomator(locator)));
        else Android.wait.until(ExpectedConditions.elementToBeSelected(Android.driver.findElementByAndroidUIAutomator(locator)));
        return this;
    }

}
