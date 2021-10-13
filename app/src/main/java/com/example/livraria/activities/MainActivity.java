package com.example.livraria.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.livraria.R;
import com.example.livraria.entities.Usuario;

public class MainActivity extends AppCompatActivity {


    private Button btnEntrar;
    private EditText editEmail;
    private EditText editPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Log.d("teste", "Cliclou");

        btnEntrar = findViewById(R.id.buttonMainEntrar);
        editEmail = findViewById(R.id.editMainEmail);
        editPassword = findViewById(R.id.editMainPassword);

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Usuario usuario = new Usuario();
                usuario.setEmail(editEmail.getText().toString());
                usuario.setPassord(editEmail.getText().toString());

                Intent intent = new Intent(MainActivity.this, AtorActivity.class);
                intent.putExtra("usuario", usuario);
/*
                Ator ator = new Ator();
                ator.setNomeAtor("Tiago Ventura");
                ator.setFoto("depp.png");
                ator.setFotoFilme("pirata.jpg");
                ator.setNomeFilme("Piratas do caribe");
                ator.setDescricaoFilme("Lorem Ipsum sit anet dolor");

                //new AsyncAtorInsert(MainActivity.this,ator).execute();
                //new AsyncUsuarioInsert(MainActivity.this, usuario).execute();
                //new AsyncAtorSelectAll(MainActivity.this).execute();



                intent.putExtra("ator", ator);
*/
                startActivity(intent);
            }
        });

    }
}