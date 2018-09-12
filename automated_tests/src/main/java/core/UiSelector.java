package core;


/**
 * Created by Kashif on 3/9/2018.
 */

// Represent the wrapper for Appium, lowest level class
public class UiSelector {

    private String locator = "new UiSelector()";

    // resourceId method
    public UiSelector resourceId(String value){
        locator += ".resourceId(\""+value+"\")";
        return this; // return the current class instance
    }

    // checkable method
    public UiSelector checkable(boolean value){
        locator += ".checkable("+value+")";
        return this; // return the current class instance
    }

    // checked method
    public UiSelector checked(boolean value){
        locator += ".checked("+value+")";
        return this; // return the current class instance
    }

    // className method
    public UiSelector className(String value){
        locator += ".className(\""+value+"\")";
        return this; // return the current class instance
    }

    // className method
    public UiSelector name(String value){
        locator += ".name(\""+value+"\")";
        return this; // return the current class instance
    }

    // clickable method
    public UiSelector clickable(boolean value){
        locator += ".clickable("+value+")";
        return this; // return the current class instance
    }

    // description method
    public UiSelector description(String value){
        locator += ".description(\""+value+"\")";
        System.out.println("Description locator ::"+locator);
        return this; // return the current class instance
    }


    // descriptionContains method
    public UiSelector descriptionContains(String value){
        locator += ".descriptionContains(\""+value+"\")";
        return this; // return the current class instance
    }

    // descriptionMatches method
    public UiSelector descriptionMatches(String value){
        locator += ".descriptionMatches(\""+value+"\")";
        return this; // return the current class instance
    }

    // enabled method
    public UiSelector enabled(boolean value){
        locator += ".enabled("+value+")";
        return this; // return the current class instance
    }

    // index method
    public UiSelector index(int value){
        locator += ".index("+value+")";
        return this; // return the current class instance
    }

    // text method
    public UiSelector text(String value){
        locator += ".text(\""+value+"\")";
        return this; // return the current class instance
    }

    // textContains method
    public UiSelector textContains(String value){
        locator += ".textContains(\""+value+"\")";
        return this; // return the current class instance
    }

    // xPath method
    public UiSelector xPath(String xPath){
        locator = xPath;
        return this; // return the current class instance
    }

    public UiObject makeUiObject() {
        return new UiObject(locator);

    }

}
