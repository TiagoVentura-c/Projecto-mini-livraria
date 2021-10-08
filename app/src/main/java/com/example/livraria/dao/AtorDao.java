package com.example.livraria.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.livraria.entities.Ator;
import com.example.livraria.entities.Usuario;

import java.util.List;

@Dao
public interface AtorDao {
    @Query("SELECT * FROM actors")
    List<Ator> getAll();

    @Query("SELECT * FROM actors WHERE uid = :id LIMIT 1")
    Ator findById(int id);

    @Insert
    void insertAll(Ator... ators);

    @Delete
    void delete(Ator ator);


}
