package com.juny.vassonicdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


/**
 * @author ChenRunFang
 */
public class MainActivity extends AppCompatActivity {
    public static final int MODE_DEFAULT = 0;
    public static final String DEMO_URL = "https://www.baidu.com/";
    private Button mSonicBtn;
    private Button mSystemBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSonicBtn = findViewById(R.id.btn_sonic_web_view);
        mSystemBtn = findViewById(R.id.btn_web_view);
        mSonicBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSonicWebViewActivity(MODE_DEFAULT);
            }
        });
        mSystemBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSystemWebViewActivity(MODE_DEFAULT);
            }
        });
    }

    private void startSonicWebViewActivity(int mode) {
        Intent intent = new Intent(this, SonicWebViewActivity.class);
        intent.putExtra(SonicWebViewActivity.PARAM_URL, DEMO_URL);
        intent.putExtra(SonicWebViewActivity.PARAM_MODE, mode);
        intent.putExtra(SonicJavaScriptInterface.PARAM_CLICK_TIME, System.currentTimeMillis());
        startActivityForResult(intent, -1);
    }

    private void startSystemWebViewActivity(int mode) {
        Intent intent = new Intent(this, SystemWebViewActivity.class);
        intent.putExtra(SonicWebViewActivity.PARAM_URL, DEMO_URL);
        intent.putExtra(SonicWebViewActivity.PARAM_MODE, mode);
        intent.putExtra(SonicJavaScriptInterface.PARAM_CLICK_TIME, System.currentTimeMillis());
        startActivityForResult(intent, -1);
    }

}