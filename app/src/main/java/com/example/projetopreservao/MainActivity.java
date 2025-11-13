package com.example.projetopreservao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnMapa, btnInform, btnContribuir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMapa = findViewById(R.id.btnMapa);
        btnMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mapa = new Intent(getApplicationContext(), mapa.class);
                startActivity(mapa);
            }
        });

        btnInform = findViewById(R.id.btnInform);
        btnInform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Informacoes = new Intent(getApplicationContext(), Informacoes.class);
                startActivity(Informacoes);
            }
        });

        btnContribuir = findViewById(R.id.btnContribuir);
        btnContribuir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contribuir = new Intent(getApplicationContext(), contribuir.class);
                startActivity(contribuir);
            }
        });
    }
}