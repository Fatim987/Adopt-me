package com.example.adoptme;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TableRow;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class fish extends AppCompatActivity {
    RadioGroup radioGroup;
    Button btn_result;
    String gen;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fish);
        radioGroup =findViewById(R.id.radioGroup);
        btn_result =findViewById(R.id.confirm);
        radioGroup =findViewById(R.id.radioGroup);
//        radioGroup.setOnCheckedChangeListener(this);
//
//        btn_result.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(fish.this,"",Toast.LENGTH_SHORT).show();
//
//
//            }
//        });

    }

//    @Override
//    public void onCheckedChanged(RadioGroup radioGroup, int i) {
//        switch (i) {
//            case R.id.radioButton1:
//                gen = "confirmed";
//
//                break;
//
//            case R.id.radioButton2:
//                gen = "confirmed";
//
//                break;
//
//            case R.id.radioButton3:
//                gen = "confirmed";
//
//                break;
//
//            case R.id.radioButton4:
//                gen = "confirmed";
//
//                break;
//        }
//
//    }
}