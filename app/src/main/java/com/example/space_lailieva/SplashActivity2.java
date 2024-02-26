package com.example.space_lailieva;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.airbnb.lottie.LottieAnimationView;


public class SplashActivity2 extends AppCompatActivity {
    LottieAnimationView lotty;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash2);
        lotty=findViewById(R.id.lottie);
        lotty.setAnimation(R.raw.astronaut);

        lotty.animate().alpha(1f).setDuration(3000).withEndAction(new Runnable() {
            @Override
            public void run() {
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);

                Intent intent = new Intent(SplashActivity2.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}