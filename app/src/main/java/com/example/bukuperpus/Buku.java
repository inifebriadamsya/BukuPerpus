package com.example.bukuperpus;

public class Buku {
    String nama_buku;
    String id_buku;
    int icon_buku;
    String status_buku;
    String kategori_buku;

    //constructor
    public Buku(String nama_buku, String id_buku, int icon, String status, String kategori) {
        this.nama_buku = nama_buku;
        this.id_buku = id_buku;
        this.icon_buku = icon;
        this.status_buku = status;
        this.kategori_buku = kategori;
    }

    //getters

    public String getNama_buku() {
        return this.nama_buku;
    }

    public String getId_buku() {
        return this.id_buku;
    }

    public String getStatus_buku() {
        return this.status_buku;
    }

    public String getKategori_buku_buku() {
        return this.kategori_buku;
    }

    public int getIcon_buku() {
        return this.icon_buku;
    }
}
