package com.example.adoptme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class Display_fish extends AppCompatActivity {
    ImageView cart_order, add_list, home,profile, search,f1,f2,f3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_fish);
        cart_order =findViewById(R.id.cart_order);
        add_list=findViewById(R.id.add_list);
        home=findViewById(R.id.home_page);
        profile=findViewById(R.id.profile);
        search=findViewById(R.id.search);
        f1=findViewById(R.id.f1);
        f2=findViewById(R.id.f2);
        f3=findViewById(R.id.f3);

        f3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Display_fish.this,PosterDetailActivity.class);
                startActivity(intent);

            }
        });


        f2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Display_fish.this,PosterDetailActivity.class);
                startActivity(intent);

            }
        });

        f1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Display_fish.this,PosterDetailActivity.class);
                startActivity(intent);

            }
        });


        cart_order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Display_fish.this,adopter_order_list.class);
                startActivity(intent);

            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Display_fish.this,home_page.class);
                startActivity(intent);
            }
        });

        add_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Display_fish.this,MainActivity.class);
                startActivity(intent);
            }
        });
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Display_fish.this,login.class);
                startActivity(intent);
            }
        });
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Display_fish.this,search_page.class);
                startActivity(intent);
            }
        });

        ArrayAdapter adapter = ArrayAdapter.createFromResource(
                this,
                R.array.filter,
                android.R.layout.simple_spinner_item);
        Spinner c = (Spinner) findViewById(R.id.filter);
        c.setAdapter(adapter);
    }
}