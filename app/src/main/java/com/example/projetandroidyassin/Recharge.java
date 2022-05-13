package com.example.projetandroidyassin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Recharge extends AppCompatActivity {
    TextView txtuser ,txtNum ,txtRecharge ,txtR;
    EditText userName2 ,editNum ,editCode ,editRecharge ,editSolde ;
    Button btn1 ,btn2;
    public String user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recharge);
        txtuser=(TextView) findViewById(R.id.txtuser);
        txtNum=(TextView) findViewById(R.id.txtNum);
        txtR=(TextView) findViewById(R.id.txtR);
        txtRecharge=(TextView) findViewById(R.id.txtRecharge);




        editNum=(EditText) findViewById(R.id.editNum);
        editCode=(EditText) findViewById(R.id.editCode);
        editRecharge=(EditText) findViewById(R.id.editRecharge);
        editSolde=(EditText) findViewById(R.id.editSolde);




        Intent data = getIntent();
        user = data.getExtras().getString("login");
        txtuser.setText(user);





        editNum.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                String numero = editNum.getText().toString().trim();
                char Ind1 = editNum.getText().charAt(0);
                String numTel = String.valueOf(Ind1);
                if(numero.length() >8 || numero.length() < 8 ) {
                    txtNum.setText("Le numéro de téléphne doit étre 8 chiffre");
                }
               else {
                    if (numTel.equals("2")) {
                        txtNum.setTextColor(Color.parseColor("#FF0000"));
                        txtRecharge.setText("Entrer votre code de recharge (14 chiffre)");
                        editRecharge.setBackgroundColor(Color.parseColor("#FF0000"));
                        editCode.setBackgroundColor(Color.parseColor("#FF0000"));
                        editSolde.setText("*100#");
                        txtNum.setText("Votre ligne est ooredoo");
                    } else if (numTel.equals("3")) {
                        txtNum.setTextColor(Color.parseColor("#FF7F00"));
                        txtRecharge.setText("Entrer votre code de recharge (14 chiffre)");
                        editRecharge.setBackgroundColor(Color.parseColor("#FF7F00"));
                        editSolde.setBackgroundColor(Color.parseColor("#FF7F00"));
                        editSolde.setText("*111#");
                        txtNum.setText("Votre ligne est orange");
                    } else if (numTel.equals("9")) {
                        txtNum.setTextColor(Color.parseColor("#0000FF"));
                        txtRecharge.setText("Entrer votre code de recharge (13 chiffre)");
                        editRecharge.setBackgroundColor(Color.parseColor("#0000FF"));
                        editSolde.setBackgroundColor(Color.parseColor("#0000FF"));
                        editSolde.setText("*122#");
                        txtNum.setText("Votre ligne est télécom");
                    }


                }
                return false;
            }
        });





        editRecharge.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {


                String code = editRecharge.getText().toString().trim();
                char numTele = editNum.getText().charAt(0);


                String ligne = String.valueOf(numTele);

                if (ligne.equals("2")) {
                    if(code.length() >14 || code.length() < 14 ) {
                        txtR.setText("Le code de recharge doit étre 14 chiffre");
                    }else {

                        String codeRecharge = editRecharge.getText().toString().trim();
                        editRecharge.setText("*100*" + codeRecharge + "#");
                    }
                } else if (ligne.equals("3")) {
                    if(code.length() >14 || code.length() < 14 ) {
                        txtR.setText("Le code de recharge doit étre 14 chiffre");
                    }else {

                        String codeRecharge = editRecharge.getText().toString().trim();
                        editRecharge.setText("*101*" + codeRecharge + "#");
                    }
                } else if (ligne.equals("9")) {
                    if(code.length() >13 || code.length() < 13 ) {
                        txtR.setText("Le code de recharge doit étre 13 chiffre");
                    }else {

                        String codeRecharge = editRecharge.getText().toString().trim();
                        editRecharge.setText("*123*" + codeRecharge + "#");
                    }
                }
                return false;
            }
        });



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Recharge();
            }

            private void Recharge() {
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Solde();
            }

            private void Solde() {
            }
        });
    }














    }
