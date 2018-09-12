package core.managers;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Kashif on 3/14/2018.
 */
public class ServerManager {

    private static String OS;
    private static String ANDROID_HOME;

    public static String getAndroidHome() {
        if(ANDROID_HOME == null) {
            ANDROID_HOME = System.getenv("ANDROID_HOME");
            if(ANDROID_HOME == null) throw new RuntimeException("Failed to find ANDROID_HOME, make sure you have set ANDROID_HOME environment variable");
        }
        return ANDROID_HOME;
    }

    public static String getOS() {
        if(OS == null) OS = System.getenv("os.name");
        return OS;
    }

    public boolean isWindow() {
        return getOS().contains("Window");
    }

    public boolean isMac() {
        return getOS().contains("Mac");
    }

    public boolean isLinux() {
        return getOS().contains("Linux") || getOS().contains("Ubuntu");
    }

    public static String runCommand (String command){
        String output = null;
        try {
            Scanner scanner = new Scanner(Runtime.getRuntime().exec(command).getInputStream()).useDelimiter("\\A");
            if(scanner.hasNext()) {
                output = scanner.next();
                System.out.println("output = "+output);
            }
        }catch (IOException e){
            throw new RuntimeException(e.getMessage());
        }
        return output;
    }
}
