package com.buzz_ht.listviewex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String s[] = {"Activity1", "Activity2", "Activity3", "Activity4", "Activity5", "Activity6", "Activity7", "Activity8", "Activity9", "Activity10"};


        listView = findViewById(R.id.listView);

        ArrayAdapter a = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, s);

        listView.setAdapter(a);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {

                    case 1:
                        Intent i1 = new Intent(MainActivity.this, Activity1.class);
                        startActivity(i1);
                        break;
                    case 2:
                        Intent i2 = new Intent(MainActivity.this, Activity2.class);
                        startActivity(i2);
                        break;
                    case 3:
                        Intent i3 = new Intent(MainActivity.this, Activity3.class);
                        startActivity(i3);
                        break;
                    case 4:
                        Intent i4 = new Intent(MainActivity.this, Activity4.class);
                        startActivity(i4);
                        break;

                    case 5:
                        Intent i5 = new Intent(MainActivity.this, Activity5.class);
                        startActivity(i5);
                        break;
                    case 6:
                        Intent i6 = new Intent(MainActivity.this, Activity6.class);
                        startActivity(i6);
                        break;
                    case 7:
                        Intent i7 = new Intent(MainActivity.this, Activity7.class);
                        startActivity(i7);
                        break;
                    case 8:
                        Intent i8 = new Intent(MainActivity.this, Activity8.class);
                        startActivity(i8);
                        break;
                    case 9:
                        Intent i9 = new Intent(MainActivity.this, Activity9.class);
                        startActivity(i9);
                        break;
                    case 10:
                        Intent i10 = new Intent(MainActivity.this, Activity10.class);
                        startActivity(i10);
                        break;
                }

            }
        });


    }

}






