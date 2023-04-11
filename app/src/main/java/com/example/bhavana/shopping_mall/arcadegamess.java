package com.example.bhavana.shopping_mall;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class arcadegamess extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arcadegamess);
        //String[] language ={"pacman","speedracer","mortalcombat","Tekken"};
        final String[] arcadegames={"pacman","speedracer","mortalcombat","bull","airhockey","foosball"};
        final Integer[] imgid={R.drawable.pacman,R.drawable.speedracer,R.drawable.mortal,R.drawable.bull,R.drawable.airhockey,R.drawable.speedracer};

        ListView lst1 = (ListView)findViewById(R.id.listview);
        CustomListView customListview = new CustomListView(this, arcadegames, imgid);
        lst1.setAdapter(customListview);

        lst1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(arcadegamess.this,"Enjoy the experience of"+arcadegames[position],Toast.LENGTH_LONG).show();
//            Intent i=new Intent(getApplicationContext(),Desc.class);
//            i.putExtra("id",arcadegames[position]);
//            Log.e("gfd",arcadegames[position]);
//            startActivity(i);
            }
        });

    }}
