package core;

import java.util.Date;

/**
 * Created by Kashif on 3/12/2018.
 */
public class Timer {

    public long startStamp;

    public void start() {
        startStamp = getTimeStamp();
    }

    public static long getTimeStamp() {
        return new Date().getTime();
    }

}
