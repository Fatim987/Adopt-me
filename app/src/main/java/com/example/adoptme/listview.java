package com.example.adoptme;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TableRow;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class listview extends AppCompatActivity {
    RadioGroup radioGroup;
    Button btn_result;
    String gen;
    ImageView cart_order, add_list, home,profile, search;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bird);
        radioGroup =findViewById(R.id.radioGroup);
        btn_result =findViewById(R.id.confirm);
        radioGroup =findViewById(R.id.radioGroup);



        cart_order =findViewById(R.id.cart_order);
        add_list=findViewById(R.id.add_list);
        home=findViewById(R.id.home_page);
        profile=findViewById(R.id.profile);
        search=findViewById(R.id.search);
        cart_order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(listview.this,adopter_order_list.class);
                startActivity(intent);

            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(listview.this,home_page.class);
                startActivity(intent);
            }
        });

        add_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(listview.this,MainActivity.class);
                startActivity(intent);
            }
        });
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(listview.this,login.class);
                startActivity(intent);
            }
        });
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(listview.this,search_page.class);
                startActivity(intent);
            }
        });
//        radioGroup.setOnCheckedChangeListener(this);
//
//        btn_result.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(listview.this,"",Toast.LENGTH_SHORT).show();
//
//
//            }
//        });




    }
    public void showAlertDialog(View view) {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("حذف");
        alert.setMessage("هل انت متأكد من تأكيد الطلب؟");
        alert.setPositiveButton("نعم", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(listview.this, "good job:)", Toast.LENGTH_SHORT).show();

            }
        });
        alert.setNegativeButton("لا", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(listview.this, "good luck:)", Toast.LENGTH_SHORT).show();


            }
        });
        alert.create().show();
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

    }


//}