package com.waroengsteakandshake.orderapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void onLogin(View view) {
        EditText username_text_view = (EditText) findViewById(R.id.login_username);
        EditText passwrod_text_view = (EditText) findViewById(R.id.login_password);

        String username = username_text_view.getText().toString();
        String password = passwrod_text_view.getText().toString();

        if (username.equals("depan")) {

            if (password.equals("password")) {
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                finish();
            }
            else {
                String toToast = "Password salah";
                Toast toast = Toast.makeText(getApplicationContext(), toToast, Toast.LENGTH_SHORT);
                toast.show();
            }
        }
        else {
            String toToast = "Username tidak terdaftar";
            Toast toast = Toast.makeText(getApplicationContext(), toToast, Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
