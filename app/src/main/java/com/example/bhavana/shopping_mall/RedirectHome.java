package com.example.bhavana.shopping_mall;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class RedirectHome extends AppCompatActivity {
    ImageView Image;
    TextView Name,descr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_redirect_home);
        Bundle b=getIntent().getExtras();
        Image=findViewById(R.id.image);
        Name=findViewById(R.id.name);
        descr=findViewById(R.id.desc);

        String image=b.getString("image");
        String name=b.getString("name");
        String description=b.getString("description");
        Glide.with(getApplicationContext()).load(image).into(Image);
        Name.setText(name);
        descr.setText(description);

    }
}
