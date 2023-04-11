package com.example.bhavana.shopping_mall;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class subHome extends AppCompatActivity {

    FirebaseDatabase database;
    DatabaseReference myRef ;
    List<Model> list;
    RecyclerView recycle;
    Button view;
    TextView t1;
    int subpa,subch;
    String hellorey;
    static String[][] hello = {{"Artifacts_Photo","Artifacts_Vases","Artifacts_Gifts","Artifacts_Statues"},{"Kitchen_Appl","Kitchen_Uten"},{"Home_LivSofas","Living_Lighting","Living_Carpets","Living_Tv","Living_Tables"},{"Dining_Furn","Dining_Crock"}};

//    static String[][] hello = {{"Women_Clothing","Women_Ethnic","Women_Footwear","Women_Lingerie","Women_Nightwear","Women_Access","Women_Jewellry"},{"Men_Clothing","Men_Ethnic","Men_Footwear","Men_Inner","Men_Access"},{"Boys_Clothing","Boys_Access","Boys_Toys","Boys_Footwear","Boys_Inner"},{"Girls_Clothing","Girls_Ethnic","Girls_Footwear","Girls_KidsEssentials","Girls_Access","Girls_Toys","Girls_Inner","Girls_Jewellry"},{"Kids_BabyCare","Kids_SoftToys","Kids_Access","Kids_Travel","Kids_Dolls"}};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        Bundle b=getIntent().getExtras();
        subpa=b.getInt("list");
        subch=b.getInt("sublist");
        view = (Button) findViewById(R.id.view);
        recycle = (RecyclerView) findViewById(R.id.recycle);

        FirebaseApp.initializeApp(this);
        database = FirebaseDatabase.getInstance();
        myRef = database.getReference(hello[subpa][subch]);

        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                list = new ArrayList<Model>();
                for(DataSnapshot dataSnapshot1 :dataSnapshot.getChildren()){

                    Model value = dataSnapshot1.getValue(Model.class);
                    Model fire = new Model();
                    String name = value.getDescription();
                    String address = value.getTitle();
                    String email = value.getImage();
                    Log.e("asvdgs",name);
                    fire.setDescription(name);
                    fire.setImage(email);
                    fire.setTitle(address);
                    list.add(fire);

                }

            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w("Hello", "Failed to read value.", error.toException());
            }
        });


        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                ViewHolder recyclerAdapter = new ViewHolder(list,subHome.this);
                RecyclerView.LayoutManager recyce = new GridLayoutManager(subHome.this,2);
                /// RecyclerView.LayoutManager recyce = new LinearLayoutManager(MainActivity.this);
                // recycle.addItemDecoration(new GridSpacingItemDecoration(2, dpToPx(10), true));
                recycle.setLayoutManager(recyce);
                recycle.setItemAnimator( new DefaultItemAnimator());
                recycle.setAdapter(recyclerAdapter);




            }
        });



    }
}





