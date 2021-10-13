package com.example.livraria.tasks;

import android.app.Activity;
import android.os.AsyncTask;

import com.example.livraria.activities.NovoAtorActivity;
import com.example.livraria.entities.Ator;
import com.example.livraria.utils.AppDatabase;

public class AsyncAtorInsert extends AsyncTask<Integer, Integer, Boolean> {
    NovoAtorActivity activity;
    Ator ator;

    public AsyncAtorInsert(NovoAtorActivity activity, Ator ator){
        this.activity = activity;
        this.ator = ator;
    }

    @Override
    protected Boolean doInBackground(Integer... integers) {

        AppDatabase.getConnection(activity.getApplicationContext()).atorDao().insertAll(ator);

        return true;
    }

    @Override
    protected void onPostExecute(Boolean aBoolean) {
        super.onPostExecute(aBoolean);
        activity.finish();
    }
}
