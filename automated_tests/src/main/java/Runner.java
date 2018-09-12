import api.android.Android;
import core.ADB;
import core.MyLogger;
import core.UiObject;
import core.UiSelector;
import core.managers.DriverManager;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.functions.ExpectedCondition;
import org.apache.commons.httpclient.methods.ExpectContinueMethod;
import org.apache.log4j.Level;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Kashif on 3/9/2018.
 */
public class Runner {

    public static void main (String [] args) throws InterruptedException {

        MyLogger.log.setLevel(Level.DEBUG);
        MyLogger.log.info("Started Regression suite");

        DriverManager.startAppiumServer();
        DriverManager.createDriver();
        Android.app.pliro.open();
        String text = Android.app.pliro.onboardingPage.findGoodDoctorTextonPage1();
        MyLogger.log.info("Find Doctor Text on Page 1 :"+text);
        String textDocCov = Android.app.pliro.onboardingPage.findDoctorCoverageTextonPage1();
        MyLogger.log.info("Find Doctor coverage Text on Page 1 :"+textDocCov);
        Android.app.pliro.onboardingPage.tapNextButton();
        String appoint = Android.app.pliro.onboardingPage.findAppointmentTextonPage2();
        MyLogger.log.info("Find Doctor appointment Text on Page 2 :"+appoint);
        String bestDoc = Android.app.pliro.onboardingPage.findBestDoctorTextonPage2();
        MyLogger.log.info("Find best Doctor  Text on Page 2 :"+appoint);
        Android.app.pliro.onboardingPage.tapNextButton();
        String freeQues = Android.app.pliro.onboardingPage.findQuestionsTextonPage3();
        MyLogger.log.info("Find best Doctor  Text on Page 3 :"+freeQues);
        Android.app.pliro.onboardingPage.tapDoneButton();
        DriverManager.killDriver();
        DriverManager.createDriver();
        Android.app.pliro.open();
        Android.app.pliro.onboardingPage.tapSkipButton();
        DriverManager.killDriver();
        DriverManager.stopAppiumServer();


    }
}