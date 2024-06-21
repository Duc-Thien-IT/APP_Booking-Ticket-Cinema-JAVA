package com.example.cinema.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.cinema.R;

public class LoginActivity extends AppCompatActivity {
    EditText edtUsername, edtPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        addControls();
        addEvents();
    }

    public void addControls(){
        edtPassword = findViewById(R.id.edtPassword);
        edtUsername = findViewById(R.id.edtUsername);
        btnLogin = findViewById(R.id.btnLogin);
    }

    public void addEvents(){
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edtUsername.toString().isEmpty() || edtPassword.toString().isEmpty()){
                    Toast.makeText(LoginActivity.this, "Please fill your usernamr or password", Toast.LENGTH_SHORT).show();
                }
                else if(edtUsername.getText().toString().equals("user") && edtPassword.getText().toString().equals("123")){
                    startActivity(new Intent(LoginActivity.this, DashboardActivity.class));
                }
                else {
                    Toast.makeText(LoginActivity.this, "Your username or password is not correct", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}