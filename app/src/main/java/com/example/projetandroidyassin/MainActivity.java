package com.example.projetandroidyassin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn_login;
    EditText editLogin,editPassword;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_login = (Button) findViewById(R.id.btn_login);
        editLogin = (EditText) findViewById(R.id.userName);
        editPassword = (EditText) findViewById(R.id.userName2);





        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String login = editLogin.getText().toString().trim();
                String password = editPassword.getText().toString().trim();
                if( password.equals("123456")) {
                    Toast.makeText(MainActivity.this,"Connexion avec succée",Toast.LENGTH_LONG).show();


                    Intent x = new Intent(MainActivity.this, Recharge.class);
                    x.putExtra("login",login);
                    startActivity(x);
                }


            }






    });

}

}