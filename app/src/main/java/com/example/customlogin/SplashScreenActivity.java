package com.example.customlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreenActivity extends AppCompatActivity {
    ImageView logo_splash;
    TextView title,beta;
    Animation logo_anim, title_anim;

    private static int splashTimeOut=5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        logo_splash = findViewById(R.id.logo_monster_splash);
        title= findViewById(R.id.slogan_splash);
        beta = findViewById(R.id.beta);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreenActivity.this,LoginActivity.class);
                startActivity(intent);
                finish();
            }
        }, splashTimeOut);

        logo_anim = AnimationUtils.loadAnimation(this, R.anim.logoanim);
        title_anim = AnimationUtils.loadAnimation(this, R.anim.titleanim);

        logo_splash.startAnimation(logo_anim);
        title.startAnimation(title_anim);
        beta.startAnimation(title_anim);

    }
}
