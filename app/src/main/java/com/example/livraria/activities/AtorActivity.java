package com.example.livraria.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.livraria.R;
import com.example.livraria.adapters.AtorRecyclerViewAdapter;
import com.example.livraria.entities.Ator;
import com.example.livraria.entities.Usuario;

import java.util.ArrayList;

public class AtorActivity extends AppCompatActivity {

    RecyclerView mRecyclerAtores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ator);
        mRecyclerAtores = findViewById(R.id.recycler_ator_list);
        AtorRecyclerViewAdapter atorAdapter = new AtorRecyclerViewAdapter(new ArrayList<Ator>());
        mRecyclerAtores.setAdapter(atorAdapter);


        Intent intent = getIntent();
        Usuario usuario = (Usuario) intent.getSerializableExtra("usuario");
        Ator ator = (Ator) intent.getSerializableExtra("ator");

    }
}