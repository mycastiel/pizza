package qishipeng.ipizza.Activity;

import android.app.Activity;

import java.util.ArrayList;

/**
 * Created by Castiel on 2017/1/5.
 */

public class ActivityManage {

    private static ArrayList<Activity> activities = new ArrayList<Activity>();

    public static void addActivity(Activity activity ){
        activities.add(activity);
    }
    public static void removeActivity(Activity activity ){
        activities.remove(activity);
    }
    public static void finishAllActivites() {
        for (Activity activity : activities) {
            if (!activity.isFinishing()) {
                activity.finish();
            }
        }
    }

}
