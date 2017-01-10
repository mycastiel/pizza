package qishipeng.ipizza.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Castiel on 2017/1/5.
 */
public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityManage.addActivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityManage.removeActivity(this);
    }

}
