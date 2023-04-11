package com.example.bhavana.shopping_mall;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.TextView;


import java.net.PasswordAuthentication;

public class Signup extends AppCompatActivity implements View.OnClickListener{
    EditText email,phno;
    EditText Password;
    Button register;
    String emailid,phoneno;
    String emailpattern="[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);EditText name,username;
            username=(EditText)findViewById(R.id.Username);
            email=(EditText)findViewById(R.id.emailid);
            phno=(EditText)findViewById(R.id.Mobile);
            register=(Button)findViewById(R.id.signup2);

            register.setOnClickListener(this);


    }
        public void onClick(View view) {
            emailid=email.getText().toString().trim();
            phoneno=phno.getText().toString().trim();
            if (emailid.matches(emailpattern) && phoneno.length()==10) {
                Toast.makeText(this, "Registered successfully", Toast.LENGTH_LONG).show();
            }
            else{
                Toast.makeText(this, "Email format or phone no is incorrect", Toast.LENGTH_LONG).show();

            }
        }
    }
