package com.example.livraria.utils;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.livraria.dao.AtorDao;
import com.example.livraria.dao.UsuarioDao;
import com.example.livraria.entities.Ator;
import com.example.livraria.entities.Usuario;

@Database(entities = {Usuario.class, Ator.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UsuarioDao userDao();
    public abstract AtorDao atorDao();


    public static AppDatabase getConnection(Context appContext){
        return Room.databaseBuilder(appContext, AppDatabase.class, "app_database")
                .fallbackToDestructiveMigration().build();
    }

}
