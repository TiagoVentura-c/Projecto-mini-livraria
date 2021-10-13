package com.example.livraria.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.livraria.R;
import com.example.livraria.entities.Ator;
import com.example.livraria.tasks.AsyncAtorDelete;
import com.example.livraria.tasks.AsyncAtorUpdate;

public class EditarAtorActivity extends AppCompatActivity {

    EditText mEditNomeAtor;
    EditText mEditNomeFilme;
    EditText mEditDescricao;
    Button mButtonCancelar;
    Button mButtonSalvar;
    Button mButtonExcluir;
    Ator ator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_ator);

        mEditNomeAtor = findViewById(R.id.editEditarNome);
        mEditNomeFilme = findViewById(R.id.editEditarFilme);
        mEditDescricao = findViewById(R.id.editEditarDescricaoFilme);
        mButtonCancelar = findViewById(R.id.buttonEditarCancelar);
        mButtonSalvar = findViewById(R.id.buttonEditarSalvar);
        mButtonExcluir = findViewById(R.id.buttonEditarRemover);

        Intent intent = getIntent();
        ator = (Ator) intent.getSerializableExtra("ator");

        mEditNomeAtor.setText(ator.getNomeAtor());
        mEditNomeFilme.setText(ator.getNomeFilme());
        mEditDescricao.setText(ator.getDescricaoFilme());

        mButtonCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        mButtonSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ator.setNomeAtor(mEditNomeAtor.getText().toString());
                ator.setNomeFilme(mEditNomeFilme.getText().toString());
                ator.setDescricaoFilme(mEditDescricao.getText().toString());

                new AsyncAtorUpdate(EditarAtorActivity.this, ator).execute();
            }
        });

        mButtonExcluir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AsyncAtorDelete(EditarAtorActivity.this, ator).execute();
            }
        });

    }


}