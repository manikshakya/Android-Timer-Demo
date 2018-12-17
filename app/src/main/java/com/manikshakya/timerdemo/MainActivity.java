package com.manikshakya.timerdemo;

import android.app.Activity;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        new CountDownTimer(10000, 1000){
            @Override
            public void onTick(long l) {
                Log.i("Seconds left: ", String.valueOf(l/1000));
            }

            @Override
            public void onFinish() {
                Log.i("Countdown timer ", "finish.");
            }
        }.start();

        /*
        final Handler handler = new Handler();
        Runnable run = new Runnable() {
            @Override
            public void run() {

                Log.i("Hi", "there");
                handler.postDelayed(this, 1000);
            }
        };

        handler.post(run);
        */


    }
}
