package com.example.adoptme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class Dispkay_rabbit extends AppCompatActivity {
    ImageView cart_order, add_list, home,profile, search,r1,r2,r3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dispkay_rabbit);
        cart_order =findViewById(R.id.cart_order);
        add_list=findViewById(R.id.add_list);
        home=findViewById(R.id.home_page);
        profile=findViewById(R.id.profile);
        search=findViewById(R.id.search);
        r1=findViewById(R.id.r1);
        r2=findViewById(R.id.r2);
        r3=findViewById(R.id.r3);

        r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Dispkay_rabbit.this,PosterDetailActivity.class);
                startActivity(intent);

            }
        });

        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Dispkay_rabbit.this,PosterDetailActivity.class);
                startActivity(intent);

            }
        });

        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Dispkay_rabbit.this,PosterDetailActivity.class);
                startActivity(intent);

            }
        });

        cart_order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Dispkay_rabbit.this,adopter_order_list.class);
                startActivity(intent);

            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Dispkay_rabbit.this,home_page.class);
                startActivity(intent);
            }
        });

        add_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Dispkay_rabbit.this,MainActivity.class);
                startActivity(intent);
            }
        });
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Dispkay_rabbit.this,login.class);
                startActivity(intent);
            }
        });
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Dispkay_rabbit.this,search_page.class);
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