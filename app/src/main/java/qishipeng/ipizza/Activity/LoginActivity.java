package qishipeng.ipizza.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import qishipeng.ipizza.MainFrame;
import qishipeng.ipizza.R;

/**
 * Created by Castiel on 2017/1/5.
 */

public class LoginActivity extends BaseActivity {
    private int exitTime;
    private ProgressBar pb;
    private EditText account;
    private EditText password;
    private Button login;
    private Button reg;
    private TextView titletext;
    TextView acc;
    private final Handler handler = new Handler() {
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case 1:
                    Toast.makeText(LoginActivity.this, "登陆成功", Toast.LENGTH_SHORT).show();
                    pb.setVisibility(View.GONE);
                    Intent it = new Intent(LoginActivity.this, MainFrame.class);
                    startActivity(it);
                    finish();
                    break;
                case -1:
                    pb.setVisibility(View.GONE);
                    Toast.makeText(LoginActivity.this, (String) msg.obj, Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        exitTime = 0;

        login = (Button) findViewById(R.id.login);
        reg = (Button) findViewById(R.id.register);
        titletext = (TextView) findViewById(R.id.title_text);
        acc = (TextView) findViewById(R.id.fragshop_accountname);
        titletext.setText("登录");
        pb = (ProgressBar) findViewById(R.id.progress_bar);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                account = (EditText) findViewById(R.id.account);
                password = (EditText) findViewById(R.id.password);


                pb.setVisibility(View.VISIBLE);

                Message msg = new Message();
                msg.what = 1;
                handler.sendMessage(msg);

            }
        });

        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(it);
            }
        });
    }
}
