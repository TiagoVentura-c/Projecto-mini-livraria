package com.example.livraria.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.livraria.entities.Usuario;

import java.util.List;

@Dao
public interface UsuarioDao {
    @Query("SELECT * FROM users")
    List<Usuario> getAll();

    @Query("SELECT * FROM users WHERE email = :email LIMIT 1")
    Usuario findByEmail(String email);

    @Insert
    void insertAll(Usuario... users);

    @Delete
    void delete(Usuario usuario);


}
