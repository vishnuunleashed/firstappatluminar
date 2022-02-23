package com.example.firstappatluminar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    EditText uname,pword;
    Button cancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    uname = findViewById(R.id.username);
    pword = findViewById(R.id.password);
    cancel = findViewById(R.id.cancel);

    cancel.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            finish();
        }
    });

    }


    public void onclick(View view) {

        if(uname.getText().toString().equals("Admin") && pword.getText().toString().equals("Admin")){
            Intent i = new Intent(getApplicationContext(),HomePage.class);
            startActivity(i);
        }else{
            Toast.makeText(getApplicationContext(),"Incorrect login credential", Toast.LENGTH_SHORT).show();
        }
    }


}