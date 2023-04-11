package com.example.bhavana.shopping_mall;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

public class Desc extends AppCompatActivity {
ImageView i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desc);
        i=(ImageView)findViewById(R.id.iv);
        Bundle b=getIntent().getExtras();
        String a="R.drawable."+b.getString("id");
        //i.setImageResource(Integer.parseInt(a));
        Log.e("assdas : "," "+a);

    }
}
