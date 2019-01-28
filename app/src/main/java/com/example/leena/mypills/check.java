package com.example.leena.mypills;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.airbnb.lottie.LottieAnimationView;

public class check extends AppCompatActivity {
    LottieAnimationView lottieAnimationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);

        lottieAnimationView = (LottieAnimationView) findViewById(R.id.animation_view_1);

        lottieAnimationView.playAnimation();

        Handler mHandler = new Handler();
        mHandler.postDelayed(new Runnable() {

            @Override
            public void run() {
                startActivity(new Intent(check.this, Map_data.class));
            }

        }, 3000L);
    }
}
