package com.example.livraria.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity(tableName = "actors")
public class Ator implements Serializable {

    @PrimaryKey(autoGenerate = true)
    private int uid;

    @ColumnInfo(name = "foto")
    private String foto;

    @ColumnInfo(name = "nome_actor")
    private String nomeAtor;

    @ColumnInfo(name = "nome_filme")
    private String nomeFilme;

    @ColumnInfo(name = "foto_filme")
    private String fotoFilme;

    @ColumnInfo(name = "descricao_filme")
    private String descricaoFilme;

    @ColumnInfo(name = "gostei")
    private boolean gostei = false;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getFotoSplitted(String nomeImage){ return nomeImage.split("\\.")[0];}

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getNomeAtor() {
        return nomeAtor;
    }

    public void setNomeAtor(String nomeAtor) {
        this.nomeAtor = nomeAtor;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public String getFotoFilme() {
        return fotoFilme;
    }

    public void setFotoFilme(String fotoFilme) {
        this.fotoFilme = fotoFilme;
    }

    public String getDescricaoFilme() {
        return descricaoFilme;
    }

    public void setDescricaoFilme(String descricaoFilme) {
        this.descricaoFilme = descricaoFilme;
    }

    public boolean isGostei() {
        return gostei;
    }

    public void setGostei(boolean gostei) {
        this.gostei = gostei;
    }

    @Override
    public String toString() {
        return "Ator{" +
                "uid=" + uid +
                ", foto='" + foto + '\'' +
                ", nomeAtor='" + nomeAtor + '\'' +
                ", nomeFilme='" + nomeFilme + '\'' +
                ", fotoFilme='" + fotoFilme + '\'' +
                ", descricaoFilme='" + descricaoFilme + '\'' +
                ", gostei=" + gostei +
                '}';
    }
}
