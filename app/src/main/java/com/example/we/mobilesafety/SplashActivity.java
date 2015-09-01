package com.example.we.mobilesafety;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import utils.SplashCheck;

public class SplashActivity extends Activity {
 private TextView tv_version;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        initView();
        tv_version.setText("版本号:"+ SplashCheck.getVersionName(this));
    }

    private void initView() {
        tv_version= (TextView) findViewById(R.id.splash_version);

    }


}
