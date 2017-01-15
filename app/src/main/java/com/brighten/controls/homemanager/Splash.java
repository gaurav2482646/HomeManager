package com.brighten.controls.homemanager;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import me.wangyuwei.loadingview.LoadingView;

public class Splash extends AppCompatActivity {

    private static final String TAG = "test";
    private LoadingView mLoadingView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);
        mLoadingView = (LoadingView) this.findViewById(R.id.loading_view);

        mLoadingView.start();
        runCountDownTimer();
    }
    public void runCountDownTimer()
    {
        new CountDownTimer(4000,1000)
        {
            @Override
            public void onTick(long millisecondAfter) {
                Log.e(TAG, "onTick: CountDowntimer calling" );
            }

            @Override
            public void onFinish() {
                startActivity(new Intent(Splash.this,Login_Activity.class));
                Log.e(TAG, "onFinish:CountDownTimer finished");
                finish();
            }
        }.start();
    }
}