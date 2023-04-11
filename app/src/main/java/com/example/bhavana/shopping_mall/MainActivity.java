package com.example.bhavana.shopping_mall;



import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText ed1;
    EditText ed2;
    SQLiteDatabase db;
    CheckBox c, p;
    String dummyPassword;
    Button b1, b2, b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = (EditText) findViewById(R.id.edittext1);
        ed2 = (EditText) findViewById(R.id.edittext2);
        c = (CheckBox) findViewById(R.id.remember);
        b1 = (Button) findViewById(R.id.login);
        b2 = (Button) findViewById(R.id.signup);
        b3 = findViewById(R.id.otp);
        db = openOrCreateDatabase("Registration", Context.MODE_PRIVATE, null);
        db.execSQL("CREATE TABLE IF NOT EXISTS Registration(name VARCHAR,username VARCHAR,pin VARCHAR,phone VARCHAR,mail_id VARCHAR);");

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, otpverification.class);
                startActivity(i);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (ed1.getText().toString().equals("admin") && ed2.getText().toString().equals("admin123")) {

                    Intent i = new Intent(MainActivity.this, Admin.class);
                    startActivity(i);
                }
//                else if (ed1.getText().toString().equals("admin1") && ed2.getText().toString().equals("admin1234")) {
//
//                    Intent i = new Intent(MainActivity.this, adminspa.class);
//                    startActivity(i);
//                }
                Cursor c = db.rawQuery("SELECT * FROM Registration WHERE username='" + ed1.getText() + "'", null);

                if (c.moveToFirst()) {
                    String dum = c.getString(1);
                    dummyPassword = c.getString(2);
                    //Toast.makeText(getApplicationContext(), dummyPassword, Toast.LENGTH_SHORT).show();

                    if (ed2.getText().toString().equals(dummyPassword)) {
                        Toast.makeText(getApplicationContext(), "Welcome " + dum, Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(MainActivity.this, Home_Grid.class);
                        startActivity(i);
                        //Intent in = new Intent(this, intent.class);
                        //i.putExtra("username", usernameLogin.getText().toString());
                        //startActivity(in);
                    }
                    else{
                        Toast.makeText(getApplicationContext(),"Invalid credentials",Toast.LENGTH_LONG).show();
                    }


                } else {
                    Toast.makeText(getApplicationContext(), "wrong credentials", Toast.LENGTH_LONG).show();
                }
            }


        });
        b2.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "redirecting....!!", Toast.LENGTH_LONG).show();
                Intent i = new Intent(MainActivity.this, Registration.class);
                startActivity(i);
            }
        }));
    }
    // public MainActivity(Context context) {

    //}


    @Override
    public void onClick(View v) {

    }

    public void savedata(View view) {
        SharedPreferences sp = getSharedPreferences("MainActivity", Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = sp.edit();
        edit.putString("username", ed1.getText().toString());
        edit.putString("password", ed2.getText().toString());
        edit.commit();
        Toast.makeText(this, "data saved", Toast.LENGTH_LONG).show();

        getdata(view);

    }

    public void getdata(View view) {
        Toast.makeText(this, "data retrieving", Toast.LENGTH_LONG).show();
        SharedPreferences sp = getSharedPreferences("MainActivity", Context.MODE_PRIVATE);
        ed1.setText(sp.getString("username", "NA"));
        ed2.setText(sp.getString("password", "NA"));

    }


}