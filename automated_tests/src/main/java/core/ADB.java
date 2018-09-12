package core;

import core.managers.ServerManager;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by Kashif on 3/9/2018.
 */

// ANDROID DEBUG BRIDGE CLASS
public class ADB {

    private String ID;

    public ADB(String deviceId) {
        ID = deviceId;
    }

    public static String command (String command){
        MyLogger.log.debug("Formatting ADB command :"+command);
        if(command.startsWith("adb")) {
            command = command.replace("adb", ServerManager.getAndroidHome() + "/platform-tools/adb");
            MyLogger.log.debug("Formatted ADB command :"+command);
        }
        else throw new RuntimeException("This method is designed to run adb commands only!");
        String output = ServerManager.runCommand(command);
        MyLogger.log.debug("Output of the ADB command :"+output);
        if(output == null) return "";
        else return output.trim();
    }

    public static void killSever(){
        command("adb kill-server");
    }

    public static void startSever(){
        command("adb start-server");
    }

    public static ArrayList getConnectedDevices() {
        ArrayList devices = new ArrayList();
        String output = command("adb devices");

        for(String line : output.split("\n")){
            line = line.trim();
            if(line.endsWith("device")) devices.add(line.replace("device", "").trim());
        }

        for(Object dev : devices){
            String newDev = dev.toString();
            MyLogger.log.debug("Found Connected Devices :"+newDev);
        }
        return devices;
    }

    public String getAndroidVersionAsString() {
        String output = command("adb -s  "+ID+" shell getprop ro.build.version.release");

        if(output.length() == 3) output+=".0";
        return output;

    }

    public int getAndroidVersion() {
        return Integer.parseInt(getAndroidVersionAsString().replaceAll("\\.", ""));

    }

    public void openAppActivity (String packageID, String activityID) {
        command("adb -s "+ID+" shell am start -c api.android.intent.category.LAUNCHER -a api.android.intent.action.Main -n "+packageID+"/"+activityID);
    }

    public void clearAppsData(String packageID){
        command("adb -s "+ID+" shell pm clear"+packageID);
    }

    public void forceStop(String packageID){
        command("adb -s "+ID+" shell am force-stop"+packageID);
    }

    public void installApp(String apkPath){
        command("adb -s "+ID+" install"+apkPath);
    }

    public void uninstallApp(String packageID){
        command("adb -s "+ID+" uninstall"+""+packageID);
    }

    public void clearLogBuffer(){
        command("adb -s "+ID+" shell -c");
    }

    public void pushFile(String source, String target){
        command("adb -s "+ID+" push "+source+""+target);
    }

    public void pullFile(String source, String target){
        command("adb -s "+ID+" push "+source+""+target);
    }

    public void takeScreenShot(String target){
        command("adb -s "+ID+" shell screencap "+target);
    }

    public void reboot(){
        command("adb -s "+ID+" reboot");
    }

    public String getDeviceModel(){
        return command("adb -s "+ID+" shell getprop ro.product.model");
    }

    public ArrayList getInstalledPackages() {
        ArrayList packages = new ArrayList();
        String [] output = command("adb -s "+ID+" shell pm list packages").split("\n");
        for(String packageID : output) packages.add(packageID.replace("package","").trim());
        return packages;
    }

}

