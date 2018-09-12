package core.managers;

import api.android.Android;
import core.ADB;
import core.MyLogger;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.apache.log4j.Level;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.ServerSocket;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/**
 * Created by Kashif on 3/9/2018.
 */
public class DriverManager {
    private static HashMap<String, URL> hosts;
    private static String unlockPackage = "com.aurora.pliro";
    private static AppiumDriverLocalService service;
    private static AppiumServiceBuilder builder;
    private static String deviceID;

    public static void startAppiumServer(){
        //Set Capabilities
        MyLogger.log.setLevel(Level.DEBUG);
        MyLogger.log.debug("Starting Appium Server... :");

        ArrayList<String> devices = getAvailableDevices();

        for(String device : devices) {
            try {

                deviceID = device;
                break;
            }catch (Exception e){
                e.printStackTrace();
                // Ignore and try next device
            }
        }
/*
        //Build the Appium service
        builder = new AppiumServiceBuilder();
        builder.withIPAddress("0.0.0.0");
        builder.usingPort(4723);
        builder.withCapabilities(getCaps(deviceID));
        builder.withArgument(GeneralServerFlag.SESSION_OVERRIDE);
        builder.withArgument(GeneralServerFlag.LOG_LEVEL,"error");

*/

        if(!checkIfServerIsRunnning(4723)) {
            //Start the server with the builder
            service = AppiumDriverLocalService.buildService(new AppiumServiceBuilder().usingPort(4723).usingDriverExecutable(new File("/usr/bin/nodejs")).withAppiumJS(new
                    File("/usr/bin/appium")));
            service.start();
            if (service.getUrl().getPort() == 4723) {
                MyLogger.log.info("Appium server has started at URL :" + " " + service.getUrl());

            }
        } else {
            MyLogger.log.error("Appium server is already running...");

        }


    }

    public static void stopAppiumServer() {
/*
        //Build the Appium service
        builder = new AppiumServiceBuilder();
        builder.withIPAddress("0.0.0.0");
        builder.usingPort(4723);
        builder.withCapabilities(getCaps(deviceID));
        builder.withArgument(GeneralServerFlag.SESSION_OVERRIDE);
        builder.withArgument(GeneralServerFlag.LOG_LEVEL,"error");
  */

        MyLogger.log.info("Stopping Appium Server...");
        service.stop();
    }


    public static boolean checkIfServerIsRunnning(int port) {

        boolean isServerRunning = false;
        ServerSocket serverSocket;
        try {
            serverSocket = new ServerSocket(port);
            serverSocket.close();
        } catch (IOException e) {
            //If control comes here, then it means that the port is in use
            MyLogger.log.info("Port :"+port+" "+"is already IN USE");

            isServerRunning = true;
        } finally {
            serverSocket = null;
        }
        return isServerRunning;
    }

    private static DesiredCapabilities getCaps(String deviceID) {
        MyLogger.log.setLevel(Level.DEBUG);
        MyLogger.log.debug("Creating driver capabilities for device :"+deviceID);

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("deviceName", deviceID);
        capabilities.setCapability("app","/home/sundus/pliro-mobile-2.0/app-release.apk");
        capabilities.setCapability("newCommandTimeout", 30);
        capabilities.setCapability("platformVersion", "8.0.0");
        capabilities.setCapability("appActivity", "com.pliro_mobile_2.SplashActivity");
        capabilities.setCapability("appPackage", "com.aurora.pliro");
        return capabilities;
    }

    private static URL host (String deviceID) throws MalformedURLException {
        if(hosts == null) {
            hosts = new HashMap<String, URL>();
            hosts.put(deviceID, new URL("http://0.0.0.0:4723/wd/hub"));
        }
        MyLogger.log.debug("Returning HOST URL :"+hosts.get(deviceID));
        return hosts.get(deviceID);
    }

    private static ArrayList getAvailableDevices () {
        MyLogger.log.debug("Checking for available devices");
        ArrayList availableDevices = new ArrayList();
        ArrayList connectedDevices = ADB.getConnectedDevices();

        for(Object connectedDevice : connectedDevices){
            String device = connectedDevice.toString();
            MyLogger.log.debug("Available Device: "+device);
            ArrayList appPackage = new ADB(device).getInstalledPackages();
            if(!appPackage.contains(unlockPackage)) {
                availableDevices.add(device);
                MyLogger.log.debug("Device "+device+" "+"has been added to list of available devices");
            }
            else MyLogger.log.debug("This device "+device+" has installed packages "+unlockPackage+", so assuming it's under testing");

        }

        if(availableDevices.size() == 0) throw new RuntimeException("Not a single device is available for testing this time");

        return availableDevices;
    }

    public static void createDriver () {
        ArrayList<String> devices = getAvailableDevices();

        for(String device : devices) {
            try {

                deviceID = device;
                MyLogger.log.debug("Trying to create new driver for Device :"+deviceID);
                Android.driver = new AndroidDriver(host(device),getCaps(deviceID));
                Android.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                Android.adb = new ADB(device);
                break;
            }catch (Exception e){
                e.printStackTrace();
                // Ignore and try next device
            }
        }
    }

    public static void killDriver () {
        if(Android.driver != null) {
            MyLogger.log.debug("Killing Android driver ...");
            Android.driver.quit();
            Android.adb.uninstallApp(unlockPackage);
        }else MyLogger.log.debug("Android driver isn't initialize yet, so nothing to kill");
    }
}
