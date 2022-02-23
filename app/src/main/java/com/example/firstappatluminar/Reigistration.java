package com.example.firstappatluminar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Reigistration extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton radioButton;
    CheckBox cricket,football,chess;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reigistration);

        radioGroup = findViewById(R.id.rg1);

        cricket = findViewById(R.id.checkBox);
        football = findViewById(R.id.checkBox1);
        chess = findViewById(R.id.checkBox2);

    }

    public void registration_click(View view) {
        radioButton = findViewById(radioGroup.getCheckedRadioButtonId());
        String remark = radioButton.getText().toString();
        Toast.makeText(getApplicationContext(),remark, Toast.LENGTH_SHORT).show();

        String result ="My hobby : ";

        if(cricket.isChecked()){
            result += " Cricket";
        }
        if(football.isChecked()){
            result += " Football";
        }
        if(chess.isChecked()){
            result += " Chess";
        }
        Toast.makeText(getApplicationContext(),result, Toast.LENGTH_SHORT).show();
    }
}