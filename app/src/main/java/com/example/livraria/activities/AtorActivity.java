package com.example.livraria.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.livraria.R;
import com.example.livraria.adapters.AtorRecyclerViewAdapter;
import com.example.livraria.entities.Ator;
import com.example.livraria.entities.Usuario;
import com.example.livraria.utils.AppDatabase;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class AtorActivity extends AppCompatActivity {

    RecyclerView mRecyclerAtores;
    AtorRecyclerViewAdapter atorAdapter;
    FloatingActionButton mFabAtorNovo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ator);

        mRecyclerAtores = findViewById(R.id.recycler_ator_list);
        mFabAtorNovo = findViewById(R.id.fabAtorNovo);

        atorAdapter = new AtorRecyclerViewAdapter(new ArrayList<Ator>());
        mRecyclerAtores.setAdapter(atorAdapter);



        Intent intent = getIntent();
        Usuario usuario = (Usuario) intent.getSerializableExtra("usuario");
        Ator ator = (Ator) intent.getSerializableExtra("ator");

        mFabAtorNovo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AtorActivity.this, NovoAtorActivity.class);
                startActivity(intent);

            }
        });

        AppDatabase.getConnection(this).atorDao().getAll().observe(this, new Observer<List<Ator>>() {
            @Override
            public void onChanged(List<Ator> ators) {
                atorAdapter.setAtores(ators);
            }
        });

    }

}