package qishipeng.ipizza;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;

public class Welcome extends Activity {
    private Handler gotoMainFrameHandler = new Handler();
    private Runnable postdelay;
    Intent gotoMainFrame;

    long delayedSeconds = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        gotoMainFrame = new Intent().setClass(this, MainFrame.class);

        postdelay = new Runnable() {
            @Override
            public void run() {
                startActivity(gotoMainFrame);
                overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
                destroyThisActivity();
            }
        };
    }

    @Override
    protected void onResume() {
        super.onResume();
        this.gotoMainFrame();
    }


    private void destroyThisActivity(){
        this.finish();
    }

    private void gotoMainFrame(){
        gotoMainFrameHandler.postDelayed(postdelay, delayedSeconds);
    }
}
