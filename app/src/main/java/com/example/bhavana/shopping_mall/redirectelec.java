package com.example.bhavana.shopping_mall;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class redirectelec extends AppCompatActivity {
    ImageView Image;
    TextView Name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_redirectelec);
        Bundle b=getIntent().getExtras();
        Image=findViewById(R.id.image);
        Name=findViewById(R.id.name);

        String image=b.getString("image");
        String name=b.getString("name");
        Glide.with(getApplicationContext()).load(image).into(Image);
        Name.setText(name);

    }
}
