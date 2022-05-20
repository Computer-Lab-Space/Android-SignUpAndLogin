package com.example.signupandloginin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
EditText Signup_Username, Signup_Password;
Button btnSignup;
String regularExpression="^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!])[A-Za-z\\d@$!]{8,}$";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Signup_Username=(EditText)findViewById(R.id.txt_username);
        Signup_Password=(EditText)findViewById(R.id.txt_password);
        btnSignup=(Button)findViewById(R.id.btn_signup);
        btnSignup.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String username=Signup_Username.getText().toString();
        String password=Signup_Password.getText().toString();
        if(validatePassword(password)){
            Toast.makeText(getBaseContext(),"Valid Password", Toast.LENGTH_LONG).show();
            Bundle bundle=new Bundle();
            bundle.putString("User",username);
            bundle.putString("Pwd",password);
            Intent it=new Intent(this,Login.class);
            it.putExtra("data",bundle);
            startActivity(it);
        } else
        {
            Toast.makeText(getBaseContext(),"Invalid Password",Toast.LENGTH_LONG).show();
        }

    }

    private boolean validatePassword(String password) {
        Pattern pattern=Pattern.compile(regularExpression);
        Matcher matcher=pattern.matcher(password);
        return matcher.matches();
    }
}