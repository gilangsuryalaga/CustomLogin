package com.example.customlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    EditText username_regis,email_regis,pass_regis,verpass;
    Button registerbtn;
    TextView loginNow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        username_regis = findViewById(R.id.user_name_regis);
        email_regis = findViewById(R.id.email_user_regis);
        pass_regis = findViewById(R.id.pass_user_regis);
        verpass = findViewById(R.id.ver_pass_regis);

        registerbtn = findViewById(R.id.register_btn);

        loginNow = findViewById(R.id.login_now);

        loginNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
