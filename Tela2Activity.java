package com.example.trabalho;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Tela2Activity extends AppCompatActivity {
    EditText edNota1;
    TextView resultado;
    EditText projeto;




    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);


        edNota1 = (EditText) findViewById(R.id.p1);
        projeto = (EditText) findViewById(R.id.projeto);
    }


    public void calcularmedia(View v) {


        float nota1 = Float.parseFloat(edNota1.getText().toString());
        float projet = Float.parseFloat(projeto.getText().toString());



        resultado = (TextView) findViewById(R.id.resultado);
        String situacao = null;
        if ( projet >= nota1)
            situacao = "Gasolina ta em conta";
        if ( nota1 >= projet)
            situacao = "Alcool ta em conta";
        if (nota1==projet)
            situacao = "Nenhum compensa";
        String msg =   "" + situacao + "  ";

        resultado.setText(msg);
    }

        public void onClick(View view){
            Intent tela = new Intent(this, MainActivity.class);
            startActivity(tela);
        }



    }
