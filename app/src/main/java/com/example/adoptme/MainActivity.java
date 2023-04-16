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

public class MainActivity extends AppCompatActivity {
    ImageView bird, cat, fish, hamster, cart_order, add_list, home, profile, search;
    ImageButton imgbtn1, imgbtn2, imgbtn3, imgbtn4, add_button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bird = findViewById(R.id.bird);
        cat = findViewById(R.id.cat);
        fish = findViewById(R.id.fish);
        add_button2 = findViewById(R.id.add_button2);
        hamster = findViewById(R.id.hamster);
        imgbtn1 = findViewById(R.id.imgbtn1);
        imgbtn2 = findViewById(R.id.imgbtn2);
        imgbtn3 = findViewById(R.id.imgbtn300);
        imgbtn4 = findViewById(R.id.imgbtn4);
        cart_order = findViewById(R.id.cart_order);
        add_list = findViewById(R.id.add_list);
        home = findViewById(R.id.home_page);
        profile = findViewById(R.id.profile);
        search = findViewById(R.id.search);

//onclick for bird poster
        bird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, listview.class);
                startActivity(intent);

            }
        });
//onclick for cat poster
        cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, listview.class);
                startActivity(intent);

            }
        });
//onclick for fish poster
        fish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, listview.class);
                startActivity(intent);

            }
        });
//onclick for hamster poster
        hamster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, listview.class);
                startActivity(intent);

            }
        });

        //onsetlistener for the imgbtn
        imgbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, owner_detailpost.class);
                startActivity(intent);

            }
        });
        imgbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, owner_detailpost.class);
                startActivity(intent);
            }
        });

        imgbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, owner_detailpost.class);
                startActivity(intent);
            }
        });

        imgbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, owner_detailpost.class);
                startActivity(intent);
            }
        });
        add_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, add_poster.class);
                startActivity(intent);

            }
        });

        cart_order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, adopter_order_list.class);
                startActivity(intent);

            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, home_page.class);
                startActivity(intent);
            }
        });

        add_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, login.class);
                startActivity(intent);
            }
        });
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, search_page.class);
                startActivity(intent);
            }
        });


    }

    public void showAlertDialog(View view) {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("حذف");
        alert.setMessage("هل انت متأكد من حذف الإعلان");
        alert.setPositiveButton("نعم", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "good job:)", Toast.LENGTH_SHORT).show();

            }
        });
        alert.setNegativeButton("لا", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "good luck:)", Toast.LENGTH_SHORT).show();


            }
        });
        alert.create().show();
    }

    public void showAlertDialog2(View view) {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Delet");
        alert.setMessage("هل انت متأكد من حذف الإعلان");
        alert.setPositiveButton("نعم", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "good job:)", Toast.LENGTH_SHORT).show();

            }
        });
        alert.setNegativeButton("لا", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "good luck:)", Toast.LENGTH_SHORT).show();


            }
        });
        alert.create().show();
    }

    public void showAlertDialog3(View view) {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Delet");
        alert.setMessage("هل انت متأكد من حذف الإعلان");
        alert.setPositiveButton("نعم", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "good job:)", Toast.LENGTH_SHORT).show();

            }
        });
        alert.setNegativeButton("لا", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "good luck:)", Toast.LENGTH_SHORT).show();


            }
        });
        alert.create().show();
    }
    public void showAlertDialog4(View view) {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Delet");
        alert.setMessage("هل انت متأكد من حذف الإعلان");
        alert.setPositiveButton("نعم", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "good job:)", Toast.LENGTH_SHORT).show();

            }
        });
        alert.setNegativeButton("لا", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "good luck:)", Toast.LENGTH_SHORT).show();


            }
        });
        alert.create().show();
    }

}


