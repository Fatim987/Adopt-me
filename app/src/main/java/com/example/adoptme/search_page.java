package com.example.adoptme;

import static android.view.View.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class search_page extends AppCompatActivity {
    ImageView cart_order, add_list, home,profile, search;
    ImageButton bird;
    ImageButton cat;
    ImageButton rabbit;
    ImageButton fish;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_page);
        cart_order =findViewById(R.id.cart_order);
        add_list=findViewById(R.id.add_list);
        home=findViewById(R.id.home_page);
        profile=findViewById(R.id.profile);
        search=findViewById(R.id.search);

        cart_order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(search_page.this,adopter_order_list.class);
                startActivity(intent);

            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(search_page.this,home_page.class);
                startActivity(intent);
            }
        });

        add_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(search_page.this,MainActivity.class);
                startActivity(intent);
            }
        });
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(search_page.this,login.class);
                startActivity(intent);
            }
        });
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(search_page.this,search_page.class);
                startActivity(intent);
            }
        });
        cat=(ImageButton)findViewById (R.id.cat);
        cat.setOnClickListener (view -> {
            Intent cat=new Intent ( search_page.this,Display_cat.class );
            startActivity (cat);
        });
        rabbit=(ImageButton)findViewById (R.id.rabbit);
        rabbit.setOnClickListener (new OnClickListener ( ) {
            @Override
            public void onClick(View view) {
                Intent rabbit=new Intent ( search_page.this,Dispkay_rabbit.class );
                startActivity (rabbit);

            }
        });
        bird=(ImageButton)findViewById (R.id.bird);
        bird.setOnClickListener (new OnClickListener ( ) {
            @Override
            public void onClick(View view) {
                Intent bird=new Intent ( search_page.this,Display_bird.class );
                startActivity (bird);
            }
        });
        fish=(ImageButton) findViewById (R.id.fish);
        fish.setOnClickListener (new OnClickListener ( ) {
            @Override
            public void onClick(View view) {
                Intent fish= new Intent ( search_page.this, Display_fish.class );
                startActivity (fish);
            }
        });

    }
}