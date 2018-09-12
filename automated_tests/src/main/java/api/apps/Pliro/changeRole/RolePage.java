package api.apps.Pliro.changeRole;

import core.MyLogger;

import java.util.NoSuchElementException;

public class RolePage {

    public RolePageUiObject uiObject =new RolePageUiObject();


    public String findRoleChangeLinkText () {
        try {
            MyLogger.log.info("Finding Role Change link text on Home Screen page");
            MyLogger.log.info("Successfully found Field : " + uiObject.getRoleChangeLinkText().getText());
            return uiObject.getRoleChangeLinkText().getText();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Role Change link text doesn't exits on login page, element absent or blocked");
        }
    }

    public void tapRoleChangeLinkText () {
        try {
            MyLogger.log.info("Clicking on Role change link on Home Screen page");
            uiObject.getRoleChangeLinkText().tap();

        }catch (NoSuchElementException e) {
            throw new AssertionError("More Specialities link text doesn't exits on login page, element absent or blocked");
        }
    }
    public String isRoleVisible (String role) {
        try {
            MyLogger.log.info("Finding location ["+role+"]");
            MyLogger.log.info("Successfully found text : " + uiObject.getRole(role).getText());
            return uiObject.getRole(role).getText();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Role does't exist, Element not found or absent");
        }
    }
    public void tapRole (String selectedRole) {
        try {
            MyLogger.log.info("Clicking on Change role["+selectedRole+"]");
            uiObject.getRole(selectedRole).tap();


        }catch (NoSuchElementException e) {
            throw new AssertionError("Doctor role doesn't exists, element absent or blocked");
        }
    }

    public String isRoleFieldVisible () {
        try {
            MyLogger.log.info("Finding location search field");
            MyLogger.log.info("Successfully found text : " + uiObject.getRoleField().getText());
            return uiObject.getRoleField().getText();

        }catch (NoSuchElementException e) {
            throw new AssertionError("Search field does't exist, Element not found or absent");
        }
    }


    public void sendRoleToSearchField(String role) {
        try {
            MyLogger.log.info("Sending text data to search field");
            uiObject.getRoleField().sendText(role);

        }catch (NoSuchElementException e) {
            throw new AssertionError("Search field doesn't exists, element absent or blocked");
        }

    }
}
