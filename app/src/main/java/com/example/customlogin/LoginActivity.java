package com.example.customlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    ImageView logo;
    TextView title,beta,regis;
    Animation logo_anim, title_anim;
    LinearLayout linear1;
    Button login;
    EditText email,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = findViewById(R.id.email_login);
        pass = findViewById(R.id.pass_login);

        regis = findViewById(R.id.regis_now);
        logo = findViewById(R.id.logo_monster);
        title = findViewById(R.id.slogan);
        beta = findViewById(R.id.beta_login);
        linear1 = findViewById(R.id.linear1);
        login = findViewById(R.id.login_btn);

        title_anim = AnimationUtils.loadAnimation(this, R.anim.loginanimation);

//        logo.startAnimation(title_anim);
//        title.startAnimation(title_anim);
//        beta.startAnimation(title_anim);
//        linear1.startAnimation(title_anim);


        regis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
