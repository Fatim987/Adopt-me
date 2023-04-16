package com.example.adoptme;

import static com.example.adoptme.R.id.spinner;
import static com.example.adoptme.R.id.spinner2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;

public class add_poster extends AppCompatActivity {
    ImageView cart_order, add_list, home,profile, search;
    Button button;
    Spinner spinner,spinner2,spinner3;
    ImageButton imageButton10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        imageButton10=findViewById(R.id.imageButton10);
        imageButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(add_poster.this,MainActivity.class);
                startActivity(intent);

            }
        });
        setContentView(R.layout.activity_add_poster);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(add_poster.this,home_page.class);
                startActivity(intent);
            }
        });

        cart_order =findViewById(R.id.cart_order);
        add_list=findViewById(R.id.add_list);
        home=findViewById(R.id.home_page);
        profile=findViewById(R.id.profile);
        search=findViewById(R.id.search);

        cart_order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(add_poster.this,adopter_order_list.class);
                startActivity(intent);

            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(add_poster.this,home_page.class);
                startActivity(intent);
            }
        });

        add_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(add_poster.this,MainActivity.class);
                startActivity(intent);
            }
        });
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(add_poster.this,login.class);
                startActivity(intent);
            }
        });
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(add_poster.this,search_page.class);
                startActivity(intent);
            }




        });

//        spinner= findViewById(R.id.spinner);
//        ArrayAdapter adapter = ArrayAdapter.createFromResource( this,
//                R.array.spinner1,
//                android.R.layout.simple_spinner_item);
//        Spinner spinner= (Spinner) findViewById(R.id.spinner);
//        spinner.setAdapter(adapter);
//
//
//        spinner2= findViewById(R.id.spinner2);
//        ArrayAdapter adapter1 = ArrayAdapter.createFromResource( this,
//                R.array.spinner2,
//                android.R.layout.simple_spinner_item);
//        Spinner spinner2= (Spinner) findViewById(R.id.spinner2);
//        spinner.setAdapter(adapter);
//
//        spinner3= findViewById(R.id.spinner3);
//        ArrayAdapter adapter3 = ArrayAdapter.createFromResource( this,
//                R.array.spinner3,
//                android.R.layout.simple_spinner_item);
//        Spinner spinner3= (Spinner) findViewById(R.id.spinner3);
//        spinner.setAdapter(adapter);

    }
}