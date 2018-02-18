package com.example.whoami.muhamadihsansusanto_1202144220_modul2;

public class pilihmenu {
    int foto;
    String nama;
    int harga;
    String komposisi;

    public pilihmenu(int foto, String nama, int harga, String komposisi) {
        this.foto = foto;
        this.nama = nama;
        this.harga = harga;
        this.komposisi = komposisi;
    }

    public int getFoto() {
        return foto;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    public String getKomposisi() {
        return komposisi;
    }
}
