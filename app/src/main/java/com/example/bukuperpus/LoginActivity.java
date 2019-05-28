package com.example.bukuperpus;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends Activity {

    private static final String TAG = "LoginActivity";
    Button mButton;
    EditText email, password;
    //TextView tx1;
    int counter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mButton = (Button)findViewById(R.id.email_sign_in_button);
        email = (EditText)findViewById(R.id.email);
        password = (EditText)findViewById(R.id.password);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(email.getText().toString().equals("pengguna@perpusku.com") && password.getText().toString().equals("pengguna123")) {
                    Toast toast = Toast.makeText(getApplicationContext(), "Redirecting...",Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER_VERTICAL, 0,0);
                    toast.show();
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                }else{
                    Toast toast = Toast.makeText(getApplicationContext(), "Isikan identitas anda dengan benar!",Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER_VERTICAL, 0,0);
                    toast.show();
                }
            }
        });
    }
}