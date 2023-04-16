package com.example.adoptme;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class adopter_order_list extends AppCompatActivity {
    ImageButton del,a;
    ImageView ccat, rrab, ffish,bbird;
    ImageView cart_order, add_list, home,profile, search;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adopter_order_list);
        ccat= findViewById(R.id.ccat);
        bbird=findViewById(R.id.bbird);
        ffish=findViewById(R.id.ffish);
        rrab=findViewById(R.id.rrab);


        ccat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent (adopter_order_list.this, owner_detailpost.class);
                startActivity(a);

            }
        });

        rrab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent (adopter_order_list.this, owner_detailpost.class);
                startActivity(a);

            }
        });
        bbird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent (adopter_order_list.this, owner_detailpost.class);
                startActivity(a);

            }
        });

        ffish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent (adopter_order_list.this, owner_detailpost.class);
                startActivity(a);

            }
        });


        del=(ImageButton) findViewById(R.id.a);
        {

        }
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent (adopter_order_list.this, After_delete.class);
                startActivity(a);
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
                Intent intent=new Intent(adopter_order_list.this,adopter_order_list.class);
                startActivity(intent);

            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(adopter_order_list.this,home_page.class);
                startActivity(intent);
            }
        });

        add_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(adopter_order_list.this,MainActivity.class);
                startActivity(intent);
            }
        });
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(adopter_order_list.this,login.class);
                startActivity(intent);
            }
        });
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(adopter_order_list.this,search_page.class);
                startActivity(intent);
            }
        });


    }
    public void showAlertDialog1(View view) {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("حذف");
        alert.setMessage("هل انت متأكد من حذف الطلب");
        alert.setPositiveButton("نعم", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(adopter_order_list.this, "good job:)", Toast.LENGTH_SHORT).show();

            }
        });
        alert.setNegativeButton("لا", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(adopter_order_list.this, "good luck:)", Toast.LENGTH_SHORT).show();


            }
        });
        alert.create().show();
    }

}