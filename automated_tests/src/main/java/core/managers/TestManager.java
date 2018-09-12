package core.managers;

import api.android.Android;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import core.MyLogger;
import core.TestInfo;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import java.io.File;


/**
 * Created by Kashif on 3/9/2018.
 */
public class TestManager {

    public static TestInfo testInfo = new TestInfo();
    public static Assertion hardAssert = new Assertion();
    public static SoftAssert softAssert = new SoftAssert();
    public static ExtentHtmlReporter htmlReporter;
    public static ExtentReports report;
    public static ExtentTest logger;

    @BeforeSuite(alwaysRun = true)
    public void setUp(){
        MyLogger.log.info("Starting Appium Server...");
        MyLogger.log.info("Creating Android driver...");
        MyLogger.log.info("Opening pliro app...");

        DriverManager.startAppiumServer();
        DriverManager.createDriver();
        Android.app.pliro.open();

    }



    @AfterSuite(alwaysRun = true)
    public void tearDown() {

        DriverManager.killDriver();
        //DriverManager.stopAppiumServer();

    }

    @BeforeTest(alwaysRun = true)
    public void ReportSetUp () {
        SoftAssert softAssert = new SoftAssert();

        MyLogger.log.info("Creating test-ouput folder for HTML reports");
        File OutputFolder = new File("./test-output");
        if (!OutputFolder.exists()) {
            if(OutputFolder.mkdir()) {
                MyLogger.log.info("test-output directory has created successfully");
            }
            else  {   MyLogger.log.error("FAILED to create test-output directory");
            }
        }else {MyLogger.log.info("Directory already exists");
        }


        report = new ExtentReports();
        htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/Pliro-Automated-testRun-Report.html");
        report.attachReporter(htmlReporter);

        // Set our document title, theme etc..
        htmlReporter.config().setDocumentTitle("Pliro Test Report");
        htmlReporter.config().setReportName("Pliro Automated Regression Test Run Report");
        htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
        htmlReporter.config().setTheme(Theme.DARK);

        report.setSystemInfo("OS", ServerManager.getOS());
        report.setSystemInfo("Test", "Regression");
        report.setSystemInfo("APP", "Pilro");
        report.setSystemInfo("User", "Kashif Ali");

    }

    @AfterMethod(alwaysRun = true)
    public void getResult(ITestResult result)
    {
        if(result.getStatus()==ITestResult.FAILURE)
        {
            logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + "Test Case failed due to below issues", ExtentColor.RED));
            logger.fail(result.getThrowable());
        }

        else if(result.getStatus()==ITestResult.SUCCESS)
        {
            logger.log(Status.PASS, MarkupHelper.createLabel(result.getName() + "Test Case Passed", ExtentColor.GREEN));
        }

        else
        {
            logger.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + "Test Case skipped", ExtentColor.YELLOW));
        }

    }

    @AfterTest(alwaysRun = true)
    public void endReport() {
        report.flush();
    }
}


