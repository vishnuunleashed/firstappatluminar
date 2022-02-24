package com.example.firstappatluminar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LogIn extends AppCompatActivity{
    EditText uname,pword;
    Button cancel;
    String un;
    String pw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);



    uname = findViewById(R.id.username);
    pword = findViewById(R.id.password);

    cancel = findViewById(R.id.cancel);


    Intent intentFromReg = getIntent();

    un = intentFromReg.getStringExtra("username");
    pw = intentFromReg.getStringExtra("password");


    cancel.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            finish();
        }
    });

    }


    public void onclick(View view) {
        String username = uname.getText().toString();
        String password = pword.getText().toString();


        if(username.equals(un) && password.equals(pw)){
            Intent intent = new Intent(getApplicationContext(),HomePage.class);
            startActivity(intent);

        }else{
            Toast.makeText(getApplicationContext(),"Incorrect login credential", Toast.LENGTH_SHORT).show();
        }
    }


    public void onclick_register(View view) {
        Intent intent = new Intent(getApplicationContext(),Registration.class);
        startActivity(intent);
    }
}