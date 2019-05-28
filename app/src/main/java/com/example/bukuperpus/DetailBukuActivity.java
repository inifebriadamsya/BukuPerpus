package com.example.bukuperpus;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailBukuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ActionBar actionBar = getSupportActionBar();
        TextView tv_namaBukuDetail = findViewById(R.id.nama_buku_detail);
        TextView tv_idBukuDetail = findViewById(R.id.id_buku_detail);
        TextView tv_kategoriBuku = findViewById(R.id.id_buku_kategori);
        TextView tv_pengarangBukuDetail = findViewById(R.id.pengarang_buku_detail);
        TextView tv_edisiBukuDetail = findViewById(R.id.edisi_buku_detail);
        TextView tv_isbnBukuDetail = findViewById(R.id.isbn_buku_detail);
        TextView tv_descBukuDetail = findViewById(R.id.desc_buku_detail);

        //get data from previous activity when item of listview is clicked using intent
        Intent intent = getIntent();
        String ActionBarTitle = intent.getStringExtra("actionBarTitle");
        String nama_buku = intent.getStringExtra("sendBookName");
        String id_buku = intent.getStringExtra("sendIDName");
        String kategori_buku = intent.getStringExtra("sendKategoriBuku");
        String pengarang_buku = intent.getStringExtra("sendPengarangName");
        String edisi_buku = intent.getStringExtra("sendEdisiName");
        String isbn_buku = intent.getStringExtra("sendISBNName");
        String desc_buku = intent.getStringExtra("sendDESCName");

        //set actionbar title
        actionBar.setTitle(ActionBarTitle);
        //set text in textview
        tv_namaBukuDetail.setText(nama_buku);
        tv_idBukuDetail.setText("ID Buku: " + id_buku);
        tv_kategoriBuku.setText("Kategori: "+kategori_buku);
        tv_pengarangBukuDetail.setText(pengarang_buku);
        tv_edisiBukuDetail.setText(edisi_buku);
        tv_isbnBukuDetail.setText(isbn_buku);
        tv_descBukuDetail.setText(desc_buku);



    }
}