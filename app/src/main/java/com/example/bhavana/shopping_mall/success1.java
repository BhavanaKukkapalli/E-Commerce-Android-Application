package com.example.bhavana.shopping_mall;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class success1 extends AppCompatActivity {
    TextView t1,textLang, textDimen, textTime, textAvail;
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success1);
        Bundle b=getIntent().getExtras();
        String name=b.getString("mov_name");
        t1=(TextView)findViewById(R.id.msg);
        String test = name;
        t1.setText(test);

        db = openOrCreateDatabase("StudentDB", Context.MODE_PRIVATE, null);
        db.execSQL("CREATE TABLE IF NOT EXISTS spar(Movie_name VARCHAR,Show_times INTEGER)");
        Cursor c = db.rawQuery("SELECT * FROM spar WHERE Movie_name='" + t1.getText() + "'", null);

        if (c.moveToFirst()) {
            String test3 = c.getString(0);
            String test4 = c.getString(1);



            textTime.setText(test3);
            textAvail.setText(test4);

        }




       /* String test1 = c.getString(4);
        String test2 = c.getString(3);
        String test3 = c.getString(1);
        String test4 = c.getString(2);



        textLang.setText(test1);
        textDimen.setText(test2);
        textTime.setText(test3);
        textAvail.setText(test4);*/





    }
}
