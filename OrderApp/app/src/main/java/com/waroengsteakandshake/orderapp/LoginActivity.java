package com.waroengsteakandshake.orderapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    public static String username = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void onLogin(View view) {
        EditText username_text_view = (EditText) findViewById(R.id.login_username);
        EditText passwrod_text_view = (EditText) findViewById(R.id.login_password);

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
