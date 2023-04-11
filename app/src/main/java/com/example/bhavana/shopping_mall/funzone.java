package com.example.bhavana.shopping_mall;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.ImageView;
//import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
public class funzone extends AppCompatActivity {
    ImageView image;
    TextView name;
    int timeinsec;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funzone);

        name=findViewById(R.id.griddata);
        image=findViewById(R.id.imageview);

        Intent intent=getIntent();
        String a =intent.getStringExtra("name");
        Toast.makeText(this,"ajfhsdj"+a,Toast.LENGTH_LONG).show();

        if(a.equals("BoxOffice")){
            try {
        name.setText(intent.getStringExtra("name"));
        image.setImageResource(intent.getIntExtra("image",0));
            LinearLayout linearLayout = findViewById(R.id.rootContainer);
            //Log.e("dfbsj","abput to creat");
            // Create Button Dynamically

            Log.e("check",name.getText().toString().trim());
                while(timeinsec>0) {
                    Toast.makeText(this,"sleeping",Toast.LENGTH_LONG).show();

                    Thread.sleep(10000);
                    timeinsec--;
                }
                Toast.makeText(this,"intent is gonna happen",Toast.LENGTH_LONG).show();
                Intent i=new Intent(this,Boxoffice.class);
                startActivity(i);
                Toast.makeText(this,"intent finished",Toast.LENGTH_LONG).show();
                //Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        else if(a.equals("Lifestyle")){
            try {
                name.setText(intent.getStringExtra("name"));
                image.setImageResource(intent.getIntExtra("image",0));
                LinearLayout linearLayout = findViewById(R.id.rootContainer);
                //Log.e("dfbsj","abput to creat");
                // Create Button Dynamically

                Log.e("check",name.getText().toString().trim());
                while(timeinsec>0) {
                    Toast.makeText(this,"sleeping",Toast.LENGTH_LONG).show();

                    Thread.sleep(10000);
                    timeinsec--;
                }
                Toast.makeText(this,"intent is gonna happen",Toast.LENGTH_LONG).show();
                Intent i=new Intent(this,categories.class);
                startActivity(i);
                Toast.makeText(this,"intent finished",Toast.LENGTH_LONG).show();
                //Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        else if(a.equals("Electronics")){
            try {
                name.setText(intent.getStringExtra("name"));
                image.setImageResource(intent.getIntExtra("image",0));
                LinearLayout linearLayout = findViewById(R.id.rootContainer);
                //Log.e("dfbsj","abput to creat");
                // Create Button Dynamically

                Log.e("check",name.getText().toString().trim());
                while(timeinsec>0) {
                    Toast.makeText(this,"sleeping",Toast.LENGTH_LONG).show();

                    Thread.sleep(10000);
                    timeinsec--;
                }
                Toast.makeText(this,"intent is gonna happen",Toast.LENGTH_LONG).show();
                Intent i=new Intent(this,categories_elec.class);
                startActivity(i);
                Toast.makeText(this,"intent finished",Toast.LENGTH_LONG).show();
                //Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        else if(a.equals("Home")){
            try {
                name.setText(intent.getStringExtra("name"));
                image.setImageResource(intent.getIntExtra("image",0));
                LinearLayout linearLayout = findViewById(R.id.rootContainer);
                //Log.e("dfbsj","abput to creat");
                // Create Button Dynamically

                Log.e("check",name.getText().toString().trim());
                while(timeinsec>0) {
                    Toast.makeText(this,"sleeping",Toast.LENGTH_LONG).show();

                    Thread.sleep(10000);
                    timeinsec--;
                }
                Toast.makeText(this,"intent is gonna happen",Toast.LENGTH_LONG).show();
                Intent i=new Intent(this,home_categories.class);
                startActivity(i);
                Toast.makeText(this,"intent finished",Toast.LENGTH_LONG).show();
                //Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        else if(a.equals("FoodCourt")){
            try {
                name.setText(intent.getStringExtra("name"));
                image.setImageResource(intent.getIntExtra("image",0));
                LinearLayout linearLayout = findViewById(R.id.rootContainer);
                //Log.e("dfbsj","abput to creat");
                // Create Button Dynamically

                Log.e("check",name.getText().toString().trim());
                while(timeinsec>0) {
                    Toast.makeText(this,"sleeping",Toast.LENGTH_LONG).show();

                    Thread.sleep(10000);
                    timeinsec--;
                }
                Toast.makeText(this,"intent is gonna happen",Toast.LENGTH_LONG).show();
                Intent i=new Intent(this,categories_food.class);
                startActivity(i);
                Toast.makeText(this,"intent finished",Toast.LENGTH_LONG).show();
                //Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        else if(a.equals("Mall Layout")){
            try {
                name.setText(intent.getStringExtra("name"));
                image.setImageResource(intent.getIntExtra("image",0));
                LinearLayout linearLayout = findViewById(R.id.rootContainer);
                //Log.e("dfbsj","abput to creat");
                // Create Button Dynamically

                Log.e("check",name.getText().toString().trim());
                while(timeinsec>0) {
                    Toast.makeText(this,"sleeping",Toast.LENGTH_LONG).show();

                    Thread.sleep(10000);
                    timeinsec--;
                }
                Toast.makeText(this,"intent is gonna happen",Toast.LENGTH_LONG).show();
                Intent i=new Intent(this,categories_layout.class);
                startActivity(i);
                Toast.makeText(this,"intent finished",Toast.LENGTH_LONG).show();
                //Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
//        else if(a.equals("Spa")){
//            try {
//                name.setText(intent.getStringExtra("name"));
//                image.setImageResource(intent.getIntExtra("image",0));
//                LinearLayout linearLayout = findViewById(R.id.rootContainer);
//                //Log.e("dfbsj","abput to creat");
//                // Create Button Dynamically
//
//                Log.e("check",name.getText().toString().trim());
//                while(timeinsec>0) {
//                    Toast.makeText(this,"sleeping",Toast.LENGTH_LONG).show();
//
//                    Thread.sleep(10000);
//                    timeinsec--;
//                }
//                Toast.makeText(this,"intent is gonna happen",Toast.LENGTH_LONG).show();
//                Intent i=new Intent(this,Spa.class);
//                startActivity(i);
//                Toast.makeText(this,"intent finished",Toast.LENGTH_LONG).show();
//                //Thread.sleep(5000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//

        else if(a.equals("FunZone")){
            try {
                name.setText(intent.getStringExtra("name"));
                image.setImageResource(intent.getIntExtra("image",0));
                LinearLayout linearLayout = findViewById(R.id.rootContainer);
                //Log.e("dfbsj","abput to creat");
                // Create Button Dynamically

                Log.e("check",name.getText().toString().trim());
                while(timeinsec>0) {
                    Toast.makeText(this,"sleeping",Toast.LENGTH_LONG).show();

                    Thread.sleep(10000);
                    timeinsec--;
                }
                Toast.makeText(this,"intent is gonna happen",Toast.LENGTH_LONG).show();
                Intent i=new Intent(this,FunZoneact.class);
                startActivity(i);
                Toast.makeText(this,"intent finished",Toast.LENGTH_LONG).show();
                //Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
//        else if(a.equals("FoodCourt")){
//            try {
//                name.setText(intent.getStringExtra("name"));
//                image.setImageResource(intent.getIntExtra("image",0));
//                LinearLayout linearLayout = findViewById(R.id.rootContainer);
//                //Log.e("dfbsj","abput to creat");
//                // Create Button Dynamically
//
//                Log.e("check",name.getText().toString().trim());
//                while(timeinsec>0) {
//                    Toast.makeText(this,"sleeping",Toast.LENGTH_LONG).show();
//
//                    Thread.sleep(10000);
//                    timeinsec--;
//                }
//                Toast.makeText(this,"intent is gonna happen",Toast.LENGTH_LONG).show();
//                Intent i=new Intent(this,FoodCourt.class);
//                startActivity(i);
//                Toast.makeText(this,"intent finished",Toast.LENGTH_LONG).show();
//                //Thread.sleep(5000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }

        else if(a.equals("Sales")){
            try {
                name.setText(intent.getStringExtra("name"));
                image.setImageResource(intent.getIntExtra("image",0));
                LinearLayout linearLayout = findViewById(R.id.rootContainer);
                //Log.e("dfbsj","abput to creat");
                // Create Button Dynamically

                Log.e("check",name.getText().toString().trim());
                while(timeinsec>0) {
                    Toast.makeText(this,"sleeping",Toast.LENGTH_LONG).show();

                    Thread.sleep(10000);
                    timeinsec--;
                }
                Toast.makeText(this,"intent is gonna happen",Toast.LENGTH_LONG).show();
                Intent i=new Intent(this,StatsIntent.class);
                startActivity(i);
                Toast.makeText(this,"intent finished",Toast.LENGTH_LONG).show();
                //Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    else
        {
            name.setText("none");
            Toast.makeText(this,"not correct",Toast.LENGTH_LONG).show();
        }


    }
}
