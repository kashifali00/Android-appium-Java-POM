package core;

import org.apache.log4j.Logger;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Kashif on 3/9/2018.
 */
public class MyLogger {

    static{

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
        System.setProperty("current.date.time", dateFormat.format(new Date()));
        String path = System.getProperty("user.dir");
        String filePath = path+"/logs/";
        System.setProperty("filePath",filePath);
    }

    public static Logger log = Logger.getLogger(MyLogger.class);

}
