package com.example.bhavana.shopping_mall;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class FunZoneact extends AppCompatActivity implements View.OnClickListener{
    Button img1,img2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_zoneact);
        img1=(Button)findViewById(R.id.arc);
        img2=(Button)findViewById(R.id.vr);

        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
            if(v==img1){
                Intent i = new Intent(FunZoneact.this,arcadegamess.class);
                startActivity(i);
            }
            else if(v==img2){
                Intent i = new Intent(FunZoneact.this,VRgames.class);
                startActivity(i);

            }
    }
}
