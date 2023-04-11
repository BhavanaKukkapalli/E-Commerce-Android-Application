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

public class subelec extends AppCompatActivity {

    FirebaseDatabase database;
    DatabaseReference myRef ;
    List<ModelElec> list;
    RecyclerView recycle;
    Button view;
    TextView t1;
    int subpa,subch;
    String hellorey;

    static String[][] hello = {{"Elec_PApple","Elec_Samsung","Women_Footwear","Women_Lingerie","Women_Nightwear"},{"Men_Clothing","Elec_AccSpeaker","Men_Footwear","Men_Inner"},{"Elec_lappyApple","Boys_Access","Elec_lappyDell","Boys_Footwear","Boys_Inner"},{"Elec_Sony","Kids_SoftToys","Kids_Access","Kids_Travel"}};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subelec);
        Bundle b=getIntent().getExtras();
        subpa=b.getInt("list");
        subch=b.getInt("sublist");
        view = (Button) findViewById(R.id.view1);
        recycle = (RecyclerView) findViewById(R.id.recycle1);

        FirebaseApp.initializeApp(this);
        database = FirebaseDatabase.getInstance();
        myRef = database.getReference(hello[subpa][subch]);

        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                list = new ArrayList<ModelElec>();
                for(DataSnapshot dataSnapshot1 :dataSnapshot.getChildren()){

                    ModelElec value = dataSnapshot1.getValue(ModelElec.class);
                    ModelElec fire = new ModelElec();
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




                ViewHolderElec recyclerAdapter = new ViewHolderElec(list,subelec.this);
                RecyclerView.LayoutManager recyce = new GridLayoutManager(subelec.this,2);
                /// RecyclerView.LayoutManager recyce = new LinearLayoutManager(MainActivity.this);
                // recycle.addItemDecoration(new GridSpacingItemDecoration(2, dpToPx(10), true));
                recycle.setLayoutManager(recyce);
                recycle.setItemAnimator( new DefaultItemAnimator());
                recycle.setAdapter(recyclerAdapter);




            }
        });



    }
}
