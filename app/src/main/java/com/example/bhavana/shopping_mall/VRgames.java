package com.example.bhavana.shopping_mall;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class VRgames extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arcadegamess);
        //String[] language ={"pacman","speed racer","mortal combat","Tekken"};
        final String[] arcadegames={"Roller Coaster","The Walk","Shooting","Skating"};
        final Integer[] imgid={R.drawable.rollar,R.drawable.thewalk,R.drawable.shooting,R.drawable.skateing};

        ListView lst1 = (ListView)findViewById(R.id.listview);
        CustomListView customListview = new CustomListView(this, arcadegames, imgid);
        lst1.setAdapter(customListview);

        lst1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(VRgames.this,"Enjoy the experience of"+arcadegames[position],Toast.LENGTH_LONG).show();
            }
        });

    }}
