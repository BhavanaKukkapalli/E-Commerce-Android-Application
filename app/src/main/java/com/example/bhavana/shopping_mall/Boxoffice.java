package com.example.bhavana.shopping_mall;

import android.content.Intent;
import android.database.Cursor;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;

public class Boxoffice extends AppCompatActivity {
    ArrayList<String> listitem;
    ArrayAdapter adapter;
    DatabaseHelper db;
    Button Display, Foodcourt;
    ListView lv;
    String mname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boxoffice);

        db = new DatabaseHelper(this);
        listitem = new ArrayList<>();
        Display = findViewById(R.id.add);
        //Foodcourt=findViewById(R.id.food);
        lv = findViewById(R.id.movielist);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(Boxoffice.this, success.class);
                i.putExtra("mov_name", mname);
                startActivity(i);

            }
        });

        Display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*String name=mvname.getText().toString();
                if(!name.equals("") && db.insertData(name)){
                    Toast.makeText(Boxoffice.this,"Data added",Toast.LENGTH_SHORT).show();
                    mvname.setText("");
                    listitem.clear();*/
                viewData();
                //}
                //else
                //  Toast.makeText(Boxoffice.this,"Data not added",Toast.LENGTH_SHORT).show();
            }
        });


    }

    private void viewData() {
        Cursor cursor = db.viewData();

        if (cursor.getCount() == 0) {
            Toast.makeText(this, "No data found", Toast.LENGTH_SHORT).show();
        } else {
            while (cursor.moveToNext()) {
                mname = cursor.getString(0);
                listitem.add(cursor.getString(0) + "\nTimings: " + cursor.getString(2));
            }
            adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listitem);
            lv.setAdapter(adapter);

        }
    }}



    /*package com.example.bhavana.shopping_mall;

import android.database.Cursor;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;

public class Boxoffice extends AppCompatActivity {
    ArrayList<String> listitem;
    ArrayAdapter adapter;
    DatabaseHelper db;
    Button Display;
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boxoffice);

        db=new DatabaseHelper(this);
        listitem=new ArrayList<>();
        Display=findViewById(R.id.add);
        lv=findViewById(R.id.movielist);

        Display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*String name=mvname.getText().toString();
                if(!name.equals("") && db.insertData(name)){
                    Toast.makeText(Boxoffice.this,"Data added",Toast.LENGTH_SHORT).show();
                    mvname.setText("");
                    listitem.clear();*/
                    //viewData();
                //}
                //else
                  //  Toast.makeText(Boxoffice.this,"Data not added",Toast.LENGTH_SHORT).show();
       /*     }
        });

    }

    private void viewData() {
        Cursor cursor=db.viewData();

        if(cursor.getCount()==0){
            Toast.makeText(this,"No data found",Toast.LENGTH_SHORT).show();
        }
        else{
            while(cursor.moveToNext()){
                listitem.add(cursor.getString(0)+"\nTimings: "+cursor.getString(2));
            }
            adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,listitem);
            lv.setAdapter(adapter);

        }
    }


}*/
