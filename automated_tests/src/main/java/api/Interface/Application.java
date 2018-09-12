package api.Interface;

import java.util.Objects;

/**
 * Created by Kashif on 3/15/2018.
 */
public interface Application {

    void forceStop();
    void clearData();
    Objects open();
    String activityID();
    String packageID();

}
