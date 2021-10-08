package com.example.livraria.tasks;

import android.app.Activity;
import android.os.AsyncTask;

import com.example.livraria.entities.Usuario;
import com.example.livraria.utils.AppDatabase;

public class AsyncUsuarioInsert extends AsyncTask<Integer, Integer, Boolean> {

    Activity activity;
    Usuario usuario;

    public AsyncUsuarioInsert(Activity activity, Usuario usuario){
        this.activity = activity;
        this.usuario = usuario;

    }


    @Override
    protected Boolean doInBackground(Integer... integers) {
        AppDatabase.getConnection(activity.getApplicationContext()).userDao().insertAll(usuario);
        return true;
    }
}
