package api.apps.Pliro.codePage;

import core.UiObject;
import core.UiSelector;

/**
 * Created by sundus on 5/23/18.
 */
public class CodePageUiObject {

    private static UiObject
            checkYourEmailText,
            orPhoneText,
            codeValue1Field,
            codeValue2Field,
            codeValue3Field,
            codeValue4Field;

    public UiObject getCheckYourEmailText() {
        if(checkYourEmailText == null) checkYourEmailText= new UiSelector().text("CHECK YOUR EMAIL").makeUiObject();
        return checkYourEmailText;
    }

    public UiObject getOrPhoneText() {
        if(orPhoneText == null) orPhoneText= new UiSelector().text("OR PHONE").makeUiObject();
        return orPhoneText;
    }

    public UiObject getCodeValue1Field() {
        if(codeValue1Field == null) codeValue1Field= new UiSelector().xPath("//android.widget.EditText[@content-desc=\"digit1\"]").makeUiObject();
        return codeValue1Field;
    }

    public UiObject getCodeValue2Field() {
        if(codeValue2Field == null) codeValue2Field= new UiSelector().xPath("//android.widget.EditText[@content-desc=\"digit2\"]").makeUiObject();
        return codeValue2Field;
    }

    public UiObject getCodeValue3Field() {
        if(codeValue3Field == null) codeValue3Field= new UiSelector().xPath("//android.widget.EditText[@content-desc=\"digit3\"]").makeUiObject();
        return codeValue3Field;
    }

    public UiObject getCodeValue4Field() {
        if(codeValue4Field == null) codeValue4Field= new UiSelector().xPath("//android.widget.EditText[@content-desc=\"digit4\"]").makeUiObject();
        return codeValue4Field;
    }


}
