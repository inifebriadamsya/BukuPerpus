package com.example.bukuperpus;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.design.widget.CoordinatorLayout;
import android.widget.Toast;
//import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class BookListViewAdapter extends BaseAdapter{

    //variables
    Context mContext;
    LayoutInflater inflater;
    List<Buku> modellist;
    ArrayList<Buku> arrayList;
    CoordinatorLayout coordinatorLayout;

    public BookListViewAdapter(Context context, List<Buku> modellist) {
        mContext = context;
        this.modellist = modellist;
        inflater = LayoutInflater.from(mContext);
        this.arrayList = new ArrayList<Buku>();
        this.arrayList.addAll(modellist);
    }

    public class ViewHolder{
        TextView nama_buku, id_buku, status_buku, kategori_buku;
        ImageView mIconIv;
    }

    @Override
    public int getCount() {
        return modellist.size();
    }

    @Override
    public Object getItem(int i) {
        return modellist.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int postition, View view, ViewGroup parent) {
        ViewHolder holder;
        //mContext = view.getContext();
        if (view==null){
            holder = new ViewHolder();
            view = inflater.inflate(R.layout.activity_row, null);

            //locate the views in row.xml
            holder.nama_buku = view.findViewById(R.id.nama_buku);
            holder.id_buku = view.findViewById(R.id.id_buku);
            holder.status_buku = view.findViewById(R.id.status_buku);
            holder.kategori_buku = view.findViewById(R.id.ketegoribuku);
            holder.mIconIv = view.findViewById(R.id.icon_buku);

            view.setTag(holder);

        }
        else {
            holder = (ViewHolder)view.getTag();
        }
        //set the results into textviews
        holder.nama_buku.setText(modellist.get(postition).getNama_buku());
        holder.id_buku.setText(modellist.get(postition).getId_buku());
        holder.status_buku.setText(modellist.get(postition).getStatus_buku());
        holder.kategori_buku.setText(modellist.get(postition).getKategori_buku_buku());
        //set the result in imageview
        holder.mIconIv.setImageResource(modellist.get(postition).getIcon_buku());

        //listview item clicks
        view.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //code later
                if (modellist.get(postition).getNama_buku().equals("Text Book 1")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, DetailBukuActivity.class);
                    intent.putExtra("actionBarTitle", "Text Book 1");
                    intent.putExtra("sendBookName", "Text Book 1");
                    intent.putExtra("sendIDName", "TB001");
                    intent.putExtra("sendKategoriBuku", "Textbook");
                    intent.putExtra("sendPengarangName", "Pengarang 1");
                    intent.putExtra("sendEdisiName", "01");
                    intent.putExtra("sendISBNName", "TB0001");
                    intent.putExtra("sendDESCName", "Berikut adalah deskripsi buku: " + mContext.getString(R.string.dummy_deskripsi));
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getNama_buku().equals("Text Book 2")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, DetailBukuActivity.class);
                    intent.putExtra("actionBarTitle", "Text Book 2");
                    intent.putExtra("sendBookName", "Text Book 2");
                    intent.putExtra("sendIDName", "TB002");
                    intent.putExtra("sendKategoriBuku", "Textbook");
                    intent.putExtra("sendPengarangName", "Pengarang 2");
                    intent.putExtra("sendEdisiName", "02");
                    intent.putExtra("sendISBNName", "TB0002");
                    intent.putExtra("sendDESCName", "Berikut adalah deskripsi buku: " + mContext.getString(R.string.dummy_deskripsi));
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getNama_buku().equals("Text Book 3")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, DetailBukuActivity.class);
                    intent.putExtra("actionBarTitle", "Text Book 3");
                    intent.putExtra("sendBookName", "Text Book 3");
                    intent.putExtra("sendIDName", "TB003");
                    intent.putExtra("sendKategoriBuku", "Textbook");
                    intent.putExtra("sendPengarangName", "Pengarang 3");
                    intent.putExtra("sendEdisiName", "03");
                    intent.putExtra("sendISBNName", "TB0003");
                    intent.putExtra("sendDESCName", "Berikut adalah deskripsi buku: " + mContext.getString(R.string.dummy_deskripsi));
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getNama_buku().equals("Text Book 4")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, DetailBukuActivity.class);
                    intent.putExtra("actionBarTitle", "Text Book 4");
                    intent.putExtra("sendBookName", "Text Book 4");
                    intent.putExtra("sendIDName", "TB004");
                    intent.putExtra("sendPengarangName", "Pengarang 4");
                    intent.putExtra("sendEdisiName", "04");
                    intent.putExtra("sendKategoriBuku", "Textbook");
                    intent.putExtra("sendISBNName", "TB0004");
                    intent.putExtra("sendDESCName", "Berikut adalah deskripsi buku: " + mContext.getString(R.string.dummy_deskripsi));
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getNama_buku().equals("Text Book 5")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, DetailBukuActivity.class);
                    intent.putExtra("actionBarTitle", "Text Book 5");
                    intent.putExtra("sendBookName", "Text Book 5");
                    intent.putExtra("sendIDName", "TB005");
                    intent.putExtra("sendKategoriBuku", "Textbook");
                    intent.putExtra("sendPengarangName", "Pengarang 5");
                    intent.putExtra("sendEdisiName", "05");
                    intent.putExtra("sendISBNName", "TB0005");
                    intent.putExtra("sendDESCName", "Berikut adalah deskripsi buku: " + mContext.getString(R.string.dummy_deskripsi));
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getNama_buku().equals("Text Book 6")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, DetailBukuActivity.class);
                    intent.putExtra("actionBarTitle", "Text Book 6");
                    intent.putExtra("sendBookName", "Text Book 6");
                    intent.putExtra("sendIDName", "TB006");
                    intent.putExtra("sendKategoriBuku", "Textbook");
                    intent.putExtra("sendPengarangName", "Pengarang 6");
                    intent.putExtra("sendEdisiName", "06");
                    intent.putExtra("sendISBNName", "TB0006");
                    intent.putExtra("sendDESCName", "Berikut adalah deskripsi buku: " + mContext.getString(R.string.dummy_deskripsi));
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getNama_buku().equals("Hasil Riset 1")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, DetailBukuActivity.class);
                    intent.putExtra("actionBarTitle", "Hasil Riset 1");
                    intent.putExtra("sendBookName", "Hasil Riset 1");
                    intent.putExtra("sendIDName", "RB013");
                    intent.putExtra("sendKategoriBuku", "Hasil Riset");
                    intent.putExtra("sendPengarangName", "Pengarang 13");
                    intent.putExtra("sendEdisiName", "13");
                    intent.putExtra("sendISBNName", "RB0013");
                    intent.putExtra("sendDESCName", "Berikut adalah deskripsi buku: " + mContext.getString(R.string.dummy_deskripsi));
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getNama_buku().equals("Hasil Riset 2")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, DetailBukuActivity.class);
                    intent.putExtra("actionBarTitle", "Hasil Riset 2");
                    intent.putExtra("sendBookName", "Hasil Riset 2");
                    intent.putExtra("sendIDName", "RB014");
                    intent.putExtra("sendKategoriBuku", "Hasil Riset");
                    intent.putExtra("sendPengarangName", "Pengarang 14");
                    intent.putExtra("sendEdisiName", "14");
                    intent.putExtra("sendISBNName", "RB0014");
                    intent.putExtra("sendDESCName", "Berikut adalah deskripsi buku: " + mContext.getString(R.string.dummy_deskripsi));
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getNama_buku().equals("Hasil Riset 3")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, DetailBukuActivity.class);
                    intent.putExtra("actionBarTitle", "Hasil Riset 3");
                    intent.putExtra("sendBookName", "Hasil Riset 3");
                    intent.putExtra("sendIDName", "RB015");
                    intent.putExtra("sendKategoriBuku", "Hasil Riset");
                    intent.putExtra("sendPengarangName", "Pengarang 15");
                    intent.putExtra("sendEdisiName", "15");
                    intent.putExtra("sendISBNName", "RB0015");
                    intent.putExtra("sendDESCName", "Berikut adalah deskripsi buku: " + mContext.getString(R.string.dummy_deskripsi));
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getNama_buku().equals("Hasil Riset 4")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, DetailBukuActivity.class);
                    intent.putExtra("actionBarTitle", "Hasil Riset 4");
                    intent.putExtra("sendBookName", "Hasil Riset 4");
                    intent.putExtra("sendIDName", "RB016");
                    intent.putExtra("sendKategoriBuku", "Hasil Riset");
                    intent.putExtra("sendPengarangName", "Pengarang 16");
                    intent.putExtra("sendEdisiName", "16");
                    intent.putExtra("sendISBNName", "RB0016");
                    intent.putExtra("sendDESCName", "Berikut adalah deskripsi buku: " + mContext.getString(R.string.dummy_deskripsi));
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getNama_buku().equals("Hasil Riset 5")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, DetailBukuActivity.class);
                    intent.putExtra("actionBarTitle", "Hasil Riset 5");
                    intent.putExtra("sendBookName", "Hasil Riset 5");
                    intent.putExtra("sendIDName", "RB017");
                    intent.putExtra("sendKategoriBuku", "Hasil Riset");
                    intent.putExtra("sendPengarangName", "Pengarang 17");
                    intent.putExtra("sendEdisiName", "17");
                    intent.putExtra("sendISBNName", "RB0017");
                    intent.putExtra("sendDESCName", "Berikut adalah deskripsi buku: " + mContext.getString(R.string.dummy_deskripsi));
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getNama_buku().equals("Hasil Riset 6")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, DetailBukuActivity.class);
                    intent.putExtra("actionBarTitle", "Hasil Riset 6");
                    intent.putExtra("sendBookName", "Hasil Riset 6");
                    intent.putExtra("sendIDName", "RB018");
                    intent.putExtra("sendKategoriBuku", "Hasil Riset");
                    intent.putExtra("sendPengarangName", "Pengarang 18");
                    intent.putExtra("sendEdisiName", "18");
                    intent.putExtra("sendISBNName", "RB0018");
                    intent.putExtra("sendDESCName", "Berikut adalah deskripsi buku: " + mContext.getString(R.string.dummy_deskripsi));
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getNama_buku().equals("Majalah 1")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, DetailBukuActivity.class);
                    intent.putExtra("actionBarTitle", "Majalah 1");
                    intent.putExtra("sendBookName", "Majalah 1");
                    intent.putExtra("sendIDName", "MB007");
                    intent.putExtra("sendKategoriBuku", "Majalah");
                    intent.putExtra("sendPengarangName", "Pengarang 7");
                    intent.putExtra("sendEdisiName", "07");
                    intent.putExtra("sendISBNName", "MB0007");
                    intent.putExtra("sendDESCName", "Berikut adalah deskripsi buku: " + mContext.getString(R.string.dummy_deskripsi));
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getNama_buku().equals("Majalah 2")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, DetailBukuActivity.class);
                    intent.putExtra("actionBarTitle", "Majalah 2");
                    intent.putExtra("sendBookName", "Majalah 2");
                    intent.putExtra("sendIDName", "MB008");
                    intent.putExtra("sendKategoriBuku", "Majalah");
                    intent.putExtra("sendPengarangName", "Pengarang 8");
                    intent.putExtra("sendEdisiName", "08");
                    intent.putExtra("sendISBNName", "MB0008");
                    intent.putExtra("sendDESCName", "Berikut adalah deskripsi buku: " + mContext.getString(R.string.dummy_deskripsi));
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getNama_buku().equals("Majalah 3")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, DetailBukuActivity.class);
                    intent.putExtra("actionBarTitle", "Majalah 3");
                    intent.putExtra("sendBookName", "Majalah 3");
                    intent.putExtra("sendIDName", "MB009");
                    intent.putExtra("sendKategoriBuku", "Majalah");
                    intent.putExtra("sendPengarangName", "Pengarang 9");
                    intent.putExtra("sendEdisiName", "09");
                    intent.putExtra("sendISBNName", "MB0009");
                    intent.putExtra("sendDESCName", "Berikut adalah deskripsi buku: " + mContext.getString(R.string.dummy_deskripsi));
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getNama_buku().equals("Majalah 4")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, DetailBukuActivity.class);
                    intent.putExtra("actionBarTitle", "Majalah 4");
                    intent.putExtra("sendBookName", "Majalah 4");
                    intent.putExtra("sendIDName", "MB010");
                    intent.putExtra("sendKategoriBuku", "Majalah");
                    intent.putExtra("sendPengarangName", "Pengarang 10");
                    intent.putExtra("sendEdisiName", "10");
                    intent.putExtra("sendISBNName", "MB0010");
                    intent.putExtra("sendDESCName", "Berikut adalah deskripsi buku: " + mContext.getString(R.string.dummy_deskripsi));
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getNama_buku().equals("Majalah 5")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, DetailBukuActivity.class);
                    intent.putExtra("actionBarTitle", "Majalah 5");
                    intent.putExtra("sendBookName", "Majalah 5");
                    intent.putExtra("sendIDName", "MB011");
                    intent.putExtra("sendKategoriBuku", "Majalah");
                    intent.putExtra("sendPengarangName", "Pengarang 11");
                    intent.putExtra("sendEdisiName", "11");
                    intent.putExtra("sendISBNName", "MB0011");
                    intent.putExtra("sendDESCName", "Berikut adalah deskripsi buku: " + mContext.getString(R.string.dummy_deskripsi));
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getNama_buku().equals("Majalah 6")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, DetailBukuActivity.class);
                    intent.putExtra("actionBarTitle", "Majalah 6");
                    intent.putExtra("sendBookName", "Majalah 6");
                    intent.putExtra("sendIDName", "MB012");
                    intent.putExtra("sendKategoriBuku", "Majalah");
                    intent.putExtra("sendPengarangName", "Pengarang 12");
                    intent.putExtra("sendEdisiName", "12");
                    intent.putExtra("sendISBNName", "MB0012");
                    intent.putExtra("sendDESCName", "Berikut adalah deskripsi buku: " + mContext.getString(R.string.dummy_deskripsi));
                    mContext.startActivity(intent);
                }
            }
        });

        return view;
    }

    //filter
    public void filter(String charText){
        charText = charText.toLowerCase(Locale.getDefault());
        modellist.clear();
        if (charText.length()==0){
            modellist.addAll(arrayList);
        }
        else {
            for (Buku buku : arrayList){
                if (buku.getNama_buku().toLowerCase(Locale.getDefault()).contains(charText) || buku.getId_buku().toLowerCase(Locale.getDefault()).contains(charText)){
                    modellist.add(buku);
                }
            }
        }
        notifyDataSetChanged();
    }
}