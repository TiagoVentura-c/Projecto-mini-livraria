package com.example.livraria.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.livraria.R;
import com.example.livraria.entities.Ator;
import com.example.livraria.entities.Usuario;

public class AtorActivity extends AppCompatActivity {

    private ImageView imageFotoAtor;
    private TextView textNomeAtor;
    private TextView textNomeFilme;
    private ImageView imageFotoFilme;
    private TextView textDescricaoFilme;
    private Button buttonGostei;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ator);

        imageFotoAtor = findViewById(R.id.imageAtorFoto);
        textNomeAtor = findViewById(R.id.textAtorNome);
        textNomeFilme = findViewById(R.id.textAtorFilme);
        imageFotoFilme = findViewById(R.id.imageAtorFotoFilme);
        textDescricaoFilme = findViewById(R.id.textAtorDescricaoFilme);
        buttonGostei = findViewById(R.id.buttonAtorGostei);


        Intent intent = getIntent();
        Usuario usuario = (Usuario) intent.getSerializableExtra("usuario");
        Ator ator = (Ator) intent.getSerializableExtra("ator");

        textNomeAtor.setText(ator.getNomeAtor());
        textNomeFilme.setText(ator.getNomeFilme());
        textDescricaoFilme.setText(ator.getDescricaoFilme());

        int idFotoAtor =  getResources().getIdentifier(ator.getFotoSplitted(ator.getFoto()), "drawable", getPackageName());
        imageFotoAtor.setImageResource(idFotoAtor);

        int idFotoFilme = getResources().getIdentifier(ator.getFotoSplitted(ator.getFotoFilme()), "drawable", getPackageName());
        imageFotoFilme.setImageResource(idFotoFilme);

    }
}