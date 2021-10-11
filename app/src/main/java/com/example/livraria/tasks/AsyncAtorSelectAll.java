package com.example.livraria.tasks;

import android.app.Activity;
import android.os.AsyncTask;
import android.util.Log;

import com.example.livraria.entities.Ator;
import com.example.livraria.utils.AppDatabase;

import java.util.List;

public class AsyncAtorSelectAll extends AsyncTask<Integer, Integer, Boolean>{

    Activity activity;

    public AsyncAtorSelectAll(Activity activity) {
        this.activity = activity;
    }

    @Override
    protected Boolean doInBackground(Integer... integers) {
        List<Ator> ators = AppDatabase.getConnection(activity.getApplicationContext()).atorDao().getAll();

        for (Ator elem:
             ators) {
            Log.e("teste", elem.toString());
        }

        return true;
    }
}
