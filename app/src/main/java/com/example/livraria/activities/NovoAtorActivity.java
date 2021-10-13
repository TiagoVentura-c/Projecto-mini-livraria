package com.example.livraria.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.livraria.R;
import com.example.livraria.entities.Ator;
import com.example.livraria.tasks.AsyncAtorInsert;

public class NovoAtorActivity extends AppCompatActivity {

    EditText editNomeAtor;
    EditText editNomeFilme;
    EditText editDescricaoFilme;
    Button buttonCancelar;
    Button buttonSalvar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novo_ator);

        editNomeAtor = findViewById(R.id.editNovoAtorDescricaoFilme);
        editNomeFilme = findViewById(R.id.editNovoAtorFilme);
        editDescricaoFilme = findViewById(R.id.editNovoAtorDescricaoFilme);
        buttonCancelar = findViewById(R.id.buttonNovoAtorCancelar);
        buttonSalvar = findViewById(R.id.buttonNovoAtorSalvar);

        buttonCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        buttonSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ator ator = new Ator();
                ator.setNomeAtor(editNomeAtor.getText().toString());
                ator.setNomeFilme(editNomeFilme.getText().toString());
                ator.setDescricaoFilme(editDescricaoFilme.getText().toString());
                ator.setFoto("depp.png");
                ator.setFotoFilme("pirata.jpg");
                new AsyncAtorInsert(NovoAtorActivity.this, ator).execute();

            }
        });

    }
}