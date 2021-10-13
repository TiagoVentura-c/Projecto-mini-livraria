package com.example.livraria.tasks;

import android.os.AsyncTask;

import com.example.livraria.activities.EditarAtorActivity;
import com.example.livraria.entities.Ator;
import com.example.livraria.utils.AppDatabase;

public class AsyncAtorUpdate extends AsyncTask<Integer, Integer, Boolean> {

    EditarAtorActivity activity;
    Ator ator;

    public AsyncAtorUpdate(EditarAtorActivity activity, Ator ator) {
        this.activity = activity;
        this.ator = ator;
    }



    @Override
    protected Boolean doInBackground(Integer... integers) {
        AppDatabase.getConnection(activity.getBaseContext()).atorDao().updateAll(ator);
        return true;
    }

    @Override
    protected void onPostExecute(Boolean aBoolean) {
        super.onPostExecute(aBoolean);
        activity.finish();
    }
}
